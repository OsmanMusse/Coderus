package com.coderus.codingchallenge.domain.repository

import androidx.room.withTransaction
import com.coderus.codingchallenge.data.local.AppDatabase
import com.coderus.codingchallenge.data.remote.APIService
import com.coderus.codingchallenge.util.networkBoundResource
import javax.inject.Inject

class LauncherRepository_Impl @Inject constructor(
    private val db: AppDatabase,
    private val apiService: APIService
):LauncherRepository {
    private val dao = db.dao()

    override suspend fun getRocketList() = networkBoundResource(
        query = { dao.getAllLaunches() },

        fetch = { apiService.getRocketLaunchList() },

        saveFetchResult = { launchers ->
            db.withTransaction {
                dao.deleteAll()
                dao.insertAll(launchers)
            }
        },

        shouldFetch = { launchers -> launchers.isEmpty() }
    )
}
