package addressbook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean running = true;

        while( running ){
            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch(choice){
                case 1:
                    System.out.print("Enter First name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Enter Last name: ");
                    String lastName = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();

                    System.out.print("Enter email address: ");
                    String emailAddress = scanner.nextLine();

                    System.out.println("Enter address details:");
                    String address = scanner.nextLine();

                    System.out.println("Enter City:");
                    String city = scanner.nextLine();

                    System.out.println("Enter State:");
                    String state = scanner.nextLine();
                    System.out.println("Enter Zip Code:");
                    String zipCode = scanner.nextLine();

                    Contact contact = new Contact(firstName,lastName, phoneNumber, emailAddress, address, city, state, zipCode);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting Address Book.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
