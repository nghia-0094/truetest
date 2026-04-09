import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission_3d710d61
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission_912a1cec
import truetest.GH_ACTION.common.inputPhoneNumberAndDateSubmission_cffee7aa
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1836, 693)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 3: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 4: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 5: Click on html welcomeInstructions"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_welcomeInstructions'))

"Step 6: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 7: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 8: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 9: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission_cffee7aa.execute(input_phoneNumber3, input_textboxDdmmyyyy)

"Step 10: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 11: Click on input medicalStatus (radioHospitalization)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value]))

"Step 12: Click on input claimEventCause (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value]))

"Step 13: Click on html pageContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent'))

"Step 14: Click on matIcon dynamicObject (dynamicObject2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value]))

"Step 15: Click on input radioIllness6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 16: Click on html pageContent2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent2'))

"Step 17: Click on input comboboxObject5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject5'))

"Step 18: Click on link acuteAbdomen2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_acuteAbdomen2'))

"Step 19: Click on matIcon object73"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 20: Click on span calendarDay (calendarItemDay3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild, 'span_calendarDay_css_value_1': span_calendarDay_css_value]))

"Step 21: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 22: Click on span calendarDay13"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay13'))

"Step 23: Click on span calendarDay14"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay14'))

"Step 24: Click on input radioNo28"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 25: Click on input radioHospital9"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital9'))

"Step 26: Click on input radioIndonesia5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 27: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 28: Click on input totalBillAmount4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 29: Enter input value in input totalBillAmount4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_totalBillAmount4)

"Step 30: Click on input radioNo29"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 31: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 32: Click on input radioNo30"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 33: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 34: Click on matSelect pleaseSelect2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 35: Click on matOption currencyOptions (currencyUsd2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value]))

"Step 36: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 37: Click on html footerContactInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContactInfo'))

"Step 38: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 39: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 40: Click on html pageContent4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent4'))

"Step 41: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 42: Click on html pageContent5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent5'))

"Step 43: Click on html pageContent5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent5'))

"Step 44: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 45: Click on span mliReferenceNumber -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_mliReferenceNumber'))

"Step 46: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 47: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 48: Click on html welcomeInstructions"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_welcomeInstructions'))

"Step 49: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 50: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 51: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 52: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission_3d710d61.execute(input_phoneNumber3_1, input_textboxDdmmyyyy_1)

"Step 53: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 54: Click on input medicalStatus (radioHospitalization)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_1, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_1]))

"Step 55: Click on input claimEventCause (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_1, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_1]))

"Step 56: Click on html pageContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent'))

"Step 57: Click on matIcon dynamicObject (dynamicObject3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel_1, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value_1]))

"Step 58: Click on input radioIllness6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 59: Click on input comboboxObject5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject5'))

"Step 60: Click on link acuteAbdomen2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_acuteAbdomen2'))

"Step 61: Click on input dateText3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateText3'))

"Step 62: Click on matIcon object73"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 63: Click on span calendarDay (calendarItemDay3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild_1, 'span_calendarDay_css_value_1': span_calendarDay_css_value_1]))

"Step 64: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 65: Click on html pageRoot"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageRoot'))

"Step 66: Click on span calendarDay15"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay15'))

"Step 67: Click on span calendarDay16"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay16'))

"Step 68: Click on matIcon periodOfHospitalizationCalendar"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_periodOfHospitalizationCalendar'))

"Step 69: Click on matRadioGroup yesNo6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_yesNo6'))

"Step 70: Click on input radioNo28"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 71: Click on input radioHospital9"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital9'))

"Step 72: Click on input radioIndonesia5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 73: Click on input totalBillAmount4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 74: Enter input value in input totalBillAmount4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_totalBillAmount4_1)

"Step 75: Click on html supportInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_supportInfo'))

"Step 76: Click on matRadioGroup yesNo7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_yesNo7'))

"Step 77: Click on input radioNo29"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 78: Click on input radioNo30"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 79: Click on html supportInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_supportInfo'))

"Step 80: Click on matSelect pleaseSelect2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 81: Click on matOption currencyOptions (currencyUsd2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_1, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_1]))

"Step 82: Click on html supportInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_supportInfo'))

"Step 83: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 84: Click on html footerContactInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContactInfo'))

"Step 85: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 86: Click on html pageContent6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent6'))

"Step 87: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 88: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 89: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 90: Click on html pageContent7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent7'))

"Step 91: Click on button submit2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 92: Click on html pageContent7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent7'))

"Step 93: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 94: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 95: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 96: Click on html welcomeInstructions"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_welcomeInstructions'))

"Step 97: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 98: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 99: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 100: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission_912a1cec.execute(input_phoneNumber3_2, input_textboxDdmmyyyy_2)

"Step 101: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 102: Click on input medicalStatus (radioHospitalization)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_2, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_2]))

