package truetest.GH_ACTION.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.custom.TrueTestScripts

public class navigateAndDragDropElements {
    
    private static def execute() {
        
        "Step 1: Click on link object7"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_home/link_object7'))
        
        "Step 2: Click on link navbtnReferences"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_home/link_navbtnReferences'))
        
        "Step 3: Drag img thumbnail and Drop to div object2"
        
        WebUI.switchToWindowTitle('Image Viewer')
        
        TrueTestScripts.dragAndDropToTargetByDirection(findTestObject('AI-Generated/GH_ACTION/Page_home/img_thumbnail'), findTestObject('AI-Generated/GH_ACTION/Page_home/div_object2'), 'CENTER')
        
        "Step 4: Drag img thumbnail and Drop to div object2"
        
        TrueTestScripts.dragAndDropToTargetByDirection(findTestObject('AI-Generated/GH_ACTION/Page_home/img_thumbnail'), findTestObject('AI-Generated/GH_ACTION/Page_home/div_object2'), 'CENTER')
    }
}

