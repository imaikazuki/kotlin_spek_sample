import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

class HelloSpecs : Spek() { init {

    given("a greeter") {
        val greeter = Hello()
        on("greet with a name") {
            val message = greeter.sayHello("world")
            it("should result a greet with name") {
                assertEquals("Hello, world.", message)
            }
        }
    }

}}