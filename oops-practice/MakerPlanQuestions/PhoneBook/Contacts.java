package MakerPlan.PhoneBook;

public class Contacts implements Comparable<Contacts> {
    private String Name;
    private  String PhoneNumber;
    private String Email;


    public Contacts(String Name, String PhoneNumber, String Email) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacts o) {
        return this.Name.compareToIgnoreCase(o.Name);
    }
}
