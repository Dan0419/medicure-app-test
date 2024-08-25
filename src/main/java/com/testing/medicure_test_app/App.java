package com.testing.medicure_test_app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//initialize the chrome driver
    			ChromeOptions options = new ChromeOptions();
    	    	options.addArguments("--headless");
    	    	
    		 	WebDriver driver = new ChromeDriver(options);
    		 	
    		 	//open the web application
    	        driver.get("http://44.200.151.7:8082/contact.html");
    	        
    	        //Read the title
    	        String title = driver.getTitle();
    	        System.out.println(title);
    	        
    	        //Define Timeout
    	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
    	        
    	        //1. Locate and Enter Name
    	        WebElement name = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[1]/div/input"));
    	        name.sendKeys("Danish");
    	            	            	        
    	        System.out.println(name);
    	        Thread.sleep(500);     
    	        
    	        //2. Locate and Enter Phone
    	        WebElement number = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div/input"));
    	        number.sendKeys("999999999");
    	        
    	        System.out.println(number);
    	        Thread.sleep(500);
    	        
    	        //3. Locate Email and Enter Email
    	        WebElement mail = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[2]/input"));
    	        mail.sendKeys("danish@xyz.com");
    	        
    	        System.out.println(mail);
    	        Thread.sleep(500);
    	        
    	        //4. Locate Message and Enter Message
    	        WebElement message = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[3]/input"));
    	        message.sendKeys("Hello, How are you ?");
    	        
    	        System.out.println(message);
    	        Thread.sleep(500);
    	        
    	       //5. Locate Send Button and click to send the message.
    	        WebElement sendButton = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/button"));
    	        sendButton.click();
    	        
    	        
    	        String response = driver.findElement(By.xpath("/html/body/section/div/div[2]/div[1]/div/div[4]/p")).getText();
    	        System.out.println(response);
    	        
    	        
    	        driver.quit();
       
    	
    	System.out.println( "Hello World!" );
    }
}
