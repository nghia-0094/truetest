import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillShippingInfoAndCompleteOrder
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /"

TrueTestScripts.navigate("/")

"Step 2: Click on button addToCart"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_addToCart_1'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on button addToCart.png')

"Step 3: Click on label colorStorageOption (storage128Gb)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on label colorStorageOption storage128Gb.png')

"Step 4: Click on label colorStorageOption (colorBlue)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_home/label_colorStorageOption', ['label_colorStorageOption_internalText': label_colorStorageOption_internalText_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on label colorStorageOption colorBlue.png')

"Step 5: Click on button buy"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/button_buy'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on button buy.png')

"Step 6: Click on link placeOrder"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/link_placeOrder'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link placeOrder.png')

"Step 7: Fill in shipping information and complete the order"

fillShippingInfoAndCompleteOrder.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Click on link kCellphoneShop -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/thank-you/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_thank_you/link_kCellphoneShop'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on link kCellphoneShop - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Order for a Product with Color Option_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}