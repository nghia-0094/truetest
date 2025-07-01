import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.Tracking_Environment.common.enterInPersonDetailsAndLicenseInfo
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

"Step 2: Click on link lifeApplication -> Navigate to page '/EGApp/NewApplication'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp/link_lifeApplication'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 2-Click on link lifeApplication - Navigate to page EGAppNewApplication.png')

"Step 3: Press key Tab on select jurisdiction2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/select_jurisdiction3'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 3-Press key Tab on select jurisdiction2.png')

"Step 4: Click on link lifeFgeverlastWizard"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_lifeFgeverlastWizard'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 4-Click on link lifeFgeverlastWizard.png')

"Step 5: Click on link createNewApplication3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/link_createNewApplication3'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 5-Click on link createNewApplication3.png')

"Step 6: Click on button create"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/NewApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_NewApplication/button_create'))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 6-Click on button create.png')

"Step 7: Enter in-person details and license information"

enterInPersonDetailsAndLicenseInfo.execute(data_path_0, Integer.valueOf(index_0))

"Step 8: Press key Tab on input mi -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/EGApp/EditWizardApplication?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.sendKeys(findTestObject('AI-Generated/Tracking Environment/Page_EGApp_EditWizardApplication/input_mi'), Keys.chord(Keys.TAB))

// WebUI.takeScreenshot(reportLocation + '/TC77/Step 8-Press key Tab on input mi - Navigate to page .png')

"Step 9: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Create Life Application and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}