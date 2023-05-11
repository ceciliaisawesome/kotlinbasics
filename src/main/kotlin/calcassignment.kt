fun main(args: Array<String>) {
    print("Enter first number :")
    val num1= readln() . toDouble()

    print("Enter second number :")
    val num2 = readln(). toDouble()

    print("Enter operator(*,-,+,/)")
    val op= readln()
    val majibu= when(op){
        "/" +
                "" -> num1/num2

        else ->{
            println("Invalid operator")
            0.0
        }
    }
    println("results = $majibu")
}