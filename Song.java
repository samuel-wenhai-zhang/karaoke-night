public class Song {
    private String title;
    private String artist;
    private String length;
    private int index;

    public Song(String title, String artist, String length, int index) {
        this.title = title;
        this.artist = artist;
        this.length = length;
        this.index = index;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return index + " - " + title + " by " + artist + "  " + length;
    }
}
