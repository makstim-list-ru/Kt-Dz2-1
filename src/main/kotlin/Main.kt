package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val amount: Int = 1000
    val commission = 0.075

    println("Размер комиссии при сумме перевода $amount рублей: " + (amount * commission) + " рублей")
}