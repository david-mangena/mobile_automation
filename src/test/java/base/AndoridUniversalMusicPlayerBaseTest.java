package base;

import java.net.MalformedURLException;
import java.net.URL;

import Screens.HomeScreen;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Android Browser Local Test.
 */
public class AndoridUniversalMusicPlayerBaseTest
{
	protected HomeScreen homeScreen;
	public static AndroidDriver<?> mobiledriver;

	@Before
	public void beforeTest( ) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.18.3");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "LMX52JBLVORAMMVGYG");
		capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\dmangena\\Documents\\TAU\\Windows\\resources\\UAMPMusicPlayerApp.apk");
		capabilities.setCapability("newCommandTimeout", 2000);
		mobiledriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		if (mobiledriver.isLocked()) {
			mobiledriver.unlockDevice();
		}
		homeScreen = new HomeScreen(mobiledriver);
	}
}