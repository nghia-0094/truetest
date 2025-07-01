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

"Step 2: Click on link startNewApplication2"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication2'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 2-Click on link startNewApplication2.png')

"Step 3: Select option with input value from select jurisdiction4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_jurisdiction4'), select_jurisdiction4)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 3-Select option with input value from select jurisdiction4.png')

"Step 4: Select option with input value from select carrier8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier8)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 4-Select option with input value from select carrier8.png')

"Step 5: Select option with input value from select jurisdiction4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_jurisdiction4'), select_jurisdiction4_1)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 5-Select option with input value from select jurisdiction4.png')

"Step 6: Select option with input value from select carrier5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier5)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 6-Select option with input value from select carrier5.png')

"Step 7: Select option with input value from select carrier5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier5_1)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 7-Select option with input value from select carrier5.png')

"Step 8: Select option with input value from select jurisdiction4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_jurisdiction4'), select_jurisdiction4_2)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 8-Select option with input value from select jurisdiction4.png')

"Step 9: Click on div jurisdictionSelection4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_jurisdictionSelection4'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 9-Click on div jurisdictionSelection4.png')

"Step 10: Select option with input value from select carrier3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_carrier8'), select_carrier3)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 10-Select option with input value from select carrier3.png')

"Step 11: Click on link annuityOptions (fixedAnnuityNewYorkLife)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_annuityOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_annuityOptions', ['link_annuityOptions_internalText': link_annuityOptions_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 11-Click on link annuityOptions fixedAnnuityNewYorkLife.png')

"Step 12: Select option with input value from select residentJurisdiction2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_residentJurisdiction2'), select_residentJurisdiction2)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 12-Select option with input value from select residentJurisdiction2.png')

"Step 13: Click on div requiredForms"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_requiredForms'))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 13-Click on div requiredForms.png')

"Step 14: Click on div newApplicationOptions (newApplication8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/div_newApplicationOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/div_newApplicationOptions', ['div_newApplicationOptions_internalLabel': div_newApplicationOptions_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 14-Click on div newApplicationOptions newApplication8.png')

"Step 15: Click on link cancel2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_cancel2'))

WebUI.switchToWindowIndex(0)

// WebUI.takeScreenshot(reportLocation + '/TC95/Step 15-Click on link cancel2 - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC95-Start New Application and Select Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}