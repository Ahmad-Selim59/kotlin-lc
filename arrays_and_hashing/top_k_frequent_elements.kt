fun main(){
    val nums = arrayOf(1,1,1,2,2,3)
    val frequency = 2
    println(top_k_frequent_elements(nums, frequency).contentToString())
}

fun top_k_frequent_elements(nums: Array<Int>, frequency: Int): IntArray{
    var seen = HashMap<Int, Int>()
    val freq = List(nums.size + 1) { mutableListOf<Int>() }

    for(number in nums){
        seen[number] = seen.getOrDefault(number, 0) + 1
    }

    for((num, count) in seen){
        freq[count].add(num)
    }

    val res = mutableListOf<Int>()

    for(i in freq.size -1 downTo 1){
        for(num in freq[i]){
            res.add(num)

            if(res.size == frequency){
                return res.toIntArray()
            }
        }
    }

    return res.toIntArray()
}