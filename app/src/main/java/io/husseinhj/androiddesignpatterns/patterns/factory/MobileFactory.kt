package io.husseinhj.androiddesignpatterns.patterns.factory

class MobileFactory {

    fun getDevice(osType: OSType): IMobileFactoryInterface {

        if (osType == OSType.ANDROID) {
            return AndroidMobile(osType)
        }

        if (osType == OSType.IOS) {
            return AndroidMobile(osType)
        }

        return WindowsMobile(osType)
    }

}