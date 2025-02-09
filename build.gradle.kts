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
    implementation("com.formdev:flatlaf:3.4")
    implementation("com.formdev:flatlaf-extras:3.4")
    implementation("com.miglayout:miglayout-swing:11.3")
    testImplementation("com.formdev:flatlaf-fonts-roboto:2.137")
}