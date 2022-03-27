package project2Coding;

public interface WebDriver { 
    /*
    1. Create a WebDriver Interface:
        void open()
        void close()
        String getTitle()
    2. Create TakesScreenshot Interface:
        void getScreenshot()
    3. Create RemoteWebDriver Interface that inherits from WebDriver and TakesScreenshot:
        void navigate()
    4. Create 3 classes ChromeDriver, FirefoxDriver, SafariDriver that implements functionality defined in the RemoteWebDriver Interface
     */



    void open ();
    void close ();
    String getTitle ();
}
interface TakesScreenShot {
    void getScreenshot ();
}
interface RemoteWebDriver extends WebDriver, TakesScreenShot {
    void navigate ();
}
class ChromeDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("chrome opens browser");
    }
    @Override
    public void close() {
        System.out.println("chrome closes browser");
    }
    @Override
    public String getTitle() {
        return "the title of the chrome browser webpage";
    }
    @Override
    public void getScreenshot() {
        System.out.println("chrome takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("chrome navigates to  google.com");
    }
}
class FirefoxDriver implements RemoteWebDriver {
    @Override
    public void open() {
        System.out.println("mozilla opens browser");
    }
    @Override
    public void close() {
        System.out.println("mozilla closes browser");
    }
    @Override
    public String getTitle() {
        return "the title of the mozilla browser webpage";
    }
    @Override
    public void getScreenshot() {
        System.out.println("mozilla takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("mozilla navigates to  google.com");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("safari opens browser");
    }
    @Override
    public void close() {
        System.out.println("safari closes browser");
    }
    @Override
    public String getTitle() {
        return  "the title of the mozilla browser webpage";
    }
    @Override
    public void getScreenshot() {
        System.out.println("safari takes a screenshot");
    }
    @Override
    public void navigate() {
        System.out.println("safari navigates to  google.com");
    }
}
class WebTester {
    public static void main(String[] args) {
        RemoteWebDriver[] driver = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};
        for (RemoteWebDriver d : driver) {
            d.open();
            d.navigate();
            System.out.println(d.getTitle());
            d.getScreenshot();
            d.close();

        }
    }
}
