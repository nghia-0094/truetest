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

"Step 1: Navigate to /EGApp with params (TransactionType)"

TrueTestScripts.navigate("/EGApp", ["TransactionType": EGApp_TransactionType])

"Step 2: Click on link applicationManagement (object) -> Navigate to page '/EGApp/EditWizardApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_applicationManagement', ['link_applicationManagement_id': link_applicationManagement_id]))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link applicationManagement object - Navigate to page EGAppEditWizardApplication.png')

"Step 3: Click on button next2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_next2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on button next2.png')

"Step 4: Click on input productName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on input productName.png')

"Step 5: Click on input productName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on input productName.png')

"Step 6: Click on div mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_applicationPages'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on div mainContent.png')

"Step 7: Click on div mainContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_applicationPages'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on div mainContent.png')

"Step 8: Click on div mainContent -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_applicationPages'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on div mainContent - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Edit Product Name and Verify Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}