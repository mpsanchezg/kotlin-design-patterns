import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

sealed class Country {
    object  Canada: Country()
}

object Spain : Country()
class Greece(val someProperty: String) : Country()
data class USA(val someProperty: String) : Country()

class Currency (val code: String)

object CurrencyFactory {
    fun currencyForCountryFor(country: Country) : Currency? =
        when(country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is Country.Canada -> Currency("CAD")
            is USA -> Currency("USD")
            else -> {null}
        }
}

class FactoryMethodTest {
    @Test
    fun currencyTest() {
        val greekCurrency = CurrencyFactory.currencyForCountryFor(Greece(""))?.code
        println("Greek currency: $greekCurrency")

        val usaCurrency = CurrencyFactory.currencyForCountryFor(USA(""))?.code
        println("USA currency: $usaCurrency")

        Assertions.assertThat(greekCurrency).isEqualTo("EUR")
        Assertions.assertThat(usaCurrency).isEqualTo("USD")
    }
}