package ru.netology

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Мы решили дать пользователям нашей социальной сети возможность отправлять друг другу денежные переводы.
    // Система будет удерживать комиссию 0.75 %, при этом минимальная комиссия составит 35 рублей.
    //
    //Напишите небольшую программу, которая будет высчитывать размер этой комиссии в зависимости от суммы перевода.

    val amount: Int = 100
    val commission = 0.075
    val minCommission = 35

    println(
        "Размер комиссии при сумме перевода $amount рублей: " +
                (if (amount * commission < minCommission) minCommission else amount * commission) + " рублей"
    )
}