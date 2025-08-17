fun main(){
    val words = arrayOf("eat","tea","tan","ate","nat","bat")
    println(group_anagrams(words))
}

fun group_anagrams(words: Array<String>): List<List<String>>{
    var res = HashMap<List<Int>, MutableList<String>>()

    for(word in words){
        var count = MutableList(26){0}
        for(char in word){
            count[char - 'a']++
        }
        res.getOrPut(count) {mutableListOf()}.add(word)
    }

    return res.values.toList()
}