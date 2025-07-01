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

"Step 2: Click on link startNewApplication3 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 2-Click on link startNewApplication3 - Navigate to page EGAppNewApplication.png')

"Step 3: Click on link variableAnnuityOptions (singlePremiumAnnuity)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_variableAnnuityOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_variableAnnuityOptions', ['link_variableAnnuityOptions_internalText': link_variableAnnuityOptions_internalText, 'link_variableAnnuityOptions_nth': link_variableAnnuityOptions_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 3-Click on link variableAnnuityOptions singlePremiumAnnuity.png')

"Step 4: Click on link create2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_create2'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 4-Click on link create2.png')

"Step 5: Click on button create -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/button_create'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 5-Click on button create - Navigate to page EGAppEditWizardApplication.png')

"Step 6: Click on input textField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_textField'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 6-Click on input textField.png')

"Step 7: Enter input value in input object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_object2'), input_object2)

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 7-Enter input value in input object2.png')

"Step 8: Select option with input value from select state"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/select_state'), select_state)

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 8-Select option with input value from select state.png')

"Step 9: Click on link logOff2 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_logOff2'))

// WebUI.takeScreenshot(reportLocation + '/TC29/Step 9-Click on link logOff2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC29-Start New Application for Variable Annuity Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}