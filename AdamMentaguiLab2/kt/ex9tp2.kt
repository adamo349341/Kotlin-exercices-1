//defining a higher-order function that prints logins dynamically
fun printSummary(counts: Map<String, Int>, formatter: (String, Int) -> String) {
    for ((key, value) in counts) {
        println(formatter(key, value))
    }
}
fun main(){
    //Declaring the log list
    val logs = listOf("user1:LOGIN_OK", "guest:LOGIN_FAIL")
    //seperating usernames and status
    val grouped = logs.groupBy { it.substringAfter(":").split("_")[1] }
    println("users with their status:\n $grouped")
    //counting successful and failed logins
    val map: Map<String,Int> = grouped.mapValues { it.value.size } .mapKeys { (key, _) -> if (key == "OK") "SUCCESS" else key }
    //calling the higher-order function
    printSummary(map) { key, value -> "$key logins: $value" }
}