class Students{
//    data member
    var num1:Int=48
    var num2:Int=2

//    member function
    fun Calculate():Int{
        return num1/num2

    }
}

fun main(args: Array<String>) {
//    create object
    val obj=Students()
    println(obj.Calculate())
}