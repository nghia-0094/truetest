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

"Step 1: Navigate to /EGApp/EditWizardApplication with params (AppGuid, LaunchPoint, RecordMetric)"

TrueTestScripts.navigate("/EGApp/EditWizardApplication", ["AppGuid": EditWizardApplication_AppGuid, "LaunchPoint": EditWizardApplication_LaunchPoint, "RecordMetric": EditWizardApplication_RecordMetric])

"Step 2: Click on div skipToContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_skipToContent'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 2-Click on div skipToContent.png')

"Step 3: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_close'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 3-Click on link close.png')

"Step 4: Click on link otherActions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_otherActions'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 4-Click on link otherActions.png')

"Step 5: Click on div pageContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_skipToContent'))

// WebUI.takeScreenshot(reportLocation + '/TC53/Step 5-Click on div pageContent - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC53-Skip Content and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}