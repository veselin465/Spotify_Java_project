package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class LibraryCapacityExceededException extends Exception {

    public LibraryCapacityExceededException() {
        super("Library capacity problem");
    }

    public LibraryCapacityExceededException(String message) {
        super(message);
    }
}
