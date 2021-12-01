fun main(){
   print(maxMultiple(2,7))
}

fun maxMultiple(d: Int, b: Int): Int {
    // your code here
    var a = listOf<Int>()
    for(i in 1..b){
        if(i%d==0){
            a+=i
        }
    }
    var e = a.maxOrNull() ?: 0
    return e
}