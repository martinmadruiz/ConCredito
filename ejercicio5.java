package org.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ejercicio5
{
    public static void main (String[] args) throws InterruptedException {
        WebDriver driver;
        String URL = "https://www.google.com/";


        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(URL);
        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Ferrari");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#hdtb-msb > div:nth-child(1) > div > div:nth-child(2) > a")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#islrg > div.islrc > div:nth-child(1) > a.wXeWr.islib.nfEiy.mM5pbd > div.bRMDJf.islir > img")).click();

if (driver.findElement(By.id("Sva75c")).isDisplayed()){
    System.out.println("el visualizador se ejecuto correctamente");

    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"Sva75c\"]/div/div/div[2]/a/div")).click();
    Thread.sleep(2000);
    if (driver.findElement(By.id("Sva75c")).isDisplayed()){
        System.out.println("el visualizador no se cerro ");


    }else {
        System.out.println("el visualizador se cerro  ");
    }

}else {
    System.out.println("El visualizador no se ejecuto");
}

        driver.close();
    }
}

