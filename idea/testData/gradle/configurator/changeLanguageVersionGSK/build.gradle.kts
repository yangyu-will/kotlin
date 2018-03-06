import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.1.1"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
   languageVersion = "1.0"
}