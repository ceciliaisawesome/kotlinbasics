class Committee(val name:String, var gender:String, var job:String){

}

fun main(args: Array<String>) {
//    this is an object
    val myobj=Committee("Cecilia", "Female", "Chairlady")
    println("Her name is ${myobj.name} and is a ${myobj.gender} and she is the ${myobj.job} of this committee")
}