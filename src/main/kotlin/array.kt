fun main(args: Array<String>) {
    //used to store more than variables
    val mycars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println("My array size is : ${mycars.size}")
    println("My fav brand is ${mycars[0]}")
    mycars[2]="Mercedes Benz"
    println("My fav brand is ${mycars[2]}")

}