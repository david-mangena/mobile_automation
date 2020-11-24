package Screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen {
    public static AndroidDriver<?> mobiledriver;
    private By genresTxt = By.id("com.instantappsample.uamp:id/title");

    public HomeScreen(AndroidDriver mobiledriver){
        this.mobiledriver = mobiledriver;
    }



    public GenresScreen clickOnGenresTxt(){
        mobiledriver.findElement(genresTxt).click();
        return new GenresScreen(mobiledriver);
    }
}
