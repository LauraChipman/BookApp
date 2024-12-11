**Book App**
===========================

This is a **Spring Boot MVC Application** for managing book recommendations. Users can add new books, view a list of books, filter them by genre and author, and track page visits using a live counter. The app includes validation, unit testing, and clean styling for a seamless experience.

* * * * *

**Features and Project Specifications**
---------------------------------------

| **Requirement** | **Notes** |
| --- | --- |
| **Spring MVC Application** | The application is built using Spring Boot and follows MVC architecture. |
| **Form with at least 3 fields** | The form has **Title**, **Author**, and **Genre** fields. |
| **Server-side validation for every field** |  Validation annotations (`@NotBlank`, `@Size`) are used in the `Book` class. |
| **Persist form data to the database** |  The `saveBook` method saves data to the database using `BookRepository`. |
| **A page that lists all items created by the form** |  The `book_list.html` page displays all books retrieved from the database. |
| **Optional GET params to filter the list (at least 2 filters)** |  Filtering works using **genre** and **author** GET parameters with case-insensitive search. |
| **Live page visit counter updating every 3 seconds** |  A live counter updates the number of visits using a REST API and JavaScript polling. |
| **At least 1 dependency injected into two different locations** |  `BookService` and `VisitCounterService` are injected into their respective controllers. |
| **Use of Lombok in data classes** |  `@Data`, `@NoArgsConstructor`, and `@AllArgsConstructor` are used in the `Book` class. |
| **Aesthetically pleasing website (CSS or frameworks)** |  Styled using **Bootstrap 5** and custom CSS for responsive and clean design. |
| **Classes have unit tests** |  Unit tests exist for the `BookController` and `BookService` using JUnit and Mockito. |
| **README file with project details** | README includes purpose, implementation details, and instructions. |
| **Future Switch to MongoDB** | The database will switch to **MongoDB** in future iterations. |
| **User Data Population** | | Users must **manually populate book data** to test filtering tools. |
| **Spring Boot Actuator for Monitoring** |  Actuator endpoints like `/actuator/health` and `/actuator/info` are enabled. |

* * * * *

**Technologies Used**
---------------------

-   **Java 17**
-   **Spring Boot 3.1**
-   **Thymeleaf** (HTML templating engine)
-   **H2 Database** (in-memory database for development)
-   **Bootstrap 5** (CSS framework)
-   **Lombok** (reduces boilerplate code)
-   **Spring Boot Actuator** (monitoring and diagnostics)
-   **JUnit and Mockito** (testing framework)

* * * * *

**Future Enhancements**
-----------------------

1.  **Switch to MongoDB**:

    -   Replace the H2 in-memory database with **MongoDB** for persistence.
    -   Update the configuration to connect to MongoDB Atlas or a local instance.
2.  **Pre-populated Book Data**:

    -   Introduce initial data or an API to load sample books for immediate use.
    -   Enhance user experience by removing the need for manual data entry.
3.  **Dynamic Page Layouts**:

    -   Implement **Thymeleaf Layout Dialect** for reusable layouts and cleaner templates.

* * * * *

**How to Run the Project**
--------------------------

1.  **Clone the Repository**:

    `git clone (https://github.com/LauraChipman/BookApp/)
    cd BookApp`

2.  **Build and Run the Application**:

    `mvn spring-boot:run`

3.  **Access the Application**: Open a browser and visit:

    `http://localhost:8080/books`

4.  **Add Books**:

    -   Navigate to the **"Add a New Book"** page.
    -   Enter book details (Title, Author, and Genre).
5.  **Test Filtering**:

    -   Populate at least 2 books manually.
    -   Use the filter tools (Genre and Author) to test the search functionality.

* * * * *

**Spring Boot Actuator**
------------------------

The application includes **Spring Boot Actuator** for diagnostics and monitoring.

-   **Health Endpoint**: `http://localhost:8080/actuator/health`
-   **Info Endpoint**: `http://localhost:8080/actuator/info`
-   **Metrics Endpoint**: `http://localhost:8080/actuator/metrics`

* * * * *

**Testing**
-----------

Run the unit tests with:

`mvn test`

Tests exist for:

1.  **BookController**: Ensures correct request handling.
2.  **BookService**: Verifies filtering logic and database interactions.

* * * * *

**Dependencies**
----------------

The following dependencies are used in the project:


`<dependencies>
    <!-- Spring Boot Starter -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <!-- Thymeleaf -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>

    <!-- H2 Database -->
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>

    <!-- Lombok -->
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <scope>provided</scope>
    </dependency>

    <!-- Spring Boot Actuator -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

    <!-- Testing -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>`

* * * * *

### **Author**

Laura Chipman

**Email**: c0590808@mylambton.ca

**GitHub**: (https://github.com/LauraChipman/BookApp/) BookApp