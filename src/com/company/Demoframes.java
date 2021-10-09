package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoframes {

    public static String vText;

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.manage().window().maximize();
        my0.get("https://jqueryui.com/droppable/");
        Thread.sleep(4000);

         vText = my0.findElement(By.className("entry-title")).getText();
        System.out.println(vText);

        my0.switchTo().frame(my0.findElement(By.xpath("//iframe[@class='demo-frame']")));

        vText=my0.findElement(By.id("draggable")).getText();
        System.out.println(vText);
        WebElement source = my0.findElement(By.id("draggable"));
        WebElement dest = my0.findElement(By.id("draggable"));

        Actions act = new Actions(my0);
        act.dragAndDrop(source,dest);

        my0.switchTo().defaultContent();
        vText=my0.findElement(By.className("entry-title")).getText();
        System.out.println(vText);
        Thread.sleep(3000);
        my0.close();

    }

}
