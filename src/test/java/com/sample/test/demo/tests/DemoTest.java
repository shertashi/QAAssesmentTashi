package com.sample.test.demo.tests;

import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DemoTest extends TestBase {

    @Test
    public void demoTest() {
        init();
         WebElement pizza1Sel=driver.findElement(By.xpath("//*[@id=\"pizza1Pizza\"]"));
         WebElement topping1Sel= driver.findElement(By.xpath("/html/body/div[1]/select[2]"));
         WebElement topping2Sel= driver.findElement(By.xpath("/html/body/div[1]/select[3]"));
         Select pizza1=new Select(pizza1Sel);
         Select topping1 = new Select(topping1Sel);
         Select topping2 = new Select(topping2Sel);
         pizza1.selectByVisibleText("Small 6 Slices - no toppings $6.75");
         topping1.selectByVisibleText("Olives");
         topping2.selectByVisibleText("Olives");
         
         WebElement quantity= driver.findElement(By.xpath("//*[@id=\"pizza1Qty\"]"));
         quantity.sendKeys("2");
         WebElement name= driver.findElement(By.xpath("//*[@id=\"name\"]"));
         name.sendKeys("Tashi Sherpa");
         WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
         email.sendKeys("tashi.sherpa@gmail.com");
         WebElement phone= driver.findElement(By.xpath("//*[@id=\"phone\"]"));
         phone.sendKeys("(469) 230-3309");
         WebElement creditCard= driver.findElement(By.xpath("//*[@id=\"ccpayment\"]"));
         creditCard.click();
         driver.findElement(By.xpath("//*[@id=\"placeOrder\"]")).click();
    }

}
