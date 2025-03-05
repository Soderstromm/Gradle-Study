plugins {
    id("java")
}

group = "ru.netology.api"
version = "1.0-SNAPSHOT"

dependencies {
    implementation(project(":db"))
    implementation(project(":service"))
}