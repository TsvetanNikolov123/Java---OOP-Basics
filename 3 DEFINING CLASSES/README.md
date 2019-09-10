03 Lab: Defining Classes
========================

Problems for exercises and homework for the ["Java OOP Basics" course \@
SoftUni](https://softuni.bg/courses/java-oop-basics).

You can check your solutions here:
<https://judge.softuni.bg/Contests/Practice/Index/474#0>.

03.01 Defining Classes
------------------------

Define Bank Account Class
-------------------------

Create a class named **BankAccount**.

The class should have public fields for:

-   Id: int

-   Balance: double

You should be able to use the class like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627859-0c687300-d3f9-11e9-82bd-063dd57c5f0f.png" alt="alt text" width="600" height=""></kbd>

### Solution

Create a **new class** and ensure **proper naming**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627866-112d2700-d3f9-11e9-8a74-891cb253e20c.png" alt="alt text" width="300" height=""></kbd>

Define the fields

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627897-1c805280-d3f9-11e9-920d-c30e04e8f51d.png" alt="alt text" width="400" height=""></kbd>

Create a Test client in the same package

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627908-2013d980-d3f9-11e9-91e9-b4bdeb9fe5ff.png" alt="alt text" width="300" height=""></kbd>

You should be now able to use your class

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627859-0c687300-d3f9-11e9-82bd-063dd57c5f0f.png" alt="alt text" width="600" height=""></kbd>

Getters and Setters
-------------------

Create a class **BankAccount** (you can modify your previous implementation).

The class should have private fields for:

-   Id: int

-   Balance: double

**Note:** When declaring the fields, consider using primitive data types.

The class should also have public methods for:

-   **setId(int id): void**

-   **getBalance(): double**

-   **deposit(double amount): void**

-   **withdraw(double amount): void**

Override method **toString()**.

You should be able to use the class like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628353-eb545200-d3f9-11e9-804e-274b176378e8.png" alt="alt text" width="600" height=""></kbd>

### Solution

**Create the class** as usual or **use and modify** your previous
implementation.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628414-08892080-d3fa-11e9-8c0a-11877293b1db.png" alt="alt text" width="400" height=""></kbd>

Make **all fields** of the class **private**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628435-12ab1f00-d3fa-11e9-899d-d66912927fcb.png" alt="alt text" width="400" height=""></kbd>

Create a **setter** for the id

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628470-2191d180-d3fa-11e9-951f-0ae11518ef24.png" alt="alt text" width="400" height=""></kbd>

Create a **getter** for the balance

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628524-38d0bf00-d3fa-11e9-8485-6edb7d7ae789.png" alt="alt text" width="400" height=""></kbd>

Create a method **deposit(double amount)**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628537-3d957300-d3fa-11e9-85c0-acb4c0805c27.png" alt="alt text" width="400" height=""></kbd>

Create a method **withdraw(double amount)**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628549-4423ea80-d3fa-11e9-9ff4-ea4363f4ec88.png" alt="alt text" width="400" height=""></kbd>

Override method **toString()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628569-4ab26200-d3fa-11e9-8628-a28e5205f2ca.png" alt="alt text" width="400" height=""></kbd>

Create a Test client in the same package

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627908-2013d980-d3f9-11e9-91e9-b4bdeb9fe5ff.png" alt="alt text" width="300" height=""></kbd>

You should be able to use the class like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64628353-eb545200-d3f9-11e9-804e-274b176378e8.png" alt="alt text" width="600" height=""></kbd>

Test Client
-----------

Create a test client that tests your **BankAccount** class.

Support the **following commands**:

-   **Create {Id}**

-   **Deposit {Id} {Amount}**

-   **Withdraw {Id} {Amount}**

-   **Print {Id}**

-   **End**

If you try to create an account with existing Id, print **"Account already
exists"**.

If you try to perform an operation on **non-existing account** with existing Id,
print **"Account does not exist"**.

If you try to withdraw an amount larger than the balance, print **"Insufficient
balance"**.

Print command should print **"Account ID{id}, balance {balance}"**. Round the
balance to the second digit after the decimal separator.

### Examples

| **Input**                                                                                                  | **Output**                                                                         |
|------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------|
| Create 1 <br/> Create 1 <br/> Deposit 1 20 <br/> Withdraw 1 30 <br/> Withdraw 1 10 <br/> Print 1 <br/> End | Account already exists <br/> Insufficient balance <br/> Account ID1, balance 10.00 |
| Create 1 <br/> Deposit 2 20 <br/> Withdraw 2 30 <br/> Print 2 <br/> End                                    | Account does not exist <br/> Account does not exist <br/> Account does not exist   |

### Solution

Create a **HashMap\<Integer, BankAccount\>** to store existing accounts

<kbd><img src="https://user-images.githubusercontent.com/32310938/64629080-3ae74d80-d3fb-11e9-9237-cc859792598d.png" alt="alt text" width="600" height=""></kbd>

Create the input loop

<kbd><img src="https://user-images.githubusercontent.com/32310938/64629104-4470b580-d3fb-11e9-8cc0-353cf6c5238a.png" alt="alt text" width="500" height=""></kbd>

Check the **type of command** and **execute** accordingly (*optional: you can
create a separate method for each command*)

<kbd><img src="https://user-images.githubusercontent.com/32310938/64629114-49ce0000-d3fb-11e9-81c3-5b52f211a074.png" alt="alt text" width="400" height=""></kbd>

Implement the Create command

<kbd><img src="https://user-images.githubusercontent.com/32310938/64629138-53effe80-d3fb-11e9-8e55-745369172e77.png" alt="alt text" width="500" height=""></kbd>

Implement the rest of the commands following the same logic

<br/>

### Solution: <a title="01 Defining Classes" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/3%20DEFINING%20CLASSES/p01_DefineBankAccountClass">01 Defining Classes</a>

---

03.02 Constructors and Static Members
-------------------------------------

Define Person Class
-------------------

Create a Person class.

The class should have **private fields** for:

-   Name: String

-   Age: int

-   Accounts: **List\<BankAccount\>**

The class should have **constructors**:

-   **Person(String name, int age)**

-   **Person(String name, int age, List\<BankAccount\> accounts)**

The class should also have **public methods** for:

-   **getBalance(): double**

You should be able to use the class like this:

### Solution

Create the class as usual

<kbd><img src="https://user-images.githubusercontent.com/32310938/64638698-f6fe4380-d40e-11e9-8664-c2d75ff730e9.png" alt="alt text" width="400" height=""></kbd>

Create a constructor with two parameters

<kbd><img src="https://user-images.githubusercontent.com/32310938/64638752-14331200-d40f-11e9-8613-64d9c32305ec.png" alt="alt text" width="400" height=""></kbd>

Create a constructor with three parameters

<kbd><img src="https://user-images.githubusercontent.com/32310938/64638726-02ea0580-d40f-11e9-9cd4-bb0625e8d91c.png" alt="alt text" width="600" height=""></kbd>

Create method **getBalance()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64638775-20b76a80-d40f-11e9-9f31-cee3831801f4.png" alt="alt text" width="700" height=""></kbd>

*Optional:* You can take advantage of **constructor chaining**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64638951-80157a80-d40f-11e9-8e6d-1388cd26b0bf.png" alt="alt text" width="600" height=""></kbd>

Static Id and Rate
------------------

Create class **BankAccount**.

The class should have **private fields** for:

-   Id: int (Starts from 1 and increments for every new account)

-   Balance: double

-   Interest rate: double (Shared for all accounts. Default value: 0.02)

The class should also have public methods for:

-   **setInterestRate(double interest): void (static)**

-   **getInterest(int Years): double**

-   **deposit(double amount): void**

Create a test client supporting the following commands:

-   **Create**

-   **Deposit {Id} {Amount}**

-   **SetInterest {Interest}**

-   **GetInterest {ID} {Years}**

-   **End**

### Examples

| **Input**                                                                                                                                                                     | **Output**                                                                                                                                                                          | **Comments**                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| Create <br/> Deposit 1 20 <br/> GetInterest 1 10 <br/> End                                                                                                                    | Account ID1 created <br/> Deposited 20 to ID1 <br/> 4.00                                                                                                                            |                                                                                                               |
| Create <br/> Create <br/> Deposit 1 20 <br/> Deposit 3 20 <br/> Deposit 2 10 <br/> SetInterest 1 <br/> GetInterest 1 1 <br/> GetInterest 2 1 <br/> GetInterest 3 1 <br/> End  | Account ID1 created <br/> Account ID2 created <br/> Deposited 20 to ID1 <br/> Account does not exist <br/> Deposited 10 to ID2 <br/> 20.00 <br/> 10.00 <br/> Account does not exist | Sets the global interest rate to 1. <br/> Prints interest for bank account <br/> with id 1 for 1 year period. |

### Solution

Create the class as usual and create a constant for the default interest rate

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639321-4e50e380-d410-11e9-83b9-e312a01023ee.png" alt="alt text" width="600" height=""></kbd>

Create the static and non-static fields, **all private**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639341-5741b500-d410-11e9-9def-6ee44919cd92.png" alt="alt text" width="600" height=""></kbd>

Set the id of an account upon creation while incrementing the global account
count

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639361-5e68c300-d410-11e9-84bb-d9fa533cd93d.png" alt="alt text" width="400" height=""></kbd>

Create a setter for the global interest rate. Making the method static will let
you access it through the class name

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639377-63c60d80-d410-11e9-822a-821d1e879454.png" alt="alt text" width="600" height=""></kbd>

Implement **deposit()** and **getInterest()**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639394-6cb6df00-d410-11e9-91a6-7f0cbeb08534.png" alt="alt text" width="400" height=""></kbd>

Override **toString()** method

<kbd><img src="https://user-images.githubusercontent.com/32310938/64639400-6fb1cf80-d410-11e9-9cc6-f73083324d6d.png" alt="alt text" width="400" height=""></kbd>

Create a Test client in the same package

<kbd><img src="https://user-images.githubusercontent.com/32310938/64627908-2013d980-d3f9-11e9-91e9-b4bdeb9fe5ff.png" alt="alt text" width="300" height=""></kbd>

<br/>

### Solution: <a title="02 Constructors and Static Members" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/3%20DEFINING%20CLASSES/p02_StaticIdAndInterestRate">02 Constructors and Static Members</a>

---