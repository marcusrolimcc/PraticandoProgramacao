package boardgame;

public class BoardException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	protected BoardException(String msg) {
		super(msg);
	}
}
