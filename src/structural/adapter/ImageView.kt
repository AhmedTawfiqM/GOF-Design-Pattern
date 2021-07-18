package adapter

class ImageView {

    private val image = Image()

    fun apply(filter: Filter) {
        filter.apply(image)
    }
}