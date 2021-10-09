package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Google {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item to be searched:\t");
        String input = sc.nextLine();
        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.get("https://www.google.com/");
        my0.manage().window().maximize();
        my0.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys(input);
        my0.findElement(By.xpath("//input[@class='gNO89b']")).submit();
        Thread.sleep(5000);
        WebElement e = my0.findElement(By.xpath("//*[text()='Selenium']"));
        System.out.println("SEARCH PAGE CONTAINS RESULT: " + e.getText() );
        WebElement b = my0.findElement(By.id("result-stats"));
        System.out.println("Total search result: "+b.getText());
        my0.close();

    }
}
