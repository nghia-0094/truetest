import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission_2e4dd55e
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 940)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 3: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 4: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 5: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 6: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 7: Click on input textfieldClaimId"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 8: Enter input value in input textfieldClaimId"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_textfieldClaimId)

"Step 9: Press key Enter on input textfieldClaimId"

WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), Keys.chord(Keys.ENTER))

"Step 10: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber3'))

"Step 11: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber3'))

"Step 12: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber3'), input_phoneNumber)

"Step 13: Press key Enter on input textfieldPolicyNumber"

WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textfieldPolicyNumber'), Keys.chord(Keys.ENTER))

"Step 14: Enter input value in input date"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_date)

"Step 15: Press key Enter on input textDateError"

WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateDdmmyyyy2'), Keys.chord(Keys.ENTER))

"Step 16: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 17: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 18: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 19: Click on div continueButton"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_continueButton'))

"Step 20: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 21: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 22: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 23: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission_2e4dd55e.execute(input_phoneNumber3, input_textboxDdmmyyyy)

"Step 24: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 25: Click on label medicalStatusOptions (disability2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/label_medicalStatusOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/label_medicalStatusOptions', ['label_medicalStatusOptions_LabelInternalText_1': label_medicalStatusOptions_LabelInternalText_1, 'label_medicalStatusOptions_css_value_1': label_medicalStatusOptions_css_value_1]))

"Step 26: Click on matRadioGroup claimEventType2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_claimEventType2'))

"Step 27: Click on input claimEventCause (radioIllness) -> Navigate to page ''"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_1, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_1]))

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC264-Switch language and complete initial claim submission then verify home page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}