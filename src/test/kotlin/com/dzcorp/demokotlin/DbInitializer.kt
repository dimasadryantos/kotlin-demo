package com.dzcorp.demokotlin

import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext

internal class DbInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {
    override fun initialize(applicationContext: ConfigurableApplicationContext) {
        println("INIT========")
    }
}