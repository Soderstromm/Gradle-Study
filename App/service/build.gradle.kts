plugins {
    id("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":db"))
}