//----------------------------------------------------------------------------------------------------------------------
// If else
if (true || false) {
    println('if')
} else if (true) {
    println('else if')
} else {
    println('else')
}

//----------------------------------------------------------------------------------------------------------------------
// Ternary operator
age = 20;
canVote = age >= 18 ? true : false

//----------------------------------------------------------------------------------------------------------------------
// While loop
i = 0;
while (i < 10)
    println(i++)

i = 0;
while (i < 10) {
    println(i++)
}

//----------------------------------------------------------------------------------------------------------------------
// For loop
for (i = 0; i < 10; ++i)
    println(i);


for (i = 0; i < 10; ++i) {
    println(i);
}

// Looping through list java style need to declare type of i
for (int i : [1, 2, 3])
    println(i)

// Looping through range
for (i in 0..10) {
    println(i);
}

// Looping through range - java style
for (int i : 0..10) {
    println(i);
}

// Looping through string
for (i in 'abcd') {
    println(i);
}

// Looping through list
for (num in [1, 2, 3]) {
    println(num);
}

// Looping through map
for (record in ['Jack': 12345, 'Amy': 54321, 'Alice': 182734]) {
    println("$record.key : $record.value");
}

//----------------------------------------------------------------------------------------------------------------------






