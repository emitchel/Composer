package com.erm.composer.data.repository.base

import kotlinx.coroutines.Dispatchers

abstract class BaseRepository {
    var ioDispatcher = Dispatchers.IO
}