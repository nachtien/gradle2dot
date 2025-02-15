plugins {
    kotlin("jvm") version "2.1.10"
    application
}

group = "gradle2dot"
version = "1.0"

repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(21)
}

application {
    mainClass.set("MainKt")
}

// https://stackoverflow.com/a/23689696
application {
    applicationDefaultJvmArgs = listOf(System.getProperty("exec.args", ""))
}