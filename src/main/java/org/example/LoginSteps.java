package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    private WebDriver driver;
    @Given("the user is on the GitHub login page")
    public void userIsOnGitHubLoginPage() {
        System.setProperty("web-driver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://github.com/login");
    }
    @When("the user enters valid GitHub username and password")
    public void userEntersValidGitHubCredentials() {
        WebElement usernameInput = driver.findElement(By.id("login_field"));
        WebElement passwordInput = driver.findElement(By.id("password"));
// Replace with your valid GitHub credentials
        usernameInput.sendKeys("yourGitHubUsername");
        passwordInput.sendKeys("yourGitHubPassword");
    }
    @When("clicks on the login button")
    public void clicksOnLoginButton() {
        WebElement loginButton = driver.findElement(By.name("commit"));
        loginButton.click();
    }
    @Then("the user is navigated to the GitHub homepage")
    public void userIsNavigatedToGitHubHomepage() {
        assertTrue(driver.getCurrentUrl().startsWith("https://github.com/"));
        driver.quit();
    }
}