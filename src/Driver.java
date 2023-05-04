import java.util.Stack;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Driver {

	static Scanner s = new Scanner(System.in);

	static int userInput;
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Contact> localPartners = new Stack<Contact>();
		Stack<Contact> onlinePartners = new Stack<Contact>();
		PriorityQueue<Contact> priorityPartners = new PriorityQueue<Contact>();

		userInput = getMenuInput();

		while (userInput <= 5 && userInput > 0) {
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

			else if(userInput == 5) {
				System.out.println("Thank You, Goodbye");
				break;
			}

		}
		s.close();
	}
}
