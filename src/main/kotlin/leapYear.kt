fun main(){

isLeapYear(2000)

}
fun isLeapYear(year: Int) = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)

