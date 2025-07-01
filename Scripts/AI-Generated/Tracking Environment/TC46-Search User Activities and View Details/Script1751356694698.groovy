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

"Step 2: Click on link page28"

WebUI.switchToWindowTitle('Welcome')

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_page28'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 2-Click on link page28.png')

"Step 3: Click on link page39"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_page39'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 3-Click on link page39.png')

"Step 4: Click on link page47"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_page47'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 4-Click on link page47.png')

"Step 5: Click on link allActivities3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_allActivities3'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 5-Click on link allActivities3.png')

"Step 6: Click on button advancedSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_advancedSearch'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 6-Click on button advancedSearch.png')

"Step 7: Select option with input value from select userActivitiesFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/select_userActivitiesFilter'), select_userActivitiesFilter)

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 7-Select option with input value from select userActivitiesFilter.png')

"Step 8: Click on input contractNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/input_contractNumber3'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 8-Click on input contractNumber3.png')

"Step 9: Enter input value in input contractNumber3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/input_contractNumber3'), input_contractNumber3)

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 9-Enter input value in input contractNumber3.png')

"Step 10: Click on button search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/button_search'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 10-Click on button search.png')

"Step 11: Click on link viewDetails (view4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_viewDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_viewDetails', ['link_viewDetails_internalLabel': link_viewDetails_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 11-Click on link viewDetails view4.png')

"Step 12: Click on div prelimPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/div_prelimPage'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 12-Click on div prelimPage.png')

"Step 13: Click on link openPageList44"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_openPageList44'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 13-Click on link openPageList44.png')

"Step 14: Click on link navigationLinks (page142)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_navigationLinks"
WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Dynamic Objects/Page_EGApp/link_navigationLinks', ['link_navigationLinks_divNthChild': link_navigationLinks_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 14-Click on link navigationLinks page142.png')

"Step 15: Click on link home13"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_home13'))

// WebUI.takeScreenshot(reportLocation + '/TC46/Step 15-Click on link home13.png')

"Step 16: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Search User Activities and View Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}