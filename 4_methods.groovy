import java.util.function.Function

//----------------------------------------------------------------------------------------------------------------------
//      Methods
// Optionally replace return type with 'def' to make return type dynamically typed

class Basics2 {
    public static void main(String[] args) {
        method()
        println(sumAll(1, 2, 3))
    }

    // Return value specified
    static void method() {
        println("method")
    }

    // def - return value dynamically typed
    static def method2() {
        println("method")
        return '123'
    }

    // default parameters
    static def addition(num1=0, num2=1) {
        return num1 + num2
    }

    static def sumAll(int... nums) {
        def sum = 0
        nums.each {sum += it}
        return sum
    }

}

//----------------------------------------------------------------------------------------------------------------------
//      Methods outside a class
// Optionally replace return type with 'def' to make return type dynamically typed

public static def method() {
    println('method')
}

def method2() {
    println('method2')
}

method()
method2()

//----------------------------------------------------------------------------------------------------------------------
//      Return keyword is optional

// The last statement in a method is returned automatically
def method3() {
    3
    5
}
n = method3()

//----------------------------------------------------------------------------------------------------------------------
//      Calling a method without parenthesis

// To call a method with no arguments, you must include parenthesis
def func1() {
    println('func1')
}
func1()

// When calling a method with one or more arguments you can omit parenthesis
def func2(num) {
    println("num is $num")
}
func2 1

def func3(num1, num2) {
    println("sum is ${num1 + num2}")
}
func3 1, 2

// Passing a map as parameter
def func4(Map m) {
    for (record in m)
        println("${record.key} -> ${record.value}")
}
func4 'cat' : 'meow', 'dog' : 'bark'

//----------------------------------------------------------------------------------------------------------------------
