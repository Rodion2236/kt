package ru.netology

fun main() {
    print("Введите кол-во лайков: ")
    val likes = readln().toInt()

    val lastNumber = likes % 10
    val lastTwoNumbers = likes % 100

    val word = when {
        lastNumber == 1 -> "человеку"
        lastNumber in 2..4 -> "людям"
        lastTwoNumbers in 11..14 -> "людям"
        else -> "людям"
    }

    println("Понравилось $likes $word")
}