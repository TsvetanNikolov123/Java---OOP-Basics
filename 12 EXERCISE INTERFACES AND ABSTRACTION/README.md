12 Exercises: Interfaces
========================

---
---

This document defines the **exercise assignments** for the ["Java OOP Advanced"
course \@ Software
University](https://softuni.bg/trainings/1361/advanced-c-sharp-may-2016). Please
submit your solutions (source code) of all below described problems in
<https://judge.softuni.bg/Contests/1079/Interfaces-and-Abstraction-Exercises> .

---

12.01 Define an Interface Person
--------------------------------

Define an interface **Person** with properties for **Name** and **Age**. Define
a class **Citizen** which implements **Person** and has a constructor which
takes a **string** name and an **int** age.

Add the following code to your main method and submit it to Judge.

    public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if(Arrays.asList(citizenInterfaces).contains(Person.class)){
            Method[] fields = Person.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            Person person = new Citizen(name,age);
            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }

If you defined the interface and implemented it correctly, the test should pass.

### Examples

| **Input**       | **Output**             |
|-----------------|------------------------|
| Pesho <br/> 25  | 2 <br/> Pesho <br/> 25 |

<br/>

### Solution: <a title="01 Define an Interface Person" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p01_DefineAnInterfacePerson">01 Define an Interface Person</a>

---

12.02 Multiple Implementation
-----------------------------

Using the code from the previous task, define an interface **Identifiable** with
a **string** property **Id** and an interface **Birthable** with a **string**
property **Birthdate** and implement them in the **Citizen** class. Rewrite the
Citizen constructor to accept the new parameters.

Add the following code to your main method and submit it to Judge.

    public static void main(String[] args) {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            methods = Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name,age,id,birthdate);
            Birthable birthable = new Citizen(name,age,id,birthdate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());        
        }
    }

If you defined the interfaces and implemented them, the test should pass.

### Examples

| **Input**                                        | **Output**                          |
|--------------------------------------------------|-------------------------------------|
| Pesho <br/> 25 <br/> 9105152287 <br/> 15/05/1991 | 1 <br/> String <br/> 1 <br/> String |

<br/>

### Solution: <a title="02 Multiple Implementation" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p02_MultipleImplementation">02 Multiple Implementation</a>

---

12.03 Ferrari
-------------

Model an application which contains a **class Ferrari** and an **interface**.
Your task is simple, you have a **car - Ferrari**, its model is **"488-Spider"**
and it has a **driver**. Your Ferrari should have functionality to **use
brakes** and **push the gas pedal**. When the **brakes** are pushed down **print
"Brakes!"**, and when the **gas pedal** is pushed down - **"Zadu6avam sA!"**. As
you may have guessed this functionality is typical for all cars, so you should
**implement an interface** to describe it.

Your task is to **create a Ferrari** and **set the driver's name** to the passed
one in the input. After that, print the info. Take a look at the Examples to
understand the task better.

### Input

On the **single input line**, you will be given the **driver's name**.

### Output

On the **single output line**, print the model, the messages from the brakes and
gas pedal methods and the driver's name. In the following format:

\<**model**\>/\<**brakes**\>/\<**gas pedal**\>/\<**driver's name**\>

### Constraints

The input will always be valid, no need to check it explicitly! The Driver's
name may contain any ASCII characters.

### Example

| **Input**  | **Output**                                  |
|------------|---------------------------------------------|
| Bat Giorgi | 488-Spider/Brakes!/Zadu6avam sA!/Bat Giorgi |
| Dinko      | 488-Spider/Brakes!/Zadu6avam sA!/Dinko      |

### Note

To check your solution, copy the code below and paste it to the bottom of the
code in your main method.

    String ferrariName = Ferrari.class.getSimpleName();
    String carInterface = Car.class.getSimpleName();
    boolean isCreated = Car.class.isInterface();
    if (!isCreated) {
        throw new IllegalClassFormatException("No interface created!");
    }

<br/>

### Solution: <a title="03 Ferrari" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p03_Ferrari">03 Ferrari</a>
    
---

12.04 Telephony
---------------

You have a business - **manufacturing cell phones**. But you have no software
developers, so you call your friends and ask them to help you create a cell
phone software. They agree and you start working on the project. The project
consists of one main **model - a Smartphone**. Each of your smartphones should
have functionalities of **calling other phones** and **browsing in the world
wide web.**

