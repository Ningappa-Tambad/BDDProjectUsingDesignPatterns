Without showing the login and password in the feature file, log in to the application.
Steps to log in to the application using the Background keyword:
- Create a Factory Design Pattern.
- Create a ConfigReader class and add the config.properties path.
- Call the ConfigReader method in the @Before hook annotation.
- Add the URL, username, and password in the config.properties file, and create separate config.properties files for QA, Staging, Testing, and Production environments.
- Add the Driver Factory class and implement a method that allows the user to select browsers (Chrome or Firefox).
