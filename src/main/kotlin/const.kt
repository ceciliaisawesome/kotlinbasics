fun main(args: Array<String>) {
    val obj=School("eMobilis", 2001)

}
class School{
    constructor(name:String, year:Int){
        println("School name : ${name.toUpperCase()}")
        println("School year : ${year}")
    }
}