import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import org.openqa.selenium.Keys as Keys
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.common.Select place of death and related options
import truetest.GH_ACTION.common.Set job description and income details
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1536, 477)
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

"Step 8: Click on div customerIdentification"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification_1'))

"Step 9: Click on input date"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 10: Enter input value in input date"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_date)

"Step 11: Click on div customerIdentificationSection"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentificationSection'))

"Step 12: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 13: Click on input medicalStatus (radioDeath)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value]))

"Step 14: Click on input claimEventCause (radioAccident)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value]))

"Step 15: Click on matIcon object72"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object72'))

"Step 16: Click on span calendarDay (calendarDay6)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild, 'span_calendarDay_css_value_1': span_calendarDay_css_value]))

"Step 17: Click on input radioHospital4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital4'))

"Step 18: Click on textarea object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_object'))

"Step 19: Enter input value in textarea object"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_object'), textarea_object)

"Step 20: Click on matRadioGroup hospitalHome"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_hospitalHome'))

"Step 21: Click on input radioNo11"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo11'))

"Step 22: Click on input selectRadioNo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectRadioNo'))

"Step 23: Click on input no2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_no2'))

"Step 24: Click on input radioNo12"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo12'))

"Step 25: Click on input noRadio3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_noRadio3'))

"Step 26: Click on input radioNoOption2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNoOption2'))

"Step 27: Click on input beneficiaryBankAccountNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_beneficiaryBankAccountNumber'))

"Step 28: Enter input value in input beneficiaryBankAccountNumber"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_beneficiaryBankAccountNumber'), input_beneficiaryBankAccountNumber)

"Step 29: Click on matSelect selectOption"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_selectOption'))

"Step 30: Click on matOption currencyOptions (rupiah3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value]))

"Step 31: Click on input selectPleaseSelect"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectPleaseSelect'))

"Step 32: Click on link object3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_object3'))

"Step 33: Click on input radioMonthly"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioMonthly'))

"Step 34: Click on button continue4 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue4'))

"Step 35: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 36: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 37: Click on label upload2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload2'))

"Step 38: Click on label uploadKtpPassport"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport'))

"Step 39: Click on label uploadKtpPassport2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport2'))

"Step 40: Click on label uploadKtpPassport3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport3'))

"Step 41: Click on div upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_upload'))

"Step 42: Click on input object2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 43: Enter input value in input object2"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_object2)

"Step 44: Press key Tab on input object2"

WebUI.sendKeys(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), Keys.chord(Keys.TAB))

"Step 45: Enter input value in input contactInformation (policyNumber)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation"
WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation', ['input_contactInformation_css_value_1': input_contactInformation_css_value]), input_contactInformation)

"Step 46: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 47: Click on span submissionId2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_submissionId2'))

"Step 48: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 49: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 50: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 51: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 52: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 53: Click on input textfieldClaimId"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 54: Enter input value in input textfieldClaimId"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_textfieldClaimId)

"Step 55: Click on div customerIdentification"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification_1'))

"Step 56: Click on input date"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 57: Enter input value in input date"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_date_1)

"Step 58: Click on div customerIdentificationSection"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentificationSection'))

"Step 59: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 60: Click on input medicalStatus (radioDeath)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_1, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_1]))

"Step 61: Click on input claimEventCause (radioAccident)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_1, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_1]))

"Step 62: Click on matIcon object72"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object72'))

"Step 63: Click on input radioHospital4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital4'))

"Step 64: Click on textarea object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_object'))

"Step 65: Enter input value in textarea object"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_object'), textarea_object_1)

"Step 66: Choose place of death and select multiple no options in the form."

Select place of death and related options.execute()

"Step 67: Click on div radioTouchTarget5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_radioTouchTarget5'))

"Step 68: Click on input beneficiaryBankAccountNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_beneficiaryBankAccountNumber'))

"Step 69: Enter input value in input beneficiaryBankAccountNumber"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_beneficiaryBankAccountNumber'), input_beneficiaryBankAccountNumber_1)

"Step 70: Click on matSelect selectOption"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_selectOption'))

"Step 71: Click on matOption currencyOptions (rupiah3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_1, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_1]))

"Step 72: Click on input selectPleaseSelect"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectPleaseSelect'))

"Step 73: Click on link bankBangkokbankLtd"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_bankBangkokbankLtd'))

"Step 74: Click on input radioMonthly"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioMonthly'))

"Step 75: Click on button continue4 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue4'))

"Step 76: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 77: Click on label upload2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload2'))

"Step 78: Click on label uploadKtpPassport"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport'))

"Step 79: Click on label uploadKtpPassport2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport2'))

"Step 80: Click on label uploadKtpPassport3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport3'))

"Step 81: Click on div upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_upload'))

"Step 82: Click on div uploadedFileItem"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_uploadedFileItem'))

