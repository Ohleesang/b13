

class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var sum = 0
        var temp = 0
        val arr = Array<Int>(num) { 0 }
        for(j in -1000 .. 1000) {
            for (i in 1..num) {
                temp = i+j
                sum += temp
                arr[i-1] = temp
            }
            if(sum==total) return arr.toIntArray()
            sum = 0

        }

        return answer
    }
}

fun main() {
    var a = Solution()
    a.solution(3, 12)//3,4,5
    a.solution(5, 15)//1,2,3,4,5
    a.solution(4,14)//2,3,4,5
    a.solution(5,5)//-1,0,1,2,3
}