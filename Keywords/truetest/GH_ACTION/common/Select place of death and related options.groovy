package truetest.GH_ACTION.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class Select place of death and related options {
    
    private static def execute() {
        
        "Step 1: Click on div choiceListPlaceOfDeath"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_choiceListPlaceOfDeath'))
        
        "Step 2: Click on input radioNo11"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo11'))
        
        "Step 3: Click on input selectRadioNo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectRadioNo'))
        
        "Step 4: Click on input no2"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_no2'))
        
        "Step 5: Click on input radioNo12"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo12'))
        
        "Step 6: Click on input noRadio3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_noRadio3'))
    }
}

