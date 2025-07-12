plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("com.codeborne:selenide:7.9.3")
    testImplementation("org.testng:testng:7.10.2")
    testImplementation("io.qameta.allure:allure-selenide:2.29.1")
    testImplementation("io.qameta.allure:allure-testng:2.29.1")
}

tasks.test {
    useTestNG {
        suites("src/test/resources/testng.xml")
    }
}