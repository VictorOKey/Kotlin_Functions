/*import kotlin.math.roundToInt
fun main() { //Округление чисел
    val num = readln()
    if(num.length >= 4)
    {
        var num2 = num.toFloat()
        num2 /= 1000
        println("${num2.roundToInt()}K")
    }
    else {
        println(num)
    }
}*/

fun main(){ // Правильное окончание для слов
    val num = readln().toInt()
    if (num > 0){
        if (num == 1)
        {
            println("${num} год")
        }
        else if (num in 2..4)
        {
            println("${num} года")
        }
        else if (num in 5..20)
        {
            println("${num} лет")
        }
    }
}
