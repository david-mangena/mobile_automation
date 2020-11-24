package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class GenresScreen {
    public static AndroidDriver<?> mobiledriver;
//    private By genresTxt = By.id("com.instantappsample.uamp:id/title\n");
    private By rockSongsText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");

    public GenresScreen(AndroidDriver mobiledriver){
        this.mobiledriver = mobiledriver;
    }

    public RockPlaylistScreen clickOnRockSongs(){
        mobiledriver.findElement(rockSongsText).click();
        return new RockPlaylistScreen(mobiledriver);
    }

    public String getRockSongsTaxt(){
        return mobiledriver.findElement(rockSongsText).getText();
    }
}
