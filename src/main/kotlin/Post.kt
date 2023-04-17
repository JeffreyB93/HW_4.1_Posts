import java.util.*

data class Post(
    val id: Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comment: Comment,
    val copyright: String,
    val canPin: Boolean,
    val isFavorite: Boolean,
    val canDelete: Boolean
)