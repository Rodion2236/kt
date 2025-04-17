package ru.netology

fun main() {
    print("Введите сумму перевода в рублях: ")
    val amount = readln().toDouble() // Считываем сумму перевода

    var commission = amount * 0.0075 // Рассчитываем комиссию 0.75%

    if (commission < 35) {
        commission = 35.0 // Минимальная комиссия 35 рублей
    }

    println("Размер комиссии: ${"%.2f".format(commission)} рублей")
}