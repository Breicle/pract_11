enum class Color(val rgb: String) {
    RED("FF0000"), GREEN("00FF00"), BLUE("0000FF"), YELLOW("FFFF00");

    fun isRed() = if (this == RED) "Да" else "Нет"  // Красный цвет или нет
    fun isGreen() = if (this == GREEN) "Да" else "Нет" // Зеленый цвет или нет
    fun isBlue() = if (this == BLUE) "Да" else "Нет" // Синий цвет или нет
    fun isYellow() = if (this == YELLOW) "Да" else "Нет" // Желтый цвет или нет
}