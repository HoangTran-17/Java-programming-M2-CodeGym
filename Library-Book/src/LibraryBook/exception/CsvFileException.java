package LibraryBook.exception;

import java.io.IOException;

public class CsvFileException extends RuntimeException{
	public CsvFileException(IOException exception) {
		super(exception);
	}
}
