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

"Step 2: Click on link reviewQueue4"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_reviewQueue4'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 2-Click on link reviewQueue4.png')

"Step 3: Select option with input value from select filterByDate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_filterByDate'), select_filterByDate)

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 3-Select option with input value from select filterByDate.png')

"Step 4: Click on strong object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/strong_object'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 4-Click on strong object.png')

"Step 5: Click on td object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/td_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 5-Click on td object3.png')

"Step 6: Click on input reviewApplicationButtons (reviewApplication5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/input_reviewApplicationButtons"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/input_reviewApplicationButtons', ['input_reviewApplicationButtons_nth': input_reviewApplicationButtons_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 6-Click on input reviewApplicationButtons reviewApplication5.png')

"Step 7: Click on td navigationLinks"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/td_navigationLinks'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 7-Click on td navigationLinks.png')

"Step 8: Click on button applicationApproval (approveApplication5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/button_applicationApproval"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/button_applicationApproval', ['button_applicationApproval_nth': button_applicationApproval_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 8-Click on button applicationApproval approveApplication5.png')

"Step 9: Click on button approve"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_approve'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 9-Click on button approve.png')

"Step 10: Click on td object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/td_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 10-Click on td object3.png')

"Step 11: Click on td object3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/td_object3'))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC45/Step 11-Click on td object3 - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Review and Approve Application from Review Queue_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}