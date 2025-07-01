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

"Step 1: Navigate to /EGApp with params (LaunchPoint)"

TrueTestScripts.navigate("/EGApp", ["LaunchPoint": EGApp_LaunchPoint])

"Step 2: Click on link applicationManagement (newApplication3) -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement', ['link_applicationManagement_id': link_applicationManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC105/Step 2-Click on link applicationManagement newApplication3 - Navigate to page EGAppEditWizardApplication.png')

"Step 3: Click on div illustration"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_illustration'))

// WebUI.takeScreenshot(reportLocation + '/TC105/Step 3-Click on div illustration.png')

"Step 4: Click on link appNameEdit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_appNameEdit'))

// WebUI.takeScreenshot(reportLocation + '/TC105/Step 4-Click on link appNameEdit.png')

"Step 5: Click on button close -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_close'))

// WebUI.takeScreenshot(reportLocation + '/TC105/Step 5-Click on button close - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC105-Edit Application Illustration and Close_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}