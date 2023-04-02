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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl('http://34.232.198.199:8081/')

WebUI.click(findTestObject('Object Repository/Test Food/Page_Kod Nuey Restaurant/button_Order Now'))

WebUI.setText(findTestObject('Object Repository/Test Food/Page_Sign In/input_Sign In_email'), 'Sasipha_th@cmu.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Test Food/Page_Sign In/input_Sign In_password'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Test Food/Page_Sign In/input'))

WebUI.click(findTestObject('Object Repository/Test Food/Page_Menu/img'))

WebUI.verifyElementText(findTestObject('Object Repository/Test Food/Page_Menu Food/foodName_1'), 'haejangguk')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/foodName_2'), 'Kimbup')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/foodName_3'), 'tteokbokki')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/foodName_4'), 'Bibimbap')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/foodName_5'), 'jajangmyeon')

WebUI.verifyElementText(findTestObject('Object Repository/Test Food/Page_Menu Food/price_1'), '100 Bath')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/price_2'), '100 Bath')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/price_3'), '100 Bath')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/price_4'), '100 Bath')

WebUI.verifyElementText(findTestObject('Test Food/Page_Menu Food/price_5'), '100 Bath')

WebDriver driver = DriverFactory.getWebDriver()

'To locate the cart'
WebElement ItemList = driver.findElement(By.xpath('/html/body/div[3]'))

'to get item elements'
List<WebElement> items = ItemList.findElements(By.className('food'))

'To get no. of items'
int item_size = items.size()

'To compare the expected value'
WebUI.verifyEqual(5,item_size )

WebUI.closeBrowser()

