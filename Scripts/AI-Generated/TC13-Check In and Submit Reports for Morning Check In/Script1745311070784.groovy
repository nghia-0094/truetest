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

"Step 2: Click on link dockLayout3 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on link dockLayout3 - Navigate to page dock management layout.png')

"Step 3: Select option with input value from select layoutSelectedDockView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_dock_management_layout/select_layoutSelectedDockView'), select_layoutSelectedDockView)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Select option with input value from select layoutSelectedDockView.png')

"Step 4: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Hover over link dockLayout.png')

"Step 5: Click on link erpReset -> Navigate to page 'dock management city load plans#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_erpReset'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 5-Click on link erpReset - Navigate to page dock management city load plans.png')

"Step 6: Click on input submitButtonMainPageErp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_submitButtonMainPageErp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 6-Click on input submitButtonMainPageErp.png')

"Step 7: Click on input passwordTextBoxErp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_passwordTextBoxErp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 7-Click on input passwordTextBoxErp.png')

"Step 8: Enter input value in input passwordTextBoxErp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_passwordTextBoxErp'), input_passwordTextBoxErp)

WebUI.takeScreenshot(reportLocation + '/TC13/Step 8-Enter input value in input passwordTextBoxErp.png')

"Step 9: Click on input searchButtonDialogBoxErp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_searchButtonDialogBoxErp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 9-Click on input searchButtonDialogBoxErp.png')

"Step 10: Click on input printDocuments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_printDocuments'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 10-Click on input printDocuments.png')

"Step 11: Click on input submitButtonDialogBoxErp"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/input_submitButtonDialogBoxErp'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 11-Click on input submitButtonDialogBoxErp.png')

"Step 12: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 12-Click on link close.png')

"Step 13: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_city_load_plans/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 13-Hover over link dockLayout.png')

"Step 14: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_city_load_plans/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 14-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 15: Click on link dockManagement (loadName)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id, 'link_dockManagement_internalText': link_dockManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 15-Click on link dockManagement loadName.png')

"Step 16: Hover over link object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_object'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 16-Hover over link object.png')

"Step 17: Click on link close5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close5'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 17-Click on link close5.png')

"Step 18: Click on link doorLoadData (loadName2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_doorLoadData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_doorLoadData', ['link_doorLoadData_internalText': link_doorLoadData_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 18-Click on link doorLoadData loadName2.png')

"Step 19: Click on link pdloadManifest -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_pdloadManifest'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 19-Click on link pdloadManifest - Navigate to page shipment movement.png')

"Step 20: Click on input loadIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_loadIt2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 20-Click on input loadIt2.png')

"Step 21: Click on input enter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 21-Click on input enter3.png')

"Step 22: Click on input button"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_button'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 22-Click on input button.png')

"Step 23: Click on input submitAction (submit) -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shipment_movement/input_submitAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shipment_movement/input_submitAction', ['input_submitAction_internalText': input_submitAction_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 23-Click on input submitAction submit - Navigate to page generic confirmationMoveConfirmation.png')

"Step 24: Click on input ok3 -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 24-Click on input ok3 - Navigate to page shipment movement.png')

"Step 25: Click on input ok -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_ok'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 25-Click on input ok - Navigate to page dock management layout.png')

"Step 26: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 26-Click on link close.png')

"Step 27: Click on link pdloadManifest2 -> Navigate to page 'shipment movement#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_pdloadManifest2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 27-Click on link pdloadManifest2 - Navigate to page shipment movement.png')

"Step 28: Click on input loadIt2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_loadIt2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 28-Click on input loadIt2.png')

"Step 29: Click on input enter3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_enter3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 29-Click on input enter3.png')

"Step 30: Click on input button2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_shipment_movement/input_button2'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 30-Click on input button2.png')

"Step 31: Click on input submitAction (submit) -> Navigate to page 'generic confirmation#*/*/MoveConfirmation'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_shipment_movement/input_submitAction"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_shipment_movement/input_submitAction', ['input_submitAction_internalText': input_submitAction_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 31-Click on input submitAction submit - Navigate to page generic confirmationMoveConfirmation.png')

"Step 32: Click on input ok3 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/MoveConfirmation?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_confirmation/input_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 32-Click on input ok3 - Navigate to page dock management layout.png')

"Step 33: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 33-Click on link close.png')

"Step 34: Click on link closeActions (close6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions', ['link_closeActions_internalLabel': link_closeActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 34-Click on link closeActions close6.png')

"Step 35: Click on input refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 35-Click on input refresh.png')

"Step 36: Click on link loadName3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_loadName3'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 36-Click on link loadName3.png')

"Step 37: Click on input sendToYard (sendToYard2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/input_sendToYard"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/input_sendToYard', ['input_sendToYard_id': input_sendToYard_id, 'input_sendToYard_internalText': input_sendToYard_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 37-Click on input sendToYard sendToYard2.png')

"Step 38: Click on button confirmationActions (confirm3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 38-Click on button confirmationActions confirm3.png')

"Step 39: Click on button confirmationActions (ok4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class_1, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 39-Click on button confirmationActions ok4.png')

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Check In and Submit Reports for Morning Check In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}