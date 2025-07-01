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

"Step 1: Navigate to /EGApp/NewApplication with params (LaunchPoint)"

TrueTestScripts.navigate("/EGApp/NewApplication", ["LaunchPoint": NewApplication_LaunchPoint])

"Step 2: Click on link newActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_newActivity'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 2-Click on link newActivity.png')

"Step 3: Click on td homeNewActivity2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/td_homeNewActivity2'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on td homeNewActivity2.png')

"Step 4: Click on link allActivities2 -> Navigate to page '/EGApp/Applications'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_allActivities2'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Click on link allActivities2 - Navigate to page EGAppApplications.png')

"Step 5: Click on link newActivity2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/Applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_Applications/link_newActivity2'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on link newActivity2.png')

"Step 6: Click on td homeNewActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/Applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_Applications/td_homeNewActivity'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on td homeNewActivity.png')

"Step 7: Click on td activityLog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/Applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_Applications/td_homeNewActivity'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on td activityLog.png')

"Step 8: Click on link home -> Navigate to page '/EGApp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/Applications?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_Applications/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Click on link home - Navigate to page EGApp.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Create new activity and verify application page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}