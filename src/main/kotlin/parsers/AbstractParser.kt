package parsers

import java.io.FileReader
import com.opencsv.CSVReader



abstract class AbstractParser {
    var parserCsv = mapOf<String, String>()

    fun initData() {
        val pathToFile = loadResource(readFileName())
        val reader = CSVReader(FileReader(pathToFile), ';', '"', 1)

        parserCsv = parseCSVFromFile(reader)
    }

    fun loadResource(resource: String): String =
            try {
                object {}.javaClass.getResource(resource)
                        .path
            } catch (all: Exception) {
                throw RuntimeException("Failed to load resource=$resource!", all)
            }

    abstract fun readFileName(): String
    abstract  fun parseCSVFromFile(reader: CSVReader): Map<String, String>
}