Your friends are very busy, so you decide to write the code on your own. Here is
the mandatory assignment:

You should have a **model** - **Smartphone** and two separate functionalities
which your smartphone has - to **call other phones** and to **browse in the
world wide web**. You should end up with **one class** and **two interfaces**.

### Input

The input comes from the console. It will hold two lines:

-   **First line**: **phone numbers** to call (String), separated by spaces.

-   **Second line: sites** to visit (String), separated by spaces.

### Output

-   First **call all numbers** in the order of input then **browse all sites**
    in order of input

-   The functionality of calling phones is printing on the console the number
    which are being called in the format:

>   **Calling... \<number\>**

-   The functionality of the browser should print on the console the site in
    format:

>   **Browsing: \<site\>! (**pay attention to the exclamation mark when printing
>   URLs**)**

-   If there is a number in the input of the URLs, print: **"Invalid URL!"** and
    continue printing the rest of the URLs.

-   If there is a character different from a digit in a number, print:
    **"Invalid number!"** and continue to the next number.

### Constraints

-   Each site's URL should consist only of letters and symbols (**No digits are
    allowed** in the URL address)

### Examples

| **Input**                                                                                                                     | **Output**                                                                                                                                                                                                                                 |
|-------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 0882134215 0882134333 08992134215 0558123 3333 1 <br/> http://softuni.bg <br/> http://youtube.com <br/> http://www.g00gle.com | Calling... 0882134215 <br/> Calling... 0882134333 <br/> Calling... 08992134215 <br/> Calling... 0558123 <br/> Calling... 3333 <br/> Calling... 1 <br/> Browsing: http://softuni.bg! <br/> Browsing: http://youtube.com! <br/> Invalid URL! |

<br/>

### Solution: <a title="04 Telephony" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p04_%D0%A2elephony">04 Telephony</a>

---

12.05 Border Control
--------------------

It’s the future, you’re the ruler of a totalitarian dystopian society inhabited
by **citizens** and **robots**, since you’re afraid of rebellions you decide to
implement strict control of who enters your city. Your soldiers check the
**Id**s of everyone who enters and leaves.

You will receive from the console an **unknown** amount of lines until the
command “**End**” is received, on each line there will be the information for
either **a citizen** or **a robot** who tries to enter your city in the format
**“\<name\> \<age\> \<id\>**” for citizens and “**\<model\> \<id\>**” for
robots. After the end command on the next line you will receive a single number
representing **the last digits of fake ids**, all citizens or robots whose
**Id** ends with the specified digits must be detained.

The output of your program should consist of all detained **Id**s each on a
separate line (the order of printing doesn’t matter).

### Examples

| **Input**                                                                                                                                | **Output**          |
|------------------------------------------------------------------------------------------------------------------------------------------|---------------------|
| Pesho 22 9010101122 <br/> MK-13 558833251 <br/> MK-12 33283122 <br/> End <br/> 122                                                       | 9010101122 33283122 |
| Toncho 31 7801211340 <br/> Penka 29 8007181534 <br/> IV-228 999999 <br/> Stamat 54 3401018380 <br/> KKK-666 80808080 <br/> End <br/> 340 | 7801211340          |

<br/>

### Solution 1: <a title="05 Border Control" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p05_01_BorderControl">05 Border Control</a>
### Solution 2: <a title="05 Border Control" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p05_02_BorderControl">05 Border Control</a>
### Solution 3: <a title="05 Border Control" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p05_03_BorderControl">05 Border Control</a>

---

12.06 Birthday Celebrations
---------------------------

It is a well known fact that people celebrate birthdays, it is also known that
some people also celebrate their pets birthdays. Extend the program from your
last task to add **birthdates** to citizens and include a class **Pet**, pets
have a **name** and a **birthdate**. Encompass repeated functionality into
interfaces and implement them in your classes.

You will receive from the console an unknown amount of lines until the command
“**End**” is received, each line will contain information in one of the
following formats **“Citizen \<name\> \<age\> \<id\> \<birthdate\>**” for
citizens, “**Robot \<model\> \<id\>**” for robots or “**Pet \<name\>
\<birthdate\>**” for pets. After the end command on the next line you will
receive a single number representing **a specific year**, your task is to print
all birthdates (of both citizens and pets) in that year in the format
**day/month/year** (the order of printing doesn’t matter).

### Examples

