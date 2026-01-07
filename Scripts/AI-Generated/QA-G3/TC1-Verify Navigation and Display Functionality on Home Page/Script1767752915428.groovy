import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to https://www.saucedemo.com/"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to / with params (a, b)"

TrueTestScripts.navigate("/", ["a": var_a, "b": var_b])

"Step 4: Click on link shop"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on link shop.png')

"Step 5: Click on link shop2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_shop2'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on link shop2.png')

"Step 6: Click on link references"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_references'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link references.png')

"Step 7: Drag image noImage and Drop to div display"

WebUI.switchToWindowTitle('Image Viewer')

TrueTestScripts.dragAndDropToTargetByDirection(findTestObject('AI-Generated/QA-G3/Page_home/image_noImage'), findTestObject('AI-Generated/QA-G3/Page_home/div_display'), 'CENTER')

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Drag image noImage and Drop to div display.png')

"Step 8: Drag image noImage and Drop to div display"

TrueTestScripts.dragAndDropToTargetByDirection(findTestObject('AI-Generated/QA-G3/Page_home/image_noImage'), findTestObject('AI-Generated/QA-G3/Page_home/div_display'), 'CENTER')

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Drag image noImage and Drop to div display.png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Verify Navigation and Display Functionality on Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}