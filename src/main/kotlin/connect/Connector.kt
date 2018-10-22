package connect

import parsers.ManagerF

class  Connector {
    private val manager = ManagerF()

    fun whoIsIn(city: String) {
        val connections = arrayListOf("f2",  "F1F2Map", "f1")

        val text = "In city $city are"

        val cityId = manager.getParserCsv(connections[0]).filterValues { it == city}.keys.iterator().next()
        val enemyId = manager.getParserCsv(connections[1]).filterKeys{ it == cityId}.values.iterator().next()
        val enemy = manager.getParserCsv(connections[2]).filterKeys { it == enemyId }.values.iterator().next()

        println("$text $enemy")

    }

    fun whereAre(enemies: String) {
        val connections =  arrayListOf("f1",  "F1F2Map", "f2")

        val text = "Enemies $enemies are in"

        val enemiesId = manager.getParserCsv(connections[0]).filterValues { it == enemies}.keys.iterator().next()
        val cityId = manager.getParserCsv(connections[1]).filterValues{ it == enemiesId}.keys.iterator().next()
        val city = manager.getParserCsv(connections[2]).filterKeys { it == cityId}.values.iterator().next()

        println("$text $city")
    }
}