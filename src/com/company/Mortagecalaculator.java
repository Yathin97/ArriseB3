package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mortagecalaculator {


    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.get("https://www.mortgagecalculator.org/");

        Select select = new Select(my0.findElement(By.name("param[start_month]")));
        select.selectByIndex(4);
        Thread.sleep(2000);
        select.selectByIndex(8);
        Thread.sleep(4000);
        select.selectByVisibleText("Sep");
        Thread.sleep(2000);
        my0.close();

    }
}
