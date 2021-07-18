package adapter.solution

import adapter.BlackWhiteFilter
import adapter.ImageView
import adapter.ThirdPartyFilter

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val imageView = ImageView()
        imageView.apply(BlackWhiteFilter())

        //now use the adapter to allow the imageView apply incompatible  objects from different interfaces
        imageView.apply(FilterFromThirdParty(ThirdPartyFilter()))
    }
}