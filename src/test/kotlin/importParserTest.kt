import com.opencsv.CSVReader
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class ImportParserTest {

    @ParameterizedTest
    @ValueSource(strings = [
        "1;a, 2;b",
        "1;b, 2;c, 3;d",
        "1;c, 11;d"
    ])
    fun shouldFindOneElement(i: String) {
        val csvReader = mock(CSVReader::class.java)
        val arr = mapParametersToCsvResponse(i)
        val m = mutableMapOf<String, String>()

        `when`(csvReader.readAll()).thenReturn(arr)

        val ip = ImportParser(m)
        ip.parse(csvReader)

        Assertions.assertEquals(m.size, arr.size)

    }

    private fun mapParametersToCsvResponse(i: String) = i.split("\\s*,\\s*".toRegex())
            .map { it.split("\\s*;\\s*".toRegex()).toTypedArray() }

}