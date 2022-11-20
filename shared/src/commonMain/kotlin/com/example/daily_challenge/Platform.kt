package com.example.daily_challenge

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform