package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.MenPage;
import com.nopcommerce.demo.testbased.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {
    MenPage menPage = new MenPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        menPage.mouseHoverMenu();
        menPage.mouseHoverOnBottom();
        menPage.mouseHoverAndClickOnpants();
        menPage.mouseHoverOnYogaPants();
        menPage.mouseHoverAndGoToOptions();
        menPage.mouseHoverOnColourOfThePants();
        menPage.clickShoppingOnCart();
        String expectedText = "You added Cronus Yoga Pant to your shopping cart";
        String actualText = menPage.getTextOfCart();
        Assert.assertEquals(actualText,expectedText,"Text not matched");
        menPage.getYogaPantText();
        menPage.clickOnCart();
        String expectedShoppingText = "Shopping Cart.";
        String actualShoppingText = menPage.textShoppingGet();
        Assert.assertEquals(actualShoppingText,expectedShoppingText,"text not matched");
        String expextedProductText = "Cronus Yoga Pant";
        String actualProductText = menPage.getProductName();
        Assert.assertEquals(actualProductText,expextedProductText,"Text not matched");
        String expectedProductSize = "32";
        String actualProductSize = menPage.getTextProductSize();
        Assert.assertEquals(actualProductSize,expectedProductSize,"Text not Matched");
        String expectedColour = "Black";
        String actualColour = menPage.getcolourText();
        Assert.assertEquals(actualColour,expectedColour,"Text not matched");

    }
}
