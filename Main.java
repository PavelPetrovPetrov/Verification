import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Registration");
		String username=SetUsername();
		String password=SetPassword();
		String EGN=SetEGN();
		
		System.out.println("Your username is:" + username);
		System.out.println("Your EGN is:" + EGN);
		System.out.println("Your password is:" + password);
		
	}
	
	public static String SetUsername (){
		boolean isRightName;
		String username;
		do {
			System.out.println("Please enter your username correctly:");
			System.out.println("You can use letters,\"-\",\"_\"");
			Scanner scanner = new Scanner(System.in);
			username =  scanner.next();
		
			UsernameValidator Validator = new UsernameValidator();
			isRightName = Validator.validateUserName(username);
		}while(isRightName==false);
		return username;
	}
	
	public static String SetPassword (){
		boolean isRightPassword;
		String password;
		do {
			System.out.println("Please enter your password correctly:");
			System.out.println("You can use only figures up to 15!");
			Scanner scanner = new Scanner(System.in);
			password =  scanner.next();
		
			PasswordValidator Validator = new PasswordValidator();
			isRightPassword = Validator.validatePassword(password);
		}while(isRightPassword==false);
		return password;
		
	}
	
	public static String SetEGN () {
		boolean isRightEGN;
		String EGN;
		do {
			System.out.println("Please enter your EGN correctly:");
			Scanner scanner = new Scanner(System.in);
			EGN =  scanner.next();
		
			EGNValidator Validator = new EGNValidator();
			isRightEGN = Validator.validateEGN(EGN);
		}while(isRightEGN==false);
		return EGN;
	}

}
