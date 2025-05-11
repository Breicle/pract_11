enum class PizzaStatus {
    ORDERED, COOKING, BAKING, READY, DELIVERED;

    fun isCooking() = if (this == COOKING || this == BAKING) "Да" else "Нет" // Проверка готовится ли пицца
    fun isReady() = if (this == READY || this == DELIVERED) "Да" else "Нет" // Проверка готова ли пицца
    fun isOrdered() = if (this == ORDERED) "Да" else "Нет" // Проверка только заказано или нет
    fun nextStep() = if (ordinal < values().size - 1) values()[ordinal + 1] else null // Вывод следующего статута
}