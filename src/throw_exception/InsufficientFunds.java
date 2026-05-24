package throw_exception;

public class InsufficientFunds extends Exception {
    public InsufficientFunds() {
        super("Insufficient Funds");
    }
}
