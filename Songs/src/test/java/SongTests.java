import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/*
public class SongTests {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private Song testSong;

    @Before
    public void init(){
        System.setOut(new PrintStream(out));
        this.testSong = new Song("TestSong", "TestSongGenre", 71, "Test song lyrics");
    }


    @Test
    public void shouldPrintSongLyrics(){
        testSong.printSongLyrics();
        Assert.assertEquals("Test song lyrics", out.toString().trim());
    }

    @Test
    public void shouldPrintSongDurations(){
        testSong.printSongDuration();
        Assert.assertEquals("Song duration: 1:11", out.toString().trim());
    }

    @Test
    public void shouldReturnCorrectMessageWithMatchingGenres(){
        testSong.checkIfGenresMatch("TestSongGenre");
        Assert.assertEquals("Genres match!", out.toString().trim());
    }

    @Test
    public void shouldReturnCorrectMessageWithDifferentGenres(){
        testSong.checkIfGenresMatch("DifferentGenre");
        Assert.assertEquals("Genre doesn't match!", out.toString().trim());
    }

}
*/