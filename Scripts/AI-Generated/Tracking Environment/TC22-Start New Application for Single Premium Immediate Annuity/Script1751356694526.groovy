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

"Step 1: Navigate to /EGApp/NewApplication with params (acordType)"

TrueTestScripts.navigate("/EGApp/NewApplication", ["acordType": NewApplication_acordType])

"Step 2: Select option with input value from select jurisdiction3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), select_jurisdiction3)

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Select option with input value from select jurisdiction3.png')

"Step 3: Select option with input value from select carrier15"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_carrier15'), select_carrier15)

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Select option with input value from select carrier15.png')

"Step 4: Click on link singlePremiumImmediateAnnuity4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_singlePremiumImmediateAnnuity4'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on link singlePremiumImmediateAnnuity4.png')

"Step 5: Click on td annuityOwner -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/td_annuityOwner'))

// WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Click on td annuityOwner - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Start New Application for Single Premium Immediate Annuity_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}