open class Wazazi{
    val mama="She likes cooking"
    val baba="He likes watching Manchester City"

}
class boy:Wazazi(){
    fun mvulana(){
        println(baba)
    }

}
class girl:Wazazi(){
    fun msichana(){
        println(mama)
    }

}

fun main(args: Array<String>) {
    val kijanaobj=boy()
    kijanaobj.mvulana()
    val fobjc=girl()
    fobjc.msichana()
}                                