package truetest.GH_ACTION.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputPhoneNumberAndDateSubmission_2e4dd55e {
    
    private static def execute(String input_phoneNumber3, String input_textboxDdmmyyyy) {
        
        "Step 1: Click on input phoneNumber"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))
        
        "Step 2: Enter input value in input phoneNumber3"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber3'), input_phoneNumber3)
        
        "Step 3: Press key Enter on input phoneNumber4"
        
        WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber4'), Keys.chord(Keys.ENTER))
        
        "Step 4: Click on input textboxDdmmyyyy"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))
        
        "Step 5: Enter input value in input textboxDdmmyyyy"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_textboxDdmmyyyy)
        
        "Step 6: Press key Enter on input dateDdmmyyyy2"
        
        WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateDdmmyyyy2'), Keys.chord(Keys.ENTER))
    }
}

