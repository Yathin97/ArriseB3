package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedinc {

    public static void main (String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        WebDriver my0 =new ChromeDriver();
        my0.get("https://www.linkedin.com/learning/?setupTimeGoal=false&showCongrats=false&u=26108514");
        my0.manage().window().maximize();
        my0.findElement(By.xpath("//a[@class='active ember-view nav-bar__item t-black--light t-12 t-normal']")).click();
        my0.findElement(By.xpath("//a[@class='ember-view browse-library-body__subitem t-14 t-black--light t-normal clamp-1']")).click();
        my0.close();


    }
}
