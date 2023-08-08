package com.demo;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ChromeOptions opt=new ChromeOptions();
           opt.addArguments("--remote-allow-origins=*");
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
           
           WebDriver driver=new ChromeDriver(opt);
           
           driver.get("https://www.facebook.com/");
           driver.manage().window().maximize();
           
           driver.findElement(By.id("email")).sendKeys("www.bharathben@gmail.com");
           driver.findElement(By.name("pass")).sendKeys("1128595788393");
           driver.findElement(By.name("login")).click();

	}

}
