# Biotics (Remastered)

## Game
### Triggers and Actions
#### Triggers

IF IS (COLOR/STRONG/WEAK/NEAR/FOOD)
	
IF Hungry/ReadyToReproduce/LOWHP

IF ALWAYS

#### Actions

KILL - Uses 3 

SPLIT - Splits your food and births a new biotic

FOLLOW - Follows Selected Biotic

RUNAWAY - Moves away from Selected Biotic, 

WANDER - Randomly Moves around

DIE  - Kills yourself

CONTROL - Copies over your DNA to the target Biotic

COLLECT - COLLECTS NEARBY FOOD


## Networking



### Biotic Behavior JSON Structure

The structure uses two keys, ```IF``` and ```THEN```, the values of the keys are arrays.

AND statements are separated by spaces in the same string

OR statements are separated by using different strings

Each ```If``` element corresponds to a ```then``` element, except the last element of the ```then``` array, which runs if everything fails.
#### Example
```
{
"IF" : ["NOBIOTICNEARBY HUNGRY","BIOTICNEARBY IS:BLUE"],
"THEN" : ["SEARCHFOOD","ATTACK","WANDER"]
}
```
If there is ```No Biotics Nearby``` and is ```HUNGRY``` then it will ```Search For Food```

Else if there are 	```Biotics Nearby``` and if any of them are ```blue```, than it will ```ATTACK``` the ```BLUE``` biotic.

else the biotic will ```WANDER```

---
### Biotic Send Request Headers


Requires 2 headers, with ```IF``` and ```THEN``` as keys.

The value of if and then represents the array in the JSON structure, with seperation of strings represented as spaces, and spaces as underscores (_).

#### Example
The same example in Biotic Behavior JSON Structure


REQUEST HEADERS:
	IF: ``` "NOBIOTICNEARBY_HUNGRY BIOTICNEARBY"```
	THEN: ```"SEARCHFOOD ATTACK WANDER"```

