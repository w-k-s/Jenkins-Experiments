package com.wks.beta

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConcatenationTest {
    @Test
    fun concatenationTests(){
        assertEquals("AB","A"+"B")
    }

    @Test
    fun formattedStringTest(){
        val a = "A"
        val b = "B"
        assertEquals("ABCD","$a$bCD")
    }
}