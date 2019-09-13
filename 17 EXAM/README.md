17 Exam: THE WAR OF THE COMIC
=============================

StoryLine
---------

You were watching tv when the EBS(Emergency Broadcast System) started. It seems
that all of the heroes and anti heroes from the comics were brought to live and
since they have different understandings they started the COMICS WAR. The
consequences are very bad and the government hired you (THE PROGRAMMER WIZZARD)
to make a program that calculates who wins. You have only 6 hours to finish the
task , so hurry up time is ticking !

Task 1: Structure
-----------------

The structure of the program consists of Charcters and Arenas. Implement your
classes, in the same way as they are **described below** (class names, field
types, field names etc.). Keep the **naming conventions** and **rules**.

Entities
--------

- ### ComicCharacterImpl

Comic characters have 4 properties you must implement:

-   **name –** a **String;**

**-** The name should be only from alphabetical characters and not bigger than
12 characters or less than 2. The name can have "**\_**";

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Comic Character name is not in the correct format!**”.

-   **energy** – a **positive integer;**

**-** A **positive integer** (include 0) not bigger than 300;

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Energy is not in the correct range!**”.

-   **health** – a **possitive floating point number;**

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Health should be a possitive number!**”.

-   **intelligence**– a **possitive floating point number**;

**-** number not bigger than 200;

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Intelligence is not in the correct range!**”.

-   **powers** - a **collection** of type **SuperPower**

All these properties are set trough the constructor. Тhe "power" collection
should not be placed as a parameter in the constructor. There are **2 types** of
comic characters – **Hero** and **AntiHero.** Each of them have one special:
Hero-heroism/AntiHero-evilness

#### Hero

All heroes have 1 additional property:

-   **heroism** – a **possitive floating point number** it describes how heroic
    is the hero.

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Heroism should be a possitive number!**”.

The heroism should be set trough the constructor.

There are 2 types of heros – **MarvelHero** and **DCHero**

#### AntiHero

The anti heroes have a property for their evilness

-   **evilness** – a **possitive floating point number** for anti heroes percent
    of evilness.

**-** If not, **throw** an **IllegalArgumentException with the message**
“**Evilness should be a possitive number!**”.

The evilness should be set trough the constructor.

There are 2 types of anti heroes – **Villain** and **Titan**

#### BEHAVIOR OF ComicCharacterImpl:

    **- void** takeDamage(**double** damage):
    
    The Comic Character health is reduce from the damage  
      
    - **void** boostCharacter(**int** energy,**double** health,**double**
    inteligence):
    
    Changes Comic Character energy,health and inteligence with the new values but
    first you have to see if they are correct.
    
    \- String getName():
    
    Returns the Comic Character name  
      
    - **int** getEnergy():
    
    Returns the Comic Character energy  
      
    - **double** getHealth():
    
    Returns the Comic Character health  
      
    - **double** getIntelligence():

Returns the Comic Character intelligence

    String useSuperPowers():
    
    If the Comic character doesn't have a super power , return "\<comic character
    name\> has no super powers!"
    
    If the character has powers , iterate over the colection and for every power:
    
    \- add to characters energy the Super power points;
    
    \- add to characters health the Super power points multiplied by two;
    
    Else returns "\<comic character name\> used his super powers!"

#### BEHAVIOR OF Hero/AntiHero:

    \- **double** getSpecial():
    
    Returns the special of Hero/AntiHero =\> heroism/evilness

#### BEHAVIOR OF MarvelHero/DcHero/Titan/Villain
    
    \- **double** attack():
    
    Returns the attack points of the given character.You can find how to make the
    attack points in the Functionality section!

- ###  ArenaImpl

The arena is the place where heroes fight against anti heroes.

-   **arenaName** – a **string**

-   **heroes** – a **collection** that contains the heroes fighting in the
    current arena

-   **antiHeroes** – a **collection** that contains the anti heroes fighting in
    the current arena;

-   **capacity** – an **integer** that holds the maximum characters that can
    participate;

- ###  Power

The power is a special ability.

-   **name** – a **string**

\- The power name should start and finish with '\@' and consist only of
alphabetical characters not less than 5 characters along with '\@'. The name can
have "**\_**".

