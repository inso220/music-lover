package ru.netology

fun main () {
    val discountFirst = 100.00 // скидка от суммы 1001
    val discountFirstStart = 1001.00
    val discountSecond = 0.05 // скидка от суммы 10001
    val discountSecondStart = 10001.00

    val monthlyCustomer = true // покупаетль делает покупки каждый месяц
    val customerDiscount = 0.01 // доп. скидка постоянному покупателю

    val totalPrice = 1200.00 // сумма покупки

    val sum = if (totalPrice < discountFirstStart) totalPrice
    else if (totalPrice > discountFirstStart && totalPrice < discountSecondStart)
        totalPrice - discountFirst
    else totalPrice - totalPrice * discountSecond // расчет скидки в зависимости от суммы покупки

    val finalSum = if (monthlyCustomer == true) sum - sum * customerDiscount else sum // расчет дополнительной скидки, если покупатель постоянный

    println(finalSum)


}

