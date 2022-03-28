package com.syntax.class25;

public interface WebDriver {
    void openBrowser();
    void maximizeWindow();
    void findElement();
    void closeBrowser();
}

class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening Chrome browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing chrome browser");
    }
    @Override
    public void findElement(){
        System.out.println("Finding Chrome browser elements");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Chrome browser elements");
    }
}

class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser(){
        System.out.println("Opening Firefox browser");
    }
    @Override
    public void maximizeWindow(){
        System.out.println("Maximizing Firefox browser");
    }
    @Override
    public void findElement(){
        System.out.println("Finding Firefox browser elements");
    }
    @Override
    public void closeBrowser(){
        System.out.println("Closing Firefox browser elements");
    }
}
