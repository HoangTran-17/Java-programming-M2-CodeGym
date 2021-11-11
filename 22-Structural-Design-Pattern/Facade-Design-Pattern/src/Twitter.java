public class Twitter implements SocialShare {
	private String message;
	
	@Override
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public void share() {
		System.out.printf("Sharing to Twitter: %s%n", this.message);
	}
}
