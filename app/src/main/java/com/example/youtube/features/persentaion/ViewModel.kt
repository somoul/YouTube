package com.example.youtube.features.persentaion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.youtube.features.data.repository.Repository
import kotlinx.coroutines.launch

class ViewModel(
    val repository: Repository
) : ViewModel() {
    init {
      viewModelScope.launch {
          repository.getData()
      }

    }
}