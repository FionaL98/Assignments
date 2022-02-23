package assign1FionaLiDuong;

/**
 * @Fiona Li-Duong
*/
public class Start {
        
    public static void main (String []args) throws Exception{

        //Instantiate two customers and prove the customerID increases by 1
        Customer c1 = new Customer("Ariana", "Grande", BirthdayMonth.JAN, "ArianaG@gmail.com");
        Customer c2 = new Customer("Amber", "Lee", BirthdayMonth.FEB, "AmberLee@gmail.com");
        System.out.println("Customer Class with increased customerID:");
        System.out.println(c1.getFirstName() + " " + c1.getLastName() + ": Birthday Month: " + c1.getBirthdayMonth() + ", " + c1.getEmailAddress() + ", Customer ID: " + c1.getCustomerID());
        System.out.println(c2.getFirstName() + " " + c2.getLastName() + ": Birthday Month: " + c2.getBirthdayMonth() + ", " + c2.getEmailAddress() + ", Customer ID: " + c2.getCustomerID());
        System.out.println("");

        //Ragged Array with 3 customers in first row, 2 customers in second row
        Customer[][] customers = {
            {
                new Customer("Bob", "Redhome", BirthdayMonth.JAN, "Bob@gmail.com"), 
                new Customer("Bobby", "Yellowhorse", BirthdayMonth.NOV, "Bobby@gmail.com"), 
                new Customer("Bobette", "Bluehouse", BirthdayMonth.SEP, "Bobette@gmail.com")
            },
            {
                new Customer("Lala", "Tubby", BirthdayMonth.JAN, "LalaTub@gmail.com"), 
                new Customer("Po", "Tubby", BirthdayMonth.APR, "PoTub@gmail.com")
            }
        };

        //use loops to print our all customer names
        System.out.println("Print out all from Ragged Array: ");
        for (int group=0; group<customers.length; group++){
            for (int num=0; num<customers[group].length; num++){
                System.out.print(customers[group][num].getFirstName() + ", ");
            }
            System.out.println("");
        }
        System.out.println("");

        //turn to your main method and write enough code to prove that all your CRM systems works as advertised.
        CRM crm = new CRM();
        crm.addCustomer(new Customer("Yuna", "Shin", BirthdayMonth.DEC, "Yunana@gmail.com"));
        crm.addCustomer(new Customer("Maya", "Samee", BirthdayMonth.DEC, "MayaSamee@gmail.com"));
        crm.addCustomer(new Customer("Yeji", "Sicio", BirthdayMonth.JAN, "YejiSicio@gamil.com"));
        crm.addCustomer(new Customer("Luna", "Kang", BirthdayMonth.JAN, "Luna@gmail.com"));
        crm.addCustomer(new Customer("James", "Opeen", BirthdayMonth.FEB, "JamesO@gmail.com"));
        crm.addCustomer(new Customer("Riley", "Elmwood", BirthdayMonth.DEC, "RileyE@gamil.com"));
        crm.addCustomer(new Customer("Emily", "Elmwood", BirthdayMonth.NOV, "EmilyE@gmail.com"));
        crm.addCustomer(new Customer("West", "South", BirthdayMonth.MAR, "SouthWest@gmail.com"));
        crm.addCustomer(new Customer("Giselle", "Swirl", BirthdayMonth.APR, "Giselle@gamil.com"));
        // crm.addCustomer(new Customer("Eldon", "Malton", BirthdayMonth.MAY, "Eldon@gmail.com"));
        // crm.addCustomer(new Customer("Hunter", "Squirrel", BirthdayMonth.SEP, "Hunter@gmail.com"));
        // crm.addCustomer(new Customer("Stephanie", "Bethany", BirthdayMonth.JUN, "Stepphy@gamil.com"));
        // crm.addCustomer(new Customer("Amanda", "Pine", BirthdayMonth.MAY, "Amanda@gmail.com"));
        // crm.addCustomer(new Customer("Noah", "Cedar", BirthdayMonth.AUG, "Noahnoah@gmail.com"));
        // crm.addCustomer(new Customer("Richelle", "Melo", BirthdayMonth.JUL, "Richelle@gamil.com"));
        // crm.addCustomer(new Customer("Oliver", "Brown", BirthdayMonth.DEC, "Oliver@gmail.com"));
        // crm.addCustomer(new Customer("Candace", "Flynn", BirthdayMonth.DEC, "CFlynn@gmail.com"));
        // crm.addCustomer(new Customer("Phinease", "Flynn", BirthdayMonth.NOV, "PFlynn@gamil.com"));
        // crm.addCustomer(new Customer("Ferb", "Flynn", BirthdayMonth.SEP, "FFlynn@gmail.com"));
        // crm.addCustomer(new Customer("Hannah", "Montana", BirthdayMonth.FEB, "HannahMontana@gmail.com"));
      
        System.out.println("CRM Class (print birthday cards and emails): ");

        System.out.println(crm.getAllCustomerEmails());
        System.out.println("");

        System.out.println(crm.printBirthdayCards(BirthdayMonth.DEC));
        System.out.println("");


        
    }
}
