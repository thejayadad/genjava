import java.util.Scanner;

public class EmailSetup {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int defaultPasswordLength = 10;
    private int mailboxCapacity = 500;
    private String altEmail;
    private String companyDoman = "kera.com";
    private String alternateEmail;

    //GET FIRST AND LAST NAME
    public EmailSetup(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EmailCreated: " + this.firstName + " " + this.lastName);
        //ASK FOR THE DEPARTMENT
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        //CREATE EMAIL
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companyDoman;
        System.out.println("Email: " + email);


        //RANDOM PASSWORD
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);
    }

    //ASK FOR DEPARTMENT
    private String setDepartment(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Department Code: ");
        System.out.println("1) I.T... 2) Marketing... 3) Sales...");
        int departmentChoice = scan.nextInt();
        if(departmentChoice == 1){
            return "IT";
        } else if(departmentChoice == 2){
            return "Marketing";
        } else if (departmentChoice == 3){
            return "Sales";
        }else {
            return "";
        }
    }

    //RANDOM PASSWORD
    public String randomPassword (int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //MAILBOX COMPACITY
    public void setMailboxCpacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //ALT EMAIL
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }
    //GETMETHODS
    public int getMailboxCapacity(){return mailboxCapacity;}
    public String getAltEmail(){return altEmail;}
    public String getPassword(){return password;}


    //SHOW EMPLOYEE INFO
    public String showEmployeeInfo(){
        return "Display Name: " + firstName + " " + lastName +
                " |Company Email: " + email +
                " |Password: " + password +
                " |Mailbox Capacity: " + mailboxCapacity +"gb"

        ;

    }


}
