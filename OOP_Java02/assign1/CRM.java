package assign1FionaLiDuong;

/**
 * @Fiona Li-Duong
*/
public class CRM {
    //Instance variable called customers with 20 elements
    //instance variable numCustoemrs to count number in array
    private Customer[] customers = new Customer[20];
    private static int numCustomers;

    //method called addCustomer that accepts a Customer, correctly adds that Customer to the customers array
    //and increments the numCustomers variable.
    public void addCustomer(Customer customer) throws Exception{
        if (numCustomers >= 20){
            throw new Exception("Error: Customers List is full: " + numCustomers);
        }

        customers[numCustomers] = customer; 
        numCustomers++;
    }

    //method called getAllCustomerEmails which returns a String containing all Customers email addresses, separated by semi-colons:
    public String getAllCustomerEmails() throws Exception{
        if (numCustomers <= 0){
            throw new Exception("Error: Customers List is empty!");
        }

        String emails ="";
        for (int i=0; i<customers.length; i++){
            if (customers[i] != null){
               emails += customers[i].getEmailAddress() + "; ";
            }
        }
        return emails;
    }

    //method called printBirthdayCards that will print out birthday cards for every Customer who’s birthMonth is equal to the BirthdayMonth that was passed to it
    public String printBirthdayCards(BirthdayMonth month) throws Exception{
        if (numCustomers <= 0){
            throw new Exception("Error: Customers List is empty!");
        };

        String output ="";
        for (int i = 0; i < numCustomers; i++){
            if (customers[i].getBirthdayMonth().equals(month)){
                output += "Dear " + customers[i].getFirstName() + ", ";
                output += "\n\nHappy Birthday! In honour of your birthday this month, we are happy to give you this coupon for $2 off on any order over $100,000!";
                output += "\n\nBest Regards,";
                output += "\n\nFiona Li-Duong";
                output += "\n\n--------------------------------------------------------\n\n";
            }
        };

        return output;

    }
}
