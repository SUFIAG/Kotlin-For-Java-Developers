package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    val secretArray = secret.toMutableList()
    val guessArray = guess.toMutableList()
    var secretCopy = secret
    var guessCopy = guess
    for (index in guess.indices) {
        if (guessCopy[index] == secretCopy[index]) {
            rightPosition++
        } else if (guessCopy[index] != secretCopy[index] && guessCopy[index] in secretArray) {
            wrongPosition++
        }
    }
    return Evaluation(rightPosition, wrongPosition)
}
