import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.accessOtherActionsAndShare
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /EGApp/EditWizardApplication with params (AppGuid, RecordMetric)"

TrueTestScripts.navigate("/EGApp/EditWizardApplication", ["AppGuid": EditWizardApplication_AppGuid, "RecordMetric": EditWizardApplication_RecordMetric])

"Step 2: Access other actions and share content"

accessOtherActionsAndShare.execute()

"Step 3: Click on input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 3-Click on input nameEmail.png')

"Step 4: Click on link search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_search'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 4-Click on link search.png')

"Step 5: Click on input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 5-Click on input nameEmail.png')

"Step 6: Enter input value in input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'), input_nameEmail)

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 6-Enter input value in input nameEmail.png')

"Step 7: Click on link search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_search'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 7-Click on link search.png')

"Step 8: Click on link clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_clear'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 8-Click on link clear.png')

"Step 9: Click on input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 9-Click on input nameEmail.png')

"Step 10: Enter input value in input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'), input_nameEmail_1)

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 10-Enter input value in input nameEmail.png')

"Step 11: Click on div dialogAppShare"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_dialogAppShare'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 11-Click on div dialogAppShare.png')

"Step 12: Click on link search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/link_search'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 12-Click on link search.png')

"Step 13: Click on input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 13-Click on input nameEmail.png')

"Step 14: Enter input value in input nameEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_nameEmail'), input_nameEmail_2)

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 14-Enter input value in input nameEmail.png')

"Step 15: Click on div dialogAppShare2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/div_dialogAppShare'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 15-Click on div dialogAppShare2.png')

"Step 16: Click on button dialogAction3 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/button_dialogAction3'))

// WebUI.takeScreenshot(reportLocation + '/TC70/Step 16-Click on button dialogAction3 - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC70-Share Application Content with Other Users_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}