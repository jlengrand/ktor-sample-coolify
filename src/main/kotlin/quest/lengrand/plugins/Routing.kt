package quest.lengrand.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }

        get("/user/{name}"){
            call.respondText("Hello ${call.parameters["name"]}!")
        }

        get("/mood/{mood}"){
            call.respondText("Are you feeling ${call.parameters["mood"]}?")
        }
    }
}
