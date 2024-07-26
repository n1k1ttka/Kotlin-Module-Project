class Archive(override val name: String): Screen {

    val list = mutableListOf(Note("Выход"), Note("Создать заметку"))

    override fun show() {
        while (true) {
            println("Список заметок:")
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
        var text = ""
        while (name == "") {
            println("Введите имя заметки")
            name = readln()
            println("Введите текст заметки")
            text = readln()
        }
        val member = Note(name)
        member.list.add(text)
        list.add(member)
        println("Элемент создан")
    }

}