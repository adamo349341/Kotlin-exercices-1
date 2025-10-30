
//defining the sanitize function as method
fun String.sanitize() = this.trim().lowercase()
//create the inline higher-order function that gives the time of the sanitization
inline fun measure(block:()->Unit){
    val start=System.nanoTime()
    block()
    println("Took ${(System.nanoTime()-start)/1_000_000} ms")
}
fun main() {
    //declaring forbidden words and the sentence
    val str = "ROOT IS THE ONLY ONE THAT PERMITS ACCESS TO THE KERNEL."
    val forb1 = "admin"
    val forb2 = "root"
    //defining the lambda function
    val contains: (String, String) -> Boolean = { text, word ->
        word.sanitize() in text.sanitize().split(" ")
    }
    //calling measure to print the result of sanitization and the confirms if a forbidden word exists in the sentence
    measure {
        print("our new sentence: ${str.sanitize()}\n")
        if (contains(str, forb1)) {
            print("there is a forbidden word in the sentence($forb1)\n")
        }
        else if (contains(str, forb2)) {
            print("there is a forbidden word in the sentence($forb2)\n")
        }

    }
}