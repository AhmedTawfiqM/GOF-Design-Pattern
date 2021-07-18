package bridge.ex2

import bridge.ex2.base.UnixOperatingSystem
import bridge.ex2.base.WindowsOperatingSystem
import bridge.ex2.hostingpackage.BasicHostingPackage
import bridge.ex2.hostingpackage.PremiumHostingPackage
import bridge.ex2.hostingpackage.PremiumPlusHostingPackage

object Client {

    @JvmStatic
    fun main(args: Array<String>){

        val windowsBasic = WindowsOperatingSystem(BasicHostingPackage())
        val windowsPremium = WindowsOperatingSystem(PremiumHostingPackage())
        val windowsPremiumPlus = WindowsOperatingSystem(PremiumPlusHostingPackage())

        val unixBasic = UnixOperatingSystem(BasicHostingPackage())
        val unixPremium = UnixOperatingSystem(PremiumHostingPackage())
        val unixPremiumPlus = UnixOperatingSystem(PremiumPlusHostingPackage())


        windowsBasic.run()
        unixPremiumPlus.run()

    }
}