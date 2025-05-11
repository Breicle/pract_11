/*fun main(){
    println("--- Дни недели ---")
    for (day in Week.values()) {
        println("${day.name} номер: ${day.dayNumber()}, выходной: ${day.isWeekend()}")
    }

    println("\n--- Цвета ---")
    for (color in Color.values()){
        println("${color.name} - RGB ${color.rgb}, Красный: ${color.isRed()}")
    }

    println("\n--- Статусы заказа ---")
    for (status in Order.values()){
        println("${status.name} - активен: ${status.isActive()}, можно отменить: ${status.canCancel()}")
    }

    println("\n--- Статусы пиццы ---")
    for (status in PizzaStatus.values()) {
        println("${status.name} - готовится: ${status.isCooking()}, готово: ${status.isReady()}")
    }
}*/





fun main(){
    println("--- Дни недели ---")
    for (day in Week.values()) {
        println("${day.name} (номер ${day.dayNumber()})")
        println("Выходной: ${day.isWeekend()}")
        println("Рабочий день: ${day.isWorkDay()}")
        println("Следующий день: ${day.nextDay().name}")
    }

    println("\n--- Цвета ---")
    for (color in Color.values()){
        println("${color.name}  (RGB ${color.rgb})")
        println("Красный: ${color.isRed()}")
        println("Зеленый: ${color.isGreen()}")
        println("Синий: ${color.isBlue()}")
        println("Желтый: ${color.isYellow()}")
    }

    println("\n--- Статусы заказа ---")
    for (status in Order.values()){
        println(status.name)
        println("Активен: ${status.isActive()}")
        println("Завершен: ${status.isFinished()}")
        println("Можно отменить: ${status.canCancel()}")
        println("Следющий статус: ${status.nextStatus()}")
    }

    println("\n--- Статусы пиццы ---")
    for (status in PizzaStatus.values()) {
        println(status.name)
        println("В процессе готовки: ${status.isCooking()}")
        println("Готово: ${status.isReady()}")
        println("Только заказано: ${status.isOrdered()}")
        println("Следющий этап: ${status.nextStep()}")
    }
}
