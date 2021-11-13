package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class AccountNotFoundException extends Exception {

    public AccountNotFoundException() {
        super("Account not found");
    }

    public AccountNotFoundException(String message) {
        super(message);
    }
}
