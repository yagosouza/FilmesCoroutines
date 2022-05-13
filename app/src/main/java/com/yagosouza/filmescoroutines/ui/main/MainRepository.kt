package com.yagosouza.filmescoroutines.ui.main

class MainRepository {

    fun getFilmes(callback: (filmes: List<Filme>) -> Unit) {
        Thread(Runnable {
            Thread.sleep(3000)
            callback.invoke(
                listOf(
                    Filme(1, "Titulo 1"),
                    Filme(2, "Titulo 2")
                )
            )
        }).start()
    }
}