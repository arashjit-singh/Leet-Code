fun main(args: Array<String>) {
    print(removeDuplicates(intArrayOf(0,1,2,2,3,0,4,2),2))
}

fun removeDuplicates(nums: IntArray,dup:Int): Int {
    var count = 0

    for(i in nums.indices){

        if(nums[i] != dup){
            nums[count] = nums[i]
            count++
        }

    }
    return count
}