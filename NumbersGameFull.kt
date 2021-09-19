import kotlin.random.Random

fun main() {
    val num = Random.nextInt(11)

    println("you have reached the first trail. THE NUMBERS GAME!! -easy mode-")
    println("to win, you have to guess the correct number I have already chosen!")
    println("TIP: the number is an integer from 0 to 10.")
    println("NOW!! WHAT IS YOUR GUESS?")
    var count = 0
    while (true) {
        try {
            var guess:String = readLine()!!
            //print("your guess is $guess")
            when{
                guess.equals("quit")  -> {
                    println("HAHAHAHAHA!! WHAT A LOSER!!")
                    break}
                guess!!.toInt() == num -> {
                    println("HMMPH!! YOU PASS, HUMAN!! *mutters: I thought they were all dumb!*")
                    break }
                guess!!.toInt() != num -> {
                    println("HOHOHO! as expected, you humans are dumb.")
                    println("I will give you a another chance!") }
            }
            count++
        } catch (e: Exception) {
            println("IDIOT HUMAN! I said number!!")
        }

        if(count == 3)
            break
    }
    println("THE FIRST TRAIL IS FINISHED!!")
}