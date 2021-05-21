fun main() {
    println(getgreetings())
    eat()
    println(besties())
    saysheis("sandra","kelvin")
    sayhellow(a="jane",b="kelvin")//name arguments we use = (this is a name function)
    funny()
    beautiful()
//    var person=Person("")
//    person.firstName
//    person.lastName //property access syntax

}
 fun getgreetings():String {
     return "hello kotlin"
 }
fun eat(){
    println("meat and ugali")
}
fun besties()="i miss you so much guys"

fun saysheis(a:String,b:String) {
    var respond="hello $a and i am $b"
    println(respond)


}
fun sayhellow(a:String,b:String)= println("hello $a and also $b")

fun funny() {
    var intresting = arrayOf("kotlin", "develop", "javascript", "python")
    println(intresting.size)  //to find the function of an array.
    println(intresting[0])
    println(intresting.get(2))

    intresting.forEach {
        println(it)     //lambda function.
    }
intresting.forEach { intresting->
    println(intresting)             //lambda function.

}
intresting.forEachIndexed { index, intresting->
    println("$intresting is in index $index") //how lambda function is used to cheak a strings and there index
}
}
fun beautiful(){
    var things= mutableListOf("industrial","design","ui","ux","internet") //you must write the word mutable in order for the new word to be added
    things.add("navigeting") //you use the .add methode to add a new string or number
    things.forEach{thinks->
        println(thinks)
    }
    var map= mutableMapOf(254 to "kenya",256 to "uganda",255 to "tanzania",257 to "rwanda") // don't to write mutable
    map.put(258,"somalia") //we use .put methode to add a value in map collection type
    map.forEach{key,value->
        println("$key-> $value")

    }
}
//class Person( var firstName:String,var lastName:String){



















