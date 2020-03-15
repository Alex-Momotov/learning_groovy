//----------------------------------------------------------------------------------------------------------------------
//      Methods

class Basics2 {
    public static void main(String[] args) {
        method();
        println(sumAll(1, 2, 3));
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
        return num1 + num2;
    }

    static def sumAll(int... nums) {
        def sum = 0;
        nums.each {sum += it;}
        return sum;
    }

}

//----------------------------------------------------------------------------------------------------------------------
//      Methods outside a class
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
    3;
    5;
}
n = method3();

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

// When calling a method with one or more arguments you can omit parenthesis
def func3(num1, num2) {
    println("sum is ${num1 + num2}")
}
func3 1, 2


//----------------------------------------------------------------------------------------------------------------------
//      Closures
// Closure are like lambda expressions in Java, but don't need to implement an interface and return type is dynamic

// Simple closure
def myFunc = {x -> x + 5};
myFunc(1);

// Use keyword 'it' to refer to closure argument
def func = {it + 2}
func 2

// Use keyword 'call' to refer to the closure itself (recursion)
def factorial = {num -> num == 1 ? 1 : num * call(num - 1)};
factorial(4);

//----------------------------------------------------------------------------------------------------------------------
//      Closure (function) as parameter


//

def func(Closure cl) {
    for (val in cl.properties)
        println(" $val.key :$val.value ")
}
func {
    group = 'com.nexmo'
    version = '1.0.4'
}


// Normal param followed by closure param
def processList(list, Closure cl) {
    result = []
    for (item in list)
        result.add(cl(item))
    return result
}
L3 = processList(['a', 'b', 'c'], {it.toUpperCase()})
L4 = processList(['a', 'b', 'c']) {it.toUpperCase()}

//----------------------------------------------------------------------------------------------------------------------






L = [1, 2, 3]
sum = 0
L.each {sum += it;}

L1 = [1, 2, 3]
L2 = []
L1.collect(L2) {it + 2}
