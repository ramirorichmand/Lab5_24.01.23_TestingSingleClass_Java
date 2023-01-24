# lab2401_TestingSingleClass

You can now use your knowledge of classes to create and test one of your own. There is no start code for this lab, so please create a new project for your code. All methods (including getters and setters) should be tested.

Open Intellij and create a new project. You can use the New Project button, or if Intellij is already open you can go to File > New > Project to bring up the New Project window. Name your project and ensure it is saved in a sensible location.
Language should be Java
Build system should be Maven
JDK should be 17 Oracle OpenJDK version 17.x.x
Create a BankAccount class which has a firstName, lastName, dateOfBirth (you may wish to investigate LocalDate, although a String would be fine), accountNumber and balance (which should start at 0).
Write and test getters and setters for all these properties.
Create a method called deposit() that takes in an amount updates the balance of the BankAccount.
Create a method called withdrawal() that takes in an amount and updates the balance of the BankAccount.
Ensure you have tests for both these methods.
provide a method to allow the account to pay interest
