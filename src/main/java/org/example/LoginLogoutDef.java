package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDef {
    WebDriver driver;
    @Given("Users launch the browser")
    public void users_launch_the_browser() {
        driver = new ChromeDriver();
    }
    @When("Users navigate to the URL {string}")
    public void users_navigate_to_the_url(String string) {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Then("U verify that the home page is visible successfully")
    public void u_verify_that_the_home_page_is_visible_successfully() {
        WebElement homePage = driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
        homePage.isDisplayed();
        System.out.println("Home page is visible");

    }
    @When("I click on {string} button")
    public void i_click_on_button(String string) {
        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signupLoginButton.click();

    }
    @Then("User verify {string} is visible")
    public void user_verify_is_visible(String string) {
        WebElement homePage = driver.findElement(By.cssSelector("body"));
        homePage.isDisplayed();

    }
    @When("U enter correct email address and password")
    public void u_enter_correct_email_address_and_password() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("jigish24@mail.com");
        passwordField.sendKeys("Jigish_24");

    }
    @When("I click {string} button")
    public void i_click_button(String string) {
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();


    }
    @Then("U verify that {string} is visible")
    public void u_verify_that_is_visible(String string) {
        WebElement loggedInVisible = driver.findElement(By.xpath("//body"));
        loggedInVisible.isDisplayed();


    }
    @Then("I verify that user is navigated to login page")
    public void i_verify_that_user_is_navigated_to_login_page() {
        WebElement loginPage = driver.findElement(By.xpath("//body"));
        loginPage.isDisplayed();

    }

}
