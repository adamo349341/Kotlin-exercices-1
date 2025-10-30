fun main(){
    //intializing the important variables
     var score = 0
     val scores= mutableListOf<Int>()
    //open the while loop in order to insert scores
    while(true){
        //input for scores
        print("enter the score between 0 and 100 (-1 to exit):")
        val input  = readlnOrNull()
        score = input?.toIntOrNull() ?: 0
        //in case if the user wanted to exit
        if (score ==-1)break
        //in case if the user inserted out of the range
        if (score < 0 || score > 100){
            print("out of the range,retry.")
            continue
        }
        //adds the scores to the scores list
        scores.add(score)
    }
    //declaring the avg varibales
    val avg = scores.average()
    //give the average of scores alongside the status
     when{
        avg in 90.0..100.0 -> println("Excellent : $avg ")
        avg in 70.0..89.0 -> println("Good : $avg ")
        avg in 50.0..69.0 -> println("Fair : $avg ")
        else -> println("Fail : $avg ")
    }
 }