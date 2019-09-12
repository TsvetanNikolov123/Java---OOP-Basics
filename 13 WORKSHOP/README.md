13 WORKSHOP
===========

---
---

Battleground – workshop
-----------------------

Overview

\-In this workshop we shall create a console game application called
"BATTLEGROUND".

BattleGround size: 5x5.

UnitTypes: Marine and Carrier.

**Commands**

-   spawn {unitType} {name} {coordinateX} {coordinateY}

-   add an unit in the battleground

-   status {name}

-   give information about the unit in this name.

-   move {name} {coordinateX} {coordinateY}

-   move the unit to a new position on the field.

-   fight

>   \- every unit hits someone (if there are some whithin it's range). Their
>   ranges are static final variables and are described in classes Marine and
>   Carrier.

\- unit can hit only one opponent (within its range)

\- when an unit chooses the target he picks one with lower health points. If on
battleground have more than one unit with same lower points he compare them by
name.

-   game-over

-   the game is over and you should print "Game Over!"

### Engine

<img src="https://user-images.githubusercontent.com/32310938/64824571-1d64e000-d5c3-11e9-9678-8513a6b75493.png" alt="alt text" width="700" height="">

### Battleground

Battleground has a fixed size: 5x5.

Throws InvalidPositionException in add(), remove() and move() in interface and
in BattlegroundImpl.

<img src="https://user-images.githubusercontent.com/32310938/64824592-2c4b9280-d5c3-11e9-8756-bec590b5d9c8.png" alt="alt text" width="700" height="">

### Unit

Each Unit has Type, Name and Coordinates of the Battleground.

Depending on the Type (Marine or Carrier), their qualities are:

**Marine:**

\-RANGE = 1

\-HEALTH_POINTS = 50

\-ENERGY_POINTS = 80

\-ATTACK_POINTS = 15

\-DEFENCE_POINTS = 5

Marine spell: RageShoot =\> ENERGY_COST = 10

**Carrier:**

\-RANGE = 2

\-HEALTH_POINTS = 50

\-ENERGY_POINTS = 80

\-ATTACK_POINTS = 15

\-DEFENCE_POINTS = 5

Carrier spell: BulletRain =\> ENERGY_COST = 15

<img src="https://user-images.githubusercontent.com/32310938/64824664-6321a880-d5c3-11e9-88b7-d6243cac551d.png" alt="alt text" width="800" height="">
<img src="https://user-images.githubusercontent.com/32310938/64824699-7a609600-d5c3-11e9-8713-79b353ee1c89.png" alt="alt text" width="800" height="">

### Position

<img src="https://user-images.githubusercontent.com/32310938/64824810-d2979800-d5c3-11e9-8678-9c1aa89b1f65.png" alt="alt text" width="300" height="">

### Combat Handler

Throws NotEnoughEnergyException in interface CombatHandler.

Throws NotEnoughEnergyException in class CarrierCombatHandler.

Throws NotEnoughEnergyException in class MarineCombatHandler.

When an unit chooses the target he picks one with **lower health points**. If on
battleground have more than one unit with same lower points he **compare them by
name**.

<img src="https://user-images.githubusercontent.com/32310938/64824943-37eb8900-d5c4-11e9-8d31-5aaca7759c9a.png" alt="alt text" width="800" height="">

### Spells

<img src="https://user-images.githubusercontent.com/32310938/64824973-4d60b300-d5c4-11e9-81a8-405e85e1b334.png" alt="alt text" width="800" height="">

### Comparators

<img src="https://user-images.githubusercontent.com/32310938/64824991-5e112900-d5c4-11e9-9c59-fd713e98340d.png" alt="alt text" width="800" height="">

### Exceptions

<img src="https://user-images.githubusercontent.com/32310938/64825021-6ff2cc00-d5c4-11e9-8101-0271ef3b8961.png" alt="alt text" width="800" height="">

### Command Dispatcher

Throw GameException (UNKNOWN_COMMAND_EXCEPTION_MESSAGE).

<img src="https://user-images.githubusercontent.com/32310938/64825034-7c772480-d5c4-11e9-91b8-677d21f583d3.png" alt="alt text" width="400" height="">

### Commands

When the command is invalid, print: “Unknown command!”.

**All Commands**:

-   **Unknown command!**

-   **spawn** {typeUnit} {name} {position} {position}

\- Valid command: {name} of type {typeUnit} has spawn \@({position}, {position})

\- Invalid command:

>   \- Invalid unit type!

\- Coordinates are not correct!

\- There is an unit at this position, already!

-   **status** \<name\>

\- Valid command: -

>   \>Gosho

\- Type: {typeUnit}

\- Position: ({position}, {position})

\- Attack Points: {attack points}

\- Defence Points: {defence points}

\- Energy Points: {energy points}

\- Health Points: {health points}

\- Invalid command:

>   \- Not exist unit with name {name}!

-   **fight**

\- Valid command:

>   \- {name} cast RageShoot spell and did 15 damage

{name} cast BulletRain spell and did 15 damage

\- {name} killed {name}

\- Invalid command:

>   \- No enough spawns for fight!

\- Units are outside range of their enemies, move closer and try again!

-   **move**

\- Valid command:

>   \- {name} moved to ({position}, {position})

\- Invalid command:

>   \- There is an unit at this position, already!

\- Not exist unit with name {name}!

\- Coordinates are not correct!

-   **game-over**

\- Valid command:

>   \- Game Over!

Throws **UnknownUnitTypeException, InvalidPositionException,
NotEnoughEnergyException** in interface.

<img src="https://user-images.githubusercontent.com/32310938/64825083-aaf4ff80-d5c4-11e9-9012-9f701f391f5d.png" alt="alt text" width="1000" height="">

In spawn command we should **throws UnknownUnitTypeException,
InvalidPositionException** with the appropriate messages.

In move command we should **throws InvalidPositionException,
NotExistingUnitException** with the appropriate messages.

In game-over command we should throws **UnknownUnitTypeException,
InvalidPositionException, NotEnoughEnergyException** with the appropriate
messages.

In status command we should throws **NotExistingUnitException** with the
appropriate messages.

In fight command we should throws **NotEnoughEnergyException** with the
appropriate messages.

**Exceptions Messages:**

NOT_EXISTING_UNIT_EXCEPTION_MESSAGE = "Not exist unit with name %s!"

INVALID_UNIT_TYPE_EXCEPTION_MESSAGE = "Invalid unit type!"

NOT_ENOUGH_ENERGY_EXCEPTION_MESSAGE = "Not enough energy to produce the spell!"

INVALID_COORDINATES_EXCEPTION_MESSAGE = "Coordinates are not correct!"

POSITION_NOT_EMPTY_EXCEPTION_MESSAGE = "There is an unit at this position,
already!"

NO_UNIT_TO_REMOVE_EXCEPTION_MESSAGE = "There is not unit to remove!"

### Factories

Throw new UnknownUnitTypeException("Provided unit type is unknown!") in
CombatHandlerFactory, SpellFactory and UnitFactory.

<img src="https://user-images.githubusercontent.com/32310938/64825311-7df51c80-d5c5-11e9-9b20-7a4c103ef916.png" alt="alt text" width="400" height="">

### Enum

<img src="https://user-images.githubusercontent.com/32310938/64825328-906f5600-d5c5-11e9-8ef8-edb6c6701eb6.png" alt="alt text" width="600" height="">

### Repository

<img src="https://user-images.githubusercontent.com/32310938/64825346-9ebd7200-d5c5-11e9-9eaf-97a32ac747bb.png" alt="alt text" width="300" height="">

### Exception Messаges Constants

NOT_EXISTING_UNIT_EXCEPTION_MESSAGE: String = "Not exist unit with name %s!"

INVALID_UNIT_TYPE_EXCEPTION_MESSAGE: String = "Invalid unit type!"

NOT_ENOUGH_ENERGY_EXCEPTION_MESSAGE: String = "Not enough energy to produce the
spell!"

INVALID_COORDINATES_EXCEPTION_MESSAGE: String = "Coordinates are not correct!"

POSITION_NOT_EMPTY_EXCEPTION_MESSAGE: String = "There is an unit at this
position, already!"

NO_UNIT_TO_REMOVE_EXCEPTION_MESSAGE: String = "There is not unit to remove!"

### Game Constants

GAME_OVER_MESSAGE: String = "Game over!"

### I / O (Input / Output)

#### Input

-   The input will come in the form of commands, in the format specified above.

-   The input sequence ends when you receive the command “**game-over**”.

#### Output

<img src="https://user-images.githubusercontent.com/32310938/64825366-ada42480-d5c5-11e9-9209-97116a4168a3.png" alt="alt text" width="600" height="">

#### Constrains

-   **All integers** in the input will be in **range [0, 4]**.

-   **All strings** in the input may consist of **any ASCII character**, except
    **SPACE**

-   Note that throughout the program, you are working **ONLY** with
    **INTEGERS**.

#### Examples

| **Output**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
    spawn Marine Pesho 0 0
    Pesho of type Marine has spawn @(0, 0)
    spawn Carrier Gosho 4 4
    Gosho of type Carrier has spawn @(4, 4)
    fight
    Units are outside range of their enemies, move closer and try again!
    move Gosho 1 0
    Gosho moved to (1, 0)
    status Gosho
    ->Gosho 
    - Type: Carrier
    - Position: (1, 0)
    - Attack Points: 15
    - Defence Points: 5
    - Energy Points: 80
    - Health Points: 50
    fightt
    Unknown command!
    fight
    Pesho cast RageShoot spell and did 15 damage
    Gosho cast BulletRain spell and did 15 damage
    status Gosho
    ->Gosho 
    - Type: Carrier
    - Position: (1, 0)
    - Attack Points: 15
    - Defence Points: 5
    - Energy Points: 65
    - Health Points: 35
    fight
    Pesho cast RageShoot spell and did 15 damage
    Gosho cast BulletRain spell and did 15 damage
    fight
    Pesho cast RageShoot spell and did 30 damage
    Pesho killed Gosho
    game-over
    Game over!

<br/>

### Solution: <a title="Battleground – workshop" href="https://github.com/TsvetanNikolov123/Java---OOP-Basics/tree/master/13%20WORKSHOP/Workshop/net/java/main">Battleground – workshop</a>

---