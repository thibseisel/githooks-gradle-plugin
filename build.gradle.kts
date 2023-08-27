plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.spotless)
}

group = "io.github.thibseisel"

version = "1.0.0"

repositories { mavenCentral() }

gradlePlugin {
    plugins {
        register("gitHooks") {
            id = "io.github.thibseisel.githooks"
            implementationClass = "io.github.thibseisel.githooks.GitHooksPlugin"
        }
    }
}

kotlin { jvmToolchain(11) }

spotless {
    kotlin { ktfmt().kotlinlangStyle() }

    kotlinGradle { ktfmt().kotlinlangStyle() }

    format("misc") {
        target("**/*.toml", "**/*.properties")
        endWithNewline()
        trimTrailingWhitespace()
    }
}
