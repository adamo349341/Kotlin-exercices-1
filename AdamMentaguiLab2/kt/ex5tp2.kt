//defining the higher-order function
fun operate(a:Int,b:Int,op:(Int,Int)->Int)=op(a,b)

fun main(){
    //defining  lambdas for operators
    val add = {x:Int,y:Int->x+y}
    val subs = {x:Int,y:Int->x-y}
    val mult = {x:Int,y:Int->x-y*x}
    val div = {x:Int,y:Int->x/y}
    //inserting the two numbers by the user
    print("enter the first element:\n")
    val x = readln()!!.toInt()
    print("enter the second element:\n")
    val y = readln()!!.toInt()
    //selecting the operation
    print("enter the operation(+,-,*,/):\n")
    val operation = readlnOrNull()
    //defines the result based on the operation selected by the user
    when (operation) {
        "+"-> println("result of addition: $x + $y = ${operate(x,y,add)}")
        "-"-> println("result of substraction: $x - $y = ${operate(x,y,subs)}")
        "*"-> println("result of multiplication: $x * $y = ${operate(x,y,mult)}")
        "/"-> println("result of division: $x / $y = ${operate(x,y,div)}")
        else -> println("Invalid operation")
    }
}