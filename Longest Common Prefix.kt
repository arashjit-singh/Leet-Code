fun getLargestCommonPrefix(strs: Array<String>):String {
    strs.sort()
    var first = strs[0]
    var second = strs[strs.size-1]
    var result = ""

    for (i in first.indices){
        while(first[i] == second[i])
            result += first[i]
    }

    return result
}