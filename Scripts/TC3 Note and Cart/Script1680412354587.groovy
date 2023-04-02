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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.232.198.199:8081/')

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Kod Nuey Restaurant/button_Order Now'))

WebUI.setText(findTestObject('Object Repository/Note and cart/Page_Sign In/input_Sign In_email'), 'Sasipha_th@cmu.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Note and cart/Page_Sign In/input_Sign In_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Sign In/input'))

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Menu/img'))

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Menu Food/div_haejangguk                thick and spi_74cef9'))

WebUI.setText(findTestObject('Object Repository/Note and cart/Page_Add To Cart/add note input'), note)

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Add To Cart/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Note and cart/Page_Menu Food/i_Menu_fa fa-shopping-cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Note and cart/Page_Menu Food/item note'), note)

WebUI.closeBrowser()

