plugins {
    java
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

group = "org.tera201"
version = "1.1.2-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(libs.bundles.flatlaf)
    testImplementation(libs.flatlaf.fronts)
    implementation(libs.miglayout)
}