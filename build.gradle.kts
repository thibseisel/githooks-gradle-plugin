plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
}

group = "io.github.thibseisel"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(8)
}