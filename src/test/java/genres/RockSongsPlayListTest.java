package genres;

import Screens.GenresScreen;
import Screens.RockPlaylistScreen;
import base.AndoridUniversalMusicPlayerBaseTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockSongsPlayListTest extends AndoridUniversalMusicPlayerBaseTest {

    @Test
    public void testRockPlaylist(){
     GenresScreen genresScreen = homeScreen.clickOnGenresTxt();
     assertEquals(genresScreen.getRockSongsTaxt(),"Rock songs");
     RockPlaylistScreen rockPlaylistScreen = genresScreen.clickOnRockSongs();
     assertEquals(rockPlaylistScreen.getRockPlayList(),"Wish You'd Come True");
    }
}
