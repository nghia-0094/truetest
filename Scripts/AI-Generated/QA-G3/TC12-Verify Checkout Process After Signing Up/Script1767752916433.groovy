import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.common.fillShippingInformation
import truetest.QA_G3.common.manageBasketAndCheckout
import truetest.QA_G3.common.processCreditCardPayment
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

"Step 2: Click on link signUp -> Navigate to page '/signup'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_signUp'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on link signUp - Navigate to page signup.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_signup/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div basketActions (addToBasket)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions"
WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Hover over div basketActions addToBasket.png')

"Step 6: Click on button productActions (productAction)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions', ['button_productActions_css_value_1': button_productActions_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on button productActions productAction.png')

"Step 7: Click on span shopping"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_shopping'))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on span shopping.png')

"Step 8: Click on button quantityControl (close)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_quantityControl', ['button_quantityControl_InternalRoleButtonName_1': button_quantityControl_InternalRoleButtonName, 'button_quantityControl_css_value_1': button_quantityControl_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on button quantityControl close.png')

"Step 9: Close basket, manage actions, and proceed to checkout."

manageBasketAndCheckout.execute(button_productActions_css_value_1, div_basketActions_InternalText_1)

"Step 10: Enter shipping details and proceed to the next step."

fillShippingInformation.execute(input_addressPlaceholder, input_emailPlaceholder, input_fullName, input_phonePlaceholder)

"Step 11: Input credit card details and confirm the checkout."

processCreditCardPayment.execute(input_cardNumber, input_namePlaceholder, input_passwordPlaceholder)

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Verify Checkout Process After Signing Up_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}