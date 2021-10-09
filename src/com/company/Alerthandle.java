package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.manage().window().maximize();
        my0.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
        Thread.sleep(4000);

        JavascriptExecutor jse = (JavascriptExecutor)my0;
        jse.executeScript("window.scrollBy(0,250)");
        my0.findElement(By.xpath("//button[text()='Click me!']")).click();
        Thread.sleep(2000);
        System.out.println(my0.switchTo().alert().getText());
        my0.switchTo().alert().accept();
        Thread.sleep(4000);

        jse.executeScript("window.scrollBy(0,500)");

        my0.findElement(By.xpath("(//button[text()='Click me!'])[2]")).click();
        Thread.sleep(2000);
        System.out.println(my0.switchTo().alert().getText());
        my0.switchTo().alert().dismiss();
        Thread.sleep(4000);

        jse.executeScript("window.scrollBy(0,750)");

        my0.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
        Thread.sleep(4000);
        System.out.println(my0.switchTo().alert().getText());
        my0.switchTo().alert().sendKeys("Yathin");
        Thread.sleep(4000);
        my0.switchTo().alert().accept();
        Thread.sleep(4000);

        my0.close();




    }
}

