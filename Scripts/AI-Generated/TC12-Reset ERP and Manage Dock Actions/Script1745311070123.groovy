import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${path_param_1}/${path_param_2}/${path_param_3}")

"Step 2: Hover over link pd"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_live_worksheet_management/link_pd'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Hover over link pd.png')

"Step 3: Click on link changeCityRoutes -> Navigate to page 'service creation#*/*/CreateNewRoute'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_live_worksheet_management/link_changeCityRoutes'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link changeCityRoutes - Navigate to page service creationCreateNewRoute.png')

"Step 4: Click on input vehicleDetails (trailerNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on input vehicleDetails trailerNumber.png')

"Step 5: Enter input value in input vehicleDetails (trailerNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel_1]), input_vehicleDetails)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Enter input value in input vehicleDetails trailerNumber.png')

"Step 6: Click on input vehicleDetails (tractorNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on input vehicleDetails tractorNumber.png')

"Step 7: Click on input vehicleDetails (driverCode)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on input vehicleDetails driverCode.png')

"Step 8: Click on input vehicleDetails (doorNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on input vehicleDetails doorNumber.png')

"Step 9: Enter input value in input vehicleDetails (doorNumber)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_service_creation/input_vehicleDetails', ['input_vehicleDetails_internalLabel': input_vehicleDetails_internalLabel_5]), input_vehicleDetails_1)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Enter input value in input vehicleDetails doorNumber.png')

"Step 10: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on input proNumber.png')

"Step 11: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on input proNumber.png')

"Step 12: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on input proNumber.png')

"Step 13: Enter input value in input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_service_creation/input_proNumber'), input_proNumber)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Enter input value in input proNumber.png')

"Step 14: Click on label proSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/label_proSearch'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on label proSearch.png')

"Step 15: Click on input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/input_proNumber'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on input proNumber.png')

"Step 16: Enter input value in input proNumber"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_service_creation/input_proNumber'), input_proNumber_1)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Enter input value in input proNumber.png')

"Step 17: Click on label proSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/label_proSearch'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on label proSearch.png')

"Step 18: Click on input submit"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/input_submit'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on input submit.png')

"Step 19: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/CreateNewRoute?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_service_creation/button_ok'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on button ok.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Reset ERP and Manage Dock Actions_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}