package adapter.problem

import adapter.BlackWhiteFilter
import adapter.ImageView

object Client {

    @JvmStatic
    fun main(args: Array<String>) {

        val imageView = ImageView()
        imageView.apply(BlackWhiteFilter())
        //todo now try to apply another type of filter from another Interface
        //imageView.apply(ThirdPartyFilter()) //todo here will cause problem incompatible objects to collaborate

        //todo to solve this problem , use Adapter which allows incompatible objects to collaborate.
    }
}