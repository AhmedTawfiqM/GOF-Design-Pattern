package bridge.ex2.hostingpackage

import bridge.ex2.IOperatingSystem

class PremiumPlusHostingPackage : HosingPackage {

    override fun distribute() {
        println("distribute PremiumPlusHostingPackage")
    }
}