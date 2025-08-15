fun main(){
    val nums = arrayOf(2,7,11,15)
    val target = 9

    println(two_sum(nums, target).contentToString())
}

fun two_sum(numbers: Array<Int>, target: Int): Array<Int>{
    var seen = mutableSetOf<Int>()

    for(i in 0 until numbers.size){
        var cur_target = target - numbers[i]
        if(cur_target in seen){
            return arrayOf(numbers[i], cur_target)
        }
        else{
            seen.add(numbers[i])
        }
    }

    return arrayOf(0)
}