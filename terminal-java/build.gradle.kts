plugins {
    id("terminal.kotlin")
    id("terminal.publish")
}

dependencies {
    api(project(":terminal-java-client-okhttp"))
}
