package prospect.configuracao.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api/v1/tipos-oferta")
class TipoOfertaController {

    @Get
    fun getAll() : List<String> {
        return listOf("Item 1", "Item 2", "Itam 3")
    }
}