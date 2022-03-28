package com.syntax.class24;

public class BrowserTester {
    public static void main(String[] args) {
        //GoogleChrome gh = new GoogleChrome();
        //gh.openBrowser();

        Browser[] browsers = {new Browser(), new GoogleChrome(), new FireFox(), new Safari() };
        for(Browser br: browsers){
            br.openBrowser();
            br.loadPage("www.google.com");
            br.testThePage();
            br.closeBrowser();
        }
    }
}
