
fun main(args: Array<String>) {
    print('\n')
    print(getMaxOccuringCharacter("hello world"))
    print('\n')
    print(getMaxOccuringCharacter("aaaabbbbbgi"))
    print('\n')
    print(getMaxOccuringCharacter("aaabbb ccc"))
    print('\n')
    print(getMaxOccuringCharacter("aa bb bbbccc"))
    print('\n')
    print(getMaxOccuringCharacter("skjgbjbneg"))
    print('\n')
}

private fun getMaxOccuringCharacter(str: String): Char {
    var maxOccuringCharacter = str.first()
    val noOfOccurences = mutableMapOf<Char, Int>()
    str.forEach {
        val existingOccurences = noOfOccurences.getOrDefault(it, 0)
        noOfOccurences.put(it, existingOccurences+1)
        if(maxOccuringCharacter != it) {
            val maxoccurences = noOfOccurences.getOrDefault(maxOccuringCharacter, 0)
            if(existingOccurences+1 > maxoccurences) {
                maxOccuringCharacter = it
            }
        }
    }
    return maxOccuringCharacter
}