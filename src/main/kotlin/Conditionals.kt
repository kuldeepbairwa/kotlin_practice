fun main() {
    var age: Int = 34

//    when_example(age)
//    assign_value_to_var(age)
elvisop()

}


fun when_example(age: Int) {

    when (age) {
        in 10..20 -> {
            print("kiddo")
        }
        in 21..30 -> {
            print("brother")
        }
        in 31..40 -> {
            print("mister")
        }
        else -> {                       //else is necessary with when statement
            print("yoo gramps")
        }
    }
}


fun assign_value_to_var(age: Int) {
    var type: String = if (age < 20) {    //same can be done with when statement
        "KID"
    } else if (age in 21..29) {
        "ADULT"
    } else {
        "old man"
    }

    print(type)
}

fun elvisop() {

    var name: String? = "kuldeep"
    println(name?.length)

    name = null

    //elvis operator

    val length = name?.length ?: 0
    print(length)
}