| **Input**                                                                                                                                                                  | **Output**            |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------|
| Citizen Pesho 22 9010101122 10/10/1990 <br/> Pet Sharo 13/11/2005 <br/> Robot MK-13 558833251 <br/> End <br/> 1990                                                         | 10/10/1990            |
| Citizen Stamat 16 0041018380 01/01/2000 <br/> Robot MK-10 12345678 <br/> Robot PP-09 00000001 <br/> Pet Topcho 24/12/2000 <br/> Pet Kosmat 12/06/2002 <br/> End <br/> 2000 | 01/01/2000 24/12/2000 |
| Robot VV-XYZ 11213141 <br/> Citizen Penka 35 7903210713 21/03/1979 <br/> Citizen Kane 40 7409073566 07/09/1974 <br/> End <br/>                                             | \<no output\>         |

<br/>

### Solution: <a title="06 Birthday Celebrations" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p06_BirthdayCelebrations">06 Birthday Celebrations</a>

---

12.07 Food Shortage
-------------------

Your totalitarian dystopian society suffers a shortage of food, so many rebels
appear. Extend the code from your previous task with new functionality to solve
this task.

Define a class **Rebel** which has a **name**, **age** and **group**
(string)**,** names are **unique -** there will never be 2 Rebels/Citizens or a
Rebel and Citizen with the same name**.** Define an interface **Buyer** which
defines a method **buyFood()** and a integer property **Food**. Implement the
**Buyer** interface in the **Citizen** and **Rebel** class, both Rebels and
Citizens **start with 0 food**, when a Rebel buys food his **Food** increases by
**5**, when a Citizen buys food his **Food** increases by **10**.

On the first line of the input you will receive an integer **N** - the number of
people, on each of the next **N** lines you will receive information in one of
the following formats “**\<name\> \<age\> \<id\> \<birthdate\>**” for a Citizen
or “**\<name\> \<age\>\<group\>**” for a Rebel. After the **N** lines until the
command “**End**” is received, you will receive names of people who bought food,
each on a new line. Note that not all names may be valid, in case of an
incorrect name - nothing should happen.

On the only line of output you should print the total amount of food purchased.

### Examples

| **Input**                                                                                                                                                                                                      | **Output** |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------|
| 2 <br/> Pesho 25 8904041303 04/04/1989 <br/> Stancho 27 WildMonkeys <br/> Pesho <br/> Gosho <br/> Pesho <br/> End                                                                                              | 20         |
| 4 <br/> Stamat 23 TheSwarm <br/> Toncho 44 7308185527 18/08/1973 <br/> Joro 31 Terrorists <br/> Penka 27 881222212 22/12/1988 <br/> Jiraf <br/> Joro <br/> Jiraf <br/> Joro <br/> Stamat <br/> Penka <br/> End | 25         |

<br/>

### Solution: <a title="07 Food Shortage" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p07_FoodShortage">07 Food Shortage</a>

---

12.08 Military Elite
--------------------

Create the following class hierarchy:

-   **Soldier** – general class for soldiers, holding **id**, **first name** and
    **last name.**

    -   **Private** – lowest base soldier type, holding the field
        **salary**(double).

        -   **LeutenantGeneral** – holds a set of **Privates** under his
            command.

        -   **SpecialisedSoldier –** general class for all specialised soldiers
            – holds the **corps** of the soldier. The corps can only be one of
            the following: **Airforces** or **Marines**.

            -   **Engineer** – holds a set of **repairs**. A **repair** holds a
                **part name** and **hours worked**(int).

            -   **Commando** – holds a set of **missions**. A mission holds
                **code name** and a **state** (*inProgress* or *Finished*). A
                mission can be finished through the method
                **CompleteMission()**.

    -   **Spy** – holds the **code number** of the spy.

Extract **interfaces** for each class. (e.g. **ISoldier**, **IPrivate**,
**ILeutenantGeneral**, etc.) The interfaces should hold their public properties
and methods (e.g. **Isoldier** should hold **id**, **first name** and **last
name**). Each class should implement its respective interface. Validate the
input where necessary (corps, mission state) - input should match **exactly**
one of the required values, otherwise it should be treated as **invalid**. In
case of **invalid corps** the entire line should be skipped, in case of an
**invalid mission state** only the mission should be skipped.

You will receive from the console an unknown amount of lines containing
information about soldiers until the command “**End**” is received. The
information will be in one of the following formats:

-   Private: “**Private \<id\> \<firstName\> \<lastName\> \<salary\>**”

