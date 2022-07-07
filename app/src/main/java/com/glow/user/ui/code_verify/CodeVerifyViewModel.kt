package com.android.fade.ui.code_verify

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.android.fade.network.Resource
import com.android.fade.ui.base.BaseViewModel
import com.android.fade.ui.profile.ProfileResponse
import kotlinx.coroutines.launch

class CodeVerifyViewModel constructor(private val repository: CodeVerifyRepository) :
    BaseViewModel(repository) {
    private val _loginResponse: MutableLiveData<Resource<ProfileResponse>> = MutableLiveData()
    val loginResponse: LiveData<Resource<ProfileResponse>>
        get() = _loginResponse

    suspend fun login(
        mobile: String
    ) = viewModelScope.launch {
        _loginResponse.value = Resource.Loading
        _loginResponse.value = repository.login(mobile)
    }
}