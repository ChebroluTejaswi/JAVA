package c_Oops;
// ques: Create a class Person with attributes: first name, second name and age.
//       Write down few methods to get full name of person, to check if he is a Teenager.

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setAge(int age){
        if(age<0 || age>100)
            this.age=0;
        else
            this.age=age;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public int getAge()
    {
        return this.age;
    }
    public boolean isTeen(){
        if(this.age >12 && this.age<20)
            return true;
        else
            return false;
    }
    public String getFullName(){
        if(this.firstName.isEmpty() && this.lastName.isEmpty())
            return "";
        else if(this.lastName.isEmpty())
            return this.firstName;
        else if(this.firstName.isEmpty())
            return this.lastName;
        else 
            return this.firstName+" " +this.lastName;
    }

    public static void main(String args[])
    {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}
