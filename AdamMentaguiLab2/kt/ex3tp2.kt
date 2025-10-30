fun main() {
    //initializing counters
    var count1 = 0
    var count2 = 0
    var count3 = 0
    //asking the user to input the sentence
    print("enter your sentence:\n")
    val str = readlnOrNull()?.lowercase() ?: ""
    //loop which counts digits, spaces and vowels on the sentence
    for (ch in str) {
        if (ch.isDigit()) {
            count1 += 1
        } else if (ch in "aeiou") {
            count2 +=1
        } else if (ch == ' '){
            count3 +=1
        } else{
            continue
        }
    }
    //prints the amount of vowels,digits and spaces
    print("digit counts :$count1.vowel counts : $count2.space counts: $count3\n")
    //checks if admin exists on that sentence,if yes then it warns the user then reverses the word and then prints the new sentence
    if ("admin" in str.lowercase() ) {
        val rev = "admin".reversed()
        val newStr = str.replace("admin", rev, ignoreCase = true)
        print("warning message \n")
        println("the new sentence : $newStr")
    }

}