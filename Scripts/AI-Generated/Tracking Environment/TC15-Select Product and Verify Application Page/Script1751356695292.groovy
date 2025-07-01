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

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Select option with input value from select jurisdiction3.png')

"Step 3: Select option with input value from select productType3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_productType3'), select_productType3)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Select option with input value from select productType3.png')

"Step 4: Select option with input value from select carrier4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_carrier15'), select_carrier4)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Select option with input value from select carrier4.png')

"Step 5: Select option with input value from select productType3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_productType3'), select_productType3_1)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Select option with input value from select productType3.png')

"Step 6: Select option with input value from select carrier28"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_carrier15'), select_carrier28)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Select option with input value from select carrier28.png')

"Step 7: Select option with input value from select productType3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_productType3'), select_productType3_2)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Select option with input value from select productType3.png')

"Step 8: Select option with input value from select carrier4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_carrier15'), select_carrier4_1)

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Select option with input value from select carrier4.png')

"Step 9: Click on link home -> Navigate to page '/EGApp'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_home'))

// WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on link home - Navigate to page EGApp.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Select Product and Verify Application Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}