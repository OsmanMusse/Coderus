package com.coderus.codingchallenge.domain.repository

import com.coderus.codingchallenge.data.local.RocketLaunch
import com.coderus.codingchallenge.util.Resource
import kotlinx.coroutines.flow.Flow

interface LauncherRepository {
     suspend fun getRocketList(): Flow<Resource<List<RocketLaunch>>>
}