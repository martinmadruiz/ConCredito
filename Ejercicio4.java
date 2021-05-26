package org.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ejercicio4{
        public static void main (String[] args) throws InterruptedException {
            WebDriver driver;
            String URL = "https://www.google.com/";



            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();

            driver.get(URL);
            driver.manage().window().maximize();

            driver.findElement(By.name("q")).sendKeys("MercadoLibre");
            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

            Thread.sleep(1000);

            driver.findElement(By.cssSelector("#xjs > table > tbody > tr > td:nth-child(3) > a")).click();
             Thread.sleep(1000);

            List<WebElement> img = driver.findElements(By.id("wp_thbn_23"));

            if(img.size() != 0){
                System.out.println(" la pagina no cambio ");
            }else{//0, elemento no esta presente.
                System.out.println(" la pagina cambio correctamente ");
            }


           driver.close();

        }
        }