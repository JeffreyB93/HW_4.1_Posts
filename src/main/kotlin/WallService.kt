import java.util.Random

object WallService {

    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            post.id = 1
            posts += post
            return posts.last()
        }
        else {
            post.id = posts.last().id + 1
            posts += post
            return posts.last()
        }
    }

    fun update(postUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postUpdate.id == post.id) {
                posts[index] = postUpdate
                return true
            }
        }
        return false
    }
}