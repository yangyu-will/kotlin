import org.jetbrains.kotlin.gradle.dsl.Coroutines

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.1.1"
}

kotlin {
    experimental.coroutines = Coroutines.ERROR
}