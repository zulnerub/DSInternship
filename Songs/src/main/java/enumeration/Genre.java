package enumeration;

/**
 * Genre is an enumeration to store the songs different genre types.
 */
public enum Genre {
    POP("pop music"),
    ROCK("rock music"),
    RAP("rap music"),
    DUBSTEP("dubstep music");

    private String name;

    Genre(String name) {
        this.name = name;
    }
}
