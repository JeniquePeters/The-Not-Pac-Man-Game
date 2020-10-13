interface BoardItem {
    val icon: Icon
    val canWalkOn: Boolean
        get() = false
}