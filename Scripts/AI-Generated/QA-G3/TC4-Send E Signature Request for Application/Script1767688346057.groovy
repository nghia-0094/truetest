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
	WebUI.setViewPortSize(1920, 945)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /EGSTS/login.aspx with params (ReturnUrl, wa, wct, wctx, wtrealm)"

TrueTestScripts.navigate("EGSTS/login.aspx", ["ReturnUrl": login_ReturnUrl, "wa": login_wa, "wct": login_wct, "wctx": login_wctx, "wtrealm": login_wtrealm])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Click on link newApplication -> Navigate to page '/EGApp/NewApplication'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp/link_newApplication'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on link newApplication - Navigate to page EGAppNewApplication.png')

"Step 4: Click on link annuityFlaccessCarrier2"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_NewApplication/link_annuityFlaccessCarrier2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on link annuityFlaccessCarrier2.png')

"Step 5: Click on link create4"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_NewApplication/link_create4'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on link create4.png')

"Step 6: Enter input value in input name"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_EGApp_NewApplication/input_name'), input_name)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Enter input value in input name.png')

"Step 7: Click on button create2 -> Navigate to page '/EGApp/eSign/Signers'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_NewApplication/button_create2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on button create2 - Navigate to page EGAppeSignSigners.png')

"Step 8: Click on link annuitant (annuitant)"

// Bind values to the variables in the locators of "AI-Generated/QA-G3/Dynamic Objects/Page_EGApp_eSign_Signers/link_annuitant"
WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Dynamic Objects/Page_EGApp_eSign_Signers/link_annuitant', ['link_annuitant_InternalLabel_1': link_annuitant_InternalLabel_1, 'link_annuitant_css_value_1': link_annuitant_css_value_1]))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link annuitant annuitant.png')

"Step 9: Click on link proceed -> Navigate to page '/EGApp/eSign/MultiClientSelected'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_Signers/link_proceed'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on link proceed - Navigate to page EGAppeSignMultiClientSelected.png')

"Step 10: Click on link sendEmailRequest -> Navigate to page '/EGApp/eSign/ClientEmail'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_MultiClientSelected/link_sendEmailRequest'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on link sendEmailRequest - Navigate to page EGAppeSignClientEmail.png')

"Step 11: Enter input value in input signerName"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerName'), input_signerName)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Enter input value in input signerName.png')

"Step 12: Click on input signerEmail"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on input signerEmail.png')

"Step 13: Enter input value in input signerEmail"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerEmail'), input_signerEmail)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Enter input value in input signerEmail.png')

"Step 14: Click on input signerLast4DigitsSsn"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerLast4DigitsSsn'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Click on input signerLast4DigitsSsn.png')

"Step 15: Enter input value in input signerLast4DigitsSsn"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerLast4DigitsSsn'), input_signerLast4DigitsSsn)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Enter input value in input signerLast4DigitsSsn.png')

"Step 16: Click on input signerBirthDate"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerBirthDate'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on input signerBirthDate.png')

"Step 17: Enter input value in input signerBirthDate"

WebUI.setText(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/input_signerBirthDate'), input_signerBirthDate)

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Enter input value in input signerBirthDate.png')

"Step 18: Click on button generateLinkWithoutEmail"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/button_generateLinkWithoutEmail'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on button generateLinkWithoutEmail.png')

"Step 19: Click on link backToSigners -> Navigate to page '/EGApp/eSign/Signers'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_ClientEmail/link_backToSigners'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on link backToSigners - Navigate to page EGAppeSignSigners.png')

"Step 20: Click on link backToApplication -> Navigate to page '/EGApp/EditWizardApplication'"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_eSign_Signers/link_backToApplication'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on link backToApplication - Navigate to page EGAppEditWizardApplication.png')

"Step 21: Click on button close"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_EditWizardApplication/button_close'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on button close.png')

"Step 22: Click on link logOff2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/QA-G3/Page_EGApp_EditWizardApplication/link_logOff2'))

// WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on link logOff2 - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Send E Signature Request for Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}