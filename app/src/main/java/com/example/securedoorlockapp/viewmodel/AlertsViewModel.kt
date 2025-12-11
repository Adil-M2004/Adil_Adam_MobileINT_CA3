package com.example.securedoorlockapp.viewmodel

import androidx.lifecycle.ViewModel

class AlertsViewModel : ViewModel() {
    private val _alerts = listOf(
        "Door forced open at 12:41 PM",
        "Multiple failed unlock attempts",
        "Door left open for over 2 minutes"
    )

    val alerts: List<String>
        get() = _alerts
}