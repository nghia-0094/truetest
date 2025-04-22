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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}")

"Step 2: Click on div mainContainer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/div_mainContainer'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on div mainContainer.png')

"Step 3: Select option with input value from select layoutSelectedTerminal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_dock_management_layout/select_layoutSelectedTerminal'), select_layoutSelectedTerminal)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Select option with input value from select layoutSelectedTerminal.png')

"Step 4: Hover over link linehaul"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_linehaul'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Hover over link linehaul.png')

"Step 5: Click on link closedTrailersReview -> Navigate to page 'closed trailers review#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_closedTrailersReview'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link closedTrailersReview - Navigate to page closed trailers review.png')

"Step 6: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_closed_trailers_review/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on input search.png')

"Step 7: Click on input search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_closed_trailers_review/input_search'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on input search.png')

"Step 8: Hover over link reports"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_closed_trailers_review/link_reports'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Hover over link reports.png')

"Step 9: Click on link proLoadedThenDocked"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_closed_trailers_review/link_proLoadedThenDocked'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on link proLoadedThenDocked.png')

"Step 10: Click on link proMovement -> Navigate to page 'report#*/Reports/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_closed_trailers_review/link_proMovement'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on link proMovement - Navigate to page reportReports.png')

"Step 11: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on input proNumber.png')

"Step 12: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on input proNumber.png')

"Step 13: Click on div searchProForm2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/div_searchProForm2'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on div searchProForm2.png')

"Step 14: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on input proNumber.png')

"Step 15: Enter input value in input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_report/input_proNumber'), input_proNumber)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Enter input value in input proNumber.png')

"Step 16: Click on input proSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/input_proSearch'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on input proSearch.png')

"Step 17: Click on td osdExceptionPieces -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/Reports/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_report/td_osdExceptionPieces'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on td osdExceptionPieces - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Pre Billing Check In Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}