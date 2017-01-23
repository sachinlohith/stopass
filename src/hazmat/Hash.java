package hazmat;

public class Hash {
	private String hash;
	
	public Hash() {
		this.hash = "";
	}
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String generateHash(String password, String hashType) {
		String hashedPassword = "";
		String saltedPassword = "";
		String salt = Random.randomAlphaNumeric(6);
		saltedPassword = password + salt;
		hashedPassword = SHA256(saltedPassword);
		return hashedPassword;
	}
	
	protected static String SHA256(String saltedPassword) {
		return "";
	}
	
	protected static String SHA512(String saltedPassword) {
		return "";
	}
}
