import enumeration.Genre;
import model.Author;
import model.Song;

/**
 * Application for creating songs and authors and using methods for manipulating them.
 *
 */
public class Application {

    public static void main(String[] args) {

        /*
         * Creating sample songs
         */
        Song pointsOfAuthority = new Song("Points of authority", Genre.ROCK, 267, "Lorem, ipsum ....");
        Song summerChillOut = new Song("Summer chill out", Genre.POP, 267, "Random lyrics for the random song");
        Song dubstep = new Song("Metamorphosis", Genre.DUBSTEP, 267, "This song has no Lyrics");

        /*
         * Creating sample author
         */
        Author chesterBenington = new Author("Chester Benington", 33);

        chesterBenington.addSong(pointsOfAuthority);
        chesterBenington.addSong(summerChillOut);
        chesterBenington.addSong(dubstep);

        /*
         * Manipulations with songs and their methods
         */
        System.out.println(pointsOfAuthority.toString());

        System.out.println("enumeration.Genre to compare - Rock\n" +
                pointsOfAuthority.checkIfGenresMatch("Rock") + "\n");

        System.out.println("enumeration.Genre to compare - pop\n" +
                pointsOfAuthority.checkIfGenresMatch("pop") + "\n");

        System.out.println(pointsOfAuthority.printSongDuration() + "\n");

        System.out.println("Lyrics:\n" +
                pointsOfAuthority.printSongLyrics() + "\n");

        /*
         * Manipulation with authors and their methods
         */
        System.out.println(chesterBenington.toString() + "\n");

        System.out.println(chesterBenington.listAuthorsSongs());
    }
}