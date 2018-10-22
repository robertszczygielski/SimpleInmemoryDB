package parsers

import org.junit.jupiter.api.Test

class  ManagerFTest {
    @Test
    fun name() {
        val menagerF = ManagerF()

        val aa = menagerF.getParserCsv("f1")

        for (entry in aa) {
            println("${entry.key} == ${entry.value}")
        }
        val bb = menagerF.getParserCsv("f2")

        for (entry in bb) {
            println("${entry.key} == ${entry.value}")
        }
        val cc = menagerF.getParserCsv("F1F2Map")

        for (entry in cc) {
            println("${entry.key} == ${entry.value}")
        }
    }
}