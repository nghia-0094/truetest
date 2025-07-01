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

"Step 1: Navigate to /EGApp/*"

TrueTestScripts.navigate("/EGApp/${EGApp_id}")

"Step 2: Click on link newApplication10 -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_newApplication10'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 2-Click on link newApplication10 - Navigate to page EGAppEditWizardApplication.png')

"Step 3: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_next2'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 3-Click on button next2.png')

"Step 4: Select option with input value from select dynamicOptions (cashExchange)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/select_dynamicOptions"
TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/select_dynamicOptions', ['select_dynamicOptions_divNthChild': select_dynamicOptions_divNthChild]), select_dynamicOptions)

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 4-Select option with input value from select dynamicOptions cashExchange.png')

"Step 5: Click on span dynamicText (transferFundsPrompt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/span_dynamicText"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/span_dynamicText', ['span_dynamicText_divTitle': span_dynamicText_divTitle]))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 5-Click on span dynamicText transferFundsPrompt.png')

"Step 6: Click on span dynamicText (transferFundsPrompt)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/span_dynamicText"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/span_dynamicText', ['span_dynamicText_divTitle': span_dynamicText_divTitle_1]))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 6-Click on span dynamicText transferFundsPrompt.png')

"Step 7: Click on link openPageList7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_openPageList7'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 7-Click on link openPageList7.png')

"Step 8: Click on div applicationPages -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_applicationPages'))

// WebUI.takeScreenshot(reportLocation + '/TC60/Step 8-Click on div applicationPages - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Create New Application and Verify Navigation to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}