package c_Oops;
// ques: Simple implementation of Encapsulation concept in JAVA.

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;
    public Printer(int tonerLevel, boolean duplex){
        if(tonerLevel<-1 || tonerLevel>100)
            this.tonerLevel=-1;
        else
            this.tonerLevel=tonerLevel;
        this.duplex=duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100)
        {
            if((this.tonerLevel+tonerAmount)>100)
            {
                return -1;
            }
            else{
                this.tonerLevel=this.tonerLevel+tonerAmount;
                return this.tonerLevel;
            }
        }
        else
            return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;
        if(this.duplex)
        {
            System.out.println("Printing in duplex mode");
            pagesToPrint=(pagesToPrint/2)+(pagesToPrint%2);
            this.pagesPrinted=this.pagesPrinted+pagesToPrint;
            return pagesToPrint;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted()
    {
        return this.pagesPrinted;
    }
    public static void main(String args[]){
        Printer printer= new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int pagesPrinted =printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count for printer = "+printer.getPagesPrinted());
        
    }
}
