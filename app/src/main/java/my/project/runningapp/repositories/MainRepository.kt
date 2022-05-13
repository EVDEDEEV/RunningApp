package my.project.runningapp.repositories

import my.project.runningapp.db.RunDAO
import my.project.runningapp.db.RunEntity
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDAO: RunDAO,
) {
    suspend fun insertRunEntity(runEntity: RunEntity) = runDAO.insertRunEntity(runEntity)

    suspend fun deleteRunEntity(runEntity: RunEntity) = runDAO.deleteRunEntity(runEntity)

    fun getAllRunsSortedByDate() = runDAO.getAllRunsSortedByDate()

    fun getAllRunsSortedByDistance() = runDAO.getAllRunsSortedByDistance()

    fun getAllRunsSortedByTimeInMillis() = runDAO.getAllRunsSortedByTimeInMillis()

    fun getAllRunsSortedByAvgSpeed() = runDAO.getAllRunsSortedByAvgSpeed()

    fun getAllRunsSortedByCaloriesBurned() = runDAO.getAllRunsSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()


}