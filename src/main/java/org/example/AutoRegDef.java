package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class AutoRegDef {
    WebDriver driver;
    @Given("I launch the browser")
    public void i_launch_the_browser() {

        driver = new ChromeDriver();
    }
    @When("I navigate to the URL")
    public void i_navigate_to_the_url() {
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();
    }
    @Then("I verify that the home page is visible")
    public void i_verify_that_the_home_page_is_visible() {
        WebElement homePage = driver.findElement(By.cssSelector("header[id='header'] li:nth-child(1) a:nth-child(1)"));
        homePage.isDisplayed();
        System.out.println("Home page is visible");

    }
    @When("I click on Signup Login button")
    public void i_click_on_signup_login_button() {
        WebElement signupLoginButton = driver.findElement(By.linkText("Signup / Login"));
        signupLoginButton.click();


    }
    @Then("I verify New User Signup is visible")
    public void i_verify_new_user_signup_is_visible() {
        WebElement homePage = driver.findElement(By.cssSelector("body"));
        homePage.isDisplayed();
    }
    @When("I enter the following details")
    public void i_enter_the_following_details(io.cucumber.datatable.DataTable dataTable) {
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement emailField = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

        nameField.sendKeys("Jigish Patel");
        emailField.sendKeys("jigish1232000@yahoo.co.in");
    }
    @When("I click Signup button")
    public void i_click_signup_button() {
        WebElement signupButton = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
        signupButton.click();
    }
    @Then("I verify that ENTER ACCOUNT INFORMATION is visible")
    public void i_verify_that_enter_account_information_is_visible() {
        WebElement accountInfo = driver.findElement(By.xpath("//body/section[@id='form']/div[@class='container']/div[1]"));
        accountInfo.isDisplayed();
    }
    @When("I fill in the following details")
    public void i_fill_in_the_following_details(io.cucumber.datatable.DataTable dataTable) {
        WebElement titleField = driver.findElement(By.cssSelector("#id_gender1"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement dayDD = driver.findElement(By.xpath("//select[@id='days']"));
        Select day = new Select(dayDD);
        Assert.assertEquals(day.getFirstSelectedOption().getText(),"Day");

        WebElement monthDD = driver.findElement(By.xpath("//select[@id='months']"));
        Select month = new Select(monthDD);
        month.selectByVisibleText("August");
        assertEquals(month.getFirstSelectedOption().getText(),"August");

        WebElement yearDD = driver.findElement(By.xpath("//select[@id='years']"));
        Select year = new Select(yearDD);
        year.selectByValue("1980");
        assertEquals(year.getFirstSelectedOption().getText(),"1980");


        titleField.click();
        passwordField.sendKeys("Jigish_24");

    }
    @When("I select checkbox Sign up for our newsletter")
    public void i_select_checkbox_sign_up_for_our_newsletter() {
        WebElement newsletter = driver.findElement(By.xpath("//input[@id='newsletter']"));
        newsletter.isDisplayed();
    }
    @When("I select checkbox Receive special offers from our partners")
    public void i_select_checkbox_receive_special_offers_from_our_partners() {
        WebElement specialOffers = driver.findElement(By.xpath("//input[@id='optin']"));
        specialOffers.isDisplayed();
    }
    @When("I fill in the following additional details")
    public void i_fill_in_the_following_additional_details(io.cucumber.datatable.DataTable dataTable) {
        WebElement firstNameField = driver.findElement(By.id("first_name"));
        WebElement lastNameField = driver.findElement(By.id("last_name"));
        WebElement companyField = driver.findElement(By.id("company"));
        WebElement addressField = driver.findElement(By.id("address1"));
        WebElement address2Field = driver.findElement(By.id("address2"));
        WebElement countryField = driver.findElement(By.id("country"));
        WebElement statField = driver.findElement(By.id("state"));
        WebElement cityField = driver.findElement(By.id("city"));
        WebElement zipcodeField = driver.findElement(By.id("zipcode"));
        WebElement mobileNumberField = driver.findElement(By.id("mobile_number"));

        firstNameField.sendKeys("Jigish");
        lastNameField.sendKeys("Patel");
        companyField.sendKeys("JB Financial");
        addressField.sendKeys("4");
        address2Field.sendKeys("Chiltern road");
        countryField.sendKeys("UK");
        statField.sendKeys("Northamptonshire");
        cityField.sendKeys("Corby");
        zipcodeField.sendKeys("NN188GW");
        mobileNumberField.sendKeys("01234567890");
    }
    @When("I click Create Account button")
    public void i_click_create_account_button() {
        WebElement createAccountButton = driver.findElement(By.xpath("//button[normalize-space()='Create Account']"));
        createAccountButton.click();
    }
    @Then("I verify that ACCOUNT CREATED is visible")
    public void i_verify_that_account_created_is_visible() {
        WebElement accountCreatedMessage = driver.findElement(By.xpath("//h2[@class='title text-center']"));
        assert accountCreatedMessage.isDisplayed();
    }
    @Then("I click Continue button")
    public void i_click_continue_button() {
        WebElement continueButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
        continueButton.click();
    }
    @Then("I verify that Logged in as username is visible")
    public void i_verify_that_logged_in_as_username_is_visible() {
        WebElement loggedInMessage = driver.findElement(By.xpath("//li[10]//a[1]"));
        loggedInMessage.isDisplayed();
    }
    @When("I click Delete Account button")
    public void i_click_delete_account_button() {
        WebElement deleteAccountButton = driver.findElement(By.cssSelector("a[href='/delete_account']"));
        deleteAccountButton.click();
    }
    @Then("I verify that ACCOUNT DELETED is visible")
    public void i_verify_that_account_deleted_is_visible() {
        WebElement accountDeletedMessage = driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
        accountDeletedMessage.isDisplayed();


    }

}