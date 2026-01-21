import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.common.navigateAndDragDropElements
import truetest.GH_ACTION.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(810, 670)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to / with params (a, b)"

TrueTestScripts.navigate("", ["a": var_a, "b": var_b])

"Step 2: Click on link object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_home/link_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link object.png')

"Step 3: Navigate to references and perform drag and drop actions"

navigateAndDragDropElements.execute()

"Step 4: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Verify Drag and Drop Functionality on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}