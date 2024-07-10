plugins {
    id("com.android.library") version "8.0.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
}

allprojects {
    // No definir repositorios aquí
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
