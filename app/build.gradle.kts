android {
    namespace = "com.example.securedoorlockapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.securedoorlockapp"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures { compose = true }

    composeOptions { kotlinCompilerExtensionVersion = "1.5.4" }

    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    // Navigation for Compose
    implementation("androidx.navigation:navigation-compose:2.7.0")

    // Material icons (stable — no experimental APIs)
    implementation("androidx.compose.material:material-icons-extended")

    // Base Compose libraries from the version catalog (already included)
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
}
