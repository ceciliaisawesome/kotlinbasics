class Student(val name:String, var gender:String, val age:Int){

}

fun main(args: Array<String>) {
//    this is an object
    val myobj=Student("Cess","Female", 18)
    val obj=Student("Trevor", "Male", 19)
    val objc=Student("Nicole", "Female", 17)
    println("My name is ${myobj.name} and I'm a ${myobj.gender} of ${myobj.age} years old")
    println("Name is ${obj.name} and is a ${obj.gender} of ${obj.age} years old")
    println("Cecilia's friend is ${objc.name} and is a ${objc.gender} of ${objc.age} years old")
}