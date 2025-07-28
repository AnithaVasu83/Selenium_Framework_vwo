# 🔍 Selenium TestNG Automation Framework

This project is a structured Selenium TestNG automation framework built using:

- **Java, Selenium, TestNG**
- **Maven, AssertJ, Page Object Model (POM)**
- **Allure Reports for execution reporting**
- **Excel Sheet (Apache POI) for Test Data via DataProvider**
- **Configurable Properties File for credentials and environment setup**

### ✅ Features

- Data-driven testing with `@DataProvider` and Excel
- Test configuration with `@BeforeMethod`, `@AfterMethod`, and `@Test`
- Centralized locator handling using POM
- Screenshot capture on test failure
- Retry logic using `IRetryAnalyzer` and custom listeners
- Easily extensible with new test cases and page classes

###🧪 Sample Test Scenarios

- Valid Login using data from Excel
- Negative Login with wrong credentials
- Validates error messages
- Retry logic for flaky tests
