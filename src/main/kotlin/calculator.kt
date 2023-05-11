fun main(args: Array<String>) {
    println("Welcome to the calculator")

    //Get the input from the user
    print("Enter the first number:")
    val num1= readln()!!.toDouble()

    print("Enter an operator(+,-,*,/ ):")
    val operator= readln()!!

    print("Enter second number:")
    val num2= readln()!!.toDouble()

    //perform the operation based on the operator entered
    val result=when(operator){
        "+"->num1+num2
        "-"->num1-num2
        "*"->num1*num2
        "/"->num1/num2
        else->{
            println("Invalid operator entered.Please try again")
        }
    }

    //Output the result to the user
    println("The result is $result")
}