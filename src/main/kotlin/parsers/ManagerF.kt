package parsers

class ManagerF()  {
    val q = mutableMapOf<String, AbstractParser>()

    init {
        q["f1"] = ParseF1()
        q["f2"] = ParseF2()
        q["F1F2Map"] = ParserF1F2Map()

        q.forEach {(k, v) -> v.initData()}

    }

    fun getParserCsv(name: String):  Map<String, String> = q[name]!!.parserCsv
}