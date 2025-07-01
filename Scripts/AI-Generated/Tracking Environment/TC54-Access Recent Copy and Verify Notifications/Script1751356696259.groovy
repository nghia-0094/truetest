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

"Step 2: Click on div recentCopy"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC54/Step 2-Click on div recentCopy.png')

"Step 3: Click on link copyOfTestAura"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_copyOfTestAura'))

// WebUI.takeScreenshot(reportLocation + '/TC54/Step 3-Click on link copyOfTestAura.png')

"Step 4: Click on link closeActions (close)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_closeActions', ['link_closeActions_internalLabel': link_closeActions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC54/Step 4-Click on link closeActions close.png')

"Step 5: Click on div messageNotifications (toastMessage)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/div_messageNotifications"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/div_messageNotifications', ['div_messageNotifications_internalLabel': div_messageNotifications_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC54/Step 5-Click on div messageNotifications toastMessage.png')

"Step 6: Click on div userEmailNotification -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_toastMessage2'))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC54/Step 6-Click on div userEmailNotification - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC54-Access Recent Copy and Verify Notifications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}