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

"Step 2: Click on link startNew3 -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_startNew3'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link startNew3 - Navigate to page EGAppNewApplication.png')

"Step 3: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Select option with input value from select jurisdiction3.png')

"Step 4: Click on link annuityIllustrations (fixedIndexedAnnuityTesting) -> Navigate to page '/EGApp/EditIllustration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_annuityIllustrations"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp_NewApplication/link_annuityIllustrations', ['link_annuityIllustrations_internalText': link_annuityIllustrations_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link annuityIllustrations fixedIndexedAnnuityTesting - Navigate to page EGAppEditIllustration.png')

"Step 5: Click on div alertsContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditIllustration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditIllustration/div_alertsContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div alertsContainer.png')

"Step 6: Click on div alertsContainer -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditIllustration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditIllustration/div_alertsContainer'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div alertsContainer - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Start New Application and Access Annuity Illustrations_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}