val libs = Libs

@Suppress("unused")
object Libs {
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.compose}" }
    val composeUiTooling by lazy { "androidx.compose.ui:ui-tooling:${Versions.compose}" }
    val composeUiToolingPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.compose}" }
    val composeFoundation by lazy { "androidx.compose.foundation:foundation:${Versions.compose}" }
    val composeMaterial by lazy { "androidx.compose.material:material:${Versions.compose}" }

    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }

}