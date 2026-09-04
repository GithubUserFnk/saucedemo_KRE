import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.click(findTestObject('Object Repository/Checkout/keranjangCheckout'))
CustomKeywords.'web.screenshoot.takeSS'()
WebUI.click(findTestObject('Object Repository/Checkout/buttonCheckout'))
CustomKeywords.'web.screenshoot.takeSS'()
WebUI.setText(findTestObject('Object Repository/Checkout/inputFirstName'), GlobalVariable.Cop_FirstName)
WebUI.setText(findTestObject('Object Repository/Checkout/inputLastName'), GlobalVariable.Cop_LastName)
WebUI.setText(findTestObject('Object Repository/Checkout/inputPostalCode'), GlobalVariable.Cop_PostalCode)
CustomKeywords.'web.screenshoot.takeSS'()
WebUI.click(findTestObject('Object Repository/Checkout/buttonContinue'))
CustomKeywords.'web.screenshoot.takeSS'()
WebUI.click(findTestObject('Object Repository/Checkout/buttonFinish'))
CustomKeywords.'web.screenshoot.takeSS'()
WebUI.click(findTestObject('Object Repository/Checkout/buttonBack Home'))
CustomKeywords.'web.screenshoot.takeSS'()