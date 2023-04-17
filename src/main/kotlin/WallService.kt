object WallService {

    var posts = emptyArray<Post>()

    fun clear() {
        posts = emptyArray()
    }

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            posts += post.copy(id = 1)
            return posts.last()
        }
        else {
            var i = 1
            while (thereIs(posts.last().id + i)) i++
            posts += post.copy(id = posts.last().id + i)
            return posts.last()
        }
    }

    private fun thereIs (test: Int): Boolean {
        for (post in posts) {
            if (post.id == test) return true
        }
        return false
    }

    fun update(postUpdate: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postUpdate.id == post.id) {
                posts[index] = postUpdate.copy(id = post.id)// Во тут правильно сделал?(а то не уверен правильно ли понял принцип copy и для чего это нужно)
                return true
            }
        }
        return false
    }
}