Apex_demo Automation Framework

Apex_demo is an automated testing framework for the Liverpool website, leveraging Selenide, TestNG, and Allure for comprehensive and efficient web testing. This framework is designed to provide a robust, easy-to-maintain solution for automated functional testing.

Table of Contents

	•	Getting Started
	•	Prerequisites
	•	Installation
	•	Running Tests
	•	Project Structure
	•	Technologies Used
	•	Configuration
	•	Contributing
	•	License

Getting Started

Follow these instructions to set up and run the project on your local machine.

Prerequisites

Ensure you have the following installed:

	•	Java 8 or higher
	•	Maven 3.6.0 or higher

Installation

1.	Clone the repository:
git clone https://github.com/yourusername/apex_demo.git
cd apex_demo

2.	Install dependencies:
mvn clean install

Running Tests

To run the tests, you can use the following Maven command:
mvn clean test

This command will execute the TestNG suite defined in src/test/resources/testng.xml and generate an Allure report.

Viewing Allure Reports

To generate and view the Allure report:

1.	Generate the report:
mvn allure:report

2.	Serve the report:
mvn allure:serve

Technologies Used

	•	Selenide: A powerful library for Selenium WebDriver to simplify browser interactions in Java.
	•	TestNG: A testing framework inspired by JUnit and NUnit, designed for test configuration and parallel execution.
	•	Allure: A flexible, lightweight, and multi-language test report tool that shows a clear representation of what has been tested.

Contributing

Contributions are welcome! Please fork the repository and create a pull request with your changes.

	1.	Fork the repository.
	2.	Create your feature branch (git checkout -b feature/YourFeature).
	3.	Commit your changes (git commit -m 'Add some feature').
	4.	Push to the branch (git push origin feature/YourFeature).
	5.	Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.
 

