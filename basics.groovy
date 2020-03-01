// Execute Groovy script:
// groovy basics.groovy

// Just like java code can be in main()
// But it can also be outside classes like Python script

class GroovyBasics {

    public static void main(String[] args) {

        // Printing
        println("Hello world");
        System.out.println("Hello world");
        printf("Hello %s \n", 'world');

        // Embedding values
        def catSound = "meow"
        println("Cat says $catSound");          // Can only embed to double quote strings
        println("Cat says ${catSound}");
        println("Cat says ${'Meow'}");
        println('Cat says ${catSound}');        // Can't embed with single quotes


        // Variables - dynamically typed
        def localVar = 30;      // Declaring new variable
        localVar = 30;          // Assigning value to it


        // Math
        1 + 2           // Addition
        1 - 1           // Substraction
        2 * 2           // Multiplication
        5 / 2           // Division
        5.intdiv(2)     // Integer division
        5 % 4           // Modulus

        // Floating point math
        1.2 + 0.2       // Addition
        1.2 - 0.2       // Substraction
        1.2 * 0.2       // Multiplication
        1.2 / 1.4       // Division

        // Increment
        def num = 1;
        num++;
        ++num;

        // Decrement
        num--;
        --num;

        // Math functions
        Math.abs(-2.45);
        Math.round(2.49);
        Math.min(2, 3);
        Math.max(2, 3);

        // Random
        new Random().nextInt() % 10

        // Strings
        def val = 13
        def name = 'Alex ${val}'    // single quote - taken literally
        def name2 = "Alex ${val}"   // double quote - can embed values
        def name3 = "Alex $val"     // both $var or ${var} work
        def multiline = ''' some
        multiline string''';        // tripple quote - multiline string


        // String length
        def b = "abcd"
        b.length()

        // String equality
        "Alex" == 'Alex'
        "Alex".equals('Alex')

        // Comparing strings (Alphabetically)
        "Ant" <=> "Banana"  // -1 means left str comes before right str
        "Ant" <=> "Anna"    // 1 means right str comes before left str
        "Ant" <=> "Ant"     // 0 means two strings are equal

        // String slicing
        def make = "0123456789"
        make[0]                 // Character at index
        make[-1]                // Last character
        make[0..2]              // Slice of string (inclusive)
        make[0..2, 3..5]        // Two slices joined together
        make[0..2, 4]           // Slice followed by char at position
        make[0, 2, 4, 6..8, 9]
        make[2..-1]             // Slice of index 2 up until the end of string
        make.indexOf('w')       // Index of character

        // String concatenation
        def n = '123' + "321"
        def n2 = '123'.concat("321")
        def n3 = 'Abc' * 5

        // String - remove substring
        def b2 = "What is your name?"
        b2 - "What is "

        // String - split
        def b3 = "How are you, Maggie?"
        b3.split()          // Split by space
        b3.split(',')       // Split by ','

        // String - Replace all
        def b4 = "A n B n C"
        b4.replaceAll('n', '+')

    }

}





