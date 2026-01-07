package truetest.QA_G3.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class selectProductSizeAndColor {
    
    private static def execute() {
        
        "Step 1: Click on div selectSize"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/div_selectSize'))
        
        "Step 2: Click on div productSize"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/div_productSize'))
        
        "Step 3: Click on div chooseColor"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/div_chooseColor'))
        
        "Step 4: Click on button addToBasket"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/button_addToBasket'))
        
        "Step 5: Click on span shoppingButton"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/span_shoppingButton'))
        
        "Step 6: Click on button checkOut -> Navigate to page '/checkout/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/button_checkOut'))
        
        "Step 7: Click on button nextStep"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))
    }
}

