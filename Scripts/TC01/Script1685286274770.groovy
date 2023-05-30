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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

// 1. Open browser dan direct ke URL
WebUI.openBrowser('https://www.saucedemo.com/')

WebUI.waitForPageLoad(10)

// 2. Get value username (standard_user) dan password nya
def username = 'standard_user'

// 3. Simpan value kedalam variable
def usernameValue = username

//def passwordValue = password
// 4. Login menggunakan value yang sudah di simpan dalam variable
WebUI.setText(findTestObject('Page_Swag Labs/input_Swag Labs_user-name'), username)

WebUI.setEncryptedText(findTestObject('Page_Swag Labs/input_Swag Labs_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Page_Swag Labs/input_Swag Labs_login-button'))

// 5. Get harga barang (Sauce Labs Backpack) dan simpan dalam variable
def backpackPrice = WebUI.getText(findTestObject('Page_Swag Labs/text_backpack_price'))

println(backpackPrice)

// 6. Checkout barang (Sauce Labs Backpack) dan verifikasi apakah harga saat proses checkout sama dengan harga di halaman awal
WebUI.click(findTestObject('Page_Swag Labs/button_add_to_cart'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Swag Labs/button_add_to_cart'))

WebUI.click(findTestObject('Page_Swag Labs/text_checkout_price'))

WebUI.click(findTestObject('Page_Swag Labs/button_Add to cart'))



// 7. Lanjutkan proses checkout sampai selesai
WebUI.click(findTestObject('Page_Swag Labs/button_checkout'))

WebUI.setText(findTestObject('Page_Swag Labs/input_first_name'), 'Noplin')

WebUI.setText(findTestObject('Page_Swag Labs/input_last_name'), 'tino')

WebUI.setText(findTestObject('Page_Swag Labs/input_zip_code'), '12920')

WebUI.click(findTestObject('Page_Swag Labs/button_continue'))

WebUI.click(findTestObject('Page_Swag Labs/button_finish'))

