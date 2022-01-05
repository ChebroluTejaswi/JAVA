package a_Basics;
//ques: Printing count of MB and KB for given kilobytes.

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes<0)
            System.out.println("Invalid Value");
        else
        {
            int mb,remkb;
            mb=(int)(kiloBytes/1024);
            remkb=kiloBytes%1024; // remainder
            System.out.println(kiloBytes+" KB = "+mb+" MB and "+remkb+" KB");
        }
    }
    public static void main(String args[]){
        printMegaBytesAndKiloBytes(5000);
    }
}