-   LeutenantGeneral: “**LeutenantGeneral \<id\> \<firstName\> \<lastName\>
    \<salary\> \<private1Id\> \<private2Id\> … \<privateNId\>**” where
    privateXId will **always** be an **Id** of a private already received
    through the input.

-   Engineer: “**Engineer \<id\> \<firstName\> \<lastName\> \<salary\> \<corps\>
    \<repair1Part\> \<repair1Hours\> … \<repairNPart\> \<repairNHours\>**” where
    repairXPart is the name of a repaired part and repairXHours the hours it
    took to repair it (the two parameters will always come paired).

-   Commando: “**Commando \<id\> \<firstName\> \<lastName\> \<salary\> \<corps\>
    \<mission1CodeName\> \<mission1state\> … \<missionNCodeName\>
    \<missionNstate\>**” a missions code name, description and state will always
    come together.

-   Spy: “**Spy \<id\> \<firstName\> \<lastName\> \<codeNumber\>**”

Define proper constructors. Avoid code duplication through abstraction. Override
**toString()** in all classes to print detailed information about the object.

Privates:  
**Name: \<firstName\> \<lastName\> Id: \<id\> Salary: \<salary\>**

Spy:  
**Name: \<firstName\> \<lastName\> Id: \<id\>**  
**Code Number: \<codeNumber\>**

LeutenantGeneral:  
**Name: \<firstName\> \<lastName\> Id: \<id\> Salary: \<salary\>**  
**Privates:**  
**\<private1 ToString()\>**  
**\<private2 ToString()\>**  
**…**  
**\<privateN ToString()\>**

**Note**: privates must be sorted by id in **descending order**.

Engineer:  
**Name: \<firstName\> \<lastName\> Id: \<id\> Salary: \<salary\>**  
**Corps: \<corps\>**  
**Repairs:**  
**\<repair1 ToString()\>**  
**\<repair2 ToString()\>**  
**…**  
**\<repairN ToString()\>**

Commando:  
**Name: \<firstName\> \<lastName\> Id: \<id\> Salary: \<salary\>**  
**Corps: \<corps\>**  
**Missions:**  
**\<mission1 ToString()\>**  
**\<mission2 ToString()\>**  
**…**  
**\<missionN ToString()\>**

Repair:  
**Part Name: \<partName\> Hours Worked: \<hoursWorked\>**

Mission:  
**Code Name: \<codeName\> State: \<state\>**

**NOTE:** Salary should be printed rounded to **two decimal places** after the
separator.

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64823601-84cd6080-d5c0-11e9-94b9-28db23965f0d.png" alt="alt text" width="900" height="">

<br/>

### Solution 1: <a title="08 Military Elite" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p08_01_MilitaryElite">08 Military Elite</a>
### Solution 2: <a title="08 Military Elite" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p08_02_MilitaryElite">08 Military Elite</a>

---

12.09 \*Collection Hierarchy
----------------------------

Create 3 different string collections – **AddCollection**,
**AddRemoveCollection** and **MyList**.

The **AddCollection** should have:

-   Only a single method **Add** which adds an item to the **end** of the
    collection.

The **AddRemoveCollection** should have:

-   An **Add** method – which adds an item to the **start** of the collection.

-   A **Remove** method which removes the **last** item in the collection.

The **MyList** collection should have:

-   An **Add** method which adds an item to the **start** of the collection.

-   A **Remove** method which removes the **first** element in the collection.

-   A **Used** property which displays the amount of elements currently in the
    collection.

Create interfaces which define the collections functionality, think how to model
the relations between interfaces to reuse code. Add an extra bit of
functionality to the methods in the custom collections, **add** methods should
return the index in which the item was added, **remove** methods should return
the item that was removed.

Your task is to create a single copy of your collections, after which on the
first input line you will receive a random amount of strings in a single line
separated by spaces - the elements you have to add to each of your collections.
For each of your collections write a single line in the output that holds the
results of all **Add operations** separated by spaces (check the examples to
better understand the format). On the second input line you will receive a
single number - the amount of **Remove operations** you have to call on each
collection. In the same manner as with the Add operations for each collection
(except the AddCollection), print a line with the results of each Remove
operation separated by spaces.

### Input

The input comes from the console. It will hold two lines:

-   The first line will contain a random amount of strings separated by spaces -
    the elements you have to **Add** to each of your collections.

