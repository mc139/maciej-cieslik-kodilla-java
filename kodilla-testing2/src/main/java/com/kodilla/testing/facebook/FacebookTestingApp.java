package com.kodilla.testing.facebook;

import com.kodilla.testing.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT_COOKIES = "/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]";
    public static final String XPATH_CREATE_ACCOUNT = "/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a";
    public static final String XPATH_WAIT_FOR_POPUP = " /html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[5]/div[2]/span/span/select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://en-gb.facebook.com/");

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_CREATE_ACCOUNT));

        WebElement acceptAll = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        Thread.sleep(2000);

        acceptAll.click();
        createNewAccount.click();

        Thread.sleep(1000);

        WebElement SelectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoard = new Select(SelectComboDay);
        selectBoard.selectByIndex(13);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectComboMonth);
        selectMonth.selectByIndex(9);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectComboYear);
        selectYear.selectByIndex(26);

    }

}
