ScreenShots
---------
![Screenshot_Add_Card_Details](https://github.com/iamjanidu/CardWatcherApp/assets/152964150/64b244f4-ebd0-4484-8e0a-64e2a12cc6b8) ![Screenshot_Filled](https://github.com/iamjanidu/CardWatcherApp/assets/152964150/a876e5fa-931a-4ef9-a5cc-95d3de4447d5) ![Screenshot_Masked](https://github.com/iamjanidu/CardWatcherApp/assets/152964150/98a65742-bc06-4c2c-bd85-a2233085c4a4)

Features
---------

* EditTexts with built-in features for validating, entering credit card details, and displaying masked card numbers (e.g., '455x xxxx xxxx x555')
* Customizable interface
* Automated selection of card type icons (Visa, Mastercard, American Express) based on the entered card number
* Support for both editable and non-editable modes
* Ability to handle four distinct card number formats

Setup
------
Add this inside your root build.gradle at the end of repositories:

```kotlin
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
Then inside your build.gradle add dependancy
```kotlin
dependencies {
    implementation 'com.github.janidub:CreditCardWatcher:1.0'
}
```
