open class Animal(colour:String,age:Int){
    init {
        println("Colour is:$colour")
        println("Age is :$age")
    }
}

class Dog(colour:String,age: Int):Animal(colour,age){
    fun woof(){
        println("Dogs make the sound woof")
    }
}
class Cat(colour: String,age: Int):Animal(colour,age){
    fun meow(){
        println("Cat makes the sound meow")
    }
}

fun main(args: Array<String>) {
    val d=Dog("Black",4)
    d.woof()
}