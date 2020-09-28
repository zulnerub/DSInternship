import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private int age;
    private List<Song> songs;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        this.songs = new ArrayList<>();
    }

    public void printAuthorNameAndAge(){
        System.out.printf("%s - %d%n", this.getName(), this.getAge());
    }
    
    public String listAuthorWithSongs(){
        StringBuilder sb = new StringBuilder();

        sb.append("Author name: ").append(this.name).append(", List of songs:").append(System.lineSeparator());

        for (Song s : this.songs) {
            sb.append("\t* ").append(s.getTitle()).append(System.lineSeparator());
        }

        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public Author setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Author setAge(int age) {
        this.age = age;
        return this;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Author setSongs(List<Song> songs) {
        this.songs = songs;
        return this;
    }
}
