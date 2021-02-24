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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://35.247.163.82/')

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/div_Google Cloud_card-hover'))

WebUI.selectOptionByValue(findTestObject('Object Repository/sample testing/Page_Online Boutique/select_1                2                3 _09e716'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/a_Keep browsing'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/div_Google Cloud_card-hover'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/div_Metal Camping Mug                      _a6f049'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/img_Free shipping with 100 purchase_logo'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/a_Cart                                     _7c491d'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/a_Keep Browsing (1)'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/div_Google Cloud_card-hover'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/button_Place order'))

WebUI.click(findTestObject('Object Repository/sample testing/Page_Online Boutique/a_Keep Browsing (1)'))

WebUI.closeBrowser()

