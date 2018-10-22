package parsers

import com.opencsv.CSVReader


class ParseF2: AbstractParser() {
    override fun readFileName(): String  = "/f2.csv"

    override fun parseCSVFromFile(reader: CSVReader): Map<String, String> = reader.associate { it[0] to it[1] }

}