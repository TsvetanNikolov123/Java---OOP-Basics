11 Lab: Interfaces and Abstraction
==================================

---
---

Problems for exercises and homework for the ["Java OOP Basics" course \@
SoftUni.](https://softuni.bg/trainings/1976/java-oop-basics-june-2018)

You can check your solutions here:
<https://judge.softuni.bg/Contests/498/Interfaces-and-Abstraction-Lab> .

---

11.01 Shapes Drawing
--------------------

Build hierarchy of **interfaces** and **classes**:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64817883-7a589a00-d5b3-11e9-9a28-d59431a58640.png" alt="alt text" width="500" height=""></kbd>

You should be able to use the class like this:

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                  |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            queue.add(Integer.parseInt(scanner.nextLine()));
        }
    
        Drawable circle = new Circle(queue.poll(), queue.poll(), queue.poll());
        Drawable rect = new Rectangle(queue.poll(), queue.poll());
    
        circle.draw();
        rect.draw();
    }

### Examples

<img src="https://user-images.githubusercontent.com/32310938/64818038-cf94ab80-d5b3-11e9-8f47-cd4eadaa951c.png" alt="alt text" width="250" height="">

### Solution

For **circle** drawing you can use this algorithm:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64818185-200c0900-d5b4-11e9-833d-c52bdb8d18d1.png" alt="alt text" width="600" height=""></kbd>

For **rectangle** drawing algorithm will be:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64818156-0f5b9300-d5b4-11e9-8706-236ad72b4ea7.png" alt="alt text" width="500" height=""></kbd>

<br/>

### Solution: <a title="01 Shapes Drawing" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/11%20INTERFACES%20AND%20ABSTRACTION/p01_ShapesDrawing">01 Shapes Drawing</a>

---

11.02 Car Shop
--------------

Build hierarchy from **classes** and **interfaces** for this UML diagram

<img src="https://user-images.githubusercontent.com/32310938/64818353-8bee7180-d5b4-11e9-8ac3-be4104d28be0.png" alt="alt text" width="400" height="">

Your hierarchy have to be used with this code

| Main.java                                                                                                                                                                                                                                                                                      |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Car seat = new Seat("Leon", "gray", 110, "Spain");
    
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                seat.getModel(),
                seat.getColor(),
                seat.getHorsePower()));
        System.out.println(seat.toString());
    }

### Examples

| **Input** | **Output**                                                                                    |
|-----------|-----------------------------------------------------------------------------------------------|
|           | Leon is gray and have 110 horrse powers <br/> This is Leon produced in Spain and have 4 tires |

### Solution

<kbd><img src="https://user-images.githubusercontent.com/32310938/64818542-f0113580-d5b4-11e9-9572-508820063c33.png" alt="alt text" width="200" height=""></kbd>

**Note:** consider using the wrapper classes in the **Seat** constructor**.**

<br/>

### Solution: <a title="02 Car Shop" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/11%20INTERFACES%20AND%20ABSTRACTION/p02_CarShop">02 Car Shop</a>

---

11.03 Car Shop Extend
---------------------

| **\<\<Car\>\>** |
|-----------------|


Extend previous problem:

<img src="https://user-images.githubusercontent.com/32310938/64818690-3a92b200-d5b5-11e9-8a88-a9e440ee70f0.png" alt="alt text" width="600" height=""><br/>

Your hierarchy have to be used with this code

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        Sellable seat = new Seat("Leon", "Gray", 110, "Spain", 11111.1);
        Rentable audi = new Audi("Leon", "Gray", 110, "Spain", 3, 99.9);
    
        printCarInfo(seat);
        printCarInfo(audi);
    }
    
    private static void printCarInfo(Car car) {
        System.out.println(String.format(
                "%s is %s color and have %s horse power",
                car.getModel(),
                car.getColor(),
                car.getHorsePower()));
        System.out.println(car.toString());
    }

### Examples

| **Input** | **Output**                                                                                                                                                                                    |
|-----------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|           | Leon is gray and have 110 horse power <br/> This is Leon produced in Spain and have 4 tires <br/> Leon is gray and have 110 horse power  <br/>This is Leon produced in Spain and have 4 tires |

<br/>

### Solution: <a title="03 Car Shop Extend" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/11%20INTERFACES%20AND%20ABSTRACTION/p03_CarShopExtended">03 Car Shop Extend</a>

---

11.04 Say Hello
---------------

Build hierarchy from classes and interfaces for this UML diagram

<img src="https://user-images.githubusercontent.com/32310938/64818810-89404c00-d5b5-11e9-9880-fcfa00ac36a4.png" alt="alt text" width="600" height="">

Your hierarchy have to be used with this code

| Main.java                                                                                                                                                                                                                                                                                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
    
        
        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));
    
        for (Person person : persons) {
            print(person);
        }
    }
    
    private static void print(Person person) {
        System.out.println(person.sayHello());
    }
                                                                                                                                                                                                                                                                                                                                                                         |

### Examples

| **Input** | **Output**                |
|-----------|---------------------------|
|           | Здравей <br/> Hello <br/> Djydjybydjy |

<br/>

### Solution: <a title="04 Say Hello" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/11%20INTERFACES%20AND%20ABSTRACTION/p04_SayHello">04 Say Hello</a>

---

11.05 Say Hello Extend
----------------------

Build hierarchy from classes and interfaces for this UML diagram

<img src="https://user-images.githubusercontent.com/32310938/64819225-7417ed00-d5b6-11e9-8558-da647f931105.png" alt="alt text" width="600" height="">

Your hierarchy have to be used with this code

| Main.java                                                                                                                                                                                                                                                                                                                                                                   |
|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
    
        
        persons.add(new Bulgarian("Pesho"));
        persons.add(new European("Pesho"));
        persons.add(new Chinese("Pesho"));
    
        for (Person person : persons) {
            print(person);
        }
    }
    
    private static void print(Person person) {
        System.out.println(person.sayHello());
    }

### Examples

| **Input** | **Output**                |
|-----------|---------------------------|
|           | Здравей <br/> Hello <br/> Djydjybydjy |

<br/>

### Solution: <a title="05 Say Hello Extend" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/11%20INTERFACES%20AND%20ABSTRACTION">05 Say Hello Extend</a>

---