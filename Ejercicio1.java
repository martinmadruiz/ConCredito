package org.test.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Ejercicio1 {
    public static void main (String[] args){
        //instanciar objeto WebDriver
        WebDriver driver;
        //declarar variables
        String URL = "https://www.google.com/";
        String ActualResult = "";


        //indicar la localizacion de el archivo chromedriver.exe en la propiedad WebDriver.Chrome.Driver
        //System.getProperty("user.dir") = C:\..\..\SeleniumBasic
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        //abrir navegador chrome
        driver = new ChromeDriver();

        //navegar por la pagina
        driver.get(URL);
        driver.manage().window().maximize();



        driver.findElement(By.name("q")).sendKeys("amazon");
        driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")).sendKeys(Keys.ENTER);


        //obtener el titulo de la pagina web
        ActualResult = driver.getTitle();
        //imprimir resultado usando el operador ternario
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (ActualResult.contentEquals("amazon - Buscar con Google")){
            System.out.println (" Se valida cambio de pagina " );
        }else{
            System.out.println("no se cambio la pagina");
        }

        driver.close();


    }
}
