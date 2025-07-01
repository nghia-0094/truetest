package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class enterInPersonDetailsAndLicenseInfo {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on div inPerson"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_inPerson'))
        
        "Step 2: Click on input licenseNo"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_licenseNo'))
        
        "Step 3: Enter input value in input licenseNo"
        
        WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_licenseNo'), data['input_licenseNo'])
        
        "Step 4: Press key Tab on input licenseNo"
        
        WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_licenseNo'), Keys.chord(Keys.TAB))
        
        "Step 5: Click on input mi"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_mi'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_licenseNo'] = testData.getValue('input_licenseNo', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_licenseNo'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

