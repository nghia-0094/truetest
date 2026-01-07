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

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Hover over div addToBasket"

WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Page_search/div_addToBasket'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Hover over div addToBasket.png')

"Step 5: Enter input value in input searchProduct"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_search/input_searchProduct'), input_searchProduct)

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Enter input value in input searchProduct.png')

"Step 6: Click on button addToBasket"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_search/button_addToBasket'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on button addToBasket.png')

"Step 7: Click on span shoppingButton"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_search/span_shoppingButton'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on span shoppingButton.png')

"Step 8: Click on button checkout -> Navigate to page '/checkout/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_search/button_checkout'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on button checkout - Navigate to page checkout.png')

"Step 9: Click on button nextStep"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_checkout/button_nextStep'))

// WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on button nextStep.png')

"Step 10: Enter shipping details and proceed to the next step."

fillShippingInformation.execute(input_addressPlaceholder, input_emailPlaceholder, input_fullName, input_phonePlaceholder)

"Step 11: Input credit card details and confirm the checkout."

processCreditCardPayment.execute(input_cardNumber, input_namePlaceholder, input_passwordPlaceholder)

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Add Product to Basket and Complete Checkout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}