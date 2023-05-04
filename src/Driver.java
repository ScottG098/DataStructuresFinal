/**************************************************************
* Name        : FinalProject - Business Contact "Database"
* Author      : Scott Grigsby
* Created     : 5/4/2023
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 11
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : Allows a user to enter a contacts information as a local, online, or priority contact or the company.
* Academic Honesty: I attest that this is my original work.
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Scanner;
//Driver Class to run the program in the console. I tried to add a GUI.
//but I have almost no experience with it and did not realize that the way
//I wrought the program meant I would need to completely re-do the entire thing
//to add it.
public class Driver {

	//scanner to gather user input to create the contact objects that are stored in the data structures
	static Scanner s = new Scanner(System.in);

	//used to determine which option will be selected
	static int userInput;
	
	//method to bring up the menu of options
	static int getMenuInput() {
		System.out.println("Select option:");
		System.out.println("Enter 1 - Local Partner");
		System.out.println("Enter 2 - Online Partner");
		System.out.println("Enter 3 - Priority Partner");
		System.out.println("Enter 4 - Output List of Partners");
		System.out.println("Enter 5 - Exit Program");

		userInput = s.nextInt();
		s.nextLine();

		return userInput;
	}

	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//stacks to contain local and online business partners
		Stack<Contact> localPartners = new Stack<Contact>();
		Stack<Contact> onlinePartners = new Stack<Contact>();
		
		//priority queue for important contacts that must be contacted first.
		PriorityQueue<Contact> priorityPartners = new PriorityQueue<Contact>();

		//uses method to get user input for menu
		userInput = getMenuInput();

		//loop to ensure only correct options continue
		while (userInput <= 5 && userInput > 0) {
			//takes user input to add a local contact
			if (userInput == 1) {
				Company newCompany = new Company();

				System.out.println("Enter Company Name:");
				newCompany.setName(s.nextLine());
				System.out.println("Enter Company's Local Address:");
				newCompany.setAddress(s.nextLine());
				System.out.println("Enter Company Phone Number:");
				newCompany.setPhone(s.nextLine());

				Contact newContact = new Contact();

				System.out.println("Enter Contact Name:");
				newContact.setName(s.nextLine());
				System.out.println("Enter Contact Phone:");
				newContact.setPhone(s.nextLine());
				System.out.println("Enter Contact Email:");
				newContact.setEmail(s.nextLine());
				newContact.setCompany(newCompany);
				

				localPartners.add(newContact);
				
				System.out.println("Is this a priority Contact? Y/N");
				
				userInput = getMenuInput();

			}

			//takes user input to add an online contact
			if (userInput == 2) {
				Company newCompany = new Company();

				System.out.println("Enter Company Name:");
				newCompany.setName(s.nextLine());
				System.out.println("Enter Company's Local Address:");
				newCompany.setAddress(s.nextLine());
				System.out.println("Enter Company Phone Number:");
				newCompany.setPhone(s.nextLine());

				Contact newContact = new Contact();

				System.out.println("Enter Contact Name:");
				newContact.setName(s.nextLine());
				System.out.println("Enter Contact Phone:");
				newContact.setPhone(s.nextLine());
				System.out.println("Enter Contact Email:");
				newContact.setEmail(s.nextLine());
				newContact.setCompany(newCompany);

				onlinePartners.add(newContact);

				userInput = getMenuInput();

			}
			//takes user input to add a priority contact
			if (userInput == 3) {
				
				Company newCompany = new Company();

				System.out.println("Enter Company Name:");
				newCompany.setName(s.nextLine());
				System.out.println("Enter Company's Local Address:");
				newCompany.setAddress(s.nextLine());
				System.out.println("Enter Company Phone Number:");
				newCompany.setPhone(s.nextLine());

				Contact newContact = new Contact();

				System.out.println("Enter Contact Name:");
				newContact.setName(s.nextLine());
				System.out.println("Enter Contact Phone:");
				newContact.setPhone(s.nextLine());
				System.out.println("Enter Contact Email:");
				newContact.setEmail(s.nextLine());
				newContact.setCompany(newCompany);

				priorityPartners.add(newContact);
				
				userInput = getMenuInput();
			}
			//outputs all entered contacts in their own sections
			if (userInput == 4) {
				
				localPartners = Sort.sortStack(localPartners);
				onlinePartners = Sort.sortStack(onlinePartners);
				
				System.out.println("Local Business Contacts(Sorted by Name)");
				for (int x = 0; x < localPartners.size(); x++) {
					System.out.println(localPartners.get(x));
				}
				
				System.out.println();

				System.out.println("Online Business Contacts(Sorted by Name)");
				for (int x = 0; x < onlinePartners.size(); x++) {
					System.out.println(onlinePartners.get(x));
				}

				System.out.println();
				
				System.out.println("Top Priority Business Contact");
				System.out.println(priorityPartners.peek());
				
				
				System.out.println();

				userInput = getMenuInput();
			}

			//ends program
			else if(userInput == 5) {
				System.out.println("Thank You, Goodbye");
				break;
			}

		}
		//close scanner
		s.close();
	}
}
