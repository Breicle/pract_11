enum class Week{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    fun isWeekend() = if (this == SATURDAY || this == SUNDAY) "Да" else "Нет" // Проверка на выходный
    fun nextDay() = values()[(ordinal + 1) % values().size] // Вывод следующего дня
    fun isWorkDay() = if (isWeekend() != "Да") "Да" else "Нет" // Проверка на рабочие дни
    fun dayNumber() = ordinal + 1 // день недели
}