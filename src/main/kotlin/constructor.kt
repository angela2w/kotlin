class Students(val name:String,var gender:String,val age:Int){

}

fun main(args: Array<String>) {
    //this is an object
    val myobj=Students("Angela","Female",19)
    val myobj1=Students("Ann","Female",23)
    val myobj2=Students("Sam","male",28)
    val myobj3=Students("Alex","male",36)
    val myobj4=Students("Annette","Female",42)
    val myobj5=Students("Hilary","male",44)


    println("Student name is ${myobj.name} and she is a ${myobj.gender} of ${myobj.age} years in age.")
    println("Student name is ${myobj1.name} and she is a ${myobj1.gender} of ${myobj1.age} years in age.")
    println("Student name is ${myobj2.name} and he is a ${myobj2.gender} of ${myobj2.age} years in age.")
    println("Student name is ${myobj3.name} and he is a ${myobj3.gender} of ${myobj3.age} years in age.")
    println("Student name is ${myobj4.name} and she is a ${myobj4.gender} of ${myobj4.age} years in age.")
    println("Student name is ${myobj5.name} and he is a ${myobj5.gender} of ${myobj5.age} years in age.")
}