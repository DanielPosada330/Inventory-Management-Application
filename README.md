<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 


## Shop Type, Products and Parts
The shop type for this project will be for board games. The products will be Chess, Checkers, Go, Monopoly and Scrabble. The in-house parts are as follows: board to play on, game pieces to play with, user manual with information on how to play the game and pertinent information. The outsourced parts are as follows: dice, and finally the packaging material.
## Rubric Instructions  
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.


Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

Changes: 
1) mainscreen.html, Line 14: updated tab title from "My Bicycle Shop" to "Aldani Board Games".
2) mainscreen.html, Line 19: updated title from "Shop" to "Main Board Game Order Menu".

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
1) Create about.html
2) about.html, Lines 5-12: Add html template information 
3) about.html, Line 14: Changed title to "About".
4) about.html, Line 19-21: Added paragraphs about company mission and goals to customer.
5) Create AboutPageController.java
6) mainscreen.html, Line 89: Add About Page Header
7) mainscreen.html, Line 90: Add About Page Button Link
8) about.html, Line 22: Add Main Screen Header
9) about.html, Line 23: Add Main Screen Button Link

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
1) BootStrapData.java, Line 3: Added import InHouse Part class
2) BootStrapData.java, Lines 48-75: Added InHouse parts of board piece, game pieces, and user manual to list.
3) BootStrapData.java, Lines 76-96: Added outsourced parts of dice and packaging materials.
4) BootStrapData.java, Lines 98-107: Added products to product list.

Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

•   The “Buy Now” button must be next to the buttons that update and delete products.

•   The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

•   Display a message that indicates the success or failure of a purchase.
1) mainscreen.html, Lines 85-86: Added "Buy Now" button to the mainscreen next to the update and delete buttons.
2) Create BuyNowButtonController.java file
3) Product.java, Lines 95-101: Added buyProduct Method to decrease product inventory amount by 1 if purchased.
4) BuyNowButtonController.java, Lines 1-36: Create Public String Method in controller for purchase confirmation.
5) Create purchaseConfirmationPage.html file so user sees if the purchase was successful.
6) Create purchaseErrorPage.html file so user sees if an error occurred during the purchase.
7) Update BuyNowButtonController.java file, Lines 22, 24 and 27 to verify correct naming of variables, mapping and methods
8) Update purchaseConfirmationPage.html Lines 18-20 with new naming conventions
9) Update purchaseErrorPage.html lines 18-20 with new naming conventions.

G. Modify the parts to track maximum and minimum inventory by doing the following:

•   Add additional fields to the part entity for maximum and minimum inventory.
1) Part.java file, Lines 31-34: Create minInv and maxInv variables to ensure inventory does not drop below zero.
2) Part.java file, Lines 88-95: Create setters and getters for both min and max inventory variables.
3) Update Part.java file, Lines 48,49,57 and 58: Added constructors for minInv and maxInv with values of 0 and 100, respectively

•   Modify the sample inventory to include the maximum and minimum fields.
1) BootStrapData.java, Lines 57 & 58, 67 & 68, 77 & 78, 92 & 93, and 103 & 104: Added minimum and maximum fields to sample inventory.

•   Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
1) InhousePartForm.html, Lines 23-28: Added additional text inputs for customizable maximum and minimum inventory values.
2) OutsourcedPartForm.html, Lines 24-29: Added additional text inputs for customizable maximum and minimum inventory values.

•   Rename the file the persistent storage is saved to.
1) Update application.properties file, Line 6: Rename file from "spring-boot-h2-db102" to "WGUShopManagementDB".

•   Modify the code to enforce that the inventory is between or at the minimum and maximum value.
1) Part.java file, Lines 112-119: Added method to enforce that the inventory is between or at the minimum and maximum value.
2) InHousePartServiceImpl.java, Line 54: Added previously described method from Part.java file to ensure inventory is within range prior to saving to repository.
3) OutsourcedPartServiceImpl.java, Line 52: Added previously described method from Part.java file to ensure inventory is within range prior to saving to repository.

H. Add validation for between or at the maximum and minimum fields. The validation must include the following:

•   Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

•   Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

•   Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.

