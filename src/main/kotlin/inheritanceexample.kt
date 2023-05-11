open class Animal(colour:String, age:Int){
    init {
        println("Color is : $colour")
        println("Age is : $age")
    }
}
class dog (colour: String, age: Int):Animal(colour, age){
    fun woof() {
        println("Dog makes sound of woof")
    }
}

class cat (colour: String, age: Int): Animal(colour, age){
    fun meow() {
        println("Cat makes sound of meow")
    }
}
class horse(colour: String, age: Int): Animal(colour, age){
    fun neigh() {
        println("Horse makes sound of neigh")
    }
}
class lion(colour: String, age: Int):Animal(colour, age){
    fun roars(){
        println("A lion roars")
    }
}

fun main(args: Array<String>) {
    val d=dog("black", 23)
    d.woof()
    val c=cat("white",3)
    c.meow()
    val h=horse("grey", 7)
    h.neigh()
    val l=lion("brown", 20)
    l.roars()
}
