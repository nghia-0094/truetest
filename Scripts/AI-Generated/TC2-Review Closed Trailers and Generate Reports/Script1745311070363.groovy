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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over link dockLayout.png')

"Step 3: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 4: Click on input startEditEmployee"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/input_startEditEmployee'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input startEditEmployee.png')

"Step 5: Select option with input value from select selectedWorkingStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_dock_management_layout/select_selectedWorkingStatus'), select_selectedWorkingStatus)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Select option with input value from select selectedWorkingStatus.png')

"Step 6: Click on link saveNewActions (new)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions', ['link_saveNewActions_internalText': link_saveNewActions_internalText, 'link_saveNewActions_nth': link_saveNewActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link saveNewActions new.png')

"Step 7: Click on button editStartTime (editStartTime)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_editStartTime"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_editStartTime', ['button_editStartTime_actualStart': button_editStartTime_actualStart]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button editStartTime editStartTime.png')

"Step 8: Click on link saveNewActions (save)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions', ['link_saveNewActions_internalText': link_saveNewActions_internalText_1, 'link_saveNewActions_nth': link_saveNewActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link saveNewActions save.png')

"Step 9: Click on link saveNewActions (new2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions', ['link_saveNewActions_internalText': link_saveNewActions_internalText_2, 'link_saveNewActions_nth': link_saveNewActions_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link saveNewActions new2.png')

"Step 10: Click on button editStartTime (editStartTime2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/button_editStartTime"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/button_editStartTime', ['button_editStartTime_actualStart': button_editStartTime_actualStart_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on button editStartTime editStartTime2.png')

"Step 11: Click on link saveNewActions (save2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_saveNewActions', ['link_saveNewActions_internalText': link_saveNewActions_internalText_3, 'link_saveNewActions_nth': link_saveNewActions_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link saveNewActions save2.png')

"Step 12: Click on link closeActions (close4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_dock_management_layout/link_closeActions', ['link_closeActions_internalLabel': link_closeActions_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link closeActions close4.png')

"Step 13: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Hover over link dock.png')

"Step 14: Click on link liveWorksheet -> Navigate to page 'live worksheet management#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_liveWorksheet'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link liveWorksheet - Navigate to page live worksheet management.png')

"Step 15: Click on input addWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/input_addWork'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on input addWork.png')

"Step 16: Select option with input value from select workType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet_management/select_workType'), select_workType)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Select option with input value from select workType.png')

"Step 17: Select option with input value from select workAssignmentTrailerNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet_management/select_workAssignmentTrailerNumber'), select_workAssignmentTrailerNumber)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Select option with input value from select workAssignmentTrailerNumber.png')

"Step 18: Select option with input value from select workAssignmentEmployeeId2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet_management/select_workAssignmentEmployeeId'), select_workAssignmentEmployeeId2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Select option with input value from select workAssignmentEmployeeId2.png')

"Step 19: Select option with input value from select workAssignmentDockLocId"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet_management/select_workAssignmentDockLocId'), select_workAssignmentDockLocId)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Select option with input value from select workAssignmentDockLocId.png')

"Step 20: Click on input saveWork"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/input_saveWork'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on input saveWork.png')

"Step 21: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet_management/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Hover over link dock.png')

"Step 22: Click on link liveWorksheet"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_liveWorksheet'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on link liveWorksheet.png')

"Step 23: Select option with input value from select selectedWorkType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_live_worksheet_management/select_selectedWorkType'), select_selectedWorkType)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Select option with input value from select selectedWorkType.png')

"Step 24: Hover over link dockLayout"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Hover over link dockLayout.png')

"Step 25: Click on link dockLayout2 -> Navigate to page 'dock management layout#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_dockLayout2'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Click on link dockLayout2 - Navigate to page dock management layout.png')

"Step 26: Hover over link dock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_dock_management_layout/link_dock'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Hover over link dock.png')

"Step 27: Click on link liveWorksheet -> Navigate to page 'live worksheet management#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dock_management_layout/link_liveWorksheet'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Click on link liveWorksheet - Navigate to page live worksheet management.png')

"Step 28: Click on input refresh"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Click on input refresh.png')

"Step 29: Click on input refresh -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/input_refresh'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on input refresh - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Review Closed Trailers and Generate Reports_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}