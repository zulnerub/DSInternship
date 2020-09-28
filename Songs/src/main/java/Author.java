import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * * Create object author that has name, age and list of songs.
 * Has methods to print author's songs, authors name and age, add song
 */
public class Author {
    private List<Song> songs = new ArrayList<>();
    private String name;
    private int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return String - Author details : name and age
     */
    @Override
    public String toString() {
        return "Author:" +
                "name: '" + name + '\'' +
                ", age: " + age;
    }

    /**
     * @return String - author's name and his songs listed below on new line
     */
    public String listAuthorsSongs() {
        return "Author name: " +
                this.name +
                ",\nList of songs:" +
                System.lineSeparator() +
                songs.stream()
                        .map(Song::getTitle)
                        .collect(Collectors.joining("\n"));
    }

    /**
     * @param song Adds a song to the author's collection of songs
     */
    public void addSong(Song song) {
        songs.add(song);
    }

}