fun main(args: Array<String>) {
    //this is a mutable variable
    var name="John"
    name="Alex"
    var num=56
    var num1=67



    println(name)
    println("My name is $name")
    println("The product is" + " " + num*num1)
    println("The coefficient is "+" "+ num1/num)
    println("The sum is "+ " " + num+num1)


    //This is an immutable variable
    val school="eMobilis"
    println("My school is $school")

    val mynum=67+45
    println(mynum)

    val myNumber="67+56"
    println(myNumber)

    //a binary variable that can have only two possible values false or true.
    val myBoolean= true
    println(myBoolean)

    var age:Int
    age=18
    println(age)

    var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of the txt string is: " + txt.length )

    var txt1 = "aeiou"
    println(txt1.uppercase())
    println(txt1.reversed())

    var txt2 = "Hello World"
    var txt3 = "My name is Lindah"
    println(txt2.compareTo(txt3))
}