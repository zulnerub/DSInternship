package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * * Create Object of Type model.Author. Can have Objects of type model.Song assigned to it in a collection.
 * Has methods to interact with the class fields.
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
     * Gets the name and age of the author formats them and creates a string representation.
     *
     * @return String - model.Author details : name and age
     */
    @Override
    public String toString() {
        return "Author:" +
                "name: '" + name + '\'' +
                ", age: " + age;
    }

    /**
     * This method gets the authors name and songs
     * - iterates the songs and creates a string representation of the authors name and the songs titles.
     *
     * @return String - author's name and his songs listed below on new line
     */
    public String listAuthorsSongs() {
        return "Author name: " +
                name +
                ",\nList of songs:\n" +
                songs.stream()
                        .map(Song::getTitle)
                        .collect(Collectors.joining("\n"));
    }

    /**
     * This method gets the author's collection of songs and adds one model.Song to the collection.
     *
     * @param song - model.Song to be added to the authors collection of songs.
     */
    public void addSong(Song song) {
        songs.add(song);
    }

}