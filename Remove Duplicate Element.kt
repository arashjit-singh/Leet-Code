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