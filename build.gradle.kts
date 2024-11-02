plugins {
    kotlin("jvm") version "2.0.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.javatuples:javatuples:1.2")
    implementation("com.google.protobuf:protobuf-java:3.25.5")
    implementation(files("libs/krpc-java-0.5.4.jar"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}