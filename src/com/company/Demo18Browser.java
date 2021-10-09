package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;

import java.util.Scanner;

public class Demo18Browser {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println(" Enter the Driver name : \t");
        String input = sc.nextLine();

        if (input == "FIREFOX")
        {
            System.setProperty("webdriver.Gecko.driver", "C:\\Bin\\geckodriver.exe");
            WebDriver my0 =new FirefoxDriver();
            my0.get("https://www.mortgagecalculator.org/");
            String title = my0.getTitle();
            System.out.println(title);
            my0.close();
        }else {
            System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
            WebDriver my0 =new ChromeDriver();
            my0.get("https://www.mortgagecalculator.org/");
            String title = my0.getTitle();
            System.out.println(title);
            my0.close();
        }


    }
}
