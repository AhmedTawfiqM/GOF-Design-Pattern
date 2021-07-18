package adapter.solution

import adapter.Filter
import adapter.Image
import adapter.ThirdPartyFilter

class FilterFromThirdParty(private val thirdPartyFilter : ThirdPartyFilter)  : Filter{

    override fun apply(image: Image) {
        thirdPartyFilter.apply(image)
    }
}