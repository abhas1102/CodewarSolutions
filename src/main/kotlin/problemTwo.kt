fun main(){
    for(i in "121"){
        println(i::class.java.typeName)
    }
/* Take an integer n (n >= 0) and a digit d (0 <= d <= 9) as an integer.

Square all numbers k (0 <= k <= n) between 0 and n.

Count the numbers of digits d used in the writing of all the k**2. */

//Call nb_dig (or nbDig or ...) the function taking n and d as parameters and returning this count. */
  //  print(nbDig(11,1))
    var d = 0.toString()
    var sum = 0
    var arrayOfSquaredNumber = mutableListOf<String>()
    for(i in 0..5750){
        arrayOfSquaredNumber.add((i*i).toString())
    }
    for (j in arrayOfSquaredNumber){
        for (k in j){
            d.toCharArray().map { if (it == k) sum++ }
        }
    }
    print(sum)
}
//fun nbDig(n:Int, d:Int):Int =
 //   (0..n).map{ (it * it) }.sumBy { it.toString().count{ it == d.toString()[0] } }