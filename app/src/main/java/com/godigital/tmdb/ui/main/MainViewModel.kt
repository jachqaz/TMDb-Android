package com.godigital.tmdb.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.godigital.tmdb.domain.model.Movie
import com.godigital.tmdb.domain.usecase.MainUseCase
import com.godigital.tmdb.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val mainUseCase: MainUseCase) : BaseViewModel() {
    var liveDataMovie = MutableLiveData<List<Movie>?>()
    fun getMovies() {
        viewModelScope.launch {
            liveDataMovie.value = mainUseCase.getMovies()
        }
    }
}
