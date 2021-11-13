package bg.sofia.uni.fmi.mjt.spotify.library;

import bg.sofia.uni.fmi.mjt.spotify.exceptions.*;
import bg.sofia.uni.fmi.mjt.spotify.playable.Playable;
import bg.sofia.uni.fmi.mjt.spotify.playlist.Playlist;
import bg.sofia.uni.fmi.mjt.spotify.playlist.UserPlaylist;

import java.util.Arrays;

public class UserLibrary implements Library {

    private static int CAPACITY = 21;
    private Playlist[] library;
    private int size;

    public UserLibrary(){
        size = 0;
        library = new Playlist[CAPACITY];
        // the liked playlist is always on index 0 and has a default name of "Liked"
        library[size++] = new UserPlaylist("Liked"); //
    }

    @Override
    public void add(Playlist playlist) throws LibraryCapacityExceededException {
        if(size == CAPACITY) throw new LibraryCapacityExceededException();
        library[size++] = playlist;
    }

    @Override
    public void remove(String name) throws EmptyLibraryException, PlaylistNotFoundException {
        if(library[0].getName().equals(name)){
            throw new IllegalArgumentException("The liked playlist cannot be deleted");
        }
        if(size == 1) throw new EmptyLibraryException();
        for (int i = 1; i < size; i++) {
            if(library[i].getName().equals(name)){
                if(i != size - 1){
                    library[i] = library[size - 1];
                }
                size--;
                return;
            }
        }
        throw new PlaylistNotFoundException();
    }

    public void like(Playable playable) throws StreamingServiceException {
        try {
            library[0].add(playable);
        }catch(PlaylistCapacityExceededException c){
            throw new StreamingServiceException();
        }
    }

    @Override
    public Playlist getLiked() {
        return library[0];
    }
}
