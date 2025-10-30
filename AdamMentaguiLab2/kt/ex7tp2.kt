fun main(){
    //declaring list of granted credentials,black list and an iteration as attempts
    val users = mapOf("admin" to "1234", "guest" to "guest")
    val blackList = mutableSetOf<String>()
    var i = 3
    //while loop that runs the program
    while(i>0){
        //getting usernames and passwords from the user
        print("enter your username:\n")
        val username = readln()
        print("enter your password:\n")
        val password = readln()
        //condition verifies if the entered username and password dont match to the correct credentials,then it would reduce attempts and blacklists the entered username
        if(!users.containsKey(username) && !users.containsValue(password)){
            blackList.add(username)
            i-=1
            println("credentials are incorrect,$i remain\n")
        }
        //checks if the entries match to the credentials
        else{
            println("credentials are correct,your permission are granted.\n")
            break
        }

    }
    //prints the blacklisted usernames
    println("blacklisted usernames:$blackList")
}