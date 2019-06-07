# Biotics (Remastered)

## Networking



### Biotic Behavior JSON Structure

The structure uses two keys, ```IF``` and ```THEN```, the values of the keys are arrays.

AND statements are separated by spaces in the same string

OR statements are separated by using different strings

Each ```If``` element corresponds to a ```then``` element, except the last element of the ```then``` array, which runs if everything fails.
#### Example
```
{
"IF" : ["NOBIOTICNEARBY HUNGRY","BIOTICNEARBY"],
"THEN" : ["SEARCHFOOD","ATTACK","WANDER"]
}
```
If there is ```No Biotics Nearby``` and is ```HUNGRY``` then it will ```Search For Food```

Else if there are 	```Biotics Nearby```, than it will ```ATTACK```

else the biotic will ```WANDER```

---
### Biotic Send Request Headers


Requires 2 headers, with ```IF``` and ```THEN``` as keys.

The value of if and then represents the array in the JSON structure, with seperation of strings represented as spaces, and spaces as underscores (_).

#### Example
The same example in Biotic Behavior JSON Structure
```
REQUEST HEADERS:
	IF: "NOBIOTICNEARBY_HUNGRY BIOTICNEARBY"
	THEN: "SEARCHFOOD ATTACK WANDER"
```
