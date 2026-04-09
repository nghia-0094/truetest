import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.GH_ACTION.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1848, 749)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /welcome"

TrueTestScripts.navigate("/welcome")

"Step 2: Click on matSelect languageOption (languageOption)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matSelect_languageOption"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matSelect_languageOption', ['matSelect_languageOption_InternalLabel_1': matSelect_languageOption_InternalLabel, 'matSelect_languageOption_css_value_1': matSelect_languageOption_css_value]))

"Step 3: Click on matOption currencyLanguage (currencyLanguage2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage', ['matOption_currencyLanguage_MatOption_1': matOption_currencyLanguage_MatOption, 'matOption_currencyLanguage_css_value_1': matOption_currencyLanguage_css_value]))

"Step 4: Click on matIcon object"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object'))

"Step 5: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_ok'))

"Step 6: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/customer-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue'))

"Step 7: Click on input phoneNumber"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'))

"Step 8: Enter input value in input phoneNumber"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_phoneNumber'), input_phoneNumber)

"Step 9: Click on div customerIdentification"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification'))

"Step 10: Click on input textboxDdmmyyyy"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'))

"Step 11: Enter input value in input textboxDdmmyyyy"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_textboxDdmmyyyy'), input_textboxDdmmyyyy)

"Step 12: Click on div customerIdentification2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_customerIdentification2'))

"Step 13: Click on button continue2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/claim-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue2'))

"Step 14: Click on input medicalInformation (medicalInput)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalInformation', ['input_medicalInformation_InternalLabel_1': input_medicalInformation_InternalLabel, 'input_medicalInformation_css_value_1': input_medicalInformation_css_value]))

"Step 15: Click on input medicalCondition (medicalConditionRadio)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalCondition', ['input_medicalCondition_InternalLabel_1': input_medicalCondition_InternalLabel, 'input_medicalCondition_css_value_1': input_medicalCondition_css_value]))

"Step 16: Click on input medicalInformation (medicalInput2)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalInformation"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalInformation', ['input_medicalInformation_InternalLabel_1': input_medicalInformation_InternalLabel_1, 'input_medicalInformation_css_value_1': input_medicalInformation_css_value_1]))

"Step 17: Click on input medicalCondition (medicalCondition)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalCondition"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/input_medicalCondition', ['input_medicalCondition_InternalLabel_1': input_medicalCondition_InternalLabel_1, 'input_medicalCondition_css_value_1': input_medicalCondition_css_value_1]))

"Step 18: Click on matIcon dynamicObject (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matIcon_dynamicObject', ['matIcon_dynamicObject_InternalLabel_1': matIcon_dynamicObject_InternalLabel, 'matIcon_dynamicObject_css_value_1': matIcon_dynamicObject_css_value]))

"Step 19: Click on input radioIllness2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIllness2'))

"Step 20: Click on input comboboxObject"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_comboboxObject'))

"Step 21: Click on link abdominalAndPelvicPain"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/link_abdominalAndPelvicPain'))

"Step 22: Click on matIcon object18"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object73'))

"Step 23: Click on span calendarElement (calendarDate)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarElement"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/span_calendarElement', ['span_calendarElement_Key_1': span_calendarElement_Key, 'span_calendarElement_SectionNthChild_1': span_calendarElement_SectionNthChild, 'span_calendarElement_css_value_1': span_calendarElement_css_value]))

"Step 24: Click on matIcon object26"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matIcon_object26'))

"Step 25: Click on span calendarDay5"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_calendarDay5'))

"Step 26: Click on span day"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_day'))

"Step 27: Click on input radioNo"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo'))

"Step 28: Click on div radioTouchTarget"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/div_radioTouchTarget'))

"Step 29: Click on input radioIndonesia"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioIndonesia'))

"Step 30: Click on input totalBillAmount4"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4_1'))

"Step 31: Enter input value in input totalBillAmount4"

WebUI.setText(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_totalBillAmount4_1'), input_totalBillAmount4)

"Step 32: Click on input radioNo2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo2'))

"Step 33: Click on input radioNo3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/input_radioNo3'))

"Step 34: Click on matSelect selectOption"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/matSelect_pleaseSelect2'))

"Step 35: Click on matOption currencyLanguage (currencyLanguage)"

// Bind values to the variables in the locators of "AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage"
WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Dynamic Objects/Page_ext_eclaims_submission_ui_id/matOption_currencyLanguage', ['matOption_currencyLanguage_MatOption_1': matOption_currencyLanguage_MatOption_1, 'matOption_currencyLanguage_css_value_1': matOption_currencyLanguage_css_value_1]))

"Step 36: Click on button continue3 -> Navigate to page '/ext/eclaims-submission-ui/id/#/support-info'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_continue3'))

"Step 37: Click on label upload"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload'))

"Step 38: Click on label upload2"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_upload4'))

"Step 39: Click on label upload3"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/label_uploadDocument'))

"Step 40: Click on button submit2 -> Navigate to page '/ext/eclaims-submission-ui/id/#/thank-you'"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/button_submit2'))

"Step 41: Click on span mli260319Pzi084"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_mli260319Pzi084'))

"Step 42: Click on span mli260319Pzi084"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_mli260319Pzi084'))

"Step 43: Click on span mli260319Pzi084 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/GH_ACTION/Page_ext_eclaims_submission_ui_id/span_mli260319Pzi084'))

"Step 44: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC201-Submit eClaim with Medical Information and Uploads_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}