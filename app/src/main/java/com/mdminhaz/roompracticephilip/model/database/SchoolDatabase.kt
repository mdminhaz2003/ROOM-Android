package com.mdminhaz.roompracticephilip.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.mdminhaz.roompracticephilip.model.dao.SchoolDao
import com.mdminhaz.roompracticephilip.model.entity.Director
import com.mdminhaz.roompracticephilip.model.entity.School
import com.mdminhaz.roompracticephilip.model.entity.Student
import com.mdminhaz.roompracticephilip.model.entity.Subject
import com.mdminhaz.roompracticephilip.model.entity.relations.StudentSubjectCrossRef

@Database(
    entities = [
        School::class,
        Student::class,
        Director::class,
        Subject::class,
        StudentSubjectCrossRef::class
    ],
    version = 1
)
abstract class SchoolDatabase: RoomDatabase() {
    abstract val schoolDao: SchoolDao

    companion object {
        @Volatile
        private var INSTANCE: SchoolDatabase? = null

        fun getInstance(context: Context): SchoolDatabase {
            synchronized(this) {
                return INSTANCE ?: Room.databaseBuilder(
                    context,
                    SchoolDatabase::class.java,
                    "school_db"
                ).build().also {
                    INSTANCE = it
                }
            }
        }
    }
}