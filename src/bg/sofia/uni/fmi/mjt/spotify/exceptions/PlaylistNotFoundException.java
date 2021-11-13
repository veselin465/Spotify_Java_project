package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class PlaylistNotFoundException extends Exception {

    public PlaylistNotFoundException() {
        super("Playlist not found");
    }

    public PlaylistNotFoundException(String message) {
        super(message);
    }
}
