plugins {
    id("terminal.kotlin")
    id("java")
    application
}

dependencies {
    implementation(project(":terminal-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    mainClass = "shop.terminal.api.example.Main"
}