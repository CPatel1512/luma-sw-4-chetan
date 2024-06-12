package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {

    By womenMenu =  By.xpath("//span[normalize-space()='Women']");
    By hoverOnTops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By clickOnJackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    By sortproductName = By.xpath("(//select[@id='sorter'])[1]");
    By sortListByValue = By.xpath("//strong[@class='product name product-item-name']//a");





    public void mouseHoverOnWomenMenu(){
        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnWomenTops(){
        mouseHoverToElement(hoverOnTops);
    }
    public void clickOnJackets(){
        clickOnElement(clickOnJackets);
    }
}
