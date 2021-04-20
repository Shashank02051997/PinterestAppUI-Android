package com.shashank.pinterestappui.ui.dashboard.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.shashank.pinterestappui.R
import com.shashank.pinterestappui.databinding.DashboardMainBinding

class DashboardActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var dataBind: DashboardMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBind = DataBindingUtil.setContentView(this, R.layout.dashboard_main)
        navController =
            Navigation.findNavController(this, R.id.nav_dashboard_host_fragment)
        dataBind.dashboardBottomNav.setupWithNavController(navController)
    }
}