public class Application {

    public static void main(String[] args) {

        // Create songs
        Song songOne = new Song("Points of authority","Rock", 267, "Lorem, ipsum ....");
        Song songTwo = new Song("Random song title","Pop", 267, "Random lyrics for the random song");
        Song songThree = new Song("Metamorphosis","Dubstep", 267, "This song has no Lyrics");


        //Create author
        Author authorOne = new Author();
        try {
            authorOne.setName("Chester");
            authorOne.setAge(20);
            authorOne.getSongs().add(songOne);
            authorOne.getSongs().add(songTwo);
            authorOne.getSongs().add(songThree);
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }



        // Print song details
        System.out.println(songOne.toString());

        // Genre match check
        System.out.println("Genre to compare - Rock");
        songOne.checkIfGenresMatch("Rock");
        System.out.println();

        System.out.println("Genre to compare - pop");
        songOne.checkIfGenresMatch("pop");
        System.out.println();

        // Print song duration
        songOne.printSongDuration();
        System.out.println();

        // Print song lyrics
        System.out.println("Lyrics:");
        songOne.printSongLyrics();
        System.out.println();

        //Print Author name and age

            authorOne.printAuthorNameAndAge();





        //Print Author with songs
        System.out.println(authorOne.listAuthorWithSongs());
    }
}
