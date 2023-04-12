data class Post(
    var id: Int,
    val ownerId: Int,
    val fromId: Int,
    val date: Int,
    val text: String,
    val comment: Comment,
    val canPin: Boolean,
    val isFavorite: Boolean
)