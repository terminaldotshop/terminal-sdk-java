plugins {
    id("terminal.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":terminal-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :terminal-java-example:run` to run `Main`
    // Use `./gradlew :terminal-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "shop.terminal.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
