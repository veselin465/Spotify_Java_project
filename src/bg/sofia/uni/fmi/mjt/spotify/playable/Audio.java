package bg.sofia.uni.fmi.mjt.spotify.playable;

public class Audio implements Playable {

    private String title;
    private String artist;
    private int year;
    private double duration;
    private int totalPlays;

    public Audio(String title, String artist, int year, double duration) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.duration = duration;
        totalPlays = 0;
    }

    @Override
    public String play() {
        totalPlays++;
        return new String("Currently playing audio content: " + title);
    }

    @Override
    public int getTotalPlays() {
        return totalPlays;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public double getDuration() {
        return duration;
    }

}
