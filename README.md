## Inventory Management Application
The purpose of this application is to create an inventory management application that utilizes Java, Spring Boot, HTML and CSS for a shop specializing in board games.

## Shop Type, Products and Parts
The shop type for this project will be for board games. The products will be Chess, Checkers, Go, Monopoly and Scrabble. The in-house parts are as follows: board to play on, game pieces to play with, user manual with information on how to play the game and pertinent information. The outsourced parts are as follows: dice, and finally the packaging material.
## Comment History 

Customize the HTML user interface

Changes: 
1) mainscreen.html, Line 14: updated tab title from "My Bicycle Shop" to "Aldani Board Games".
2) mainscreen.html, Line 19: updated title from "Shop" to "Aldani Board Games".

Add an “About” page to the application to describe chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
1) Create about.html
2) about.html, Lines 5-12: Add html template information 
3) about.html, Line 14: Changed title to "About".
4) about.html, Line 19-21: Added paragraphs about company mission and goals to customer.
5) Create AboutPageController.java
6) mainscreen.html, Line 89: Add About Page Header
7) mainscreen.html, Line 90: Add About Page Button Link
8) about.html, Line 22: Add Main Screen Header
9) about.html, Line 23: Add Main Screen Button Link

Add a sample inventory appropriate for store to the application.
1) BootStrapData.java, Line 3: Added import InHouse Part class
2) BootStrapData.java, Lines 48-80: Added InHouse parts of board piece, game pieces, and user manual to list.
3) BootStrapData.java, Lines 82-106: Added outsourced parts of dice and packaging materials.
4) BootStrapData.java, Lines 108-119: Added products to product list.


Add a “Buy Now” button to product list.

1) mainscreen.html, Lines 85-86: Added "Buy Now" button to the mainscreen next to the update and delete buttons.
2) Create BuyNowButtonController.java file
3) Product.java, Lines 95-101: Added buyProduct Method to decrease product inventory amount by 1 if purchased.
4) BuyNowButtonController.java, Lines 1-36: Create Public String Method in controller for purchase confirmation.
5) Create purchaseConfirmationPage.html file so user sees if the purchase was successful.
6) Create purchaseErrorPage.html file so user sees if an error occurred during the purchase.
7) Update BuyNowButtonController.java file, Lines 22, 24 and 27 to verify correct naming of variables, mapping and methods
8) Update purchaseConfirmationPage.html Lines 18-20 with new naming conventions
9) Update purchaseErrorPage.html lines 18-20 with new naming conventions.

Modify the parts to track maximum and minimum inventory by doing the following:

1) Part.java file, Lines 31-34: Create minInv and maxInv variables to ensure inventory does not drop below zero.
2) Part.java file, Lines 88-95: Create setters and getters for both min and max inventory variables.
3) Update Part.java file, Lines 48,49,57 and 58: Added constructors for minInv and maxInv with values of 0 and 100, respectively

Modify the sample inventory to include the maximum and minimum fields.

1) BootStrapData.java, Lines 57 & 58, 67 & 68, 77 & 78, 92 & 93, and 103 & 104: Added minimum and maximum fields to sample inventory.

Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

1) InhousePartForm.html, Lines 23-28: Added additional text inputs for customizable maximum and minimum inventory values.
2) OutsourcedPartForm.html, Lines 24-29: Added additional text inputs for customizable maximum and minimum inventory values.

Rename the file the persistent storage is saved to.

1) Update application.properties file, Line 6: Rename file from "spring-boot-h2-db102" to "WGUShopManagementDB".

•Modify the code to enforce that the inventory is between or at the minimum and maximum value.

1) Part.java file, Lines 113-126: Added methods to enforce that the inventory is between or at the minimum and maximum value, and to return integer values to check if methods were used to redirect to correct html page.
2) InHousePartServiceImpl.java, Lines 54 & 55: Added previously described methods from Part.java file to ensure inventory is within range prior to saving to repository.
3) OutsourcedPartServiceImpl.java, Lines 52 & 53: Added previously described methods from Part.java file to ensure inventory is within range prior to saving to repository.

Add validation for between or at the maximum and minimum fields.

Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

1) AddInHousePartController.java, Lines 45-47: Added error message for low inventory when adding and updating parts.
2) AddOutsourcedPartController.java, Lines 46-48: Added error message for low inventory when adding and updating parts.

Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

1) EnufPartsValidator.java, Line 36: Insert additional checks in if statement to account for possible change when adding or updating products lowers part inventory below minimum.
2) ValidEnufParts.java, Line 20: Change error message to introduce better clarity.
3) Create belowMinInv.html, Lines 1-12: Added html template to show error should the desired part selection go below the minimum inventory amount.
4) Create aboveMaxInv.html, Lines 1-12: Added html template to show error should the desired part selection go above the maximum inventory amount.

Display error messages when adding and updating parts if the inventory is greater than the maximum.

1) AddInHousePartController.java, Lines 48-50: Added error message for greater than maximum inventory when adding and updating parts.
2) AddOutsourcedPartController.java, Lines 49-51: Added error message for greater than maximum inventory when adding and updating parts.

Add three unit tests for the maximum and minimum fields to the PartTest class in the test package.

1) PartTest.java file, Lines 104-112: Created Unit test for getMinInv (get minimum field).
2) PartTest.java file, Lines 113-120: Created Unit test for setMinInv (set minimum field).
3) PartTest.java file, Lines 122-129: Created Unit test for getMaxInv (get maximum field).
4) PartTest.java file, Lines 131-139: Created Unit test for setMaxInv (set maximum field).

Remove Redundant Code

1) DeletePartValidator.java file: No usages detected. Removed to clean up redundant code.
