fun main(args: Array<String>) {
    //for,if...else statements

    val mycars = arrayOf("Volvo", "BMW", "Mazda", "Ford")
    if ("Volvo" in mycars) {
        println("It exists!")
    } else {
        println("It does not exist")
    }

    val myclass = arrayOf("Angela", "Delain", "Dwaine", "Lakisha")
    if ("Esther" in myclass) {
        println("She made it back.")
    } else {
        println("She is not yet back!!")
    }

    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }

}
