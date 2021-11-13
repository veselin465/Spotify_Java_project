package bg.sofia.uni.fmi.mjt.spotify;

import bg.sofia.uni.fmi.mjt.spotify.account.Account;
import bg.sofia.uni.fmi.mjt.spotify.account.FreeAccount;
import bg.sofia.uni.fmi.mjt.spotify.library.Library;
import bg.sofia.uni.fmi.mjt.spotify.library.UserLibrary;
import bg.sofia.uni.fmi.mjt.spotify.playable.Audio;
import bg.sofia.uni.fmi.mjt.spotify.playable.Playable;
import bg.sofia.uni.fmi.mjt.spotify.playable.Video;

public class SpotifyTest {

    public static void main(String[] args) {
        Library ul = new UserLibrary();
        Account a1 = new FreeAccount("veselin penev @ gmail.com", ul);
        Account a2 = new FreeAccount("veselin penev @ gmail123.com", ul);
        Playable a = new Audio("A1", "me", 1999, 35);
        Playable v = new Video("A1", "me", 1999, 35);
        StreamingService spotify = new Spotify(new Account[]{a1,a2},new Playable[]{a,v});
    }

}
