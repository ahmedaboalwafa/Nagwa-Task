# Nagwa-Task


* Using IntelliJ IDEA IDE to develop the solution
* Using TestNG as a Test Framework to create and execute the script
* Using Maven to build and manage the project
* Using Chrome driver to run the script
* Using Data property file to save configuration data used in the script such as URL
* Using Page Object Model as a Design Pattern 

#Classes : 
* Creating a DataLoader class to read values from the property file .
* Creating the Test Case in CountWorkSheetQuestionsTests class for the provided scenario containing all mentioned steps plus the bonus one .
* Creating a TestBase class contains the setup and teardown . 
* Create a Language_Page class to execute the second step by click on one language to choose this language and open the home page .
* Create a Home_Page class to execute the 3rd and 4th steps by click on search icon and search by a specific lesson name .
* Create a SearchResults_Page class to execute the 5th and 6th step by click on the second 2nd lesson in the search results .
* Create a Lesson_Page class to execute the 7th step by go to worksheet section by click on WorkSheet link .
* Create a LessonWorkSheet_Page class to execute 8th step by return the count number of questions displayed .



#Challenges :
* Some LinkText (ex : English link) cannot be accessed by linktext however it is exist in the DOM
* Using Explicit Wait as Submit button was needed to be checked if it is displayed and clickable before clicking on it 
* When trying to count the number of questions while counting the number of div Tags in the div Tag containing the questions found that one of them its class name is not same as others so used contains method to capture the correct count

