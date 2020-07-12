import java.util.*;
class Email{
	private String FirstName;
	private String LastName;
	private String Password;
	private int MailBoxCapacity = 100;
	private String Department;
	public Email(String Fname, String Lname, String Depart){
		this.FirstName = Fname;
		this.LastName = Lname;
		this.Department = Depart;
		System.out.println("------------------------------------------------------------");
		System.out.println("Email Created for: Mr/Miss."+this.FirstName);
		this.Password = generatePassword(8);
	}
	private static String generatePassword(int length) {
      	String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      	String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
      	String specialCharacters = "!@#$";
      	String numbers = "1234567890";
      	String combinedChars = lowerCaseLetters + capitalCaseLetters + specialCharacters + numbers;
      	Random random = new Random();
      	char[] password = new char[length];

      	password[0] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      	password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
      	password[2] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      	password[3] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
      	password[4] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
      	password[5] = numbers.charAt(random.nextInt(numbers.length()));
      	password[6] = numbers.charAt(random.nextInt(numbers.length()));
      	password[7] = numbers.charAt(random.nextInt(numbers.length()));

      	String str = new String(password);
      	return str;
   }
   public void changePassword(String Password){
   		this.Password = Password;
   }
   public void showInfo(){
   		System.out.println("Full Name: "+FirstName+" "+LastName);
   		System.out.println("Email Address: "+FirstName+"_"+LastName+"@Company."+Department+".com");
   		System.out.println("MailBoxCapacity: "+MailBoxCapacity);
   		System.out.println("Password: "+Password);
   }
}
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please, Enter your First Name:");
	    String fname = sc.nextLine();
	    System.out.println("Please, Enter your Last Name:");
	    String lname = sc.nextLine();
	    System.out.println("Please, Enter your Department:");
	    String dept = sc.nextLine();
		Email em = new Email(fname,lname,dept);
		em.showInfo();
		System.out.println("------------------------------------------------------------");
	}
}