"Step 103: Click on input claimEventCause (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_2, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_2]))

"Step 104: Click on matIcon dynamicObject (dynamicObject3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel_2, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value_2]))

"Step 105: Click on html pageContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent'))

"Step 106: Click on input radioIllness6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 107: Click on html pageContent2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent2'))

"Step 108: Click on input comboboxObject5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject5'))

"Step 109: Click on link acuteAbdomen2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_acuteAbdomen2'))

"Step 110: Click on matIcon object73"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 111: Click on span calendarDay (calendarItemDay3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild_2, 'span_calendarDay_css_value_1': span_calendarDay_css_value_2]))

"Step 112: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 113: Click on span calendarDate4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDate4'))

"Step 114: Click on span calendarDate5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDate5'))

"Step 115: Click on input radioNo28"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 116: Click on input radioHospital9"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital9'))

"Step 117: Click on input radioIndonesia5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 118: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 119: Click on input totalBillAmount4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 120: Enter input value in input totalBillAmount4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_totalBillAmount4_2)

"Step 121: Click on input radioNo29"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 122: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 123: Click on input radioNo30"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 124: Click on matSelect pleaseSelect2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 125: Click on matOption currencyOptions (currencyUsd2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_2, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_2]))

"Step 126: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 127: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 128: Click on html footerContactInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContactInfo'))

"Step 129: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 130: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 131: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 132: Click on html pageContent4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent4'))

"Step 133: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 134: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 135: Click on html pageContent7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent7'))

"Step 136: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 137: Click on span claimReference3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimReference3'))

"Step 138: Click on span claimReference3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/welcome'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimReference3'))

"Step 139: Click on matSelect languageBahasaIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_languageBahasaIndonesia'))

"Step 140: Click on matOption optionEnglish"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matOption_optionEnglish'))

"Step 141: Click on html welcomeInstructions"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_welcomeInstructions'))

"Step 142: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 143: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 144: Click on button continue"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 145: Enter phone number and date in the submission form"

inputPhoneNumberAndDateSubmission.execute(input_phoneNumber3_3, input_textboxDdmmyyyy_3)

"Step 146: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 147: Click on input medicalStatus (radioHospitalization)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalStatus', ['input_medicalStatus_InternalLabel_1': input_medicalStatus_InternalLabel_3, 'input_medicalStatus_css_value_1': input_medicalStatus_css_value_3]))

"Step 148: Click on input claimEventCause (radioMedicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_claimEventCause', ['input_claimEventCause_InternalLabel_1': input_claimEventCause_InternalLabel_3, 'input_claimEventCause_css_value_1': input_claimEventCause_css_value_3]))

"Step 149: Click on html englishManulifeIdClaimCustomerContactCenter"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_englishManulifeIdClaimCustomerContactCenter'))

"Step 150: Click on matIcon dynamicObject (dynamicObject3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel_3, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value_3]))

"Step 151: Click on html pageContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent'))

"Step 152: Click on input radioIllness6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 153: Click on input comboboxObject5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject5'))

"Step 154: Click on link acuteAbdomen2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_acuteAbdomen2'))

"Step 155: Click on html footerContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContent'))

"Step 156: Click on matIcon object73"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 157: Click on span calendarDay (calendarItemDay3)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild_3, 'span_calendarDay_css_value_1': span_calendarDay_css_value_3]))

"Step 158: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 159: Click on span calendarDay17"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay17'))

"Step 160: Click on span calendarDay18"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay18'))

"Step 161: Click on html footerContent"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContent'))

"Step 162: Click on input radioNo28"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 163: Click on input radioHospital9"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital9'))

"Step 164: Click on input radioIndonesia5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 165: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 166: Click on input totalBillAmount4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'))

"Step 167: Enter input value in input totalBillAmount4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4'), input_totalBillAmount4_3)

"Step 168: Click on div questionCoveredByOtherInsurance"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_questionCoveredByOtherInsurance'))

"Step 169: Click on input radioNo29"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 170: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 171: Click on input radioNo30"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 172: Click on matSelect pleaseSelect2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 173: Click on matOption currencyOptions (currencyUsd2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyOptions', ['matOption_currencyOptions_MatOption_1': matOption_currencyOptions_MatOption_3, 'matOption_currencyOptions_css_value_1': matOption_currencyOptions_css_value_3]))

"Step 174: Click on html pageContent3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent3'))

"Step 175: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 176: Click on html footerContactInfo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_footerContactInfo'))

"Step 177: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 178: Click on span closeFileUpload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_closeFileUpload'))

"Step 179: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_delete2'))

"Step 180: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 181: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 182: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 183: Click on label uploadDocument"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 184: Click on html pageContent7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/html_pageContent7'))

"Step 185: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 186: Click on span claimReference4 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_claimReference4'))

"Step 187: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC286-Submit English ID Claim with Upload Documents and Verify Claim Reference on Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}