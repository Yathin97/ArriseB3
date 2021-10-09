package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testdemo1 {

    public WebDriver myd;

    public void openApp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        myd = new ChromeDriver();
        myd.get("https://www.amazon.in/");
        myd.manage().window().maximize();
        String vTtitle = myd.getTitle();
        System.out.println(vTtitle);


    }
}
