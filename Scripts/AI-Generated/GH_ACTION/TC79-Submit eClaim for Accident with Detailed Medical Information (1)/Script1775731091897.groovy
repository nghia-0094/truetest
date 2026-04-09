import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1446, 482)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matOption currencyLanguage (english)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage', ['matOption_currencyLanguage_MatOption_1': matOption_currencyLanguage_MatOption, 'matOption_currencyLanguage_css_value_1': matOption_currencyLanguage_css_value]))

"Step 3: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 4: Click on button confirmation (ok)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/button_confirmation"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/button_confirmation', ['button_confirmation_CdsButton_1': button_confirmation_CdsButton, 'button_confirmation_css_value_1': button_confirmation_css_value]))

"Step 5: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 6: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 7: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_phoneNumber)

"Step 8: Click on div customerIdentification"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification'))

"Step 9: Click on input textboxDdmmyyyy"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 10: Enter input value in input dateInputAlternative"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_dateInputAlternative'), input_dateInputAlternative)

"Step 11: Click on div customerIdentification7"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification7'))

"Step 12: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 13: Click on input radioMedicalConditionSelection (radioHospitalization2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalConditionSelection"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioMedicalConditionSelection', ['input_radioMedicalConditionSelection_InternalLabel_1': input_radioMedicalConditionSelection_InternalLabel, 'input_radioMedicalConditionSelection_css_value_1': input_radioMedicalConditionSelection_css_value]))

"Step 14: Click on input radioAccidentMedicalCondition (medicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioAccidentMedicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_radioAccidentMedicalCondition', ['input_radioAccidentMedicalCondition_InternalLabel_1': input_radioAccidentMedicalCondition_InternalLabel, 'input_radioAccidentMedicalCondition_css_value_1': input_radioAccidentMedicalCondition_css_value]))

"Step 15: Click on matIcon object (object2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_object"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_object', ['matIcon_object_InternalLabel_1': matIcon_object_InternalLabel, 'matIcon_object_css_value_1': matIcon_object_css_value]))

"Step 16: Click on input radioIllness2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness6'))

"Step 17: Click on input comboboxObject"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject'))

"Step 18: Click on link acuteAbdomen"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_acuteAbdomen2'))

"Step 19: Click on matIcon object8"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 20: Click on span calendarDay (day2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarDay', ['span_calendarDay_CdsCalendarItemNthChild_1': span_calendarDay_CdsCalendarItemNthChild, 'span_calendarDay_css_value_1': span_calendarDay_css_value]))

"Step 21: Click on matIcon object5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 22: Click on span day24"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_day24'))

"Step 23: Click on span calendarDay5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay5_1'))

"Step 24: Click on matRadioGroup radioGroup2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matRadioGroup_radioGroup2'))

"Step 25: Click on input radioNo11"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo28'))

"Step 26: Click on input radioHospital2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioHospital9'))

"Step 27: Click on input radioIndonesia6"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia5'))

"Step 28: Click on input totalBillAmount"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount'))

"Step 29: Enter input value in input totalBillAmount"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount'), input_totalBillAmount)

"Step 30: Click on appQuestionFormItem currency2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/appQuestionFormItem_currency2'))

"Step 31: Click on input radioNo12"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo29'))

"Step 32: Click on input radioNo13"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo30'))

"Step 33: Click on matSelect select"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 34: Click on matOption currencyLanguage (selectRupiah)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage', ['matOption_currencyLanguage_MatOption_1': matOption_currencyLanguage_MatOption_1, 'matOption_currencyLanguage_css_value_1': matOption_currencyLanguage_css_value_1]))

"Step 35: Click on button continue -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 36: Click on label upload3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 37: Click on label upload4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 38: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 39: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 40: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 41: Click on span mliIdentifier4 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_mliIdentifier4'))

"Step 42: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC79-Submit eClaim for Accident with Detailed Medical Information (1)_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}