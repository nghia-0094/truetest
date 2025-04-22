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

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 4: Click on link dockManagement (closeToBos2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id, 'link_dockManagement_internalText': link_dockManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link dockManagement closeToBos2.png')

"Step 5: Select option with input value from select newLoadToTerminal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_dock_management_layout/select_newLoadToTerminal'), select_newLoadToTerminal)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Select option with input value from select newLoadToTerminal.png')

"Step 6: Click on input newTrailerNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_newTrailerNumber'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on input newTrailerNumber.png')

"Step 7: Enter input value in input newTrailerNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_management_layout/input_newTrailerNumber'), input_newTrailerNumber)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Enter input value in input newTrailerNumber.png')

"Step 8: Click on input saveTrailer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_saveTrailer'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on input saveTrailer.png')

"Step 9: Click on button ok3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/button_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on button ok3.png')

"Step 10: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Hover over link dock.png')

"Step 11: Click on link trek -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_trek'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on link trek - Navigate to page shipment movement.png')

"Step 12: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on input buffer.png')

"Step 13: Enter input value in input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'), input_buffer)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Enter input value in input buffer.png')

"Step 14: Click on input enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on input enter.png')

"Step 15: Click on input loadIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_loadIt'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Click on input loadIt.png')

"Step 16: Click on input misloadOverride"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_misloadOverride'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on input misloadOverride.png')

"Step 17: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on input buffer.png')

"Step 18: Enter input value in input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'), input_buffer_1)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Enter input value in input buffer.png')

"Step 19: Click on input enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on input enter.png')

"Step 20: Click on input misloadOverride -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_misloadOverride'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on input misloadOverride - Navigate to page generic confirmationMoveConfirmation.png')

"Step 21: Click on input ok -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on input ok - Navigate to page shipment movement.png')

"Step 22: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on input buffer.png')

"Step 23: Enter input value in input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'), input_buffer_2)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Enter input value in input buffer.png')

"Step 24: Click on input enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on input enter.png')

"Step 25: Click on input loadIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_loadIt'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on input loadIt.png')

"Step 26: Click on input misloadOverride"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_misloadOverride'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on input misloadOverride.png')

"Step 27: Click on input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on input buffer.png')

"Step 28: Enter input value in input buffer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer'), input_buffer_3)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Enter input value in input buffer.png')

"Step 29: Click on input enter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on input enter.png')

"Step 30: Click on input misloadOverride -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_misloadOverride'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on input misloadOverride - Navigate to page generic confirmationMoveConfirmation.png')

"Step 31: Click on input ok -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on input ok - Navigate to page dock management layout.png')

"Step 32: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on link close.png')

"Step 33: Click on input refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on input refresh.png')

"Step 34: Click on link dockManagement (closeToBos)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id_1, 'link_dockManagement_internalText': link_dockManagement_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on link dockManagement closeToBos.png')

"Step 35: Click on link closeActions (close3) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions', ['link_closeActions_internalLabel': link_closeActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on link closeActions close3 - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Edit Employee Actions and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}