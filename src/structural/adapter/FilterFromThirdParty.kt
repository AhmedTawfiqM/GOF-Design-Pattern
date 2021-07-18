package adapter

import adapter.Image

interface FilterFromThirdParty {
    fun apply(image: Image)
}