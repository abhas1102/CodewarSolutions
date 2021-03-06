/*
There is a bus moving in the city, and it takes and drop some people in each bus stop.

You are provided with a list (or array) of integer pairs. Elements of each pair represent number of people get into bus (The first item) and number of people get off the bus (The second item) in a bus stop.

Your task is to return number of people who are still in the bus after the last bus station (after the last array). Even though it is the last bus stop, the bus is not empty and some people are still in the bus, and they are probably sleeping there :D

Take a look on the test cases.

Please keep in mind that the test cases ensure that the number of people in the bus is always >= 0. So the return integer can't be negative.

The second value in the first integer array is 0, since the bus is empty in the first bus stop.
 */

fun main(){
people(arrayOf(3 to 0,9 to 1,4 to 10,12 to 2,6 to 1,7 to 10))
}

fun people(busStops: Array<Pair<Int, Int>>) : Int {
    //code here
    var sum = 0
    var sum1 = 0
    for(pairs in busStops){
        sum = sum+pairs.first
        sum1 = sum1 + pairs.second
    }
    return sum-sum1
}