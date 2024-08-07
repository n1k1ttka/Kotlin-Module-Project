class Menu(
    override var name: String,
    var list: MutableList<Archive> = mutableListOf(Archive("Выход"), Archive("Создать архив")),
    ): Screen {

    val navigator: Navigator
        get() = Navigator()
    override fun show() {
        while (true) {
            println("Список архивов:")
            for ((index, element) in list.withIndex()) println("$index. ${element.name}")
            when(val go = navigator.navigate(list.size)){
                0 -> break
                1 -> list = navigator.create(Archive(), list)
                in 2 until list.size -> list[go].show()
                else -> println("Введите номер пункта из предложенных")
            }
        }
    }

//    override fun create(spisok: MutableList<Archive>) {
//        var name = ""
//        while (name == "") {
//            println("Введите имя архива")
//            name = readln()
//        }
//        list.add(Archive(name))
//        println("Элемент создан")
//    }
}