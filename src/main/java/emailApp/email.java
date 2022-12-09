package emailApp;

import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private Integer defaultPasswordLength = 10;
    private String department;
    private String email;
    private Integer mailboxCapacity = 500;
    private String alternateEmail;
    private String companySuffix = "sonicmaster.com";

    //Constructor for first name and last name
    public email (String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        System.out.println(firstName + " " + lastName);

        //Ask for department and return
        this.department = setDepartment();
        System.out.println("DEPARTMENT: " + department);

        //Generate random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("PASSWORD: " + password);

        //Generate email
        this.email = firstName.toLowerCase() +"."+lastName.toLowerCase() +"@"+department +"."+ companySuffix;
    }

    //Ask for department
    private String setDepartment(){
        System.out.print("DEPARTMENTS\n1. for IT \n2. for Sales \n3. for Accounting \n4. for none \nEnter Department:");
        Scanner scan = new Scanner(System.in);
        int depChoice = scan.nextInt();

        if (depChoice ==1) {return "IT";}
        else if (depChoice ==2) {return "Sales";}
        else if (depChoice ==3) {return "Accounting";}
        else {return "";}
    }

    //Generate random password
        //Get the 'length'; define what can be in password; create array of chars the size of the 'length';
        //for loop iterates 'length' times; add characters selected from password set to array[];
        //return 'new String' as the password is an array of chars
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-=_+";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length()); //Math.random() = 0 - 0.99
            password[i] = passwordSet.charAt(rand);
        }
        return new String (password);
    }

    //Set mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }

    //Set alternate email
    public void setAltEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail(){
        return alternateEmail;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

    public String display(){
        return "NAME: " + firstName+" " + lastName + "\nEMAIL: " + email + " " + "(" + mailboxCapacity +")";
    }
}
