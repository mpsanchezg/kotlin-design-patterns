package abstract_factory

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

interface DataSource

class DatabaseDataSource : DataSource

class NetworkDataSource : DataSource

abstract class DataSourceFactory {
    abstract fun makeDataSource() : DataSource

    companion object {
        inline fun <reified T: DataSource> createFactory(): DataSourceFactory =
            when(T::class) {
                DatabaseDataSource::class -> DatabaseFactory()
                NetworkDataSource::class -> NetworkFactory()
                else -> throw IllegalArgumentException()
            }

    }
}

class NetworkFactory : DataSourceFactory() {
    override fun makeDataSource(): DataSource = NetworkDataSource()
}

class DatabaseFactory : DataSourceFactory() {
    override fun makeDataSource(): DataSource = DatabaseDataSource()
}

class AbstractFactoryTest {
    @Test
    fun abstractFactoryTest() {
        val datasourceFactory: DataSourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource: DataSource = datasourceFactory.makeDataSource()
        println("Create datasource: $dataSource")

        Assertions.assertThat((dataSource)).isInstanceOf(DatabaseDataSource::class.java)

    }
}
