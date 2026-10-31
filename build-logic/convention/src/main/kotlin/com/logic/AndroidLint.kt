package com.logic

import com.android.build.api.dsl.Lint

internal fun Lint.configureAndroidLint() {
    abortOnError = false
    checkReleaseBuilds = true
    ignoreTestSources = true
}
