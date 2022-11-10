package testing.calculator.myCalculator.ValidatePassword;

public class ValidateUserPassword {
	private String password;
	
	public ValidateUserPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public int validateLength() {
		return password.length();
	}
	
	public boolean checkSpecialCharacter() {
//		boolean answer = false;
//		String regex;
//		
//		return answer;
		return true;
	}
}
