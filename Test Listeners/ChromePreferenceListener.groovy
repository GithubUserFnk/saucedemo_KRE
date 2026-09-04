import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.configuration.RunConfiguration

class ChromePreferenceListener {

    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {

        Map chromePrefs = [
            "credentials_enable_service"            : false,
            "profile.password_manager_enabled"      : false,
            "profile.password_manager_leak_detection": false
        ]

        RunConfiguration.setWebDriverPreferencesProperty(
            "prefs",
            chromePrefs
        )

        RunConfiguration.setWebDriverPreferencesProperty(
            "args",
            [
                "--disable-notifications",
                "--disable-save-password-bubble",
                "--disable-popup-blocking"
            ]
        )
    }
}