package adapter

import adapter.FilterFromThirdParty
import adapter.Image

class ThirdPartyFilter : FilterFromThirdParty {

    override fun apply(image: Image) {
        println("Third Party Filter")
    }
}