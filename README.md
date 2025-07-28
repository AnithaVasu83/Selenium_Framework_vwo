🔍 Selenium TestNG Automation Framework
 
This is a Java-based Selenium Test Automation Framework built with best practices like Page Object Model (POM), TestNG, Data-Driven Testing, and reporting via Allure.

✅ Tech Stack Used

Category	              Tools / Libraries

Programming Language	  Java

Build Tool	            Maven

Testing Framework	     TestNG

UI Automation	Selenium WebDriver

Data-Driven	           Excel (Apache POI) + TestNG @DataProvider

Config Management	     .properties file

Reporting	             Allure Reports

Design Pattern	       Page Object Model (POM)

⚙️ Key Features

🔄 Reusable POM classes for maintainability

📊 Data-Driven Testing with Excel sheet

🔑 Securely reads credentials from config.properties

🧪 Lifecycle management using @BeforeMethod and @AfterMethod

📸 Screenshots captured for failed test cases

📁 Allure HTML report generation

⏱️ Explicit waits and assertion handling

🧪 Sample Test Scenarios

✅ Valid Login using data from Excel

❌ Negative Login with wrong credentials

📝 Validates error messages

🔄 Retry logic for flaky tests




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
