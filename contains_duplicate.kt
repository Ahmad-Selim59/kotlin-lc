fun main(args: Array<String>) {
    val my_nums = arrayOf(1, 2, 1, 3)
    val my_nums2 = arrayOf(1, 2, 3, 4)
    println(contains_duplicate(my_nums))
    println(contains_duplicate(my_nums2))
}

fun contains_duplicate(numbers: Array<Int>): Boolean{
    var my_set = mutableSetOf<Int>()
    for(i in 0 until numbers.size){
        if(numbers[i] in my_set){
            return true
        }
        else{
            my_set.add(numbers[i])
        }
    }

    return false
}