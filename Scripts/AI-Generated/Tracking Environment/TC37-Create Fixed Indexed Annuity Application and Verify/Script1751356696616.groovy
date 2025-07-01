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

"Step 2: Click on link applications -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Click on link applications - Navigate to page EGAppNewApplication.png')

"Step 3: Click on link fixedIndexedAnnuity"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_fixedIndexedAnnuity'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 3-Click on link fixedIndexedAnnuity.png')

"Step 4: Click on link create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_create'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on link create.png')

"Step 5: Click on button create -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/button_create'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Click on button create - Navigate to page EGAppEditWizardApplication.png')

"Step 6: Enter input value in input emailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_emailAddress'), input_emailAddress)

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Enter input value in input emailAddress.png')

"Step 7: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_next2'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 7-Click on button next2.png')

"Step 8: Click on div individualOwnership"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_individualOwnership'))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 8-Click on div individualOwnership.png')

"Step 9: Click on div dynamicObject (yes2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_EditWizardApplication/div_dynamicObject', ['div_dynamicObject_divTitle': div_dynamicObject_divTitle, 'div_dynamicObject_nth': div_dynamicObject_nth]))

// WebUI.takeScreenshot(reportLocation + '/TC37/Step 9-Click on div dynamicObject yes2 - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Create Fixed Indexed Annuity Application and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}