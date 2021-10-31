package io.husseinhj.androiddesignpatterns.patterns.factory

import android.util.Size

enum class OSType {
    ANDROID,
    IOS,
    WINDOWS,
}

interface IMobileFactoryInterface {
    var color: Int
    var osType: OSType
    var screenSize: Size
}