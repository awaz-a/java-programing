package day34_void_methods;

public class EtsySearchTest {

    public static void main(String[] args) {
        System.out.println("--Starting Etsy Search Smoke Test--");
        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();
        System.out.println("-- Etsy Search Test completed - pass -");
    }
    public static void openBrowser(){
        System.out.println("Launching Chrome browser");
    }
    public static void navigateToEtsyUrl(){
        System.out.println("Navigating to hhtps:www.etsy.com/");
    }
    public static void searchForWoodenSpoon(){
        System.out.println("PASS: Verify Etsy home page is displayed");
        System.out.println("Type Search 'wooden spoon' in search field and click search");
    }
    public static void verifyResultsAreDisplayed(){
        System.out.println("PASS: Search results successfully displayed " );

    }
}
