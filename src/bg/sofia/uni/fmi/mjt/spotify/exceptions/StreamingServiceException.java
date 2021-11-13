package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class StreamingServiceException extends Exception {

    public StreamingServiceException() {
        super("Streaming service problem");
    }

    public StreamingServiceException(String message) {
        super(message);
    }
}
