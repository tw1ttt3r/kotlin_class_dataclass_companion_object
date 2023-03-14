fun main() {
    val scaryMovie = Movie("Scary Movie", "Comedy", 88.27)

    println(scaryMovie)

    scaryMovie.createdAt = "2000"
    println(scaryMovie.createdAt)

    // destructuration
    val ( name, genero, duration ) = scaryMovie
    println("$name, $genero, $duration")
}

data class Movie (
    val name: String,
    val genre: String,
    val duration: Double
) {
    var createdAt = "x"
}