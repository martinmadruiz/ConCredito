package org.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejercicio3
{
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver;
        String URL = "https://www.google.com/";

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("concredito");
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b") ).click();

        driver.findElement(By.name("q")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("q")).clear();

        driver.findElement(By.name("q")).sendKeys("MercadoLibre");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.close();



    }
}
