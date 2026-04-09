import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.common.Set job description and income details_78c9167d
import truetest.GH_ACTION.common.Update daily activity and company details
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission_1c727a0d
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1707, 810)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on div claimInformationSections (claimInformationTitle)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/div_claimInformationSections"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/div_claimInformationSections', ['div_claimInformationSections_DivNthChild_1': div_claimInformationSections_DivNthChild, 'div_claimInformationSections_css_value_1': div_claimInformationSections_css_value]))

"Step 3: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 4: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 5: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 6: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 7: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 8: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission_1c727a0d.execute(input_phoneNumber3, input_textboxDdmmyyyy)

"Step 9: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 10: Click on input medicalStatus (radioOutpatient2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value]))

"Step 11: Click on input medicalStatus (radioDisability)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_1, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_1]))

"Step 12: Click on input claimEventCause (radioIllness5)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value]))

"Step 13: Click on textarea incidentDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_incidentDetails'))

"Step 14: Enter input value in textarea incidentDetails"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_incidentDetails'), textarea_incidentDetails)

"Step 15: Click on input radioLumpSum2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioLumpSum2'))

"Step 16: Click on input radioYes15"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes15'))

"Step 17: Click on input radioYes16"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes16'))

"Step 18: Click on input radioYes17"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes17'))

"Step 19: Click on input radioYes15"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes15'))

"Step 20: Click on input radioYes16"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioYes16'))

"Step 21: Enter date, daily activity, company name, phone, and address fields."

Update daily activity and company details.execute(input_companyName3, input_companyPhoneNumber4, input_dateTextField5, textarea_dailyActivityInDownPosition)

"Step 22: Click on textarea companyAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_companyAddress'))

"Step 23: Enter input value in textarea companyAddress"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_companyAddress'), textarea_companyAddress)

"Step 24: Click on input jobDescription2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_jobDescription2'))

"Step 25: Enter job description, select currency, and input average income amount."

Set job description and income details_78c9167d.execute(input_averageIncomeAmount5, input_jobDescription2, matOption_currencyOptions_MatOption, matOption_currencyOptions_css_value)

"Step 26: Click on input dateTextfield3 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateTextfield3'))

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC266-Complete eClaims submission form with medical and incident details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}