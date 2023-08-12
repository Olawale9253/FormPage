# FormPage

# Registration and Login Page

This repository contains an example of a web application with registration and login functionality. The application is built using Spring Boot and Thymeleaf.

## Getting Started

These instructions will help you set up and run the project on your local machine for development and testing purposes.

### Prerequisites

- Java Development Kit (JDK) - This project requires Java to be installed. You can download it from the [official website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Olawale9253/FormPage.git
   ```

2. Build the project using Maven:

   ```bash
   ./mvn clean install
   ```

### Usage

1. Run the application:

   ```bash
   ./mvn clean package exec:java
   ```

2. Access the application in your web browser by visiting `http://localhost:8080`.

### Functionality

The application provides the following functionality:

- **Registration Page**: Users can create an account by providing a unique username, email, and password.

- **Login Page**: Registered users can log in using their username and password.

- **Personal Page**: After successful login, users are redirected to a personal page displaying their username.

- **Error Handling**: If there are errors during registration or login, users are shown an error page.

### Directory Structure

- `src/main/java/org/logpackage/controller`: Contains the controller classes handling registration and login.

- `src/main/java/org/logpackage/model`: Defines the `UsersModel` class for representing user data.

- `src/main/java/org/logpackage/service`: Contains the `UsersService` interface and its implementation, responsible for user-related actions.

- `src/main/resources/templates`: Contains Thymeleaf templates for the registration, login, personal, and error pages.

- `src/main/resources/static`: Contains static resources such as Html and css.

### Customization

You can customize the application by modifying the Thymeleaf templates, CSS, and Java code according to your requirements.


## Acknowledgments

This example is for educational purposes and demonstrates basic registration and login functionality using Spring Boot and Thymeleaf.

Feel free to expand and enhance this project based on your needs!
