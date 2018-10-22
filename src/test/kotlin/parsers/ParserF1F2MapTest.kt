package parsers

import org.junit.jupiter.api.Test

class ParserF1F2MapTest {
    @Test
     fun name() {

        val parser = ParserF1F2Map()
        parser.initData()

        for (entry in parser.parserCsv) {
            println("${entry.key} = ${entry.value}")
        }
    }
}