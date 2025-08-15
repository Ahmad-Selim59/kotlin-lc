fun main(){
    val set1_word1 = "anagram"
    val set1_word2 = "nagaram"

    val set2_word1 = "car"
    val set2_word2 = "rat"

    println(isValidAnagram(set1_word1, set1_word2))
    println(isValidAnagram(set2_word1, set2_word2))
}

fun isValidAnagram(word1: String, word2: String): Boolean{
    var map1 = mutableMapOf<Char, Int>()
    var map2 = mutableMapOf<Char, Int>()
    for(element in word1){
        map1[element] = map1.getOrDefault(element, 0) + 1
    }

    for(element in word2){
        map2[element] = map2.getOrDefault(element, 0) + 1
    }

    return map1 == map2
}