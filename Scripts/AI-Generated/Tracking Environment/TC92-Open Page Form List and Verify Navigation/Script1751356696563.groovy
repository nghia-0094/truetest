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

"Step 2: Click on link openPageFormList"

WebUI.switchToWindowTitle('testApplication')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/link_openPageFormList'))

// WebUI.takeScreenshot(reportLocation + '/TC92/Step 2-Click on link openPageFormList.png')

"Step 3: Click on div dropdownIndicator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditApplication/div_dropdownIndicator'))

// WebUI.takeScreenshot(reportLocation + '/TC92/Step 3-Click on div dropdownIndicator.png')

"Step 4: Click on link dynamicObject (page12) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditApplication/link_dynamicObject', ['link_dynamicObject_internalText': link_dynamicObject_internalText]))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC92/Step 4-Click on link dynamicObject page12 - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC92-Open Page Form List and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}