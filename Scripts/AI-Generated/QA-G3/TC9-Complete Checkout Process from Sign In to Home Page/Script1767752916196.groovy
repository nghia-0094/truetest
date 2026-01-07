import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.QA_G3.common.fillShippingInformation
import truetest.QA_G3.common.processCreditCardPayment
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

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on link signIn - Navigate to page signin.png')

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on link shop -> Navigate to page '/shop'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_signin/link_shop'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on link shop - Navigate to page shop.png')

"Step 5: Hover over div addToBasket3"

WebUI.mouseOver(findTestObject('AI-Generated/QA-G3/Page_shop/div_addToBasket3'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Hover over div addToBasket3.png')

"Step 6: Click on header productName"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_shop/header_productName'))

// WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on header productName.png')

"Step 7: Choose product size and color then add to basket."

selectProductSizeAndColor.execute()

"Step 8: Enter shipping details and proceed to the next step."

fillShippingInformation.execute(input_addressPlaceholder, input_emailPlaceholder, input_fullName, input_phonePlaceholder)

"Step 9: Input credit card details and confirm the checkout."

processCreditCardPayment.execute(input_cardNumber, input_namePlaceholder, input_passwordPlaceholder)

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Complete Checkout Process from Sign In to Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}