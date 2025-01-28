import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class HelloWorldTest : FunSpec({
    test("Hello World! test") {
        "Hello World!".length shouldBe 12
    }
})
