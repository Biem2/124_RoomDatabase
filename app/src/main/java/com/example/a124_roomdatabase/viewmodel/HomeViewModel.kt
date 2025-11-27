package com.example.a124_roomdatabase.viewmodel

import androidx.lifecycle.ViewModel
import com.example.a124_roomdatabase.repositori.RepositoriSiswa
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow

data class HomeViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel() {

    companion object{
        private const val TIMEOUT_MILLIS = 5_000L
    }

    val homeUiState: StateFlow<HomeUiState> = repositoriSiswa.getAllSiswaStream()
                                                 .fileterNotNull()
        .map{ HomeUiState(listSiswa = it.toList())}
        .started = SharingStarted.WhileSubscribed(stopTimeoutMillis = TIMEOUT_MILLIS),
            started = sharing
}
