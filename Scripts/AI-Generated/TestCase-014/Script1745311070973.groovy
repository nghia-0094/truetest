import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/${path_param_3}")

"Step 2: Hover over link pd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet_management/link_pd'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Hover over link pd.png')

"Step 3: Click on link pdcheckIn -> Navigate to page 'pnd morning check in#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_pdcheckIn'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on link pdcheckIn - Navigate to page pnd morning check in.png')

"Step 4: Hover over link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_pnd_morning_check_in/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Hover over link reports.png')

"Step 5: Click on link proMovement -> Navigate to page 'report#*/Reports/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pnd_morning_check_in/link_proMovement'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on link proMovement - Navigate to page reportReports.png')

"Step 6: Click on div object -> Navigate to page 'pnd morning check in#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on div object - Navigate to page pnd morning check in.png')

"Step 7: Click on button checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pnd_morning_check_in/button_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on button checkIn.png')

"Step 8: Click on button submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pnd_morning_check_in/button_submit'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button submit.png')

"Step 9: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pnd_morning_check_in/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on button ok.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-014_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}