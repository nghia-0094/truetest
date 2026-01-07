package truetest.QA_G3.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class manageBasketAndCheckout {
    
    private static def execute(String button_productActions_css_value_1, String div_basketActions_InternalText_1) {
        
        "Step 1: Click on span close2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_close2'))
        
        "Step 2: Hover over div basketActions (addToBasket2)"
        
        // Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions"
        WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText_1]))
        
        "Step 3: Click on button productActions (productCardAction)"
        
        // Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions', ['button_productActions_css_value_1': button_productActions_css_value_1]))
        
        "Step 4: Click on span shopping"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_shopping'))
        
        "Step 5: Click on button checkOut -> Navigate to page '/checkout/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/button_checkOut'))
        
        "Step 6: Click on button nextStep"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))
    }
}

