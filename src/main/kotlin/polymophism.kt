//parent/super class
open class Shapes{
    open fun draw(){
        println("Drawing Shape")
    }
}
//child class/sub class
class Circle:Shapes() {
    override fun draw() {
        println("Drawing Circle")
    }
}
class Square:Shapes(){
    override fun draw() {
        println("Drawing Square")
    }

}
class Triangle:Shapes(){
    override fun draw() {
        println("Drawing Triangle")
    }

}

fun main(args: Array<String>) {
    val shapes:Array<Shapes> = arrayOf(Circle(), Square(), Triangle())
    for (shape in shapes){
        shape.draw()

    }
}