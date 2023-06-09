package com.constructionsupplystore.di


import com.constructionsupplystore.ui.viewmodel.ProductViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module { viewModel { ProductViewModel(get()) } }