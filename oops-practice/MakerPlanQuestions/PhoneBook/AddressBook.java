package MakerPlan.PhoneBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class AddressBook {
    static ArrayList<Contacts> contacts = new ArrayList<>();
    static HashMap<String,Contacts> contactMap = new HashMap<>();
    static  HashSet<String> phoneNumbers= new HashSet<>();


    public void addContact(String name,String phoneNumber,String email) {
       if(phoneNumber.contains(phoneNumber)) {

           System.out.println("Phone number already exists");
       }

       Contacts contact = new Contacts(name,phoneNumber,email);
       contacts.add(contact);
       contactMap.put(name,contact);
       phoneNumbers.add(phoneNumber);
        System.out.println("Contacts has been added");
    }

    public void search(String name) {
        Contacts c =contactMap.get(name);
        if(c!=null) {
            System.out.println(c);
        }
        else {
            System.out.println("Contact with name " + name + " not found");
        }

    }

    public void delete(String name) {
        Contacts c =contactMap.get(name);
        if(c!=null) {
            contactMap.remove(name);
            contacts.remove(c);
            phoneNumbers.remove(c.getPhoneNumber());
            System.out.println("Contacts has been deleted");
        }
        else {
            System.out.println("Contact with name " + name + " not found");
        }
    }


    public void display()
    {
        Collections.sort(contacts);
        for(Contacts contact:contacts)
        {
            System.out.println(contact);
        }
    }
}