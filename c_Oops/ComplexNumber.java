package c_Oops;
// ques: Create a class Complexnuber. Write down methods to Add or Subtract Complex numbers.
//       To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts.

public class ComplexNumber {
    private double real;
    private double imaginary;
    public ComplexNumber(double real, double imaginary)
    {
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal()
    {
        return this.real;
    }
    public double getImaginary()
    {
        return this.imaginary;
    }
    public void add(double real, double imaginary)
    {
        this.real=this.real+real;
        this.imaginary=this.imaginary+imaginary;
    }
    public void add(ComplexNumber c)
    {
        this.real=this.real+c.real;
        this.imaginary=this.imaginary+c.imaginary;
    }
    public void subtract(double real, double imaginary)
    {
        this.real=this.real-real;
        this.imaginary=this.imaginary-imaginary;
    }
    public void subtract(ComplexNumber c)
    {
        this.real=this.real-c.real;
        this.imaginary=this.imaginary-c.imaginary;
    }

    public static void main (String args[])
    {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
