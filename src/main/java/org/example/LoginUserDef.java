package org.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUserDef {
    WebDriver driver;
    @When("I navigate to the URL {string}")
    public void i_navigate_to_the_url(String string) {
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Then("I verify that the home page is visible successfully")
    public void i_verify_that_the_home_page_is_visible_successfully() {
        WebElement homePage = driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
        homePage.isDisplayed();
        System.out.println("Home page is visible");

    }
    @When("I click on Signup  Login button")
    public void i_click_on_signup_login_button() {
        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signupLoginButton.click();

    }
    @Then("I verify {string} is visible")
    public void i_verify_is_visible(String string) {
        WebElement homePage = driver.findElement(By.cssSelector("body"));
        homePage.isDisplayed();

    }
    @When("I enter correct email address and password")
    public void i_enter_correct_email_address_and_password() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("jigish24@gmail.com");
        passwordField.sendKeys("Jigish_24");

    }
    @When("User click LogIn button")
    public void user_click_log_in_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();

    }
    @Then("User verify that Logged in as username is visible")
    public void user_verify_that_logged_in_as_username_is_visible() {
        WebElement loggedInVisible = driver.findElement(By.xpath("//body"));
        loggedInVisible.isDisplayed();

    }
    @Then("User delete account button")
    public void user_delete_account_button() {
        WebElement deleteAccountButton = driver.findElement(By.cssSelector("a[href='/delete_account']"));
        deleteAccountButton.click();
    }
    @Then("I verify that {string} is visible")
    public void i_verify_that_is_visible(String string) {
        WebElement accountDeleted = driver.findElement(By.xpath("//body"));
        accountDeleted.isDisplayed();
    }

}


