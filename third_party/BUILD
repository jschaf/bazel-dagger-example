package(default_visibility = ["//visibility:public"])

java_import(
    name = "guava",
    jars = ["guava/guava-23.6-jre.jar"],
)

java_import(
    name = "junit4",
    jars = [
        "hamcrest/hamcrest-core-1.3.jar",
        "junit/junit-4.11.jar",
    ],
)

java_import(
    name = "mockito",
    jars = ["mockito/mockito-all-1.10.19.jar"],
)

java_import(
    name = "jsr330_inject",
    jars = ["jsr330_inject/javax.inject.jar"],
)

java_import(
    name = "dagger_api",
    jars = ["dagger/dagger-2.14.1.jar"],
    exports = [":guava"],
)

java_import(
    name = "dagger_spi",
    jars = ["dagger/dagger-spi-2.14.1.jar"],
)

java_import(
    name = "dagger_compiler",
    jars = ["dagger/dagger-compiler-2.14.1.jar"],
    exports = [":dagger_spi"],
)

java_import(
    name = "dagger_producers",
    jars = ["dagger/dagger-producers-2.14.1.jar"],
)

java_library(
    name = "dagger",
    exported_plugins = [":dagger_plugin"],
    exports = [
        ":dagger_api",
        ":googlejavaformat",
        ":guava",
        ":jsr330_inject",
    ],
)

java_plugin(
    name = "dagger_plugin",
    processor_class = "dagger.internal.codegen.ComponentProcessor",
    deps = [
        ":dagger_api",
        ":dagger_compiler",
        ":dagger_producers",
        ":googlejavaformat",
        ":guava",
        ":java_poet",
        ":jsr330_inject",
    ],
)

java_import(
    name = "googlejavaformat",
    jars = ["googlejavaformat/google-java-format-1.5.jar"],
    exports = [":error_prone_javac_shaded"],
)

java_import(
    name = "error_prone_javac_shaded",
    jars = ["errorprone/javac-shaded-9-dev-r4023-3.jar"],
)

java_import(
    name = "java_poet",
    jars = ["javapoet/javapoet-1.9.0.jar"],
)
