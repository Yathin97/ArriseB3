package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Casestudy2 {


        public static void main (String[] args) throws InterruptedException {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the item to be searched:");
            String input = sc.nextLine();

            System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
            WebDriver my0 = new ChromeDriver();
            my0.get("https://www.google.com/");
            my0.manage().window().maximize();

            my0.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys(input);
            Thread.sleep(2000);
            my0.findElement(By.xpath("//input[@class='gNO89b']")).submit();
            Thread.sleep(5000);

            my0.findElement(By.xpath("//a[@href='https://www.google.com/gmail/']")).click();
            Thread.sleep(3000);
            my0.findElement(By.xpath("//a[@href='https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser']")).click();
            Thread.sleep(3000);

            String titlename = my0.getTitle();
            System.out.println("CURRENT PAGE TITLE :"+ titlename);

            my0.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click();
            Thread.sleep(3000);

            Set<String> GID = my0.getWindowHandles();
            Iterator<String> GIT = GID.iterator();
            String GP = GIT.next();
            String GC = GIT.next();
            my0.switchTo().window(GC);

            System.out.println("HELP PAGE TITLE :"+ my0.getTitle());
            my0.quit();

        }



}
