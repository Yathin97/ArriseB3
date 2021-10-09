package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.xml.ws.Action;

public class amazon {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.get("https://www.amazon.in/");

        Thread.sleep(4000);

        Actions act = new Actions(my0);
        act.moveToElement(my0.findElement(By.linkText("Hello, Sign in"))).build().perform();
        Thread.sleep(4000);
        my0.findElement(By.linkText("Hello, Sign in")).click();
        Thread.sleep(2000);

        my0.findElement(By.linkText("Sign in")).click();

        my0.close();


    }
}
