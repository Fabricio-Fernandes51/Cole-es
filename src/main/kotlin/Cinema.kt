class Cinema(
    private val nome: String,
    private val horarioDeAbrimento: Byte,
    private val hrarioDeFechamento:Byte
){
    private var assentos = mutableListOf<Assento>()
    private var filmes = mutableListOf<Filme>()

    fun adicionarNovoFilme(filme: Filme): Boolean = filmes.add(filme)

    fun listarTodosOsFilmes() = filmes

    fun cadastrarAssento(assento: Assento): Boolean = assentos.add(assento)

    fun listarAssentos() = assentos

}