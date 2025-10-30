fun main(){
    //asking the user to input the integers so they could be added to our array
    print("enter intenger:\n")
    val arr = Array(5) { readlnOrNull()?.toIntOrNull() ?: 0 }
    //calculate the sum,max and min of the array
    val sum = arr.sum()
    val max = arr.maxOrNull()
    val min = arr.minOrNull()
    println("sum = $sum")
    println("max = $max")
    println("min = $min")
    print("ask for the number to search on tha array:")
    //declaring a boolean to confirm the verification, the other one is the integer to get checked
    var found = false
    val jack  = readlnOrNull()?.toIntOrNull() ?: 0
    //loop for in order to search the desired integer
    for (i in arr.indices){
        //condition that verifies if this integers exists and prints its index
        if (jack == arr[i]){
            println("found the searched number, here is the index: $i")
            found = true
            break
        }
    }
    //condition in case of the integer doesnt exist
    if (!found){
        print("the number doesn't exist.")}

}