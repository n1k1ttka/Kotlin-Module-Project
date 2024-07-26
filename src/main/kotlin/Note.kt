class Note( override val name: String,
            val list: MutableList<String> = mutableListOf("Выход", "Создать запись")
    ): Screen {

    override fun show() {
        while (true) {
            println("Список записей:")
            for ((index, element) in list.withIndex()) println("$index. $element")
            when(navigator.navigate(list.size)){
                0 -> break
                1 -> create()
                in 2..Int.MAX_VALUE -> println("Функции удаления в разработке :D")
                else -> println("Введите номер пункта из предложенных")
            }
        }
    }
    override fun create() {
        var text = ""
        while (text == "") {
            println("Введите запись (Пустые строки не допускаются):")
            text = readln()
        }
        println("Запись добавлена")
        list.add(text)
    }
}
