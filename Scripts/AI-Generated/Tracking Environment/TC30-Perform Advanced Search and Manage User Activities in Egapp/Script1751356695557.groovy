import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /EGApp with params (LaunchPoint)"

TrueTestScripts.navigate("/EGApp", ["LaunchPoint": EGApp_LaunchPoint])

"Step 2: Click on link allActivities5"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_allActivities5'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 2-Click on link allActivities5.png')

"Step 3: Click on button advancedSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_advancedSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 3-Click on button advancedSearch.png')

"Step 4: Click on input radioAll"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/input_radioAll'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 4-Click on input radioAll.png')

"Step 5: Select option with input value from select statusType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_statusType'), select_statusType)

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 5-Select option with input value from select statusType.png')

"Step 6: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_search'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 6-Click on button search.png')

"Step 7: Click on button advancedSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_advancedSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 7-Click on button advancedSearch.png')

"Step 8: Select option with input value from select userActivitiesFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_userActivitiesFilter'), select_userActivitiesFilter)

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 8-Select option with input value from select userActivitiesFilter.png')

"Step 9: Click on link all"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_all'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 9-Click on link all.png')

"Step 10: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_search'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 10-Click on button search.png')

"Step 11: Click on button allUsers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_allUsers'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 11-Click on button allUsers.png')

"Step 12: Click on link view2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_view2'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 12-Click on link view2.png')

"Step 13: Click on link close3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_close3'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 13-Click on link close3.png')

"Step 14: Click on div toastMessage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_toastMessage2'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 14-Click on div toastMessage2.png')

"Step 15: Click on button continue"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_continue'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 15-Click on button continue.png')

"Step 16: Click on button reSign"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_reSign'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 16-Click on button reSign.png')

"Step 17: Click on button ok"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_ok'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 17-Click on button ok.png')

"Step 18: Click on link agentOwnerDetails (owner)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_agentOwnerDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_agentOwnerDetails', ['link_agentOwnerDetails_internalLabel': link_agentOwnerDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 18-Click on link agentOwnerDetails owner.png')

"Step 19: Click on link signNow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_signNow'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 19-Click on link signNow.png')

"Step 20: Click on link sendEmailRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_sendEmailRequest'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 20-Click on link sendEmailRequest.png')

"Step 21: Click on input yourEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/input_yourEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 21-Click on input yourEmail.png')

"Step 22: Click on input signerEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/input_signerEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 22-Click on input signerEmail.png')

"Step 23: Click on div sendEmailRequest"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_sendEmailRequest'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 23-Click on div sendEmailRequest.png')

"Step 24: Click on link cancel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_cancel'))

// WebUI.takeScreenshot(reportLocation + '/TC30/Step 24-Click on link cancel.png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Perform Advanced Search and Manage User Activities in Egapp_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}