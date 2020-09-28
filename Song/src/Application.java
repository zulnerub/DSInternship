public class Application {

    public static void main(String[] args) {

        // Create song
        Song songOne = new Song("Points of authority","Rock", 267, "Lorem, ipsum ....");


        // Print song details
        System.out.println(songOne.toString());

        // Genre match check
        System.out.println("Genre to compare - Rock");
       songOne.checkIfGenresMatch("Rock");

        System.out.println("Genre to compare - pop");
        songOne.checkIfGenresMatch("pop");

        // Print song duration
        songOne.printSongDuration();

        // Print song lyrics
        songOne.printSongLyrics();
    }
}
