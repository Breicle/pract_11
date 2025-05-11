enum class Order {
    NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED;

    fun isActive() = if (this == NEW || this == PROCESSING) "Да" else "Нет" // Проверка активный заказ или нет
    fun isFinished() = if (this == DELIVERED || this == CANCELLED) "Да" else "Нет" // Проверка завершен заказ или нет
    fun canCancel() = if (this != DELIVERED && this != CANCELLED) "Да" else "Нет" // Проверка можно ли отменить заказ или нет
    fun nextStatus() = if (ordinal < values().size - 1) values()[ordinal + 1] else null // Вывод следующего статуса
}