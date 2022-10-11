fun main() {
//    print(greet(name = "lalit"))        //string "lalit" will be passed for name which is the second parameter

    print(add(10,20))               //calls function add() for addition



}

fun greet(greet: String = "hey", name: String = "Kuldeep"): String {         //default value is "hey" and "kuldeep"


    return "$greet $name"
}




//single statement function

fun add(num1:Int,num2:Int) = num1.plus(num2)