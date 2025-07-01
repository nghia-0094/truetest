import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.toggleHiddenForms
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

"Step 2: Click on link startNewApplication2 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNewApplication2'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 2-Click on link startNewApplication2 - Navigate to page EGAppNewApplication.png')

"Step 3: Click on link fixedIndexedAnnuity3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_fixedIndexedAnnuity3'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 3-Click on link fixedIndexedAnnuity3.png')

"Step 4: Click on link create7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_create7'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 4-Click on link create7.png')

"Step 5: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/button_create'))

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 5-Click on button create.png')

"Step 6: Toggle visibility of hidden forms multiple times in the qualified section"

toggleHiddenForms.execute()

"Step 7: Select option with input value from select planType -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/select_planType'), select_planType)

// WebUI.takeScreenshot(reportLocation + '/TC102/Step 7-Select option with input value from select planType - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC102-Create New Fixed Indexed Annuity Application and Verify_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}