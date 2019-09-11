07 Lab: Inheritance
===================

---
---

Problems for exercises and homework for the ["Java OOP Basics" course \@
SoftUni](https://softuni.bg/courses/java-oop-basics).

You can check your solutions here:
<https://judge.softuni.bg/Contests/478/Inheritance-Lab> .

---

Part I: Upload Solutions
------------------------

In that exercise Judge uses Reflection to check your solutions.

If you are using **packages for every problem** you should:

-   Go to project folder

-   Go to src folder

<kbd><img src="https://user-images.githubusercontent.com/32310938/64727880-87f21f00-d4e2-11e9-8171-029b8e307817.png" alt="alt text" width="400" height=""></kbd>


-   Send the **whole package** to zip and upload.

If you are **creating project for every problem**, you should:

-   Go to project folder

-   Go to src folder:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64727890-8c1e3c80-d4e2-11e9-8d6a-95eb4ffbd72b.png" alt="alt text" width="400" height=""></kbd>

-   Send **everything** to zip and upload.

Part II: Inheritance
--------------------

07.01 Single Inheritance
------------------------

Create two classes named **Animal** and **Dog**.

**Animal** with a single public method **eat()** that prints: **"eating…"**

**Dog** with a single public method **bark()** that prints: **"barking…"**

**Dog** should inherit from **Animal**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64728036-d99aa980-d4e2-11e9-9766-e8b6ebd39555.png" alt="alt text" width="400" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64728049-df908a80-d4e2-11e9-8f70-d26268276801.png" alt="alt text" width="400" height=""></kbd>

### Hints

Use the **extends** keyword to build a hierarchy

<br/>

### Solution: <a title="01 Single Inheritance" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p01_SingleInheritance">01 Single Inheritance</a>

---

07.02 Multiple Inheritance
--------------------------

Create three classes named **Animal**, **Dog** and **Puppy**.

**Animal** with a single public method **eat()** that prints: **"eating…"**

**Dog** with a single public method **bark()** that prints: **"barking…"**

**Puppy** with a single public method **weep()** that prints: **"weeping…"**

**Dog** should inherit from **Animal**. **Puppy** should inherit from **Dog**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64728312-62b1e080-d4e3-11e9-9f9a-3441728e165b.png" alt="alt text" width="300" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64728325-67769480-d4e3-11e9-9990-9537da6a73c5.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="02 Multiple Inheritance" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p02_MultipleInheritance">02 Multiple Inheritance</a>

---

07.03 Hierarchical Inheritance
------------------------------

Create three classes named **Animal**, **Dog** and **Cat**.

**Animal** with a single public method **eat()** that prints: **"eating…"**

**Dog** with a single public method **bark()** that prints: **"barking…"**

**Cat** with a single public method **meow()** that prints: **"meowing…"**

**Dog** and **Cat** should inherit from **Animal**.

<kbd><img src="https://user-images.githubusercontent.com/32310938/64731799-83316900-d4ea-11e9-85e7-875c873b8a3a.png" alt="alt text" width="500" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64731804-8593c300-d4ea-11e9-9fef-6853c4d4e50b.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="03 Hierarchical Inheritance" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p03_HierarchicalInheritance">03 Hierarchical Inheritance</a>

---

Part III: Reusing Classes
-------------------------

07.04 Fragile Base Class
------------------------

Create three classes named **Animal**, **Predator** and **Food**.

**Predator** should inherit from **Animal**.

**Animal:**

-   Protected field: **foodEaten: ArrayList\<Food\>**

-   Public final method: **eat(Food): void**

-   Public method: **eatAll(Food[]): void**

**Predator:**

-   Private field: **health: int**

-   Public method: **feed(Food): void**

**Food:**

-   Just an empty class

**Note:** First, make **eatAll()** to use **eat()** to do its job. Do not make
the **eat()** method **final**. **override eat()** in **Predator**. Now if you
change the implementation of **eatAll()** (to no longer use **eat()**, you can
use **Collections.addAll()**) you should observe a bug introduced in you
program.

<br/>

### Solution: <a title="04 Fragile Base Class" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p04_FragileBaseClass">04 Fragile Base Class</a>

---

07.05 Random Array List
-----------------------

Create a **RandomArrayList** class that has all the functionality of an
**ArrayList**.

Add additional function that **returns** and **removes** a random element from
the list.

-   Public method: **getRandomElement(): Object**

### Hints

<br/>

### Solution: <a title="05 Random Array List" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p05_RandomArrayList">05 Random Array List</a>

---

07.06 Stack of Strings
----------------------

Create a class **Stack** which can store only strings and has the following
functionality:

-   Private field: **data: ArrayList\<String\>**

-   Public method: **push(String item): void**

-   Public method: **pop(): String**

-   Public method: **peek(): String**

-   Public method: **isEmpty(): boolean**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64731809-875d8680-d4ea-11e9-8779-306b8380f059.png" alt="alt text" width="500" height=""></kbd>

### Hints

Use composition/delegation in order to have a field in which to store the
stack's data

<br/>

### Solution: <a title="06 Stack of Strings" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/7%20INHERITANCE/p06_StackOfStrings">06 Stack of Strings</a>

---
