import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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

//Open Browser
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.radarbox.com/')

WebUI.waitForElementClickable(findTestObject('Object Repository/RadarBox/button_statistics'), 5)

WebUI.mouseOver(findTestObject('Object Repository/RadarBox/button_statistics'))

WebUI.click(findTestObject('Object Repository/RadarBox/option_Dashboard'))

//verify element using customkeyword
CustomKeywords.'utility.VerifyElementPresent.clickElement'(findTestObject('Object Repository/RadarBox/verify_MostActiveAirlines'))

//get text of MostActiveAirline
String expectresult = WebUI.getText(findTestObject('Object Repository/RadarBox/verify_MostActiveAirlines'))

println(expectresult)

//Serch airline by name
WebUI.setText(findTestObject('Object Repository/RadarBox/txtBx_FindByAirline'), 'American')

WebUI.click(findTestObject('Object Repository/RadarBox/option_AmericanAirlines'))

WebUI.closeBrowser()
