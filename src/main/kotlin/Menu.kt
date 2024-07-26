class Menu(override val name: String): Screen {

    val list = mutableListOf(Archive("Выход"), Archive("Создать архив"))

    override fun show() {
        while (true) {
            println("Список архивов:")
            for ((index, element) in list.withIndex()) println("$index. ${element.name}")
            when(val go = navigator.navigate(list.size)){
                0 -> break
                1 -> create()
                in 2..Int.MAX_VALUE -> list[go].show()
                else -> println("Введите номер пункта из предложенных")
            }
        }
    }

    override fun create() {
        var name = ""
        while (name == "") {
            println("Введите имя архива")
            name = readln()
        }
        list.add(Archive(name))
        println("Элемент создан")
    }

}