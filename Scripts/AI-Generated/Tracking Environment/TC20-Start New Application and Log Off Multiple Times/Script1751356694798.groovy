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

"Step 2: Click on section main2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/section_main2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on section main2.png')

"Step 3: Click on link startNewApplication3 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on link startNewApplication3 - Navigate to page EGAppNewApplication.png')

"Step 4: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/body_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on body object.png')

"Step 5: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3)

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Select option with input value from select jurisdiction3.png')

"Step 6: Click on td homeNewActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/td_homeNewActivity'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on td homeNewActivity.png')

"Step 7: Click on link logOff2 -> Navigate to page '/EGApp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_logOff2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on link logOff2 - Navigate to page EGApp.png')

"Step 8: Click on td startNewActivity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/td_startNewActivity'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on td startNewActivity.png')

"Step 9: Click on link startNewApplication3 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on link startNewApplication3 - Navigate to page EGAppNewApplication.png')

"Step 10: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/body_object'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 10-Click on body object.png')

"Step 11: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3_1)

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 11-Select option with input value from select jurisdiction3.png')

"Step 12: Select option with input value from select productType7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_productType7'), select_productType7)

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 12-Select option with input value from select productType7.png')

"Step 13: Click on link annuityIllustrations (annuityAmeritasFlexMark) -> Navigate to page '/EGApp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_annuityIllustrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_annuityIllustrations', ['link_annuityIllustrations_internalText': link_annuityIllustrations_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 13-Click on link annuityIllustrations annuityAmeritasFlexMark - Navigate to page EGApp.png')

"Step 14: Click on link startNewApplication3 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 14-Click on link startNewApplication3 - Navigate to page EGAppNewApplication.png')

"Step 15: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3_2)

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 15-Select option with input value from select jurisdiction3.png')

"Step 16: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3_3)

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 16-Select option with input value from select jurisdiction3.png')

"Step 17: Click on div createNewApplication"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/div_createNewApplication'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 17-Click on div createNewApplication.png')

"Step 18: Click on link logOff2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_logOff2'))

// WebUI.takeScreenshot(reportLocation + '/TC20/Step 18-Click on link logOff2 - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Start New Application and Log Off Multiple Times_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}