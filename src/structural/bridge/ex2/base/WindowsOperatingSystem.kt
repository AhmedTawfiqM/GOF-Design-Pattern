package bridge.ex2.base

import bridge.ex2.IOperatingSystem
import bridge.ex2.hostingpackage.HosingPackage

class WindowsOperatingSystem(private val hostingPackage: HosingPackage) : IOperatingSystem {

    fun distribute() = hostingPackage.distribute()

    override fun run() {
        distribute()
        println("run WindowsOperatingSystem")
    }
}