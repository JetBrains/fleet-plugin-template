package fleet.sample.workspace

import com.jetbrains.rhizomedb.Entrypoint
import fleet.kernel.ChangeScope
import fleet.kernel.saga
import fleet.sample.common.SampleSharedEntity
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

@Entrypoint
fun ChangeScope.entry() {
    shared {
        new(SampleSharedEntity::class) {
            name = "example"
        }
    }

    // using ktor
    kernel.saga {
        HttpClient(CIO).use { client ->
            val response: HttpResponse = client.get("https://ktor.io/")
            println("KTOR response: " + response.status)
        }
    }
}

