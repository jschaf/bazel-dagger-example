package(default_visibility = ["//visibility:public"])

java_library(
    name = "interfaces",
    srcs = [
        "Heater.java",
        "Pump.java",
    ],
)

java_library(
    name = "coffee_lib",
    srcs = [
        "CoffeeApp.java",
        "CoffeeMaker.java",
    ],
    deps = [
        ":interfaces",
        "//java/coffee/dripcoffee",
        "//third_party:dagger",
    ],
)

java_binary(
    name = "coffee",
    jvm_flags = [
        "-Xms32m",
        "-Xmx128m",
    ],
    main_class = "coffee.CoffeeApp",
    runtime_deps = [":coffee_lib"],
)
