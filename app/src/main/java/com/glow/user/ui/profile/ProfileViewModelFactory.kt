package com.android.fade.ui.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.glow.user.ui.profile.ProfileViewModel

class ProfileViewModelFactory(private val profileRepository: ProfileRepository) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProfileViewModel(profileRepository) as T
    }

}
