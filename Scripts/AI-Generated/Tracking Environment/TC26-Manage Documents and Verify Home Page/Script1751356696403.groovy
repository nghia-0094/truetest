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

"Step 2: Click on div object3"

WebUI.switchToWindowTitle('ClientApplication')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object163'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 2-Click on div object3.png')

"Step 3: Click on link openPageFormList4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_openPageFormList4'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 3-Click on link openPageFormList4.png')

"Step 4: Click on div dropdownIndicator2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_dropdownIndicator2'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on div dropdownIndicator2.png')

"Step 5: Click on link dynamicObject (page125)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Click on link dynamicObject page125.png')

"Step 6: Click on link otherActions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_otherActions'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on link otherActions.png')

"Step 7: Click on link documentManagement (history)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement', ['link_documentManagement_internalText': link_documentManagement_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Click on link documentManagement history.png')

"Step 8: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/button_submit'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on button submit.png')

"Step 9: Click on input applicationValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/input_applicationValue'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 9-Click on input applicationValue.png')

"Step 10: Enter input value in input applicationValue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/input_applicationValue'), input_applicationValue)

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 10-Enter input value in input applicationValue.png')

"Step 11: Select option with input value from select cBz"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/select_cBz'), select_cBz)

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 11-Select option with input value from select cBz.png')

"Step 12: Click on div object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_object4'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 12-Click on div object4.png')

"Step 13: Click on link otherActions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_otherActions'))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 13-Click on link otherActions.png')

"Step 14: Click on link documentManagement (history)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_documentManagement', ['link_documentManagement_internalText': link_documentManagement_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 14-Click on link documentManagement history.png')

"Step 15: Click on button submit -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/button_submit'))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC26/Step 15-Click on button submit - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Manage Documents and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}