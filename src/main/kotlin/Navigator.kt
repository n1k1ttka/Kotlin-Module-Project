class Navigator {

    fun navigate(size: Int): Int{
        val input = readlnOrNull()
        try {
            val _check = input.toString().toInt()
            when (_check) {
                0 -> return 0
                1 -> return 1
                in 2 until size -> return _check
            }
        } catch (e: Exception) {
            println("Ошибка! Для выбора необходимо ввести номер требуемого пункта!")
        }
        return -1
    }

    inline fun <reified T> create(member: T, spisok : MutableList<T>): MutableList<T> {
        when(member) {
            is Archive -> {
                var name = ""
                while (name.isBlank()) {
                    println("Введите имя архива")
                    name = readln()
                }
                member.name = name
                spisok.add(member)
                println("Элемент создан")
                return spisok
            }
            is Note -> {
                var name = ""
                var text = ""
                while (name.isBlank() || text.isBlank()) {
                    println("Введите имя заметки")
                    name = readln()
                    println("Введите текст заметки")
                    text = readln()
                }
                member.name = name
                member.list.add(text)
                spisok.add(member)
                println("Элемент создан")
                return spisok
            }
            else -> {
                println("Ошибка при создании элемента")
                return spisok
            }
        }
    }
}
