package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Links {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.get("https://www.google.com/");

        int val = my0.findElements(By.tagName("a")).size();
        System.out.println(val);

        for (int i=0;i<val;i++){
            String vlink = my0.findElements(By.tagName("a")).get(i).getText();
            System.out.println(vlink);
            if (vlink=="Sign in"){
                my0.findElement(By.className("gb_3 gb_4 gb_3d gb_3c")).click();
            }

        }

        my0.close();

    }
}
