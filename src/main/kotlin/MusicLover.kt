package ru.netology

fun main() {
    print("Введите сумму: ")
    val amount = readln().toInt()
    val regularCustomer = true

    val discount = when {
        amount in 1001..10000 -> 100
        amount > 10000 -> (amount*0.05).toInt()
        else -> 0
    }

    var totalAmount = amount - discount

    if (regularCustomer) {
        totalAmount = (totalAmount * 0.99).toInt()
    }

    println("Итоговая стоимость покупки: $totalAmount руб.")
}