package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class PlaylistCapacityExceededException extends Exception {

    public PlaylistCapacityExceededException() {
        super("Playlist capacity problem");
    }

    public PlaylistCapacityExceededException(String message) {
        super(message);
    }
}
