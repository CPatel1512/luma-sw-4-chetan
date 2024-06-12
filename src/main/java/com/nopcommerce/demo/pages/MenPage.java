package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {

By mouseHoverOnMenu = By.xpath("//span[normalize-space()='Men']");
By mouseHoverOnBottoms = By.xpath("//a[@id='ui-id-18']");
By mouseHoverAndClickOnPants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
By mouseHoverOnCronusYogaPants = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By mouseHoverAndClickOptions = By.xpath("(//div[@class='swatch-option text'])[1]");
By mouseHoverOnCronusYogaPantsAndClickOnColour = By.xpath("(//div[@class='swatch-option color'])[1]");
By mouseHoverAndClickAddToCart = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
By mousehoverAndClickAddToCartByText = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
By getCronusYogaPantText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
By clickOnShoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
By getTextShoppingCart = By.xpath("//span[@class='base']");
By getTextProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
By getProductSize = By.xpath("//dd[contains(text(),'32')]");
By getTextBlack = By.xpath("//dd[contains(text(),'Black')]");

public void mouseHoverMenu(){
    mouseHoverToElement(mouseHoverOnMenu);
}
public void mouseHoverOnBottom(){
    mouseHoverToElement(mouseHoverOnBottoms);
}
public void mouseHoverAndClickOnpants(){
    mouseHoverToElementAndClick(mouseHoverAndClickOnPants);
}
public void mouseHoverOnYogaPants(){
    mouseHoverToElement(mouseHoverOnCronusYogaPants);
}
public void mouseHoverAndGoToOptions(){
    mouseHoverToElementAndClick(mouseHoverAndClickOptions);
}
public void mouseHoverOnColourOfThePants(){
    mouseHoverToElementAndClick(mouseHoverOnCronusYogaPantsAndClickOnColour);
}
public void clickShoppingOnCart(){
    mouseHoverToElementAndClick(mouseHoverAndClickAddToCart);
}
public String  getTextOfCart(){
    return getTextFromElement(mousehoverAndClickAddToCartByText);
}
public String getYogaPantText(){
   return getTextFromElement(getCronusYogaPantText);
}
public void clickOnCart(){
    clickOnElement(clickOnShoppingCart);

}
public String textShoppingGet(){
   return getTextFromElement(getTextShoppingCart);
}
public String getProductName(){
   return getTextFromElement(getTextProductName);
}

public String getTextProductSize(){
   return getTextFromElement(getProductSize);
}
public String getcolourText(){

   return getTextFromElement(getTextBlack);
}


}
