package com.example.tvm.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.example.tvm.base.activity.BaseActivity
import com.example.tvm.ui.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setSupportActionBar(binding.toolbar)

        navController = Navigation.findNavController(this, R.id.mainNavHost)

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.destMain))

        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp()
    }

}
