package com.learning

import KotlinLearningTestSample
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class KotlinLearningTestSampleTest {
    private val testSample: KotlinLearningTestSample = KotlinLearningTestSample()

    @Test
    fun sum() {
        // Given;
        var a = 10
        var b = 20
        // When;
        var sum = testSample.sum(a, b);
        // Then
        assertEquals(sum, 30)
    }
}