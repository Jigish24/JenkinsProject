package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExistingEmailDef {
    WebDriver driver;

    @Given("Us launch the browser")
    public void us_launch_the_browser() {
        driver = new ChromeDriver();

    }
    @When("Us navigate to the URL {string}")
    public void us_navigate_to_the_url(String string) {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

    }
    @Then("Us verify that the home page is visible successfully")
    public void us_verify_that_the_home_page_is_visible_successfully() {
        WebElement homePage = driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
        homePage.isDisplayed();
        System.out.println("Home page is visible");

    }
    @When("Us click on {string} button")
    public void us_click_on_button(String string) {
        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signupLoginButton.click();


    }
    @Then("Us verify {string} is visible")
    public void us_verify_is_visible(String string) {
        WebElement homePage = driver.findElement(By.cssSelector("body"));
        homePage.isDisplayed();


    }
    @When("I enter name and already registered email address")
    public void i_enter_name_and_already_registered_email_address() {
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement emailField = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        nameField.sendKeys("Jigish Patel");
        emailField.sendKeys("jigish24@gmail.com");


    }
    @When("Us click {string} button")
    public void us_click_button(String string) {
        WebElement signupButton = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
        signupButton.click();


    }
    @Then("Us verify error {string} is visible")
    public void us_verify_error_is_visible(String string) {
        WebElement visiblePage = driver.findElement(By.xpath("//section[@id='form']//div[@class='row']"));
        visiblePage.isDisplayed();

    }

}
