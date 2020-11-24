package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class RockPlaylistScreen {
    private AndroidDriver<?> mobiledriver;
    private By rockPlayList = By.id("com.instantappsample.uamp:id/title");
    private By the126ers = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget." +
            "LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget." +
            "FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget." +
            "FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget." +
            "RelativeLayout[1]/android.widget.LinearLayout/android.widget.TextView[2]");
    private By viewPlaySong = By.xpath("//android.widget.TextView[@content-desc=\"Song currently playing\"]");

    public RockPlaylistScreen(AndroidDriver<?> mobiledriver) {
        this.mobiledriver = mobiledriver;
    }

    public String getRockPlayList(){
        return mobiledriver.findElement(rockPlayList).getText();
    }

    public void playSong(){
        mobiledriver.findElement(the126ers).click();
    }

    public void viewCurrentPlaySong(){
        mobiledriver.findElement(viewPlaySong).click();
    }

}
