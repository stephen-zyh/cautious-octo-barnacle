package chapter4;

public class User {
	@SuppressWarnings("unused")
	private String username;
	private String password;
	@SuppressWarnings("unused")
	private static int numberOfUser;
	static {
		numberOfUser++;
	}

	public User() {
		super();
	}

	public User(String username) {
		super();
		this.username = username;
	}

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
