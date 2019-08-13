package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FirefoxBaseDocker {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:4444/wd/hub");
        DesiredCapabilities capabilities =DesiredCapabilities.firefox();

        RemoteWebDriver remoteWebDriver = new RemoteWebDriver(url, capabilities);
        remoteWebDriver.get("http://google.com");
        System.out.println(remoteWebDriver.getTitle());

    }



}
