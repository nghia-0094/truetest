import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.common.fillShippingInformation
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

"Step 2: Click on link signIn -> Navigate to page '/signin'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_signIn'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_signin/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div basketActions (addToBasket)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions"
WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/div_basketActions', ['div_basketActions_InternalText_1': div_basketActions_InternalText]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Hover over div basketActions addToBasket.png')

"Step 6: Click on button productActions (productAction)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_productActions', ['button_productActions_css_value_1': button_productActions_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on button productActions productAction.png')

"Step 7: Click on span shopping"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_shopping'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on span shopping.png')

"Step 8: Click on button quantityControl (increaseQuantity)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/button_quantityControl', ['button_quantityControl_InternalRoleButtonName_1': button_quantityControl_InternalRoleButtonName, 'button_quantityControl_css_value_1': button_quantityControl_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button quantityControl increaseQuantity.png')

"Step 9: Click on image productThumbnail"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/image_productThumbnail'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on image productThumbnail.png')

"Step 10: Click on div productDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/div_productDetails'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Click on div productDetails.png')

"Step 11: Click on span quantityControl (increaseQuantity)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl', ['span_quantityControl_InternalRoleButtonName_1': span_quantityControl_InternalRoleButtonName, 'span_quantityControl_css_value_1': span_quantityControl_css_value]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on span quantityControl increaseQuantity.png')

"Step 12: Click on span quantityControl (increaseQuantity)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl', ['span_quantityControl_InternalRoleButtonName_1': span_quantityControl_InternalRoleButtonName_1, 'span_quantityControl_css_value_1': span_quantityControl_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on span quantityControl increaseQuantity.png')

"Step 13: Click on span decreaseQuantity"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_decreaseQuantity'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on span decreaseQuantity.png')

"Step 14: Click on span decreaseQuantity"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_decreaseQuantity'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on span decreaseQuantity.png')

"Step 15: Click on span quantityControl (decreaseQuantity2)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_shop/span_quantityControl', ['span_quantityControl_InternalRoleButtonName_1': span_quantityControl_InternalRoleButtonName_2, 'span_quantityControl_css_value_1': span_quantityControl_css_value_2]))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on span quantityControl decreaseQuantity2.png')

"Step 16: Click on button checkOut -> Navigate to page '/checkout/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/button_checkOut'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on button checkOut - Navigate to page checkout.png')

"Step 17: Click on button nextStep"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))

// WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on button nextStep.png')

"Step 18: Enter shipping details and proceed to the next step."

fillShippingInformation.execute(input_addressPlaceholder, input_emailPlaceholder, input_fullName, input_phonePlaceholder)

"Step 19: Input credit card details and confirm the checkout."

processCreditCardPayment.execute(input_cardNumber, input_namePlaceholder, input_passwordPlaceholder)

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Adjust Product Quantity and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}