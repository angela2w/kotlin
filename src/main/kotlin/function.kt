import java.time.temporal.TemporalAmount
import kotlin.math.sqrt

fun angela(){
    println("This is a customised user defined function")
}

fun Hesabu(){
    val num=6
    val num1=8
    println("The sum of $num and $num1 is ${num1+num}")
}

fun main(args: Array<String>) {
    angela()
    Hesabu()
    println(sqrt(25.9))
    myfunction("Angela","Njeri" ,20)
    myfunction("Kerry","Thuita" ,25)
    myfunction("Aaliyah","Kila" ,15)
    myfunction("Cynthia","Liz" ,30)
    myfunction1("Doctor", 1000000)
    myfunction1("Nurse", 600000)
    myfunction1("Sergon", 6000000)
    myfunction1("Police", 60000)
}

fun myfunction(fname:String,lname:String,age:Int){
    println("My name is $fname $lname and I am $age years ")

}

fun myfunction1(wname:String,amount:Int){
    println("I work as a $wname earning $amount")
}