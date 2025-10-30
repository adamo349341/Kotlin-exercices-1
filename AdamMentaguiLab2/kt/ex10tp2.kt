
//creating function which fetch values safely
fun readConfig(key:String, cfg:Map<String,Any?>):Any?=cfg[key]

fun main(){
    //creating the map list
    val config = mapOf("secureMode" to true, "maxLoginAttempts" to 3, "timeout" to null)
    //adding as? in order to safely cast Any? to correct the type for each one (including the null ones)
    val secureMode: Boolean = (readConfig("secureMode", config) as? Boolean) ?: false
    val timeout = config["timeout"] as? Int ?: 3
    val maxAttempts: Int = (readConfig("maxLoginAttempts", config) as? Int) ?: 30
    //printing results in a formatted way (table)
    println(String.format("%-20s | %-15s", "Config Key", "Resolved Value"))
    println("-".repeat(38))
    println(String.format("%-20s | %-15s", "secureMode", secureMode))
    println(String.format("%-20s | %-15s", "maxLoginAttempts", maxAttempts))
    println(String.format("%-20s | %-15s", "timeout", timeout))

}