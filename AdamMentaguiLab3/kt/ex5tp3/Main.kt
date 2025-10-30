//the same file exists on the same package as the library kotlin file
package  ex5tp3

fun main(){
    //visible since we are on the same package
    val book = Book("Kotlin Basics "," Mohammed Ali")
    //the output works fine from the class book , meaning the class got called
    println(book.title)
    println(book.author)
    //seems the private function cannot be called on another kotlin file, although it is on the same package.
    //secretfunction()(got to made this one as a comment because gives errors)

    //internal is visible on the package it is in.
    //as for private, it is visible only on the file that was declared on.
}