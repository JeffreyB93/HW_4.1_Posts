import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val comment = Comment(0, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val post = Post(1, 2, 3, 4, "Первый пост!", comment, canPin = true,
            isFavorite = false)
        assertEquals(post, service.add(post))
    }

    @Test
    fun updateTrue() {
        val service = WallService
        val comment = Comment(0, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val postOne = Post(1, 2, 3, 4, "Первый пост!", comment, canPin = true,
            isFavorite = false)
        val postTwo = Post(1, 2, 3, 4, "Второй пост!", comment, canPin = true,
            isFavorite = false)
        val postThree = Post(1, 2, 3, 4, "Третий пост!", comment, canPin = true,
            isFavorite = false)
        val postUpdate = Post(1, 2, 3, 4, "Третий пост!", comment, canPin = true,
            isFavorite = false)

        service.add(postOne)
        service.add(postTwo)
        service.add(postThree)

        assertTrue(service.update(postUpdate))
    }

    @Test
    fun updateFalse() {
        val service = WallService
        val comment = Comment(0, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val postOne = Post(1, 2, 3, 4, "Первый пост!", comment, canPin = true,
            isFavorite = false)
        val postTwo = Post(1, 2, 3, 4, "Второй пост!", comment, canPin = true,
            isFavorite = false)
        val postThree = Post(1, 2, 3, 4, "Третий пост!", comment, canPin = true,
            isFavorite = false)
        val postUpdate = Post(99, 2, 3, 4, "Третий пост!", comment, canPin = true,
            isFavorite = false)

        service.add(postOne)
        service.add(postTwo)
        service.add(postThree)

        assertFalse(service.update(postUpdate))
    }
}