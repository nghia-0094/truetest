package truetest.GH_ACTION.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class Update daily activity and company details {
    
    private static def execute(String input_companyName3, String input_companyPhoneNumber4, String input_dateTextField5, String textarea_dailyActivityInDownPosition) {
        
        "Step 1: Click on input dateTextField5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateTextField5'))
        
        "Step 2: Enter input value in input dateTextField5"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateTextField5'), input_dateTextField5)
        
        "Step 3: Click on input radioYes17"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes17'))
        
        "Step 4: Click on textarea dailyActivityInDownPosition"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_dailyActivityInDownPosition'))
        
        "Step 5: Enter input value in textarea dailyActivityInDownPosition"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_dailyActivityInDownPosition'), textarea_dailyActivityInDownPosition)
        
        "Step 6: Click on input companyName3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyName3'))
        
        "Step 7: Enter input value in input companyName3"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyName3'), input_companyName3)
        
        "Step 8: Click on input companyPhoneNumber4"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyPhoneNumber4'))
        
        "Step 9: Enter input value in input companyPhoneNumber4"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyPhoneNumber4'), input_companyPhoneNumber4)
        
        "Step 10: Click on textarea companyAddress"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_companyAddress'))
    }
}

