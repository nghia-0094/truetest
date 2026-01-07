import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.common.selectProductSizeAndColor
import truetest.QA_G3.custom.TrueTestScripts

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

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_signin/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div basketActions (addToBasket4)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions"
WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Hover over div basketActions addToBasket4.png')

"Step 6: Click on header productName"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/header_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on header productName.png')

"Step 7: Choose product size and color then add to basket."

selectProductSizeAndColor.execute()

"Step 8: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'), input_fullName)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in input fullName.png')

"Step 9: Enter input value in input emailPlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_emailPlaceholder'), input_emailPlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Enter input value in input emailPlaceholder.png')

"Step 10: Enter input value in input addressPlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_addressPlaceholder'), input_addressPlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Enter input value in input addressPlaceholder.png')

"Step 11: Enter input value in input phonePlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_phonePlaceholder'), input_phonePlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Enter input value in input phonePlaceholder.png')

"Step 12: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on button nextStep2.png')

"Step 13: Click on div paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/div_paymentPrompt'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on div paymentPrompt.png')

"Step 14: Click on input paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_paymentPrompt'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on input paymentPrompt.png')

"Step 15: Click on button confirmCheckout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_confirmCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on button confirmCheckout - Navigate to page .png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Complete Checkout Process with Product Selection and Payment_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}