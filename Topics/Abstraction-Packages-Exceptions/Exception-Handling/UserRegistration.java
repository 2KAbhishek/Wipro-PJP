public class UserRegistration {

	public void registerUser(String username, String userCountry) throws InvalidCountryException {
		if (!userCountry.equals("India"))
			throw new InvalidCountryException();
		else
			System.out.println("User registration done successfully");
	}

	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();

		try {
			// registration.registerUser("Mickey", "US");
			registration.registerUser("Mini", "India");
		} catch (InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}

}
