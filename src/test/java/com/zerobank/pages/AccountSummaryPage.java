package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

    public class AccountSummaryPage extends PageBase{
        public AccountSummaryPage(){
            PageFactory.initElements(Driver.get(),this);
        }
        LoginPage loginPage=new LoginPage();

        @FindBy(xpath = "//h2[@class='board-header']")
        public List<WebElement> subTitles;

        @FindBy(xpath = "//h2[text()='Credit Accounts']/following-sibling::div[@class='board'][1]/div/table/thead/tr/th")
        public List<WebElement> table;

        public String returnTitle(){
            String actualTitle=Driver.get().getTitle();
            return actualTitle;
        }

        public List<String> returnSubTitles(){
            List<String> dashboardTitles=new ArrayList<>();

            for (WebElement e : subTitles) {
                dashboardTitles.add(e.getText());
            }
            return dashboardTitles;
        }

        public List<String> returnColumns() {
            List<String> tableTitles = new ArrayList<>();
            for (WebElement e : table) {
                tableTitles.add(e.getText());
            }
            return tableTitles;
        }
    }

