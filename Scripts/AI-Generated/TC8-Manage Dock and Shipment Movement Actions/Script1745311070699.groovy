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

"Step 2: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 4: Click on link dockManagement (doorNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id, 'link_dockManagement_internalText': link_dockManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on link dockManagement doorNumber.png')

"Step 5: Click on link trailerSummary -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_trailerSummary'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on link trailerSummary - Navigate to page shipment movement.png')

"Step 6: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on button ok.png')

"Step 7: Click on input dockIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_dockIt'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on input dockIt.png')

"Step 8: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on input buffer.png')

"Step 9: Click on input enter -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on input enter - Navigate to page generic confirmationMoveConfirmation.png')

"Step 10: Click on input ok -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on input ok - Navigate to page dock management layout.png')

"Step 11: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on link close.png')

"Step 12: Click on link closeActions (close2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions', ['link_closeActions_internalLabel': link_closeActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on link closeActions close2.png')

"Step 13: Click on input refresh -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on input refresh - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Manage Dock and Shipment Movement Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}