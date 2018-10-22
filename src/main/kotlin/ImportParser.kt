import com.opencsv.CSVReader

class ImportParser(val m: MutableMap<String, String>) {

    fun parse(csvReader: CSVReader) = csvReader.readAll().associateByTo(m, { it[0]} , { it[1] })
}
