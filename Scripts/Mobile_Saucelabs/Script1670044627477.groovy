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

Mobile.startApplication('C:\\Users\\Aditia Angga Perdana\\Katalon Studio\\Mobile_Saucelabs\\Apk\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk', 
    true)

Mobile.setText(findTestObject('Object Repository/inputUsername'), 'asd', 0)

Mobile.setText(findTestObject('Object Repository/inputPassword'), 'asd', 0)

Mobile.tap(findTestObject('Object Repository/buttonLogin'), 0)

Mobile.tap(findTestObject('Object Repository/inlineError - Username and password do not match any user in this service'), 
    0)

Mobile.tap(findTestObject('Object Repository/inlineError - Username is required'), 0)

Mobile.tap(findTestObject('Object Repository/inlineError - Password is required'), 0)

Mobile.tap(findTestObject('Object Repository/button AddToCart'), 0)

Mobile.tap(findTestObject('Object Repository/iconKeranjang'), 0)

Mobile.tap(findTestObject('Object Repository/buttonCheckout'), 0)

Mobile.setText(findTestObject('Object Repository/inputFirstName'), 'Adit', 0)

Mobile.setText(findTestObject('Object Repository/inputLastName'), 'Angga', 0)

Mobile.setText(findTestObject(''), '12130', 0)

Mobile.tap(findTestObject('Object Repository/buttonContinue'), 0)

Mobile.scrollToText('finish')

Mobile.tap(findTestObject('Object Repository/buttonFinish'), 0)

Mobile.tap(findTestObject('Object Repository/checkoutComplete'), 0)

Mobile.closeApplication()

