09 Lab: Polymorphism
====================

---
---

Problems for exercises and homework for the ["Java OOP Basics" course \@
SoftUni](https://softuni.bg/courses/java-oop-basics).

You can check your solutions here:
<https://judge.softuni.bg/Contests/481/Polymorphism-Lab> .

---

09.01 Overload Method
---------------------

Create a class **MathOperation**, which should have method **add().** Method
**add()** have to be invoked with **two, three** or **four Integers.**

You should be able to use the class like this:

| Main.java                                                                                                                                                                                                                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) throws IOException {
        MathOperation math = new MathOperation();
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
    }

### Examples

| **Input** | **Output**             |
|-----------|------------------------|
|           | 4 <br/> 9 <br/> 16     |

### Solution

Class **MathOperation** should look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64739697-7e28e580-d4fb-11e9-806a-b440fa70ff35.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="01 Overload Method" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/9%20POLYMORPHISM/p01_OverloadMethod">01 Overload Method</a>

---

09.02 Method Overriding
-----------------------

Read **n** lines from console. If line consist only **one Double** number it is
square, if numbers are **two** it is rectangle. Numbers are sides of Rectangle.
You need to have two classes:

-   **Rectangle**

-   **Square**

You should be able to use the class like this:

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Rectangle> listOfRectangles = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            String[] reminder = reader.readLine().split( " ");
            if (reminder.length == 1) {
                listOfRectangles.add(new Square(Double.parseDouble(reminder[0])));
            } else {
                listOfRectangles.add(new Rectangle(Double.parseDouble(reminder[0]),              
                                                   Double.parseDouble(reminder[1])));
            }
        }
    
        for (Rectangle rectangle : listOfRectangles) {
            System.out.println(rectangle.area());
        }
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |

### Examples

| **Input**                                                           | **Output**                                       |
|---------------------------------------------------------------------|--------------------------------------------------|
| 5 <br/> 5 <br/> 25 <br/> 25 <br/> 4 <br/> 5 <br/> 3 <br/> 7 <br/> 2 | 25.0 <br/> 625.0 <br/> 20.0 <br/> 21.0 <br/> 4.0 |

### Solution

Square class should look like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64739700-7f5a1280-d4fb-11e9-85cd-3789b12cb3c2.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="02 Method Overriding" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/9%20POLYMORPHISM/p02_MethodOverriding">02 Method Overriding</a>

---

09.03 Shapes
------------

Create class hierarchy, starting with abstract class **Shape**:

-   **Fields:**

    -   **perimeter**

    -   **area**

-   **Encapsulation for this fields**

-   **Abstract methods:**

    -   **calculatePerimeter()**

    -   **calculateArea()**

Extend Shape class with two children:

-   **Rectangle**

-   **Circle**

Each of them need to have:

-   **Fields:**

    -   **height and width for Rectangle**

    -   **radius for Circle**

-   **Encapsulation for this fields**

-   **Public constructor**

-   **Concrete methods for calculations (perimeter and area)**

<br/>

### Solution: <a title="03 Shapes" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/9%20POLYMORPHISM/p03_Shapes">03 Shapes</a>

---