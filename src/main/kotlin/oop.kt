class Sturbon {
    //This is a data member
    private var wanafunzi: Int = 31

    //This is a member function
    fun calculate(): Int {
        return wanafunzi * wanafunzi
    }
}
class eMobilis{

    //data member
    var num:Int=6
    //  Member function
    fun Hesabu():Int{
        return num*num
    }
}

class Isaca{
    var num :Int=19
    fun Isaca():Int{
        return num+num
    }
}

fun main(args: Array<String>) {
    //this is an object

    val myobj=Sturbon()
    println(myobj.calculate())

    //create object
    val Objc=eMobilis()
    println(Objc.Hesabu())

    val myObj=Isaca()
    println(myObj.Isaca()
    )

}

