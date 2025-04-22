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

"Step 2: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link resetLayout -> Navigate to page 'dock layout management#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_resetLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on link resetLayout - Navigate to page dock layout management.png')

"Step 4: Click on input submitMainPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/input_submitMainPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on input submitMainPage.png')

"Step 5: Enter input value in input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_layout_management/input_password'), input_password)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Enter input value in input password.png')

"Step 6: Click on input submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/input_submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on input submit.png')

"Step 7: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_layout_management/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Hover over link dockLayout.png')

"Step 8: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 9: Click on link doorData"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_doorData'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link doorData.png')

"Step 10: Click on link doorLoadData (doorData2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_doorLoadData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_doorLoadData', ['link_doorLoadData_internalText': link_doorLoadData_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link doorLoadData doorData2.png')

"Step 11: Click on input saveLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_saveLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on input saveLayout.png')

"Step 12: Click on button ok3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/button_ok3'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on button ok3.png')

"Step 13: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Hover over link dockLayout.png')

"Step 14: Click on link resetLayout -> Navigate to page 'dock layout management#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_resetLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link resetLayout - Navigate to page dock layout management.png')

"Step 15: Click on input submitMainPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/input_submitMainPage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input submitMainPage.png')

"Step 16: Enter input value in input password"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_dock_layout_management/input_password'), input_password_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input password.png')

"Step 17: Click on input submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/input_submit'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on input submit.png')

"Step 18: Click on link close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/link_close'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on link close.png')

"Step 19: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_layout_management/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Hover over link dockLayout.png')

"Step 20: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_layout_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Assign Work and Verify Dock Management Layout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}