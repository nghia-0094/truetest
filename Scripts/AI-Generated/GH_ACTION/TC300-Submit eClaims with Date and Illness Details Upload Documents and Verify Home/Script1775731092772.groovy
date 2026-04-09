import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1848, 757)
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

"Step 9: Click on div customerIdentification"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification_1'))

"Step 10: Click on input date"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 11: Enter input value in input date"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_date)

"Step 12: Double-click on input dateStartingWork"

WebUI.doubleClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateStartingWork'))

"Step 13: Click on input dateStartingWork"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateStartingWork'))

"Step 14: Click on input dateStartingWork"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateStartingWork'))

"Step 15: Enter input value in input dateStartingWork"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateStartingWork'), input_dateStartingWork)

"Step 16: Click on div customerIdentificationSection"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentificationSection'))

"Step 17: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 18: Click on input medicalStatus (radioHospitalization)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_1, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_1]))

"Step 19: Click on input claimEventCause (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_1, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_1]))

"Step 20: Click on matIcon dynamicObject (dynamicObject3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel_1, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value_1]))

"Step 21: Click on input radioIllness6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 22: Click on input textAutocomplete"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject5'))

"Step 23: Click on link abdominalPelvicPain"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_abdominalAndPelvicPain'))

"Step 24: Click on matIcon object73"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 25: Click on span calendarDay (calendarItemDay3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild_1, 'span_calendarDay_css_value_1': span_calendarDay_css_value_1]))

"Step 26: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 27: Click on label calendarItemContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_calendarItemContent'))

"Step 28: Click on span calendarDay15"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay15'))

"Step 29: Click on span calendarDay20"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_day'))

"Step 30: Click on input radioNo28"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 31: Click on input radioClinic"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioClinic'))

"Step 32: Click on input radioIndonesia5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 33: Click on input totalBillAmount42"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 34: Enter input value in input totalBillAmount42"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_totalBillAmount42)

"Step 35: Click on div otherInsuranceDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_otherInsuranceDetails'))

"Step 36: Click on input radioNo29"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 37: Click on input policyholderBankAccountNumber4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_policyholderBankAccountNumber4'))

"Step 38: Enter input value in input policyholderBankAccountNumber4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_policyholderBankAccountNumber4'), input_policyholderBankAccountNumber4)

"Step 39: Click on matSelect selectOption"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_selectOption'))

"Step 40: Click on matOption currencyOptions (rupiah3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_1, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_1]))

"Step 41: Click on input selectPleaseSelect"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectPleaseSelect'))

"Step 42: Click on link anZpaninBank3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_anZpaninBank3'))

"Step 43: Click on appPaymentBeneficiaryList object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/appPaymentBeneficiaryList_object'))

"Step 44: Click on button continue3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 45: Click on input radioNo30"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 46: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 47: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 48: Click on span closeFileUpload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_closeFileUpload'))

"Step 49: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 50: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 51: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 52: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 53: Double-click on span claimReference5"

WebUI.doubleClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimReference5'))

"Step 54: Click on span claimReference5 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimReference5'))

"Step 55: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC300-Submit eClaims with Date and Illness Details Upload Documents and Verify Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}