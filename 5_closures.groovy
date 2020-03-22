//----------------------------------------------------------------------------------------------------------------------
//      Reminder Java lambdas
// Function<String, Integer> f = s -> s.length();
// Function<String, Integer> f = (String s) -> s.length();          lambda args can optionally be in parenthesis is 1 arg
// Function<..... > f = (String s, Integer n) -> s * n;
// Function<..... > f = (String s, Integer n) -> {return s * n};    lambda body can optionally be in curly braces in 1 statement

//----------------------------------------------------------------------------------------------------------------------
//      Closure Theory
// Closure are like lambda expressions in Java, but don't need to implement an interface and return type is dynamic

//----------------------------------------------------------------------------------------------------------------------
//      Simple closure
// Unlike in Java both args and lambda body are included in curly braces {}
def printWelcome = {
    println "Welcome to Closures!"
}
printWelcome()

//----------------------------------------------------------------------------------------------------------------------
//      Simple closure 2
// Result of last line is returned automatically
def myFunc = {x ->
    x.length()
}
myFunc("blabla")

//----------------------------------------------------------------------------------------------------------------------
//      'It' keyword
// Use keyword 'it' to refer to single closure parameter. Only works with one parameter.
def func = {it + 2}
func 2

//----------------------------------------------------------------------------------------------------------------------
//      Closure with body
def my_division = {a, b ->
    def rem = 0
    def whole = 0
    while (a > b) {
        whole += 1
        a -= b
    }
    rem = a
    return [whole, rem]
}
my_division(34, 5)

//----------------------------------------------------------------------------------------------------------------------
//      Typed parameters
def func2 = {String a, int b ->
    a * b
}
func2("123 ", 3)

//----------------------------------------------------------------------------------------------------------------------
//      Clusure class
// Closures are instances of Clusure class
def f = {x -> x.length()}
f instanceof Closure

//----------------------------------------------------------------------------------------------------------------------
//      Return type
// Optionally, you can specify the return type of the closure by using the generic type of Closure
Closure<Boolean> cl = {it + 5}

//----------------------------------------------------------------------------------------------------------------------
//      call()
// Can call a clusure using .call()
def cl1 = {it + 5}
cl1.call(5)

// Lambda recursion - Use keyword 'call' to refer to the closure itself
def factorial = {num -> num == 1 ? 1 : num * call(num - 1)}
factorial(4)

//----------------------------------------------------------------------------------------------------------------------
//      Varargs
def sum = {int... nums ->
    def total = 0
    for (i in nums) total += i
    total
}
sum(1, 2, 3)

//----------------------------------------------------------------------------------------------------------------------
//      Closure as parameter
def func(Closure cl) {
    for (val in cl.properties)
        println(" $val.key :$val.value ")
}
func {
    group = 'com.nexmo'
    version = '1.0.4'
}

//----------------------------------------------------------------------------------------------------------------------
//      Normal param followed by closure param
def processList(list, Closure cl) {
    result = []
    for (item in list)
        result.add(cl(item))
    return result
}
L3 = processList(['a', 'b', 'c'], {it.toUpperCase()})
L4 = processList(['a', 'b', 'c']) {it.toUpperCase()}

//----------------------------------------------------------------------------------------------------------------------
//      Nested closures
def timed = {function ->
    def inner = {
        before = System.currentTimeMillis();
        function()
        println "Function finished in ${System.currentTimeMillis() - before}"
    }
    return inner
}
time_sleep = timed {
    Thread.sleep(1000)
}
time_sleep()

//----------------------------------------------------------------------------------------------------------------------
//      Closure vs method
// Method
def formatToLowerCase(name) {
    return name.toLowerCase()
}

// Closure
def formatToLowerCaseClosure = { name ->
    return name.toLowerCase()
}

//----------------------------------------------------------------------------------------------------------------------
//      Closures in strings
// Normally, embedded str value is captured and the resulting string will not be changed if the captured var is changed.
name = "Nicola"
greeting = "Welcome ${name}!"

name = "Divya"
greeting

// The syntax ${-> varName} evaluates the embedded variable's value each time before evaluating the string itself.
name = "Yuliia"
greeting2 = "Welcome ${-> name}"

name = "Yannick"
greeting2

//----------------------------------------------------------------------------------------------------------------------
//      Closures in collections

// each(Closure cl)
// Performs an operation on each element
def L = [1, 2, 3, 4, 5, 6]
L.each {println it}

// findAll(Closure cl)
// Returns a subset of collection, conforming to a given predicate
def L2 = [1, 2, 3, 4, 5, 6]
L2.findAll {it instanceof Integer && it % 2 == 0}

// collect(Closure cl)
// Transforms each element
def L3 = [1, 2, 3, 4, 5, 6]
L4 = L3.collect {it * 2}


//----------------------------------------------------------------------------------------------------------------------

