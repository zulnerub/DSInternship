
public class Song {
    // Declaring class fields
    private String title;
    private String genre;
    private int timing;
    private String lyrics;

    //Constructor with parameters, initializing the class fields
    public Song(String title, String genre, int timing, String lyrics) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setTiming(timing);
        this.setLyrics(lyrics);
    }

    //method to print the songs lyrics on the console
    public void printSongLyrics(){
        System.out.println(this.getLyrics());
    }

    //method to print the song duration - mm:ss
    public void printSongDuration(){
        int minutes = this.getTiming() / 60;
        int seconds = this.getTiming() % 60;

        System.out.println("Song duration: " + minutes + ":" + seconds);
    }

    //method checking if provided genre is the same as song's genre
    //and returning result as massage
    public void checkIfGenresMatch(String genreToMatch){
        if (this.getGenre().toLowerCase().equals(genreToMatch.toLowerCase())){
            System.out.println("Genres match!");
        }else{
            System.out.println("Genre doesn't match");
        }
    }

    //Overriding the toString() method to print the song's characteristics as wanted
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

    // Getters and Setters for the class fields

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
