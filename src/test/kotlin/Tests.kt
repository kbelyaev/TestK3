import kotlin.test.Test
import kotlin.test.assertTrue

class MyTests {
    @Test
    fun testCheckArgs() {
        val args1 = Array(1){"a"}
        assertTrue(!checkArgs(args1))

        val args2 = Array(2){"a b"}
        assertTrue(checkArgs(args2))
    }
}