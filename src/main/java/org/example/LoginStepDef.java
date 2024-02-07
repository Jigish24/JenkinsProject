package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LoginStepDef {
    WebDriver driver;

    @Given("I am on logg in page")
    public void i_am_on_logg_in_page() {
        driver = new ChromeDriver();
        String baseURL = "https://demo.nopcommerce.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        System.out.println("Login page run");
    }
    @When("I enter valid username")
    public void i_enter_valid_username() {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        emailField.sendKeys("jigish24@gmail.com");
        Assert.assertTrue(emailField.isDisplayed());
        System.out.println(emailField);

    }
    @When("I Enter Valid Password")
    public void i_enter_valid_password() {
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("Jigish_24");
        Assert.assertTrue(passwordField.isDisplayed());
        System.out.println("passwordField");

    }
    @When("I click on Login button")
    public void i_click_on_login_button() {
      WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
      loginButton.click();
        System.out.println("Login button clicked");

    }
    @Then("I should Login")
    public void i_should_login() {
        System.out.println("login successful");
    }
    @Then("I should see Log in massage Welcome")
    public void i_should_see_log_in_massage_welcome() throws InterruptedException {
        System.out.println("Welcome message");
        Thread.sleep(2000);
    }
    @Given("I am on login page")
    public void i_am_on_login_page() {
        driver = new ChromeDriver();
        String baseURL = "https://demo.nopcommerce.com/";
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        System.out.println("Login page run");

    }

    @When("I Enter {string} and {string}")
    public void i_enter_and(String Username, String passwords) {
       driver.findElement(By.className("email")).sendKeys(Username);
       driver.findElement(By.id("Password")).sendKeys(passwords);
       driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
       throw new io.cucumber.java.PendingException();
    }
    @Then("I Should see outcome")
    public void i_should_see_outcome() {
        System.out.println("Can see the result");
        throw new io.cucumber.java.PendingException();

    }



    }
