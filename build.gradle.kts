plugins {
    id("java")
}

group = "ru.netology.service"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    //testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("junit:junit:4.13")
}

tasks.test {
    useJUnit()
}