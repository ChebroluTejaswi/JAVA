package d_Arrays_Lists;
//ques: Using ArrayLists concept Write a program to manage Bank details.
/* functions: Printing customer details of a particular branch
              Printing transaction details of customers of a particular branch
              Add a new Branch
              Add a new Customer to a branch
              Add a transaction
*/

import java.util.ArrayList;
import java.util.Scanner;
class Bank{
    public String name;
    ArrayList<Branch> branches;
    public Bank(String name)
    {
        this.name=name;
        this.branches=new ArrayList<Branch>();
    }
    // add a new branch
    public boolean addBranch(String branchName)
    {
        if(findBranch(branchName)==null)
        {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }
    // add a customer to that branch with initial transaction
    public boolean addCustomer(String branchName,String customerName, double initialAmount)
    {
        Branch branch = findBranch(branchName);
        if(branch!=null)
        {
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    // add a transaction for an existing customer for that branch
    public boolean addCustomerTransaction(String branchName,String customerName, double amount)
    {
        Branch branch = findBranch(branchName);
        if(branch!=null)
        {
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    } 
    // show a list of customers for a particular branch and optionally list of transactions
    public boolean listCustomers(String branchName, boolean showTransactions)
    {
        Branch branch = findBranch(branchName);
        if(branch !=null)
        {
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i=0;i<branchCustomers.size();i++)
            {
                Customer branchCustomer=branchCustomers.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+i+"]");
                if(showTransactions)
                {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j=0;j<transactions.size();j++)
                    {
                        System.out.println("["+(j+1)+"] Amount "+transactions.get(j));  
                    }
                }
            }
            return true;
        }
        else
            return false;
    }
    // to find a branch
    public Branch findBranch(String branchname)
    {
        for(int i=0;i<this.branches.size();i++)
        {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchname))
            {
                return checkedBranch;
            }
        }
        return null;
    }

}   

class Branch{
    String name;
    ArrayList<Customer> customers;
    public Branch(String name)
    {   
        this.name=name;
        customers=new ArrayList<Customer>();
    }
    public String getName()
    {
        return this.name;
    }
    public ArrayList<Customer> getCustomers(){
        return this.customers;
    }
    // add a new customer and initial transaction amount
    public boolean newCustomer(String customerName, double initialAmount)
    {
        if(findCustomer(customerName)==null)
        {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }
        return false;
    }
    // additional transactions for customer/ branch
    public boolean addCustomerTransaction(String customerName, double amount)
    {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer !=null)
        {
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
    }
     // to find a customer
    public Customer findCustomer(String CustomerName){
        for(int i=0;i<this.customers.size();i++)
        {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(CustomerName)){
                return checkedCustomer;
            }
        }
        return null;
    }
}

class Customer{
    String name;
    ArrayList<Double> transactions;
    public Customer(String name, double initialAmuont)
    {
        this.name=name;
        this.transactions=new ArrayList<Double>();
        addTransaction(initialAmuont);
    }
    public void addTransaction(double amount)
    {
        this.transactions.add(amount);
    }
    //---------------getter functions----------------
    public String getName(){
        return this.name;
    }
    public ArrayList<Double> getTransactions(){
        return this.transactions;
    }
}

public class BankProgram {
    static Scanner scanner = new Scanner(System.in);
    private static void printMenu() {
		System.out.println("............................................................................");
		System.out.println("\t 1- Print list of customers");
		System.out.println("\t 2- Add new branch");
        System.out.println("\t 3- Add new customer");
		System.out.println("\t 4- Add Customer Transaction");
		System.out.println("\t 5- Quit");
	}
    public static void main(String args[])
    {
		boolean quit = false;
		while(!quit) {
            printMenu();
			System.out.println("Choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 1:
					printListOfCustomers();
					break;
				case 2:
					addBranch();
					break;
				case 3:
					addCustomer();
					break;
				case 4:
					addCustomerTransaction();
					break;
				case 5:
					quit = true;
					quit();
					break;
				default:
					System.out.println("Invalid option");
					printMenu();
			}
		}
    }  
    static Bank bank= new Bank("Indian Bank");

    private static void printListOfCustomers() {
		System.out.println("Enter branch name: ");
		String branchName = scanner.nextLine();
        if(bank.branches.size()==0)
        {
            System.out.println("List of Customers in this branch is empty!");
            return;
        }
		System.out.println("Want to see transactions?[1/0]: ");
		int showTransactions = scanner.nextInt();
        if(showTransactions==1)
        {
            bank.listCustomers(branchName, true);
        }
        else
            bank.listCustomers(branchName,false);
	}  

    private static void addBranch() {
		System.out.println("Enter branch name: ");
		String name = scanner.nextLine();
		boolean flag=bank.addBranch(name);
        if(flag)
            System.out.println("Branch Added Successfully!");
        else
            System.out.println("Failed to Add Branch!");
	}

    private static void addCustomer() {
        System.out.println("Enter branch name: ");
		String branchName = scanner.nextLine();
		System.out.println("Enter customer name: ");
		String customerName = scanner.nextLine();
        System.out.println("Enter initial amount: ");
		double initialAmount = scanner.nextDouble();
		boolean flag = bank.addCustomer(branchName, customerName, initialAmount);
        if(flag)
            System.out.println("Customer Added Successfully!");
        else
            System.out.println("Failed to Add Customer!");
	}

    private static void addCustomerTransaction() {
		System.out.println("Enter branch name: ");
		String branchName = scanner.nextLine();
		System.out.println("Enter customer name: ");
		String customerName = scanner.nextLine();
        System.out.println("Enter initial amount: ");
		double amount = scanner.nextDouble();
		boolean flag= bank.addCustomerTransaction(branchName, customerName, amount);
        if(flag)
            System.out.println("Transaction Added Successfully!");
        else
            System.out.println("Failed to Add Transaction!");
	}

    private static void quit() {
		System.out.println("/*--- Goodbye ---*/");
	}
}
