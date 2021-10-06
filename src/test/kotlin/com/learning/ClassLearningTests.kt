import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

internal class ClassLearningTests : DescribeSpec({
    describe("ClassLearning") {
       ClassLearning("Test").let {
           it("첫번째 멤버는 First member 이다.") {
               it.firstMember shouldBe "First member"
           }

           it("두번째 멤버는 Second member 이다.") {
               it.secondMember shouldBe "Second member"
           }
       }
    }
})