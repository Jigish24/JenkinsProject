package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectLoginDef {
    WebDriver driver;

    @Given("User launch the browser")
    public void user_launch_the_browser() {
        driver = new ChromeDriver();

    }

    @When("User navigate to the URL {string}")
    public void user_navigate_to_the_url(String string) {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

    }

    @Then("User verify that the home page is visible successfully")
    public void user_verify_that_the_home_page_is_visible_successfully() {
        WebElement homePage = driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
        homePage.isDisplayed();
        System.out.println("Home page is visible");

    }

    @When("User click on {string} button")
    public void user_click_on_button(String string) {
        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signupLoginButton.click();

    }

    @Then("Use verify {string} is visible")
    public void use_verify_is_visible(String string) {
        WebElement homePage = driver.findElement(By.cssSelector("body"));
        homePage.isDisplayed();

    }

    @When("I enter incorrect email address and password")
    public void i_enter_incorrect_email_address_and_password() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("jigish@mail.com");
        passwordField.sendKeys("Jigish24");

    }

    @When("Use click {string} button")
    public void use_click_button(String string) {
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();


    }

    @Then("I verify error {string} is visible")
    public void i_verify_error_is_visible(String string) {
     WebElement errorP = driver.findElement(By.xpath("//section[@id='form']"));
     errorP.isDisplayed();

    }
}
