/*
Given a positive integer n: 0 < n < 1e6, remove the last digit until you're left with a number that is a multiple of three.

Return n if the input is already a multiple of three, and return null/nil/None/-1 if no such number exists.
 */

fun main(){
   print(prevMultOfThree(1244))
}

fun prevMultOfThree(n: Int): Int? = when{
    n == 0 -> null
    n % 3 == 0 -> n
    else -> prevMultOfThree(n / 10)
}
