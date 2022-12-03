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

Mobile.startApplication('Apk\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk', true)

Mobile.comment(description)

Mobile.setText(findTestObject('Object Repository/inputUsername'), username, 30)

Mobile.setText(findTestObject('Object Repository/inputPassword'), password, 30)

Mobile.tap(findTestObject('Object Repository/buttonLogin'), 30)

if ((flag == 'null') && (tag == 'user')) {
    Mobile.verifyElementText(findTestObject('Object Repository/inlineError - Username is required'), 'Username is required')

    Mobile.delay(2)

    Mobile.takeScreenshot()
} else if ((flag == 'null') && (tag == 'pass')) {
    Mobile.verifyElementText(findTestObject('Object Repository/inlineError - Password is required'), 'Password is required')

    Mobile.delay(2)

    Mobile.takeScreenshot()
} else if (flag == 'null') {
    Mobile.verifyElementText(findTestObject('Object Repository/inlineError - Username is required'), 'Username is required')

    Mobile.delay(2)

    Mobile.takeScreenshot()
} else if (flag == 'notMatch') {
    Mobile.waitForElementPresent(findTestObject('Object Repository/inlineError - Username and password do not match any user in this service'), 
        30)

    Mobile.delay(2)

    Mobile.takeScreenshot()
} else {
    Mobile.verifyElementVisible(findTestObject('Object Repository/logoSwagLabs'), 30)

    Mobile.delay(2)
	
	Mobile.takeScreenshot()
}

