package io.husseinhj.androiddesignpatterns.patterns.factory

import android.graphics.Color
import android.util.Size

class IOSMobile(osType: OSType): IMobileFactoryInterface {

    private var _color: Int = Color.GRAY
    override var color: Int
        get() = _color
        set(value) { _color = value }

    private var _osType: OSType = OSType.IOS
    override var osType: OSType
        get() = _osType
        set(value) { _osType = value }

    private var _screenSize: Size = Size(0,0)
    override var screenSize: Size
        get() = _screenSize
        set(value) { _screenSize = value }

}