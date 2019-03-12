package com.taher.mpptry1

import kotlinx.coroutines.*

actual fun platformName(): String {
    return "Android"
}

internal actual val ApplicationDispatcher: CoroutineDispatcher = Dispatchers.Default

