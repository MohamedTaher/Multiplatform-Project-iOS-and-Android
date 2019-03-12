package com.taher.mpptry1

import kotlinx.coroutines.GlobalScope

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"

}
