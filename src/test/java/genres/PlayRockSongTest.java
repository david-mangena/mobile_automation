package genres;

import Screens.GenresScreen;
import Screens.RockPlaylistScreen;
import base.AndoridUniversalMusicPlayerBaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayRockSongTest extends AndoridUniversalMusicPlayerBaseTest {

    @Test
    public void playRockSong(){
        GenresScreen genresScreen = homeScreen.clickOnGenresTxt();
        assertEquals(genresScreen.getRockSongsTaxt(),"Rock songs");
        RockPlaylistScreen rockPlaylistScreen = genresScreen.clickOnRockSongs();
        rockPlaylistScreen.playSong();
        rockPlaylistScreen.viewCurrentPlaySong();
    }
}