-   The second line will contain a single number - the amount of **Remove**
    operations.

### Output

The output will consist of 5 lines:

-   The first line contains the results of all **Add** operations on the
    **AddCollection** separated by spaces.

-   The second line contains the results of all **Add** operations on the
    **AddRemoveCollection** separated by spaces.

-   The third line contains the result of all **Add** operations on the
    **MyList** collection separated by spaces.

-   The fourth line contains the result of all **Remove** operations on the
    **AddRemoveCollection** separated by spaces.

-   The fifth line contains the result of all **Remove** operations on the
    **MyList** collection separated by spaces.

### Constraints

-   All collections should have a **length of 100.**

-   There will never be **more than 100** add operations.

-   The number of remove operations will never be more than the amount of add
    operations.

### Examples

| **Input**                                 | **Output**                                                                                               |
|-------------------------------------------|----------------------------------------------------------------------------------------------------------|
| banichka boza tutmanik <br/> 3            | 0 1 2 <br/> 0 0 0 <br/> 0 0 0 <br/> banichka boza tutmanik <br/> tutmanik boza banichka                  |
| one two three four five six seven <br/> 4 | 0 1 2 3 4 5 6 <br/> 0 0 0 0 0 0 0 <br/> 0 0 0 0 0 0 0 <br/> one two three four <br/> seven six five four |

### Hint

Create an interface hierarchy representing the collections. You can use a List
as the underlying collection and implement the methods using the List’s Add,
Remove and Insert methods.

<br/>

### Solution: <a title="09 *Collection Hierarchy" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p09_CollectionHierarchy">09 \*Collection Hierarchy</a>

---

12.10 MooD 3
------------

You are an owner of the most epic video game of the world - **3 MooD**. Your
employees have gone on summer vacation. But there is a problem in the
application and you are on your own. So the problem is how to store the
information for the players. The best approach to you, seems to be, storing them
in **GameObjects**.

In your game, there are two types of characters - **Demon** and **Archangel**.
All characters in the game have:

-   **username**

-   **hashedPassword**

-   **level**

-   **special points**.

The **main difference** between the Demon and the Archangel is that the **Demon
has an energy** (as special points) and the **Archangel has a mana** (as special
points). Your task is to model the application.

When you receive the username and the character type, you should generate the
hashed password by the formulas below:

-   For a **Demon**: **username length \* 217**

-   For an **Archangel**: **(username’s characters in reversed order) +
    (username’s characters' length \* 21)**

Your task is to print the info as it is written in the Output.

### Input

The input consists of **single line**. First, you will get the username of a
player. The second parameter is its character type. The next two parameters are
his mana / energy points and his level. Format:

\<**username**\> \| \<**character type**\> \| \<**special points**\> \|
\<**level**\>

### Output

Print the info on two lines, for a single entry in the database (player) in the
format:

\<”**username”\>** \| **\<”hashed password”\>** -\> \<**character type**\>

\<**special points \* level**\>

### Constraints

-   **Username** – alphabetical letters (**Latin**), no more than 10 characters
    and you do not need to check it explicitly.

-   **Character type** – String, Demon or Archangel, no need to check it
    explicitly.

-   **Special points (Mana)** – a valid Integer, no need to check it explicitly.

-   **Special points (Energy)** – a valid Double, no need to check it
    explicitly.

-   **Level** – a valid Integer, no need to check it explicitly.

### Example

| **Input**                                        | **Output**                                        |
|--------------------------------------------------|---------------------------------------------------|
| **"KoHaH"** &#124; **Demon** &#124; **100.0** &#124; **100** | **""KoHaH"" &#124; "1519" -\> Demon <br/> 10000.0**         |
| **"Akasha" &#124; Archangel &#124; 5 &#124; 100**            | **""Akasha"" &#124; ""ahsakA"168" -\> Archangel <br/> 500** |

### Note

Implement **interface**, holding the **main functionalities of all characters**.
Create an **abstract class** to hold all the same characteristics of the
characters. If you need to declare a character object, be sure to declare it of
type character's interface to the left side and the specific implementation to
the right side of the declaration. You should not override the setter for the
hashedPassword and instead, use generics to pass them the type for the password
and the special points.

<br/>

### Solution: <a title="10 MooD 3" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/12%20EXERCISE%20INTERFACES%20AND%20ABSTRACTION/p10_MooD3">10 MooD 3</a>

---