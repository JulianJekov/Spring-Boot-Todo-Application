![spring boot todo application](./imgs/home.jpg)

![spring boot todo application](imgs/AddEdit.png)

<p>This is a simple Todo application built with Spring framework where users can add, edit, and delete their tasks.</p>

<h2>Features</h2>
• Add Todo: Users can add new tasks to their list.

• Edit Todo: Users can modify existing tasks.

• Delete Todo: Users can remove tasks from their list.

<h2>Technologies Used </h2>

• Spring Framework: Used for building the backend logic and RESTful APIs.

• Java: Primary programming language for the backend.

• Spring Boot: Facilitates rapid application development and easy deployment.

• Hibernate: Object-relational mapping (ORM) tool for database interaction.

• MySQL: Database management system for storing todo items.

• Maven: Build automation tool for managing dependencies and building the project.

<h2>Installation & Setup Guide</h2>

1. **Prerequisites**
   - Java JDK 11 or higher
   - Maven 3.6.3 or higher
   - MySQL 8.0 or higher
   - Your favorite IDE (Spring Tool Suite, IntelliJ IDEA, or Eclipse)

2. **Database Setup**
   ```sql
   CREATE DATABASE todo_db;
   USE todo_db;
   ```

3. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/todo-application.git
   cd todo-application
   ```

4. **Configure Application Properties**
   - Navigate to `src/main/resources/application.properties`
   - Update the following properties with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     ```

5. **Build the Project**
   ```bash
   mvn clean install
   ```

6. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```
   
   The application will start running at `http://localhost:8080`

7. **Verify Installation**
   - Open your web browser
   - Navigate to `http://localhost:8080`
   - You should see the Todo application homepage

<h2>Usage</h2>

<h3>1.Add a Todo:</h3>

• Click on the "Create Todo" button.
• Enter the details of the new task.
• Click on the "Add Todo" button to add the task to the list.

<h3>2.Edit a Todo:</h3>

• Click on the "Edit" button on the task you want to edit.
• Modify the task details.
• Click on the "Update" button to update the changes.

<h3>3.Delete a Todo:</h3>

Click on the "Delete" button to remove the task from the list.
