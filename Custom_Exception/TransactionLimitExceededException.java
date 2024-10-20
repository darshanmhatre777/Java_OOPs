package Custom_Exception;

public class TransactionLimitExceededException extends Exception {
	
	public TransactionLimitExceededException(String x) {
		super(x);
	}

}
