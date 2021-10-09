package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testngdemo {

    public WebDriver myd;

    public void openApp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        myd = new ChromeDriver();
        myd.get("https://www.google.com/");
        myd.manage().window().maximize();
        String vTtitle = myd.getTitle();
        System.out.println(vTtitle);


    }
}
