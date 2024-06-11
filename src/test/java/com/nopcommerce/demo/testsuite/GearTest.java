package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.GearPage;
import com.nopcommerce.demo.testbased.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();
    @Test
    public void GoTpGearMenu(){
        gearPage.mouseHoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnOverNightDuffle();
        String expectedText = "Overnight Duffle";
        String acualText = gearPage.verifyOvernightDuffleText();
        Assert.assertEquals(acualText,expectedText,"Text not matched");
        gearPage.changeQuantity3();
        gearPage.clickOnAddToCart();
        String expectedAddedText = "You added Overnight Duffle to your shopping cart";
        String actualAddedText = gearPage.verifyYouAddedOvernightDuffleToCartText();
        Assert.assertEquals(actualAddedText,expectedAddedText,"Text not matched");
        gearPage.clickOnShoppingCart();
        String expectedProductNameText = "Cronus Yoga Pant";
        String actualProductNameText = gearPage.getTextProductName();
        Assert.assertEquals(actualProductNameText,expectedProductNameText,"Text not matched");
        String expectedQuantity3 = "3";
        String actualQuantity3 = gearPage.getTextQuntity3Text();
        Assert.assertEquals(actualQuantity3,expectedQuantity3,"Text not matched");
        String expectedProductPriceFor3Text = "$135.00";
        String actualProductPriceFor3Text = gearPage.getTextProductPriceFor3();
        gearPage.changeQuantityTo5();
        gearPage.updateShoppingCart();
        String expectedTotalPriceText = "225";
        String actualTotalPriceText = gearPage.getTotalPriceTextFor5();
        Assert.assertEquals(actualTotalPriceText,expectedTotalPriceText,"Price not matched");
    }
}
