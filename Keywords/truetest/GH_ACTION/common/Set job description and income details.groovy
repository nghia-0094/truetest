package truetest.GH_ACTION.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class Set job description and income details {
    
    private static def execute(String input_averageIncomeAmount5, String input_jobDescription2, String matOption_currencyOptions_MatOption_1, String matOption_currencyOptions_css_value_1) {
        
        "Step 1: Enter input value in input jobDescription2"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_jobDescription2'), input_jobDescription2)
        
        "Step 2: Click on matSelect selectOption3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_selectOption3'))
        
        "Step 3: Click on matOption currencyOptions (currencyRupiah)"
        
        // Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_1, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_1]))
        
        "Step 4: Click on input averageIncomeAmount5"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_averageIncomeAmount5'))
        
        "Step 5: Enter input value in input averageIncomeAmount5"
        
        WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_averageIncomeAmount5'), input_averageIncomeAmount5)
    }
}

