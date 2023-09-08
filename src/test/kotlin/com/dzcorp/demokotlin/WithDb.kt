package com.dzcorp.demokotlin

import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@ContextConfiguration(initializers = [DbInitializer::class])
@ActiveProfiles("test")
annotation class WithDb {
}