interface Screen {

    val name: String
    val navigator: Navigator
        get() = Navigator()
    fun create()
    fun show()

}
