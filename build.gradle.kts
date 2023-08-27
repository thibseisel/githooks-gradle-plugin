plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spotless)
}

group = "io.github.thibseisel"

version = "1.0.0"

repositories { mavenCentral() }

kotlin { jvmToolchain(8) }

spotless {
    kotlin { ktfmt().kotlinlangStyle() }

    kotlinGradle { ktfmt().kotlinlangStyle() }

    format("misc") {
        target("**/*.toml", "**/*.properties")
        endWithNewline()
        trimTrailingWhitespace()
    }
}
