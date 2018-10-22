package parsers

import org.junit.jupiter.api.Test

class ParseF2Test {
    @Test
    fun name() {

        val parser = ParseF2()
        parser.initData()

        for (entry in parser.parserCsv) {
            println("${entry.key} = ${entry.value}")
        }
    }
}