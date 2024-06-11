package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {

    By mouseHoverOnGearMenu = By.xpath("//span[normalize-space()='Gear']");
    By clickOnBags = By.xpath("//span[normalize-space()='Bags']");
    By overNightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By getTextOfoverNightDuffle = By.xpath("//span[@class='base']");
    By quantityChange = By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By getTextYouAddedOverNightDuffle = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By getTextProductNameOverNightDuffle = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By getQuantityText = By.xpath("//input[@title='Qty']");
    By getProductPriceText = By.xpath("(//span[@class='cart-price']//span)[2]");
    By changeQuantityTo5 = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By getTotalPriceText = By.xpath("(//span[@class='cart-price']//span)[2]");




    public void mouseHoverOnGearMenu() {
        mouseHoverToElement(mouseHoverOnGearMenu);
    }

    public void clickOnBags(){
        mouseHoverToElementAndClick(clickOnBags);
    }
    public void clickOnOverNightDuffle(){
        clickOnElement(overNightDuffle);
    }
    public String verifyOvernightDuffleText(){
        return getTextFromElement(getTextOfoverNightDuffle);

    }
    public void changeQuantity3(){
        sendTextToElement(quantityChange,"3");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String verifyYouAddedOvernightDuffleToCartText(){
        return getTextFromElement(getTextYouAddedOverNightDuffle);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String getTextProductName(){
        return getTextFromElement(getTextProductNameOverNightDuffle);
    }
    public String getTextQuntity3Text(){
        return getTextFromElement(getQuantityText);
    }
    public String getTextProductPriceFor3(){
        return getTextFromElement(getProductPriceText);
    }
    public void changeQuantityTo5(){
        sendTextToElement(changeQuantityTo5,"5");
    }
    public void updateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String getTotalPriceTextFor5(){
        return getTextFromElement(getTotalPriceText);
    }


}
