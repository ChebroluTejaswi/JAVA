package d_Arrays_Lists;
// ques: Using ArrayLists concept Write a program to manage contact list in Mobile phone.
/* functions: Printing Contacts
              Create a contact
              Update a contact
              Remove a contact
              Searching contact
*/
import java.util.ArrayList;
import java.util.Scanner;

class MobilePhone
{
    String myNumber;
    ArrayList<Contact> myContacts;
    public MobilePhone(String phoneNumber)
    {
        this.myNumber=phoneNumber;
        myContacts = new ArrayList<>();
    }
    public MobilePhone()
    {
        myContacts = new ArrayList<>();
    }
    // -------------------------------To print all contacts in the contact list------------------------------
    public void printListOfContacts() {
		if(myContacts.size() == 0) {
			System.out.println("List of contacts is empty");
		} else {
			System.out.println("/*--- List of contacts ---*/");
			for(int i = 0; i < myContacts.size(); i++) {
				System.out.println(myContacts.get(i).getName() + ": " + myContacts.get(i).getPhoneNumber());
			}
		}
	}
    // -------------------------------To add a new contact in the contact list------------------------------
    public boolean addNewContact(Contact c){
        if(myContacts.contains(c))
            return false;
        else
        {
            myContacts.add(c);
            return true;
        }
    }
    // -------------------------------To update a contact in the contact list------------------------------
    public boolean updateContact(Contact oldContact,Contact newContact){
        if(myContacts.contains(oldContact))
        {
            int x=myContacts.indexOf(oldContact);
            myContacts.set(x,newContact);
            return true;
        }
        else
            return false;
    }
    // -------------------------------To remove a contact in the contact list------------------------------
    public boolean removeContact(Contact c){
        if(myContacts.contains(c))
        {
            int x=myContacts.indexOf(c);
            myContacts.remove(x);
            return true;
        }
        else
            return false;
    }
    // -------------------------------To find contacts in the contact list------------------------------
    public int findContact(Contact c){
        return myContacts.indexOf(c);
    }
    public Contact findContact(String name){
        for(int i=0;i<myContacts.size();i++)
        {
            if(myContacts.get(i).getName().equals(name))
            {
                return myContacts.get(i);
            }
        }
        return null;
    }
}
class Contact{
    String name;
    String phoneNumber;
    public Contact(String name,String phoneNumber)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getName()
    {
        return this.name;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public Contact createContact(String name,String phoneNumber)
    {
        Contact c = new Contact(name, phoneNumber);
        return c;
    } 
}
//------------------------------------------------------------------------------------------
public class Mobile {
    static Scanner scanner = new Scanner(System.in);
    private static void printMenu() {
		System.out.println("............................................................................");
		System.out.println("\t 1- Print list of contacts");
		System.out.println("\t 2- Add new contact");
		System.out.println("\t 3- Update existing contact");
		System.out.println("\t 4- Remove contact");
		System.out.println("\t 5- Search / Find contact");
		System.out.println("\t 6- Quit");
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
					printListOfContacts();
					break;
				case 2:
					addContact();
					break;
				case 3:
					updateContact();
					break;
				case 4:
					removeContact();
					break;
				case 5:
					searchContact();
					break;
				case 6:
					quit = true;
					quit();
					break;
				default:
					System.out.println("Invalid option");
					printMenu();
			}
		}
    }  
    private static MobilePhone mobilePhone = new MobilePhone();

    private static void printListOfContacts() {
		mobilePhone.printListOfContacts();
	}  

    private static void addContact() {
		System.out.println("Enter contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter contact number: ");
		String number = scanner.nextLine();
		boolean flag=mobilePhone.addNewContact(new Contact(name, number));
        if(flag)
            System.out.println("Added Successfully!");
        else
            System.out.println("Failed to Add!");
	}

    private static void updateContact() {
		System.out.println("Enter contact you want to update: ");
		String name = scanner.nextLine();
		Contact oldContact= mobilePhone.findContact(name);
        if(oldContact==null)
        {
            System.out.println("Contact not found!");
            return;
        }
		System.out.println("Enter contact new name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter contact new number: ");
		String newPhoneNumber = scanner.next();
		Contact newContact = new Contact(newName, newPhoneNumber);
		boolean flag = mobilePhone.updateContact(oldContact, newContact);
        if(flag)
            System.out.println("Updated Successfully!");
        else
            System.out.println("Failed to update!");
	}

    private static void removeContact() {
		System.out.println("Enter contact you want to remove: ");
		String name = scanner.nextLine();
        Contact oldContact= mobilePhone.findContact(name);
		boolean flag= mobilePhone.removeContact(oldContact);
        if(flag)
            System.out.println("Removed Successfully!");
        else
            System.out.println("Failed to Remove!");
	}

    private static void searchContact() {
		System.out.println("Enter contact name: ");
		String name = scanner.nextLine();
		
		Contact contact = mobilePhone.findContact(name);
		if(contact==null) {
			System.out.println("Contact not found!");
            return;
		}
		System.out.println(name + ": " + contact.getPhoneNumber());
	}
    private static void quit() {
		System.out.println("/*--- Goodbye ---*/");
	}
}