\- If not, **throw** an **IllegalArgumentException with the message** “**Super
power name not in the correct format!**”.

-   **powerPoints** - a possitive **floating point number**;

\- If not, **throw** an **IllegalArgumentException with the message** “**Power
points should be a possitive number!**”.

#### BEHAVIOR OF Power

**- String** getName():

Returns the name of the power

**- double** getPowerPoints():

Returns the powerPoints + Power name length divided by 2

Contracts
---------

**Every contract should be implemented by the correct class!**

-  ### ComicCharacter

Contract with methods:

    \- **void** takeDamage(**double** damage);  
      
    - String getName();  
      
    - **void** boostCharacter(**int** energy,**double** health,**double**
    intelligence);  
      
    - **int** getEnergy();  
      
    - **double** getHealth();  
      
    - **double** getIntelligence();  
      
    - **double** attack();  
      
    - **double** getSpecial();
    
    \- String useSuperPowers();
    
    \- **void** addSuperPower(SuperPower superPower);

- ###  Arena

Contract with methods:

    \- String getArenaName();  
      
    - **boolean** isArenaFull();  
      
    - **void** addHero(ComicCharacter hero);  
      
    - **void** addAntiHero(ComicCharacter antiHero);  
      
    - **boolean** fightHeroes();

-  ###  Manager

Contract with methods:

    \- String checkComicCharacter(String characterName);  
      
    - String addHero(ComicCharacter hero);  
      
    - String addAntiHero(ComicCharacter antiHero);  
      
    - String addArena(Arena arena);  
      
    - String addHeroToArena(String arena, String hero);  
      
    - String addAntiHeroToArena(String arena, String antiHero);
    
    \- String loadSuperPowerToPool(SuperPower superPower);
    
    \- String assignSuperPowerToComicCharacter(String comicCharacter,String
    superPower);
    
    \- String usePowers(String characterName);  
      
    - String startBattle(String arena);  
      
    - String endWar();

- ###  SuperPower

Contract with methods:

    \- String getName();
    
    \- **double** getPowerPoints();

### Important

The **parameters** should be in the **EXACT given order** and the **EXACT given
types (use primitive types as parameters)**.

### String Representation

Implement **toString()** methods for all the classes except for the **Arena**
class. You can see the requirements in the **Output Section** below.

Task 2: Business Logic
----------------------

The main logic of the program will be in a class called **WarManager**, which
will hold the **main functionality**,the class should have these **methods**
(the methods should have correct return types, names and parameters):

-   **String checkComicCharacter(String characterName)**

-   **String addHero(ComicCharacter hero)**

-   **String addAntiHero(ComicCharacter antiHero)**

-   **String addArena(Arena arena)**

-   **String addHeroToArena(String arena,String hero)**

-   **String addAntiHeroToArena(String arena,String antiHero)**

-   **String loadSuperPowerToPool(SuperPower superPower)**

-   **String assignSuperPowerToComicCharacter(String comicCharacter, String
    superPower)**

-   **String usePowers(String characterName)**

-   **String startBattle(String arena)**

-   **String endWar()**

Commands in WarManger
---------------------

**WarManager class** should hold the main **functionality** to the input
commands of the user. These are the **input commands** you need to accept from
the **input**.

-   **checkComicCharacter(String characterName)**

-   **RETURNS** information about the comic character with the given **name**

-   **IF** the comic character has health that is \<= 0, **returns** message

"**\<characterName\> has fallen in battle!**"

-   **IF** the comic character doesn't exist, **returns** message  
    "**Sorry, fans! \<characterName\> doesn't exist in our comics!**"

-   **addHero(ComicCharacter hero)**

-   **ADDS** a hero with the given **name**

-   **RETURNS** message "**\<hero name\> is ready for battle!**"

-   **IF** a hero with the **same name already exists**,**BOOST** all of his old
    parameters (energy,health,inteligence) with the new one, **returns** message
    "**\<hero name\> evolved!**". If some of the parameters are not correct
    return the appropriate message.The **order** of changing the parameters
    should be energy,health,intelligence.

-   **addAntiHero (ComicCharacter antiHero)**

