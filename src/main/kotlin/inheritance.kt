open class wazazi{
    val mama="She likes coooking"
    val baba="He likes watching football"
}
class boy:wazazi(){
    fun mvulana(){
        println(baba)
    }
}
class girl:wazazi(){
    fun msichana(){
        println(mama)
    }
}

fun main(args: Array<String>) {
    val kijanaobject=boy()
    kijanaobject.mvulana()

    val msichanaobject=girl()
    msichanaobject.msichana()
}