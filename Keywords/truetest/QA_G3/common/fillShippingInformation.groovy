package truetest.QA_G3.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillShippingInformation {
    
    private static def execute(String input_addressPlaceholder, String input_emailPlaceholder, String input_fullName, String input_phonePlaceholder) {
        
        "Step 1: Enter input value in input fullName"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'), input_fullName)
        
        "Step 2: Enter input value in input emailPlaceholder"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_emailPlaceholder'), input_emailPlaceholder)
        
        "Step 3: Enter input value in input addressPlaceholder"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_addressPlaceholder'), input_addressPlaceholder)
        
        "Step 4: Enter input value in input phonePlaceholder"
        
        WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_phonePlaceholder'), input_phonePlaceholder)
        
        "Step 5: Click on header shippingInfo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/header_shippingInfo'))
        
        "Step 6: Click on input shippingOption"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_shippingOption'))
        
        "Step 7: Click on button nextStep2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))
    }
}

