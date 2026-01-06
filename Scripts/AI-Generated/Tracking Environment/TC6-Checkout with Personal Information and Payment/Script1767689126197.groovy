import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.selectProductSizeAndColor
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link signIn -> Navigate to page '/signin'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_home/link_signIn'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_signin/link_shop'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div basketActions (addToBasket3)"

// // Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_shop/div_basketActions"
WebUI.mouseOver(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Hover over div basketActions addToBasket3.png')

"Step 6: Click on header chamaedoreaElegans"

// WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_shop/header_chamaedoreaElegans'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on header chamaedoreaElegans.png')

"Step 7: Choose product size and color then add to basket and checkout"

selectProductSizeAndColor.execute()

"Step 8: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_checkout/input_fullName'), input_fullName)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Enter input value in input fullName.png')

"Step 9: Enter input value in input emailAddress"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_checkout/input_emailAddress'), input_emailAddress)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Enter input value in input emailAddress.png')

"Step 10: Enter input value in input shippingAddress"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_checkout/input_shippingAddress'), input_shippingAddress)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Enter input value in input shippingAddress.png')

"Step 11: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_checkout/input_phoneNumber'), input_phoneNumber)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Enter input value in input phoneNumber.png')

"Step 12: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_checkout/button_nextStep2'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 12-Click on button nextStep2.png')

"Step 13: Click on div paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_checkout/div_paymentPrompt'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Click on div paymentPrompt.png')

"Step 14: Click on input cashPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_checkout/input_cashPrompt'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on input cashPrompt.png')

"Step 15: Click on button confirm -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_checkout/button_confirm'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on button confirm - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Checkout with Personal Information and Payment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}