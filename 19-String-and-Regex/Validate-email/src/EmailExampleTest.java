public class EmailExampleTest {
	private static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
	private static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};
	
	public static void main(String[] args) {
		EmailExample emailExample = new EmailExample();
		for (String email: validEmail) {
			boolean IsValid = emailExample.validate(email);
			System.out.printf("Email is %s is valid: %s.%n", email, IsValid);
		}
		for (String email: invalidEmail) {
			boolean IsValid = emailExample.validate(email);
			System.out.printf("Email is %s is valid: %s.%n", email, IsValid);
		}
	}
}
