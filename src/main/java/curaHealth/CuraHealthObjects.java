package curaHealth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CuraHealthObjects {
    WebDriver driver;
    WebDriverWait wait;
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get(Selectors.siteurl);
        driver.manage().window().maximize();
    }
    public void makeAppointment(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Selectors.makeAppointmentButton)));
        driver.findElement(By.id(Selectors.makeAppointmentButton)).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Selectors.username)));
        driver.findElement(By.id(Selectors.username)).sendKeys("John Doe");
        driver.findElement(By.id(Selectors.password)).sendKeys("ThisIsNotAPassword");
        driver.findElement(By.id(Selectors.loginButton)).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Selectors.selectFacility)));
        driver.findElement(By.id(Selectors.selectFacility)).click();
        driver.findElement(By.id("combo_facility")).click();
        driver.findElement(By.cssSelector(Selectors.centerChoice)).click();
        driver.findElement(By.id(Selectors.checkHospitalReadMission)).click();
        driver.findElement(By.id(Selectors.programMedicaid)).click();
        driver.findElement(By.id(Selectors.visitDate)).click();
        driver.findElement(By.id(Selectors.visitDate)).sendKeys("20/12/2023");
        driver.findElement(By.id(Selectors.textAreaComment)).sendKeys(Keys.TAB);
        driver.findElement(By.id(Selectors.textAreaComment)).clear();
        driver.findElement(By.id(Selectors.textAreaComment)).sendKeys("I think this is a perfect appointment date");
        driver.findElement(By.id(Selectors.bookAppointment)).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(Selectors.homePage)));
        driver.findElement(By.cssSelector(Selectors.homePage)).click();
    }
    public void logout(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Selectors.hamburgerMenu)));
        driver.findElement(By.id(Selectors.hamburgerMenu)).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Selectors.sidebar)));
        driver.findElement(By.cssSelector(Selectors.logoutButton)).click();
    }
    public void dissolve(){
        driver.quit();
    }
    public static void  main(String [] args ){
        CuraHealthObjects webDriver = new CuraHealthObjects();
        webDriver.setup();
        webDriver.makeAppointment();
        webDriver.logout();
        webDriver.dissolve();
    }
}
