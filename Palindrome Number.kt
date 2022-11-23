fun isPalindrome(x: Int): Boolean {
    var num = 0
    var y = x
    if(Math.abs(x) !=x)
        return false
    else{
        while(y > 0){
            num = (num * 10) + y%10
            y = y/10
        }
    }
    println(num)
    return num == x
}


fun main(args: Array<String>) {
    println(isPalindrome(121))
}