-   **ADDS** an antiHero with the given **name**

-   **RETURNS** message "**\<antiHero name\> is ready for destruction!**"

-   **IF** an antiHero with the **same name already exists**,**BOOST** all of
    his old parameters (energy,health,inteligence) with the new one, **returns**
    message "**\<hero name\> is getting stronger!**".If some of the parameters
    are not correct return the appropriate message.The **order** of changing the
    parameters should be energy,health,intelligence.

-   **addArena(Arena arena)**

-   **ADDS** an arena with the given name

-   **RETURNS** message "**\<arena name\> is becoming a fighting ground!**"

-   **IF** an arena with the same name already exists, **returns** message  
    "**A battle is about to start there!**"

-   **addHeroToArena(arenaName, heroName)**

-   **IF** a hero is already assigned to an arena ,**returns** message  
    "**\<heroName\> is fighting!**"

-   **IF** the hero health is \<= 0, **returns** message "**\<heroName\> is
    dead!**"

-   **IF** the arena capacity is reached , **returns** message "**Arena is
    full!**"

-   **ELSE** adds hero to the arena and , **returns** message "**\<heroName\> is
    fighting for your freedom in \<arenaName\>!**"

-   **addAntiHeroToArena(arenaName, antiHeroName)**

-   **IF** an anti hero is already assigned to an arena ,**returns** message  
    "**\<antiHeroName\> is fighting!**"

-   **IF** the anti hero health is \<= 0, **returns** message
    "**\<antiHeroName\> is dead!**"

-   **IF** the arena capacity is reached , **returns** message "**Arena is
    full!**"

-   **ELSE** adds anti hero to the arena and , **returns** message
    "**\<antiHeroName\> and his colleagues are trying to take over
    \<arenaName\>!**"

-   **loadSuperPowerToPool(SuperPower superPower)**

-   **IF** a super power already exists ,**returns** message  
    "**This super power already exists!**"

-   **ELSE** adds super power to pool , **returns** message **"\<super power
    name\> added to pool!**"

-   **assignSuperPowerToComicCharacter(String comicCharacter,String
    superPower)**

-   **IF** a super power is already assigned to a ComicCharacter ,**returns**
    message  
    "**\<super power name\> already assigned!**"

-   **ELSE** adds super power to ComicCharacter , **returns** message **"\<comic
    character\> has a new super power!**"

-   **IMPORTANT :** After you assign a super power to a character you can't
    assign it to any other character

-   **usePowers(String characterName)**

-   **IF** the Comic Character doesn't have any powers ,**returns** message  
    "**\<comic character name\> has no super powers!**"

-   **ELSE** return message "**\<comic character name\> used his super
    powers!**"

-   **startBattle(arenaName)**

-   **IF** the arena has zero participants , **returns** message "**SAFE
    ZONE!**"

-   **STARTS** the battle in the arena

-   **IF** heroes win, **returns** message "**Heroes won the battle of
    \<arenaName\>!**"

-   **IF** anti heroes win, **returns** message "**Anti Heroes won the battle of
    \<arenaName\>!**"

-   **REMOVES** the arena

-   **endWar()**

-   **IF** heroes won battles are more or equal to anti heros, **returns**
    message "**After \<count of all battles\> battles our FRIENDLY HEROES
    WON!"**

-   **ELSE returns** message "**WE ARE DOOMED!**"

Functionality
-------------

#### Starting Battle

Every battle should be **counted**!

When you start the battle in the arena you should define which team is bigger
(**heroes or anti heroes**) .

**IF** the heroes team is bigger or equal : the anti heroes attack(if the anti
heroes team is bigger, the heroes team attack first).  
EXAMPLE: heroes are 10 and anti heroes are 5. In this case anti heroes attack
the first five heros and stop.

**The first of the anti heroes are attacking the first of the heroes, then the
second attacks the second, and so on.**

After each attack, the dead heroes are **removed** and check if the battle is
completed (until one of the teams stays **without live characters**).

After that dead heroes should be **removed**(heroes with health **less or equal
to zero**).

**If** all of the heroes are dead **return false** (The heroes lost).

