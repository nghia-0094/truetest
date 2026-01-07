package truetest.QA_G3.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class processCreditCardPayment {
    
    private static def execute(String input_cardNumber, String input_namePlaceholder, String input_passwordPlaceholder) {
        
        "Step 1: Click on div creditCardPayment"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/div_creditCardPayment'))
        
        "Step 2: Click on input creditCard"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_creditCard'))
        
        "Step 3: Enter input value in input namePlaceholder"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_namePlaceholder'), input_namePlaceholder)
        
        "Step 4: Enter input value in input cardNumber"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_cardNumber'), input_cardNumber)
        
        "Step 5: Enter input value in input passwordPlaceholder"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_passwordPlaceholder'), input_passwordPlaceholder)
        
        "Step 6: Click on button confirmCheckout"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_confirmCheckout'))
    }
}

