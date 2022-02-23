package assign1FionaLiDuong;

/**
 * @Fiona Li-Duong
*/

public class Customer {
    //instance variables firstname, lastname, birthmonth, email, customerID
    private String firstName;
    private String lastName;
    private BirthdayMonth birthdayMonth;
    private String emailAddress;
    private int customerID;

    //add static variable nextId
    private static int nextAvailableID;

    //constructor that takes firstname, lastname, birthmonth, email
    //generate customerID and add nextId by one
    public Customer (String firstName, String lastName, BirthdayMonth birthdayMonth, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayMonth = birthdayMonth;
        this.emailAddress = emailAddress;

        this.customerID = nextAvailableID;
        nextAvailableID++; 
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BirthdayMonth getBirthdayMonth() {
        return birthdayMonth;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getCustomerID() {
        return customerID;
    }

    
}
