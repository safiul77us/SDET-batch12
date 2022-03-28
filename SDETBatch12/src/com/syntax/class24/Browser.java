package com.syntax.class24;



public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String URL){
        System.out.println("Loading the website"+URL);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String URL){
        System.out.println("Loading the website"+URL+" in GoogleChrome");
    }
    void testThePage(){
        System.out.println("Testing the page in GoogleChrome ");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome browser");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the FireFox browser");
    }
    void loadPage(String URL){
        System.out.println("Loading the website"+URL+" in FireFox");
    }
    void testThePage(){
        System.out.println("Testing the page in FireFox ");
    }
    void closeBrowser(){
        System.out.println("Closing the FireFox browser");
    }
}
class Safari extends Browser{
    void openBrowser(){
        System.out.println("Opening the Safari browser");
    }
    void loadPage(String URL){
        System.out.println("Loading the website"+URL+" in Safari ");
    }
    void testThePage(){
        System.out.println("Testing the page in Safari ");
    }
    void closeBrowser(){
        System.out.println("Closing the Safari browser");
    }
}