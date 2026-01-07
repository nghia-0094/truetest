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

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on link shop3 -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/link_shop3'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link shop3 - Navigate to page shop.png')

"Step 3: Click on span shopping"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/span_shopping'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on span shopping.png')

"Step 4: Click on button checkOut"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/button_checkOut'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button checkOut.png')

"Step 5: Click on button signInToCheckout -> Navigate to page '/signin'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/button_signInToCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on button signInToCheckout - Navigate to page signin.png')

"Step 6: Login into Application"

TrueTestScripts.login()

"Step 7: Hover over div productDisplay"

WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Page_home/div_productDisplay'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Hover over div productDisplay.png')

"Step 8: Click on image productDisplay -> Navigate to page '/product/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_home/image_productDisplay'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on image productDisplay - Navigate to page product.png')

"Step 9: Click on button addToBasket"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/button_addToBasket'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on button addToBasket.png')

"Step 10: Click on span shoppingButton"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/span_shoppingButton'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on span shoppingButton.png')

"Step 11: Click on button checkOut -> Navigate to page '/checkout/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_product/button_checkOut'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on button checkOut - Navigate to page checkout.png')

"Step 12: Click on button nextStep"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button nextStep.png')

"Step 13: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on button nextStep2.png')

"Step 14: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on input fullName.png')

"Step 15: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'), input_fullName)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Enter input value in input fullName.png')

"Step 16: Click on input emailPlaceholder"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_emailPlaceholder'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on input emailPlaceholder.png')

"Step 17: Enter input value in input emailPlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_emailPlaceholder'), input_emailPlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Enter input value in input emailPlaceholder.png')

"Step 18: Click on div shippingAddressRequired"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/div_shippingAddressRequired'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on div shippingAddressRequired.png')

"Step 19: Click on input addressPlaceholder"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_addressPlaceholder'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on input addressPlaceholder.png')

"Step 20: Enter input value in input addressPlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_addressPlaceholder'), input_addressPlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Enter input value in input addressPlaceholder.png')

"Step 21: Enter input value in input phonePlaceholder"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_phonePlaceholder'), input_phonePlaceholder)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Enter input value in input phonePlaceholder.png')

"Step 22: Click on header shippingInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/header_shippingInfo'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on header shippingInfo.png')

"Step 23: Click on input shippingOption"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_shippingOption'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on input shippingOption.png')

"Step 24: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on button nextStep2.png')

"Step 25: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Click on button nextStep2.png')

"Step 26: Click on input fullName"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on input fullName.png')

"Step 27: Enter input value in input fullName"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_checkout/input_fullName'), input_fullName_1)

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Enter input value in input fullName.png')

"Step 28: Click on button nextStep2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep2'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 28-Click on button nextStep2.png')

"Step 29: Click on button confirmCheckout"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_confirmCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 29-Click on button confirmCheckout.png')

"Step 30: Click on span paymentMethods"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/span_paymentMethods'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 30-Click on span paymentMethods.png')

"Step 31: Click on div creditCard"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/div_creditCard'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 31-Click on div creditCard.png')

"Step 32: Click on label creditCard"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/label_creditCard'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 32-Click on label creditCard.png')

"Step 33: Click on label paymentPrompt"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/label_paymentPrompt'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 33-Click on label paymentPrompt.png')

"Step 34: Click on button confirmCheckout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_confirmCheckout'))

// WebUI.takeScreenshot(reportLocation + '/TC14/Step 34-Click on button confirmCheckout - Navigate to page .png')

"Step 35: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Checkout Process with Detailed Shipping and Payment Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}