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

"Step 2: Click on link startNewApplication3"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 2-Click on link startNewApplication3.png')

"Step 3: Select option with input value from select jurisdiction4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_jurisdiction4'), select_jurisdiction4)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 3-Select option with input value from select jurisdiction4.png')

"Step 4: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 4-Select option with input value from select carrier11.png')

"Step 5: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_1)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 5-Select option with input value from select carrier11.png')

"Step 6: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_2)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 6-Select option with input value from select carrier11.png')

"Step 7: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_3)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 7-Select option with input value from select carrier11.png')

"Step 8: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_4)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 8-Select option with input value from select carrier11.png')

"Step 9: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_5)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 9-Select option with input value from select carrier11.png')

"Step 10: Select option with input value from select carrier11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_6)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 10-Select option with input value from select carrier11.png')

"Step 11: Click on link startNewApplication3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 11-Click on link startNewApplication3.png')

"Step 12: Select option with input value from select jurisdiction4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_jurisdiction4'), select_jurisdiction4_1)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 12-Select option with input value from select jurisdiction4.png')

"Step 13: Select option with input value from select carrier11 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier11_7)

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC38/Step 13-Select option with input value from select carrier11 - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC38-Start New Application and Verify Home Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}