package com.apps.tilak.theme.samples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatDelegate
import com.apps.tilak.theme.samples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val  TAG = "MainActivity"

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnDarkTheme.setOnClickListener {
            Log.d(TAG, "dark theme button click ")
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        }

        binding.btnLightTheme.setOnClickListener {
            Log.d(TAG, "Light theme button click ")
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }
    }
}