"Step 83: Click on input object2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 84: Enter input value in input object2"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_object2_1)

"Step 85: Click on input contactInformation (policyNumber)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation', ['input_contactInformation_css_value_1': input_contactInformation_css_value_1]))

"Step 86: Enter input value in input contactInformation (policyNumber)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation"
WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_contactInformation', ['input_contactInformation_css_value_1': input_contactInformation_css_value_2]), input_contactInformation_1)

"Step 87: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 88: Click on span claimNumber3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimNumber3'))

"Step 89: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 90: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 91: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 92: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 93: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 94: Click on input textfieldClaimId"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 95: Enter input value in input textfieldClaimId"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_textfieldClaimId_1)

"Step 96: Click on input date"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 97: Enter input value in input date"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_date_2)

"Step 98: Click on div customerIdentificationSection"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentificationSection'))

"Step 99: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 100: Click on input medicalStatus (radioDisability)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_2, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_2]))

"Step 101: Click on input claimEventCause (radioAccident)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_2, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_2]))

"Step 102: Click on textarea incidentDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_incidentDetails'))

"Step 103: Enter input value in textarea incidentDetails"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_incidentDetails'), textarea_incidentDetails)

"Step 104: Click on matRadioGroup eventCause"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_eventCause'))

"Step 105: Click on input radioNo3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo3_1'))

"Step 106: Click on input radioNoOption"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNoOption'))

"Step 107: Click on input radioNo4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo4'))

"Step 108: Click on input radioNo31"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo31'))

"Step 109: Click on input radioNo5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo5'))

"Step 110: Click on textarea dailyActivityInDownPosition"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_dailyActivityInDownPosition'))

"Step 111: Enter input value in textarea dailyActivityInDownPosition"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_dailyActivityInDownPosition'), textarea_dailyActivityInDownPosition)

"Step 112: Click on appQuestionFormItem disabilityDetails"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/appQuestionFormItem_disabilityDetails'))

"Step 113: Click on input companyName3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyName3'))

"Step 114: Enter input value in input companyName3"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyName3'), input_companyName3)

"Step 115: Click on input companyPhoneNumber4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyPhoneNumber4'))

"Step 116: Enter input value in input companyPhoneNumber4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_companyPhoneNumber4'), input_companyPhoneNumber4)

"Step 117: Click on textarea companyAddress"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_companyAddress'))

"Step 118: Enter input value in textarea companyAddress"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/textarea_companyAddress'), textarea_companyAddress)

"Step 119: Click on div employmentDetailsHelpText"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_employmentDetailsHelpText'))

"Step 120: Click on input jobDescription2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_jobDescription2'))

"Step 121: Enter job description, select currency, and input average income amount."

Set job description and income details.execute(input_averageIncomeAmount5, input_jobDescription2, matOption_currencyOptions_MatOption_2, matOption_currencyOptions_css_value_2)

"Step 122: Click on matIcon object75"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object75'))

"Step 123: Click on span calendarDay (calendarDay6)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild_1, 'span_calendarDay_css_value_1': span_calendarDay_css_value_1]))

"Step 124: Click on appQuestionFormItem employmentDetails2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/appQuestionFormItem_employmentDetails2'))

"Step 125: Click on matIcon alertIcon"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_alertIcon'))

"Step 126: Click on input employedSameCompanyRadio"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_employedSameCompanyRadio'))

"Step 127: Click on input no"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_no'))

"Step 128: Click on input noRadio"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_noRadio'))

"Step 129: Click on input radioNo2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo2_1'))

"Step 130: Click on input policyholderBankAccountNumber4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_policyholderBankAccountNumber4'))

"Step 131: Enter input value in input policyholderBankAccountNumber4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_policyholderBankAccountNumber4'), input_policyholderBankAccountNumber4)

"Step 132: Click on matSelect beneficiaryAccountSelect"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_selectOption'))

"Step 133: Click on matOption currencyOptions (rupiah3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_3, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_3]))

"Step 134: Click on input selectPleaseSelect"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectPleaseSelect'))

"Step 135: Click on link bankBangkokbankLtd"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_bankBangkokbankLtd'))

"Step 136: Click on input selectRadioMonthly"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_selectRadioMonthly'))

"Step 137: Click on button continue4 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue4'))

"Step 138: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 139: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 140: Click on label uploadKtpPassport4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport4'))

"Step 141: Click on label uploadKtpPassport5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport5'))

"Step 142: Click on span removeFile3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_removeFile3'))

"Step 143: Click on button delete3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_delete3'))

"Step 144: Click on label uploadKtpPassport5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadKtpPassport5'))

"Step 145: Click on label upload7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload7'))

"Step 146: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 147: Click on span claimNumber4 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimNumber4'))

"Step 148: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC287-Submit Extended Eclaims Form with Employment and Upload Steps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}