import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to pre-billing"

TrueTestScripts.navigate("pre-billing")

"Step 2: Click on input terminal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_terminal'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on input terminal.png')

"Step 3: Enter input value in input terminal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_terminal'), input_terminal)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Enter input value in input terminal.png')

"Step 4: Click on link man"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/link_man'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link man.png')

"Step 5: Click on input driverList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_driverList'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on input driverList.png')

"Step 6: Enter input value in input driverList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_driverList'), input_driverList)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Enter input value in input driverList.png')

"Step 7: Click on link name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/link_name'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link name.png')

"Step 8: Click on input trailer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_trailer'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on input trailer.png')

"Step 9: Enter input value in input trailer"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_trailer'), input_trailer)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Enter input value in input trailer.png')

"Step 10: Click on input door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_door'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on input door.png')

"Step 11: Click on input door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_door'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on input door.png')

"Step 12: Enter input value in input door"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_door'), input_door)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Enter input value in input door.png')

"Step 13: Click on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on input checkIn.png')

"Step 14: Click on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on input checkIn.png')

"Step 15: Enter input value in input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), input_checkIn)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Enter input value in input checkIn.png')

"Step 16: Press key Enter on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Press key Enter on input checkIn.png')

"Step 17: Click on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on input checkIn.png')

"Step 18: Enter input value in input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), input_checkIn_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Enter input value in input checkIn.png')

"Step 19: Press key Enter on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Press key Enter on input checkIn.png')

"Step 20: Click on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on input checkIn.png')

"Step 21: Enter input value in input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), input_checkIn_2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Enter input value in input checkIn.png')

"Step 22: Press key Enter on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Press key Enter on input checkIn.png')

"Step 23: Click on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 23-Click on input checkIn.png')

"Step 24: Enter input value in input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), input_checkIn_3)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 24-Enter input value in input checkIn.png')

"Step 25: Press key Enter on input checkIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Page_pre_billing/input_checkIn'), Keys.chord(Keys.ENTER))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 25-Press key Enter on input checkIn.png')

"Step 26: Click on button sendToDock"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'pre-billing?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_pre_billing/button_sendToDock'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 26-Click on button sendToDock.png')

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Change City Routes and Verify Service Creation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}