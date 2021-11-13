package bg.sofia.uni.fmi.mjt.spotify.exceptions;

public class PlayableNotFoundException extends Exception {

    public PlayableNotFoundException() {
        super("Playable not found");
    }

    public PlayableNotFoundException(String message) {
        super(message);
    }
}
