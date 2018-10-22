package parsers

import org.junit.jupiter.api.Test

class ParseF1Test {
    @Test
    fun name() {

        val parser = ParseF1()
        parser.initData()

        for (entry in parser.parserCsv) {
            println("${entry.key} = ${entry.value}")
        }
    }
}