//---------------------------------------------------------------------------------------------------------------------
//      List

// Creating a list
L = [1, 2, 3, 4, 5]
L[2]                    // Get value at index
L.get(2)                // Get value at index

// Nested list
L2 = [1, 2, 3, 'Alex', [4, 5, 6]]
L2[4][1]                            // Get value from nested list

// Size of list
L3 = [1, 2, 3]
L3.size()
L3.isEmpty()

// Append to list
L4 = [1, 2, 3]
L4.add('d')     // append to the right
L4 << 'm'       // append to the right

// Pop from list
L12 = [1, 2, 3]
L12.pop()

// concatenate two lists
L5 = [1, 2]
L6 = L5 + [8, 9]

// remove elements of one list from another
L7 = [1, 2, 3, 4, 5]
L7 - [3, 5]

// Slicing a list
L8 = ['zero', 'one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight']
L8[0, 2, 4, 6]              // includes values at specified indexes
L8[0..2, 4, 6..-1]          // 0..2 means range (inclusive)

// Reverse - Make reversed copy
L9 = [1, 2, 3]
L10 = L9.reverse()

// Sort - In place
L11 = [5, 1, 4, 2, 3]
L11.sort()


//----------------------------------------------------------------------------------------------------------------------
//      Map

// Creating a map
M1 = ['name' : 'Paul', 'age' : '35', 'fav_numbers' : [1, 2, 3]]
M1 = [
        'name' : 'Paul',
        'age' : '35',
        'fav_numbers' : [1, 2, 3]
]

// Getting a value
M1['name']
M1.get('fav_numbers')

// Adding new value
M1['language'] = 'english'
M1.put(7, 'Seven')

// Contains key
M1.containsKey('age')

// Size
M1.size()
M1.isEmpty()

// Passing map as parameter without parenthesis
def func5(Map map) {
    for (item in map)
        println(item.key + " " + item.value)
}
func5 'cat': 'meow', 'dog': 'bark'

//----------------------------------------------------------------------------------------------------------------------
//      Range

// Create range
R1 = 1..10;
aToZ = 'a'..'z';

// Size
R1.size()

// Index or slice
R1[0]
R1[0..3]

// Contains
R1.contains(3)

// First and last element
R1.getFrom()
R1.getTo()

//----------------------------------------------------------------------------------------------------------------------




