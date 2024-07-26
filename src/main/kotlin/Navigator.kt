class Navigator {

    fun navigate(size: Int): Int{
        val input = readlnOrNull()
        try {
            val _check = input.toString().toInt()
            when (_check) {
                0 -> return 0
                1 -> return 1
                in 2..Int.MAX_VALUE -> if (_check < size ) return _check
            }
        } catch (e: Exception) {
            println("Ошибка! Для выбора необходимо ввести номер требуемого пункта!")
        }
        return -1
    }
}
