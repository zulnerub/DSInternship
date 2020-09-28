import org.w3c.dom.ls.LSOutput;

public class Song {
    private String title;
    private String genre;
    private int timing;
    private String lyrics;

    public Song(String title, String genre, int timing, String lyrics) {
        this.title = title;
        this.genre = genre;
        this.timing = timing;
        this.lyrics = lyrics;
    }

    public void printSongLyrics(){
        System.out.println(this.lyrics);
    }

    public void printSongDuration(){
        int minutes = this.timing / 60;
        int seconds = this.timing % 60;

        System.out.println("Song duration: " + minutes + ":" + seconds);
    }

    public void checkIfGenresMatch(String genreToMatch){
        if (this.getGenre().toLowerCase().equals(genreToMatch.toLowerCase())){
            System.out.println("Genres match!");
        }else{
            System.out.println("Genre doesn't match");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Song Details:").append(System.lineSeparator());
        sb.append("\t* Title: ").append(this.getTitle()).append(System.lineSeparator());
        sb.append("\t* Genre: ").append(this.getGenre()).append(System.lineSeparator());
        sb.append("\t* Timing: ").append(this.getTiming()).append(System.lineSeparator());
        sb.append("\t* Lyrics: ").append(this.getLyrics()).append(System.lineSeparator());

        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public Song setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Song setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public int getTiming() {
        return timing;
    }

    public Song setTiming(int timing) {
        this.timing = timing;
        return this;
    }

    public String getLyrics() {
        return lyrics;
    }

    public Song setLyrics(String lyrics) {
        this.lyrics = lyrics;
        return this;
    }
}