**Then** its time for the heroes to attack. The same rule apply from above.
Removing dead anti heroes and if all anti heroes are dead **return true**(The
anti heroes lost). **ALSO** in some cases the second attack: the atacking team
may be bigger. In that case you should stop the attack when you atack all of the
characters.

The two teams fight until one of them has no heros/anti heroes left.

\*Every ComicCharacter should take damage from his enemy.

Different ComicCharacters have different attack power:

-   **MarvelHero: attack power = ((energy + special) \* intelligence) / 2.5**

-   **DCHero: attack power = energy / 1.5 + special + intelligence**.

-   **Villain: attack power = (intelligence \* special) / energy.**

-   **Titan: attack power = (energy + intelligence + special) \* 3.**

#### ENDING THE WAR

When you get command "WAR_IS_OVER" the war stops . If the HEROES has **equal or
more** battles won they are the winners. ELSE the ANTI HEROES WIN. The program
ends!

#### Testing

**After finishing upload zip file with SRC folder. Do not expect points from the
JUDGE!**

<kbd><img src="https://user-images.githubusercontent.com/32310938/64887721-e7326980-d671-11e9-9978-2372bd548aeb.png" alt="alt text" width="600" height=""></kbd>

<kbd><img src="https://user-images.githubusercontent.com/32310938/64887716-e568a600-d671-11e9-9f01-9e632d828fb9.png" alt="alt text" width="600" height=""></kbd>

Task 3: Input/Output
--------------------

Input
-----

-   The input will come in the form of commands, in format :

        - CHECK_CHARACTER <character name>
        - REGISTER_HERO <character name> <type> <energy> <health><intelligence> <heroism>
        - REGISTER_ANTI_HERO <character name> <type> <energy> <health><intelligence> <evilness>
        - BUILD_ARENA <arena name> <capacity>
        - SEND_HERO <arena name> <hero name>
        - SEND_ANTI_HERO <arena name> <anti hero name>
        - SUPER_POWER <super power name> <power points>
        - ASSIGN_POWER <comic character name> <super power name>
        - UNLEASH <comic character name>
        - COMICS_WAR <arena name>
        - WAR_IS_OVR

Output
------

Each command prints a message :

Any floating point number should be rounded to the second decimal point.

-   **addHero**:

-   "**{hero name} is ready for battle!**" or

-   "**{hero name} evolved!**"

-   **addAntiHero**:

-   "**{antiHero name} is ready for destruction!** or

-   "**{hero name} is getting stronger!**"

-   **checkComicCharacter RETURNS** a **String representation** of the
    **ComicCharacter** with the **GIVEN NAME**:

-   **"\#Name: {name}**

-   **\#\#Health: {health}// Energy: {energy}// Intelligence: {intelligence}**

If the Comic Character is Hero,print:

-   **\#\#\#Heroism: {special}**

Else if the Comic Character is Anti Hero, print:

-   **\#\#\#Evilness: {special}**

If the ComicCharacter is DCHero,print :

-   **\#\#\#\#DC Attack Power: {attack power}**

Else if the ComicCharacter is MarvelHero,print :

-   **\#\#\#\#Marvel Attack Power: {attack power}**

Else if the ComicCharacter is Villain,print :

-   **\#\#\#\#Villain Attack Power: {attack power}**

Else if the ComicCharacter Titan ,print :

-   **\#\#\#\#Titan Attack Power: {attack power}**

-   **addArena**:

-   **"{arena name} is becoming a fighting ground!"** or

-   "**A battle is about to start there!**"

-   **addHeroToArena**:

-   "**{heroName} is fighting!**" or

-   "**{heroName} is dead!"** or

-   "**Arena is full!**" or

-   "**{heroName} is fighting for your freedom in \<arenaName\>!**"

-   **addAntiHeroToArena**:

-   "**{antiHeroName} is fighting!**" or

-   "**{antiHeroName} is dead!"** or

-   "**Arena is full!**" or

-   "**{antiHeroName} and his colleagues are trying to take over {arenaName}!**"

-   **loadSuperPowerToPool**:

-   "**{super power name} added to pool!**" or

-   "**This super power already exists!"**

-   **assignSuperPowerToComicCharacter**:

-   "**{super power name} already assigned!**" or

