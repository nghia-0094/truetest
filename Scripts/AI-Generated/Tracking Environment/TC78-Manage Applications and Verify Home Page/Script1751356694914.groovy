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

"Step 1: Navigate to /EGApp"

TrueTestScripts.navigate("/EGApp")

"Step 2: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 2-Click on div object.png')

"Step 3: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 3-Click on div object.png')

"Step 4: Click on link applicationManagement (newApplication5) -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement', ['link_applicationManagement_id': link_applicationManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 4-Click on link applicationManagement newApplication5 - Navigate to page EGAppEditWizardApplication.png')

"Step 5: Click on label dynamicObject (withdrawalChargePeriod)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject', ['label_dynamicObject_internalText': label_dynamicObject_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 5-Click on label dynamicObject withdrawalChargePeriod.png')

"Step 6: Click on label dynamicObject (withdrawalChargePeriod)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject', ['label_dynamicObject_internalText': label_dynamicObject_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 6-Click on label dynamicObject withdrawalChargePeriod.png')

"Step 7: Click on label dynamicObject (withdrawalChargePeriod)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/label_dynamicObject', ['label_dynamicObject_internalText': label_dynamicObject_internalText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 7-Click on label dynamicObject withdrawalChargePeriod.png')

"Step 8: Click on link home3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_home3'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 8-Click on link home3.png')

"Step 9: Click on button ok -> Navigate to page '/EGApp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_ok'))

// WebUI.takeScreenshot(reportLocation + '/TC78/Step 9-Click on button ok - Navigate to page EGApp.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC78-Manage Applications and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}