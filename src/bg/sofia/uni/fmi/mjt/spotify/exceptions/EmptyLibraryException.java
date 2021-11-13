package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class EmptyLibraryException extends Exception {

    public EmptyLibraryException() {
        super("Empty library");
    }

    public EmptyLibraryException(String message) {
        super(message);
    }
}
