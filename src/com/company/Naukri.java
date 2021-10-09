package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Naukri {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Bin\\chromedriver.exe");
        WebDriver my0 = new ChromeDriver();
        my0.manage().window().maximize();
        my0.get("http://www.naukri.com/");

        String parent=my0.getWindowHandle();
        Set<String> s=my0.getWindowHandles();

        Iterator<String> I1= s.iterator();
        while(I1.hasNext()){

            String child_window= I1.next();

            if(!parent.equals(child_window))
            {
                my0.switchTo().window(child_window);
                System.out.println(my0.switchTo().window(child_window).getTitle());

                Thread.sleep(5000);
                my0.close();

            }

        }

        //switch to the parent window

        my0.switchTo().window(parent);

        Thread.sleep(5000);

        my0.quit();

    }
}
