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

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 4: Click on link dockManagement (closeToBos)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_dockManagement', ['link_dockManagement_id': link_dockManagement_id, 'link_dockManagement_internalText': link_dockManagement_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link dockManagement closeToBos.png')

"Step 5: Click on input trailerUtilization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_trailerUtilization'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on input trailerUtilization.png')

"Step 6: Enter input value in input trailerUtilization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_management_layout/input_trailerUtilization'), input_trailerUtilization)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Enter input value in input trailerUtilization.png')

"Step 7: Click on input sendToYard (sendToYardAndClose)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/input_sendToYard"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/input_sendToYard', ['input_sendToYard_id': input_sendToYard_id, 'input_sendToYard_internalText': input_sendToYard_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on input sendToYard sendToYardAndClose.png')

"Step 8: Click on button confirmationActions (continue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button confirmationActions continue.png')

"Step 9: Click on input actualTrailerUtilization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_actualTrailerUtilization'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on input actualTrailerUtilization.png')

"Step 10: Enter input value in input actualTrailerUtilization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_management_layout/input_actualTrailerUtilization'), input_actualTrailerUtilization)

WebUI.takeScreenshot(reportLocation + '/TC11/Step 10-Enter input value in input actualTrailerUtilization.png')

"Step 11: Click on input submitTrailerUtilization"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_submitTrailerUtilization'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on input submitTrailerUtilization.png')

"Step 12: Click on label removeFromDoor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/label_removeFromDoor'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on label removeFromDoor.png')

"Step 13: Click on span removeFromDoor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/span_removeFromDoor'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on span removeFromDoor.png')

"Step 14: Click on input closeTrailerAtDoor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_closeTrailerAtDoor'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 14-Click on input closeTrailerAtDoor.png')

"Step 15: Click on input createDockMove"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_createDockMove'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 15-Click on input createDockMove.png')

"Step 16: Click on input requestReplacement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_requestReplacement'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 16-Click on input requestReplacement.png')

"Step 17: Click on button confirmationActions (confirm)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class_1, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText_1]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 17-Click on button confirmationActions confirm.png')

"Step 18: Click on button confirmationActions (ok) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_confirmationActions', ['button_confirmationActions_class': button_confirmationActions_class_2, 'button_confirmationActions_internalHasText': button_confirmationActions_internalHasText_2]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 18-Click on button confirmationActions ok - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Submit Trailer Utilization and Complete Dock Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}