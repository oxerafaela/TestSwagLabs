import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestandoSwagLabs {

   @Test
   public void TesteDeLoginValido1(){

      // define o google chrome como navegador
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

      // chama o chrome de robozinho
      WebDriver robozinho = new ChromeDriver();

      // ACESSAR O SITE
      robozinho.get("https://www.saucedemo.com/");

      // VERIFICACAO
      assertEquals("Swag Labs", robozinho.getTitle());

      robozinho.findElement(By.id("user-name")).sendKeys("standard_user");
      robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
      robozinho.findElement(By.id("login-button")).click();

      assertEquals(
              "PRODUCTS",
              robozinho.findElement(By.className("title")).getText()
      );

      robozinho.quit();
   }

   @Test
   public void TesteDeLoginValido2(){

      // define o google chrome como navegador
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

      // chama o chrome de robozinho
      WebDriver robozinho = new ChromeDriver();

      // ACESSAR O SITE
      robozinho.get("https://www.saucedemo.com/");

      // VERIFICACAO
      assertEquals("Swag Labs", robozinho.getTitle());

      robozinho.findElement(By.id("user-name")).sendKeys("locked_out_user");
      robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
      robozinho.findElement(By.id("login-button")).click();

      assertEquals(
              "Epic sadface: Sorry, this user has been locked out.",
              robozinho.findElement(By.cssSelector("h3[data-test=error]")).getText()
      );

      robozinho.quit();
   }

   @Test
   public void TesteDeLoginValido3(){

      // define o google chrome como navegador
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

      // chama o chrome de robozinho
      WebDriver robozinho = new ChromeDriver();

      // ACESSAR O SITE
      robozinho.get("https://www.saucedemo.com/");

      // VERIFICACAO
      assertEquals("Swag Labs", robozinho.getTitle());

      robozinho.findElement(By.id("user-name")).sendKeys("problem_user");
      robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
      robozinho.findElement(By.id("login-button")).click();

      assertEquals(
              "PRODUCTS",
              robozinho.findElement(By.className("title")).getText()
      );

      robozinho.quit();
   }

   @Test
   public void TesteDeLoginValido4(){

      // define o google chrome como navegador
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

      // chama o chrome de robozinho
      WebDriver robozinho = new ChromeDriver();

      // ACESSAR O SITE
      robozinho.get("https://www.saucedemo.com/");

      // VERIFICACAO
      assertEquals("Swag Labs", robozinho.getTitle());

      robozinho.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
      robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
      robozinho.findElement(By.id("login-button")).click();

      assertEquals(
              "PRODUCTS",
              robozinho.findElement(By.className("title")).getText()
      );

       robozinho.quit();
   }

   @Test
   public void TesteDeLoginValido5(){

      // define o google chrome como navegador
      System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

      // chama o chrome de robozinho
      WebDriver robozinho = new ChromeDriver();

      // ACESSAR O SITE
      robozinho.get("https://www.saucedemo.com/");

      // VERIFICACAO
      assertEquals("Swag Labs", robozinho.getTitle());

      robozinho.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
      robozinho.findElement(By.id("password")).sendKeys("secret_sauce");
      robozinho.findElement(By.id("login-button")).click();

      assertEquals(
              "PRODUCTS",
              robozinho.findElement(By.className("title")).getText()
      );

      robozinho.quit();
   }

}
