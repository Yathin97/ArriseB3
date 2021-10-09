package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Casestudy1 {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Bin\\chromedriver.exe");
        WebDriver my0 =new ChromeDriver();
        my0.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
        my0.manage().window().maximize();
        JavascriptExecutor jse = (JavascriptExecutor)my0;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(4000);
        
        my0.findElement(By.id("food")).sendKeys("150");
        Thread.sleep(2000);

        my0.findElement(By.id("clothing")).sendKeys("150");
        Thread.sleep(2000);

        my0.findElement(By.id("shelter")).sendKeys("150");
        Thread.sleep(2000);

        jse.executeScript("window.scrollBy(0,700)");

        Thread.sleep(4000);

        my0.findElement(By.id("monthlyPay")).sendKeys("5000");
        Thread.sleep(2000);

        my0.findElement(By.id("monthlyOther")).sendKeys("500");
        Thread.sleep(2000);

        String monthlyexpenses = my0.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");

        System.out.println("Monthly expenses : "+ monthlyexpenses );

        String monthlyincome = my0.findElement(By.id("totalMonthlyIncome")).getAttribute("value");

        System.out.println("Monthly Income : "+ monthlyincome );

        String budget = my0.findElement(By.id("underOverBudget")).getAttribute("value");

        System.out.println("Your Budget : "+ budget );

        double bud = Double.parseDouble(budget);

        if (bud >0){
            System.out.println("You are on budget");
        }else {
            System.out.println("you are over budget");
        }

        jse.executeScript("window.scrollBy(0,850)");

        Thread.sleep(4000);


        my0.close();
    }
}
