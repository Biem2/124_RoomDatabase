package com.example.a124_roomdatabase.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.a124_roomdatabase.repositori.AplikasiSiswa
import com.example.a124_roomdatabase.viewmodel.EntryViewModel
import com.example.a124_roomdatabase.viewmodel.HomeViewModel

object PenyediaViewModel {

    val Factory = viewModelFactory{
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositorySiswa)
        }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositorySiswa)
        }
    }
}

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa =
    (this[ViewModelProvider.AndroidViewModelFactory
        .APPLICATION_KEY] as AplikasiSiswa)