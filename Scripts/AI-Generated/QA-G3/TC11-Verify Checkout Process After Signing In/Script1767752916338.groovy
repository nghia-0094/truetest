import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.common.fillShippingInformation
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

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_signin/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div basketActions (addToBasket)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions"
WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Hover over div basketActions addToBasket.png')

"Step 6: Click on button productActions (productAction)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions', ['button_productActions_css_value_1': button_productActions_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on button productActions productAction.png')

"Step 7: Click on span shopping"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_shopping'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 7-Click on span shopping.png')

"Step 8: Click on button checkOut -> Navigate to page '/checkout/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/button_checkOut'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 8-Click on button checkOut - Navigate to page checkout.png')

"Step 9: Click on button nextStep"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 9-Click on button nextStep.png')

"Step 10: Enter shipping details and proceed to the next step."

fillShippingInformation.execute(input_addressPlaceholder, input_emailPlaceholder, input_fullName, input_phonePlaceholder)

"Step 11: Click on span paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/span_paymentPrompt'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 11-Click on span paymentPrompt.png')

"Step 12: Click on input paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_paymentPrompt'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 12-Click on input paymentPrompt.png')

"Step 13: Click on button confirmCheckout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_confirmCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC11/Step 13-Click on button confirmCheckout - Navigate to page .png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Verify Checkout Process After Signing In_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}