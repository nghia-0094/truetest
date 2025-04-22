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

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 4: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Hover over link dock.png')

"Step 5: Click on link trek -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_trek'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link trek - Navigate to page shipment movement.png')

"Step 6: Click on input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on input buffer2.png')

"Step 7: Enter input value in input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'), input_buffer2)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Enter input value in input buffer2.png')

"Step 8: Click on input enter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on input enter2.png')

"Step 9: Click on input dockIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_dockIt2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on input dockIt2.png')

"Step 10: Click on input enter2 -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on input enter2 - Navigate to page generic confirmationMoveConfirmation.png')

"Step 11: Click on input ok2 -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Click on input ok2 - Navigate to page shipment movement.png')

"Step 12: Click on input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on input buffer2.png')

"Step 13: Enter input value in input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'), input_buffer2_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Enter input value in input buffer2.png')

"Step 14: Click on input enter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on input enter2.png')

"Step 15: Click on input dockIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_dockIt2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on input dockIt2.png')

"Step 16: Click on input enter2 -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 16-Click on input enter2 - Navigate to page generic confirmationMoveConfirmation.png')

"Step 17: Click on input ok2 -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on input ok2 - Navigate to page shipment movement.png')

"Step 18: Click on input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on input buffer2.png')

"Step 19: Enter input value in input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'), input_buffer2_2)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Enter input value in input buffer2.png')

"Step 20: Click on input enter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Click on input enter2.png')

"Step 21: Click on input dockIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_dockIt2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on input dockIt2.png')

"Step 22: Click on input enter2 -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 22-Click on input enter2 - Navigate to page generic confirmationMoveConfirmation.png')

"Step 23: Click on input ok2 -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Click on input ok2 - Navigate to page shipment movement.png')

"Step 24: Click on input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on input buffer2.png')

"Step 25: Enter input value in input buffer2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_shipment_movement/input_buffer2'), input_buffer2_3)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 25-Enter input value in input buffer2.png')

"Step 26: Click on input enter2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Click on input enter2.png')

"Step 27: Click on input dockIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_dockIt2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Click on input dockIt2.png')

"Step 28: Click on input enter2 -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Click on input enter2 - Navigate to page generic confirmationMoveConfirmation.png')

"Step 29: Click on input ok2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Click on input ok2 - Navigate to page dock management layout.png')

"Step 30: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Click on link close.png')

"Step 31: Click on input refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 31-Click on input refresh.png')

"Step 32: Click on link dockManagement (doorNumber2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id, 'link_dockManagement_internalText': link_dockManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 32-Click on link dockManagement doorNumber2.png')

"Step 33: Click on input sendToYard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_sendToYard'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 33-Click on input sendToYard.png')

"Step 34: Click on button confirmationActions (confirm2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 34-Click on button confirmationActions confirm2.png')

"Step 35: Click on button confirmationActions (ok2) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class_1, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 35-Click on button confirmationActions ok2 - Navigate to page .png')

"Step 36: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Reset Dock Layout and Verify Changes_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}