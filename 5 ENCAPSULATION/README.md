05 Lab: Encapsulation
=====================

---
---

Problems for exercises and homework for the ["Java OOP Basics" course \@
SoftUni](https://softuni.bg/courses/java-oop-basics).

You can check your solutions here:
<https://judge.softuni.bg/Contests/475/Encapsulation-Lab> .

---

05.01 Sort by Name and Age
--------------------------

Create a class **Person**, which should have **private** fields for:

-   firstName: String

-   lastName: String

-   age: Integer

-   toString() - override

You should be able to use the class like this:

| Main.java                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
    
        List<Person> people = new ArrayList<>();
    
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2])));
        }
    
        Collections.sort(people, (firstPerson, secondPerson) -> {
            int sComp = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());
    
            if (sComp != 0) {
                return sComp;
            } else { 
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge()); 
            }
        });
    
        for (Person person : people) {
            System.out.println(person.toString());
        }
    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         

### Examples

| **Input**                                                                                                                      | **Output**                                                                                                                                                                             |
|--------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 <br/> Asen Ivanov 65 <br/> Boiko Borisov 57 <br/> Ventsislav Ivanov 27 <br/> Asen Harizanoov 44 <br/> Boiko Angelov 35 <br/> | Asen Harizanoov is 44 years old. <br/> Asen Ivanov is 65 years old. <br/> Boiko Angelov is 35 years old. <br/> Boiko Borisov is 57 years old. <br/> Ventsislav Ivanov is 27 years old. |

### Solution

Create a **new class** and ensure **proper naming**. Define the **private**
fields

<kbd><img src="https://user-images.githubusercontent.com/32310938/64648195-21f29280-d423-11e9-9bf1-7af7eb7245ad.png" alt="alt text" width="250" height=""></kbd>

Create getters and apply them access modifiers, which are as strictly as
possible

<kbd><img src="https://user-images.githubusercontent.com/32310938/64648211-29b23700-d423-11e9-87b4-828ce389a19c.png" alt="alt text" width="300" height=""></kbd>

Override **toString()** method:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64648242-35056280-d423-11e9-8fab-9bfb9d02b33d.png" alt="alt text" width="800" height=""></kbd>

<br/>

### Solution: <a title="01 Sort by Name and Age" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/5%20ENCAPSULATION/p01_SortByNameAndAge">01 Sort by Name and Age</a>

---

05.02 Salary Increase
---------------------

Read person with their names, age and salary. Read percent bonus to every person
salary. Persons younger than 30 get half bonus. Expand **Person** from previous
task. Add **salary field** and **property** with proper **access**.

New **fields** and **methods**

-   Salary: Double

-   IncreaseSalary(Double bonus)

You should be able to use the class like this:

| Main.java                                                                                                                                                                                                                                                         |
|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    public static void main(String[] args) throws IOException {
        //TODO: Add reading logic
        doube bonus = Double.parseDouble(reader.readLine());
        for (Person person : people) {
            person.increaseSalary(bonus);
            System.out.println(person.toString());
        }
    }

### Examples

| **Input**                                                                                                                | **Output**                                                                                                                                                                                                                 |
|--------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 <br/> Asen Ivanov 65 2200 <br/> Boiko Borisov 57 3333 <br/> Ventsislav Ivanov 27 600 <br/> Asen Harizanoov 44 666.66 <br/> Boiko Angelov 35 559.4 <br/> 20 | Asen Ivanov gets 2640.0 leva <br/> Boiko Borisov gets 3999.6 leva <br/> Ventsislav Ivanov gets 660.0 leva <br/> Asen Harizanoov gets 799.992 leva <br/> Boiko Angelov gets 671.28 leva |

### Solution

Add new **private** field for **salary** and proper **setters** and **getters**
for it

<kbd><img src="https://user-images.githubusercontent.com/32310938/64648259-3df63400-d423-11e9-8030-759136330bda.png" alt="alt text" width="400" height=""></kbd>

Add new **method**, which will **increase** salary with bonus

