import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

class WallServiceTest {

    @BeforeEach
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun add() {
        val service = WallService
        val comment = Comment(1, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val post = Post(1, 2, 3, 4, "Первый пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)
        assertEquals(post, service.add(post))
    }

    @Test
    fun updateTrue() {
        val service = WallService
        val comment = Comment(0, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val postOne = Post(1, 2, 3, 4, "Первый пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        val postTwo = Post(2, 2, 3, 4, "Второй пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        val postThree = Post(3, 2, 3, 4, "Третий пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        val postUpdate = Post(3, 2, 3, 4, "Четвертый пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        service.add(postOne)
        service.add(postTwo)
        service.add(postThree)

        assertTrue(service.update(postUpdate))
    }

    @Test
    fun updateFalse() {
        val service = WallService
        val comment = Comment(0, canPost = true, groupsCanPost = false, canClose = true, canOpen = true)
        val postOne = Post(1, 2, 3, 4, "Первый пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        val postTwo = Post(2, 2, 3, 4, "Второй пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)
        val postThree = Post(3, 2, 3, 4, "Третий пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)
        val postUpdate = Post(4, 2, 3, 4, "Четвертый пост!", 1,
            2, true, comment, "qwe", canPin = true, isFavorite = false, canDelete = true)

        service.add(postOne)
        service.add(postTwo)
        service.add(postThree)

        assertFalse(service.update(postUpdate))
    }
}