package truetest.Tracking_Environment.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class accessOtherActionsAndShare {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link otherActions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_otherActions'))
        
        "Step 2: Click on link share"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_share'))
        
        "Step 3: Click on button dialogAction3"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_dialogAction3'))
        
        "Step 4: Click on link otherActions"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_otherActions'))
        
        "Step 5: Click on link share"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_share'))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        
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

