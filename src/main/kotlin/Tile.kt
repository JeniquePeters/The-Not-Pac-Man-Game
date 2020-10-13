object Tile : BoardItem {
    override val icon: Icon
        get() = Icon.TILE
    override val canWalkOn: Boolean
        get() = true
}