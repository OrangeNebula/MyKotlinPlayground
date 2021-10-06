package com.learning

import KotlinLearningTestSample
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.DescribeSpec
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KotlinLearningTestSampleTest : DescribeSpec({
    describe("Properties") {
        it("이미 val 이 선언되어 있을 때, 다시 값을 assign 하려고 하면 에러가 발생한다.") {
            val foo: String = "bar"
        }
    }
})