package LibraryBook.exception;

public class LibraryBookException extends RuntimeException{
	public LibraryBookException(String message) {
		super(message);
	}
	
	
	@Override
	public String getMessage() {
		return "Library Book: " + super.getMessage();
	}
}
