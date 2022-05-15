package com.yagosouza.filmescoroutines.di

import androidx.navigation.NavController
import com.yagosouza.filmescoroutines.ui.main.MainRepository
import com.yagosouza.filmescoroutines.ui.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {

    factory {
        MainRepository()
    }
    //single { MainRepository() } //Caso tenha necessidade de acesso em vários lugares

//    viewModel { (navController: NavController) ->
    viewModel {
        MainViewModel(
            repository = get()
//            navController = navController
        )
    }
}