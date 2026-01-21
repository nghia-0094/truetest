import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import truetest.GH_ACTION.common.navigateAndDragDropElements
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(810, 670)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to / with params (a, b)"

TrueTestScripts.navigate("", ["a": var_a, "b": var_b])

"Step 2: Navigate to references and perform drag and drop actions"

navigateAndDragDropElements.execute()

"Step 3: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Drag and Drop Functionality without Link Click_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}