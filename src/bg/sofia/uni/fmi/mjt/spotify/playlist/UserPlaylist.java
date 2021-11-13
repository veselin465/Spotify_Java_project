package bg.sofia.uni.fmi.mjt.spotify.playlist;

import bg.sofia.uni.fmi.mjt.spotify.exceptions.PlaylistCapacityExceededException;
import bg.sofia.uni.fmi.mjt.spotify.playable.Playable;

public class UserPlaylist implements Playlist {

    private static int CAPACITY = 20;
    private String name;
    private Playable[] playlist;
    private int size;

    public UserPlaylist(String name){
        this.name = name;
        size = 0;
        playlist = new Playable[CAPACITY];
    }

    @Override
    public void add(Playable playable) throws PlaylistCapacityExceededException {
        if(size == CAPACITY) throw new PlaylistCapacityExceededException();
        playlist[size++] = playable;
    }

    @Override
    public String getName() {
        return name;
    }
}
