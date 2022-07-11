package com.glow.user.ui.get_started_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.android.fade.ui.get_started.GetStartedActivity
import com.glow.user.databinding.ActivityGetStartedNewBinding

class GetStartedNewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGetStartedNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityGetStartedNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.relGetStarted.setOnClickListener {
            startActivity(Intent(this, GetStartedActivity::class.java))
        }
    }
}