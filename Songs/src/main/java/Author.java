import java.util.ArrayList;
import java.util.List;

/**
 **
 */
public class Author {
    //Declaring class fields
    private String name;
    private int age;
    private List<Song> songs;

    // Constructor with parameters - name and age, and initializing the list of songs
    public Author(String name, int age) {
        this.setName(name);
        this.setAge(age);
        this.setSongs(new ArrayList<>());
    }

    public Author() {
        this.setSongs(new ArrayList<>());
    }

    // method to print the authors name and age
    public void printAuthorNameAndAge(){
        if (this.age != 0){
            System.out.printf("%s - %d%n", this.getName(), this.getAge());
        }else{
            System.out.println("Author age is not valid!");
        }

    }

    // Using StringBuilder and a for loop to create a string representation of
    // the author name and the list of songs he has created
    public String listAuthorWithSongs(){
        StringBuilder sb = new StringBuilder();

        sb.append("Author name: ").append(this.name).append(", List of songs:").append(System.lineSeparator());

        if (!this.getSongs().isEmpty()){
            for (Song s : this.songs) {
                sb.append("\t* ").append(s.getTitle()).append(System.lineSeparator());
            }
        }


        return sb.toString();
    }

    //Getters and Setters for the class fields

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 12 && age < 125){
            this.age = age;
        }else{
            throw new IllegalArgumentException("The age of the author must be between 12 and 150!");
        }

    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
