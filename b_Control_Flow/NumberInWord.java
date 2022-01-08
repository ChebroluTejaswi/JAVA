package b_Control_Flow;
// ques: Based on the entered number, print out the number in words.

public class NumberInWord {
    public static void printNumberInWord(int num){
        switch(num){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
    public static void main(String args[]){
        printNumberInWord(3);
        printNumberInWord(-2);
    }
}
