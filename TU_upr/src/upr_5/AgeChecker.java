package upr_5;

public class AgeChecker extends Exception{
	private static final long serialVersionUID = 1L;

	public AgeChecker() {
		super();
	}

	public AgeChecker(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AgeChecker(String message, Throwable cause) {
		super(message, cause);
	}

	public AgeChecker(String message) {
		super(message);
	}

	public AgeChecker(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		return "Age should be in interval: "+super.getMessage();
	}
	

	
}
