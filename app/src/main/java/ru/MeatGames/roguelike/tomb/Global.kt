package ru.MeatGames.roguelike.tomb

import ru.MeatGames.roguelike.tomb.db.ItemDB
import ru.MeatGames.roguelike.tomb.db.MobDB
import ru.MeatGames.roguelike.tomb.db.StatsDB
import ru.MeatGames.roguelike.tomb.db.TileDB
import ru.MeatGames.roguelike.tomb.model.HeroClass
import ru.MeatGames.roguelike.tomb.model.MapClass
import ru.MeatGames.roguelike.tomb.screen.GameScreen
import ru.MeatGames.roguelike.tomb.screen.MainMenu
import ru.MeatGames.roguelike.tomb.util.AssetHelper

object Global {

    lateinit var game: Game
    var hero: HeroClass? = null
    var mapg: MapGenerationClass? = null
    lateinit var mapview: GameScreen
    lateinit var mmview: MainMenu
    var map: Array<Array<MapClass>>? = null
    // temporary most of the tiles is null, use carefully
    lateinit var tiles: Array<TileDB> // 0 element is opaque
    lateinit var itemDB: Array<ItemDB>
    lateinit var mobDB: Array<MobDB>
    lateinit var stats: Array<StatsDB>
    lateinit var mAssetHelper: AssetHelper

}