class Avatar(var location: Position) : BoardItem {
    override val icon: Icon = Icon.GAME_CHARACTER

    var totalPoints: Int = 0
}

data class Position(var x: Int, var y: Int)