package MakerPlan.PhoneBook;

import java.util.Scanner;

public class AddressBookMain {

    public void choices()
    {
        AddressBook addressBook = new AddressBook();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Welcome to the AddressBook Main Menu");
        while(true)
        {
        System.out.println("1.Add New Contact\n2.Search Contact\n3.Delete a Contact\n4.Display Sorted Contacts\n5.Exit");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            if(choice==5)
                break;

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Contact Name:");
                    String name = sc.next();
                    System.out.println("Enter Your 10 digit phone number:");
                    String phoneNumber = sc.next();
                    System.out.println("Enter Your Email Address:");
                    String emailAddress = sc.next();
                    addressBook.addContact(name, phoneNumber, emailAddress);
                    break;

                    case 2:
                        System.out.println("Enter Contact Name:");
                        name = sc.next();
                        addressBook.search(name);
                        break;

                        case 3:
                            System.out.println("Enter Contact Name:");
                            name = sc.next();
                            addressBook.delete(name);
                            break;

                            case 4:
                                addressBook.display();
                                break;

                                default:
                                    System.out.println("Invalid Choice");

            }
        }
        System.out.println("---------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.choices();
    }
}



