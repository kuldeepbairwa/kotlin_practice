fun main() {


//   fun1()
//   fun2()
//   fun3()
   fun4()


}

fun fun1() {


    //data type conversion
    val number = 20
    val numberDouble = number.toDouble()

    println(number)
    println(numberDouble)
}


fun fun2() {

    //functions on variables
    val num1 = 10
    val num2 = 30
    val result = num1.plus(num2)

    print(result)

}


fun fun3(){
    //string operation
    val firstName  = "kuldeep"
    val lastName = "Bairwa"
    val fullName = "$firstName $lastName"
    print(fullName)
}


fun fun4(){
    //new line on triple quotes

    var random = """ldkjsf
        |dfjhdj
        |sdlfkjhslkh
        |dfjshkjh
    """.trimMargin()

    print(random)

}

