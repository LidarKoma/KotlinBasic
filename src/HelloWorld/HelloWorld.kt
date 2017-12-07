package HelloWorld

fun main(args: Array<String>) {
    println("Hello, Lidar!")
    var person = people()
    person.name ="Lidar"
    //using concatenation
    println("The Name is : " + person.name)
    //or like this.. $ with brackets
    println("The Name is : ${person.name}")
}