-   "**{comic character name} has a new super power!"**

-   **usePowers**:

-   "**{comi character name} has no super powers!**" or

-   "**{comic character name} used his super powers!"**

-   **startBattle**:

-   "**SAFE ZONE !"** or

-   "**Heroes won the battle of {arenaName}!"** or

-   **"Anti Heroes won the battle of {arenaName}!"**

-   **endWar**:

-   "**After {count of all battles} battles our FRIENDLY HEROES WON!"** or

-   "**WE ARE DOOMED!**"

Constrains
----------

-   **All strings** in the input may consist of **any ASCII character**, except
    **SPACE**

-   So that the input is easily processed – hint: split by white space!

-   There will be **NO invalid** input lines

-   **All integers** in the input will be in **range [0, 1000]**.

-   You **won't** recieve non-existent hero/anti hero when adding them to arena

Examples
--------

| **Input**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | **Output**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| REGISTER_ANTI_HERO Lex_Luthor Villain 20 300.50 40.72 9.32 <br/>REGISTER_ANTI_HERO Red_Skull Villain 34 130 9 5 <br/>CHECK_CHARACTER Lex_Luthor <br/>BUILD_ARENA Sofia 3 <br/>REGISTER_HERO Chuck_Noris MarvelHero -12 230 23 23 <br/>SEND_ANTI_HERO Sofia Lex_Luthor <br/>REGISTER_HERO Hulk MarvelHero 100 700.50 5.25 8 <br/>SUPER_POWER @Super_Strength@ 3 <br/>BUILD_ARENA MANHATAN 7 <br/>ASSIGN_POWER Red_Skull @Super_Strength@ <br/>CHECK_CHARACTER Hulk <br/>REGISTER_ANTI_HERO Red_Hulk Villain 91 725 3 5 <br/>SEND_HERO Sofia Hulk <br/>SEND_ANTI_HERO Sofia Red_Skull <br/>COMICS_WAR MANHATAN <br/>UNLEASH Red_Skull <br/>SEND_ANTI_HERO Sofia Red_Hulk <br/>CHECK_CHARACTER Red_Skull <br/>COMICS_WAR Sofia <br/>WAR_IS_OVER                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | Lex_Luthor is ready for destruction! <br/>Red_Skull is ready for destruction! <br/>\#Name: Lex_Luthor <br/>\#\#Health: 300.50// Energy: 20// Intelligence: 40.72 <br/>\#\#\#Evilness: 9.32 <br/>\#\#\#\#Villain Attack Power: 18.98 <br/>Sofia is becoming a fighting ground! <br/>Energy is not in the correct range! <br/>Lex_Luthor and his colleagues are trying to take over Sofia! <br/>Hulk is ready for battle! <br/>@Super_Strength@ added to pool! <br/>MANHATAN is becoming a fighting ground! <br/>Red_Skull has a new super power! <br/>\#Name: Hulk <br/>\#\#Health: 700.50// Energy: 100// Intelligence: 5.25 <br/>\#\#\#Heroism: 8.00 <br/>\#\#\#\#Marvel Attack Power: 226.80 <br/>Red_Hulk is ready for destruction! <br/>Hulk is fighting for your freedom in Sofia! <br/>Red_Skull and his colleagues are trying to take over Sofia! <br/>SAFE ZONE! <br/>Red_Skull used his super powers! <br/>Arena is full! <br/>\#Name: Red_Skull <br/>\#\#Health: 152.00// Energy: 45// Intelligence: 9.00 <br/>\#\#\#Evilness: 5.00 <br/>\#\#\#\#Villain Attack Power: 1.00 <br/>Heroes won the battle of Sofia! <br/>After 1 battles our FRIENDLY HEROES WON! <br/>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| REGISTER_HERO Iron_Man MarvelHero 40 550.49 200.00 9.00 <br/>REGISTER_ANTI_HERO Dr_Doom Villain 60 600 180.45 6.50 <br/>SUPER_POWER Levitation 20 <br/>BUILD_ARENA New_York 5 <br/>REGISTER_HERO Flash DCHero 130 300 3 7.50 <br/>BUILD_ARENA New_York 9 <br/>REGISTER_HERO Batman DCHero 10 90 150.50 9.30 <br/>BUILD_ARENA Wakanda 10 <br/>SEND_HERO Wakanda Iron_Man  <br/>SEND_ANTI_HERO New_York Dr_Doom <br/>SUPER_POWER @Infinity_Gauntlet@ 30 <br/>REGISTER_ANTI_HERO Thanos Titan 200 1400 100 7 <br/>CHECK_CHARACTER Flash <br/>SEND_ANTI_HERO New_York Thanos <br/>SEND_HERO Wakanda Flash <br/>ASSIGN_POWER Thanos @Infinity_Gauntlet@ <br/>CHECK_CHARACTER Thanos <br/>SEND_HERO New_York Batman <br/>COMICS_WAR New_York <br/>CHECK_CHARACTER Thanos <br/>REGISTER_ANTI_HERO Galactus Titan 600 800 20 2 <br/>SEND_ANTI_HERO Wakanda Thanos <br/>REGISTER_ANTI_HERO Loki Villain 20 490 100 4 <br/>SEND_ANTI_HERO Wakanda Loki <br/>ASSIGN_POWER Iron_Man @Infinity_Gauntlet@ <br/>REGISTER_HERO Black_Panter MarvelHero 27 490 90.50 5 <br/>SEND_HERO Wakanda Black_Panter <br/>REGISTER_HERO Green_Lanter DCHero 30 130 40 6 <br/>SEND_HERO Wakanda Green_Lanter <br/>COMICS_WAR Wakanda <br/>UNLEASH Thanos <br/>CHECK_CHARACTER Thanos <br/>WAR_IS_OVER                         | Iron_Man is ready for battle! <br/>Dr_Doom is ready for destruction! <br/>Super power name not in the correct format! <br/>New_York is becoming a fighting ground! <br/>Flash is ready for battle! <br/>A battle is about to start there! <br/>Batman is ready for battle! <br/>Wakanda is becoming a fighting ground! <br/>Iron_Man is fighting for your freedom in Wakanda! <br/>Dr_Doom and his colleagues are trying to take over New_York! <br/>@Infinity_Gauntlet@ added to pool! <br/>Thanos is ready for destruction! <br/>\#Name: Flash <br/>\#\#Health: 300.00// Energy: 130// Intelligence: 3.00 <br/>\#\#\#Heroism: 7.50 <br/>\#\#\#\#DC Attack Power: 97.17 <br/>Thanos and his colleagues are trying to take over New_York! <br/>Flash is fighting for your freedom in Wakanda! <br/>Thanos has a new super power! <br/>\#Name: Thanos <br/>\#\#Health: 1400.00// Energy: 200// Intelligence: 100.00 <br/>\#\#\#Evilness: 7.00 <br/>\#\#\#\#Titan Attack Power: 921.00 <br/>Batman is fighting for your freedom in New_York! <br/>Anti Heroes won the battle of New_York! <br/>\#Name: Thanos <br/>\#\#Health: 1400.00// Energy: 200// Intelligence: 100.00 <br/>\#\#\#Evilness: 7.00 <br/>\#\#\#\#Titan Attack Power: 921.00 <br/>Energy is not in the correct range! <br/>Thanos and his colleagues are trying to take over Wakanda! <br/>Loki is ready for destruction! <br/>Loki and his colleagues are trying to take over Wakanda! <br/>@Infinity_Gauntlet@ already assigned! <br/>Black_Panter is ready for battle! <br/>Black_Panter is fighting for your freedom in Wakanda! <br/>Green_Lanter is ready for battle! <br/>Green_Lanter is fighting for your freedom in Wakanda! <br/>Anti Heroes won the battle of Wakanda! <br/>Thanos used his super powers! <br/>\#Name: Thanos <br/>\#\#Health: 156.43// Energy: 239// Intelligence: 100.00 <br/>\#\#\#Evilness: 7.00 <br/>\#\#\#\#Titan Attack Power: 1038.00 <br/>WE ARE DOOMED! <br/>        |
| REGISTER_HERO Chuck_Noris MarvelHero -12 230 23 23 <br/>REGISTER_ANTI_HERO Lex_Luthor Villain 20 300.50 40.72 9.32 <br/>REGISTER_ANTI_HERO Red_Skull Villain 34 130 9 5 <br/>REGISTER_ANTI_HERO BIBO Titan 12 234 100 3 <br/>REGISTER_HERO SAMUEL_LEE_JACKSON MarvelHero 29 329 1 9 <br/>BUILD_ARENA Sevastopol 4 <br/>BUILD_ARENA Moon 1 <br/>SEND_ANTI_HERO Sevastopol Lex_Luthor <br/>BUILD_ARENA Moon 1 <br/>REGISTER_HERO Bunny DCHero 96 900 31 21.3 <br/>SEND_HERO Moon Bunny <br/>SEND_HERO Sevastopol Bunny <br/>COMICS_WAR Moon <br/>CHECK_CHARACTER Bunny <br/>SEND_HERO Sevastopol Bunny <br/>SEND_ANTI_HERO Sevastopol Red_Skull  <br/>SEND_ANTI_HERO Sevastopol BIBO <br/>COMICS_WAR Sevastopol <br/>WAR_IS_OVER                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Energy is not in the correct range!<br/>Lex_Luthor is ready for destruction!<br/>Red_Skull is ready for destruction!<br/>BIBO is ready for destruction!<br/>Comic Character name is not in the correct format!<br/>Sevastopol is becoming a fighting ground!<br/>Moon is becoming a fighting ground!<br/>Lex_Luthor and his colleagues are trying to take over Sevastopol!<br/>A battle is about to start there!<br/>Bunny is ready for battle!<br/>Bunny is fighting for your freedom in Moon!<br/>Bunny is fighting!<br/>Heroes won the battle of Moon!<br/>\#Name: Bunny<br/>\#\#Health: 900.00// Energy: 96// Intelligence: 31.00<br/>\#\#\#Heroism: 21.30<br/>\#\#\#\#DC Attack Power: 116.30<br/>Bunny is fighting for your freedom in Sevastopol!<br/>Red_Skull and his colleagues are trying to take over Sevastopol!<br/>BIBO and his colleagues are trying to take over Sevastopol!<br/>Anti Heroes won the battle of Sevastopol!<br/>After 2 battles our FRIENDLY HEROES WON!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| REGISTER_HERO Bloop DCHero 20 300 20 30 <br/>SUPER_POWER @2a@ 23 <br/>SUPER_POWER power 20 <br/>SUPER_POWER @aa@ 30 <br/>SUPER_POWER @InteligencE@ 400 <br/>REGISTER_ANTI_HERO Stick_man Villain 2 3 4 5 <br/>BUILD_ARENA Atina 2 <br/>BUILD_ARENA Atina 5 <br/>BUILD_ARENA Bolivia 1 <br/>REGISTER_HERO Spider_man MarvelHero 20 140 10 30 <br/>SEND_HERO Bolivia Spider_man <br/>SEND_HERO Bolivia Bloop <br/>SEND_HERO Atina Bloop <br/>SEND_HERO Atina Spider_man <br/>COMICS_WAR Bolivia <br/>SEND_ANTI_HERO Atina Stick_man <br/>COMICS_WAR Atina <br/>WAR_IS_OVER                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          | Bloop is ready for battle!<br/>Super power name not in the correct format!<br/>Super power name not in the correct format!<br/>Super power name not in the correct format!<br/>@InteligencE@ added to pool!<br/>Stick_man is ready for destruction!<br/>Atina is becoming a fighting ground!<br/>A battle is about to start there!<br/>Bolivia is becoming a fighting ground!<br/>Spider_man is ready for battle!<br/>Spider_man is fighting for your freedom in Bolivia!<br/>Arena is full!<br/>Bloop is fighting for your freedom in Atina!<br/>Spider_man is fighting!<br/>Heroes won the battle of Bolivia!<br/>Stick_man and his colleagues are trying to take over Atina!<br/>Heroes won the battle of Atina!<br/>After 2 battles our FRIENDLY HEROES WON!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          |

<br/>

### Solution: <a title="THE WAR OF THE COMIC" href="">THE WAR OF THE COMIC</a>

---
