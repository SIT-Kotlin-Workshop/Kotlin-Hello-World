plugins {
    kotlin("jvm") version "2.1.20"
}

group = "schwarz.it.kotlin.workshop"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}
