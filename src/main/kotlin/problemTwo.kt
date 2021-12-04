fun main(){
/* Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.

Square all numbers k (0 <= k <= n) between 0 and n.

Count the numbers of digits d used in the writing of all the k**2.

Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count. */
    print(nbDig(11,1))
   /* var d = 1.toChar()
    var sum = 0
    var listOfSquaredNumber = mutableListOf<String>()
    for(i in 0..6){
        listOfSquaredNumber.add ((i*i).toString())
    }
    for(j in listOfSquaredNumber) {
        if (j.contains(d)) {
            for (k in j) {
                if (k == d) {
                    sum += 1
                }else{
                    continue
                }
            }
        } else{
            continue
        }

    }
    print(sum) */


}
fun nbDig(n:Int, d:Int):Int =
    (0..n).map{ (it * it) }.sumBy { it.toString().count{ it == d.toString()[0] } }