<kbd><img src="https://user-images.githubusercontent.com/32310938/64648274-43ec1500-d423-11e9-9bff-8c5c3da9a3e4.png" alt="alt text" width="450" height=""></kbd>

Refactor **toString()** method for this task.

**Note**: do not use **String.format()** in toString() method.

<br/>

### Solution: <a title="02 Salary Increase" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/5%20ENCAPSULATION/p02_SalaryIncrease">02 Salary Increase</a>

---

05.03 Validation Data
---------------------

Expand **Person** with proper validation for every field:

-   **Names must be at least 3 symbols**

-   **Age must not be zero or negative**

-   **Salary can't be less than 460.0**

Print proper message to end user (look at example for messages).

Don't use **System.out.println()** in Person class.

### Examples

| **Input**                                                                                                                                     | **Output**                                                                                                                                                                                                            |
|-----------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 5 <br/> Asen Ivanov -6 2200 <br/> B Borisov 57 3333 <br/> Ventsislav Ivanov 27 600 <br/> Asen H 44 666.66 <br/> Boiko Angelov 35 300 <br/> 20 | Age cannot be zero or negative integer <br/> First name cannot be less than 3 symbols <br/> Last name cannot be less than 3 symbols <br/> Salary cannot be less than 460 leva <br/> Ventsislav Ivanov gets 660.0 leva |

### Solution

Add **validation** to all setters in Person. Validation may look like this or
something similar:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649258-346dcb80-d425-11e9-925a-4cc91424d378.png" alt="alt text" width="700" height=""></kbd>

<br/>

### Solution: <a title="03 Validation Data" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/5%20ENCAPSULATION/p03_ValidationData">03 Validation Data</a>

---

05.04 First and Reserve Team
----------------------------

Create a **Team** class. Add to this team all person you read. All person
**younger** than 40 go in **first team**, others go in **reverse team**. At the
end print first and reserve team sizes.

The class should have **private fields** for:

-   Name: String

-   First Team Players: **List\<Person\>**

-   Reserve Team Players: **List\<Person\>**

The class should have **constructors**:

-   **Team(**String name**)**

The class should also have **public methods** for:

-   **addPlayer**(Person person): **void**

-   **getFirstTeam(): Collections.unmodifiableList**

-   **getReserveTeam(): Collections.unmodifiableList**

You should be able to use the class like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649279-3f286080-d425-11e9-8f35-6d86fcdc21b1.png" alt="alt text" width="700" height=""></kbd>

You should **NOT** be able to use the class like this:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649290-451e4180-d425-11e9-9439-bfddb60b65be.png" alt="alt text" width="400" height=""></kbd>
<kbd><img src="https://user-images.githubusercontent.com/32310938/64649299-494a5f00-d425-11e9-9260-924226410519.png" alt="alt text" width="160" height=""></kbd>

### Examples

| **Input**                                                                                                                                         | **Output**                                                  |
|---------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------|
| 5 <br/> Asen Ivanov 20 2200 <br/> Boiko Borisov 57 3333 <br/> Ventsislav Ivanov 27 600 <br/> Grigor Dimitrov 25 666.66 <br/> Boiko Angelov 35 555 | First team have 4 players <br/> Reserve team have 1 players |

### Solution

Add new class Team. Its fields and constructor look like:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649314-510a0380-d425-11e9-94db-015ff51837d4.png" alt="alt text" width="400" height=""></kbd>

Properties for firstTeam and reserveTeam have only getters:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649323-5404f400-d425-11e9-89e6-332c3d13b644.png" alt="alt text" width="500" height=""></kbd>

There will be only one method, which add players to teams:

<kbd><img src="https://user-images.githubusercontent.com/32310938/64649330-57987b00-d425-11e9-9c2b-04238c994851.png" alt="alt text" width="400" height=""></kbd>

<br/>

### Solution: <a title="04 First and Reserve Team" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/5%20ENCAPSULATION/p04_FirstAndReserveTeam">04 First and Reserve Team</a>

---