import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /EGApp/EditApplication with params (AppGuid)"

TrueTestScripts.navigate("/EGApp/EditApplication", ["AppGuid": EditApplication_AppGuid])

"Step 2: Click on button okay2"

WebUI.switchToWindowTitle('ClientApplication')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/button_okay2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Click on button okay2.png')

"Step 3: Click on link nextPage18"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_nextPage18'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on link nextPage18.png')

"Step 4: Click on canvas status"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/canvas_status'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on canvas status.png')

"Step 5: Click on link openPageFormList11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_openPageFormList11'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on link openPageFormList11.png')

"Step 6: Click on link dynamicObject (page126)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Click on link dynamicObject page126.png')

"Step 7: Click on div object163"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object163'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on div object163.png')

"Step 8: Click on link otherActions5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_otherActions5'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on link otherActions5.png')

"Step 9: Click on link documentManagement (documents8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement', ['link_documentManagement_internalText': link_documentManagement_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on link documentManagement documents8.png')

"Step 10: Click on button close2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/button_close2'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Click on button close2.png')

"Step 11: Click on input cAo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/input_cAo3'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on input cAo3.png')

"Step 12: Enter input value in input cAo3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/input_cAo3'), input_cAo3)

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Enter input value in input cAo3.png')

"Step 13: Click on div object164"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object164'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 13-Click on div object164.png')

"Step 14: Click on div object165"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object165'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 14-Click on div object165.png')

"Step 15: Click on div object166"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object166'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 15-Click on div object166.png')

"Step 16: Click on link otherActions5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_otherActions5'))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 16-Click on link otherActions5.png')

"Step 17: Click on link documentManagement (history2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement', ['link_documentManagement_internalText': link_documentManagement_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 17-Click on link documentManagement history2.png')

"Step 18: Click on button close3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/button_close3'))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC23/Step 18-Click on button close3 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Manage Ownership Types and Plan Types in Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}