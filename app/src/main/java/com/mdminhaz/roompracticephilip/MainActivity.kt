package com.mdminhaz.roompracticephilip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.mdminhaz.roompracticephilip.model.dao.SchoolDao
import com.mdminhaz.roompracticephilip.model.database.SchoolDatabase
import com.mdminhaz.roompracticephilip.model.entity.relations.SchoolAndDirector
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dao: SchoolDao = SchoolDatabase.getInstance(context = this).schoolDao

        lifecycleScope.launch {
            directors.forEach { dao.insertDirector(it) }
            schools.forEach { dao.insertSchool(it) }
            subjects.forEach { dao.insertSubject(it) }
            students.forEach { dao.insertStudent(it) }
            studentSubjectRelations.forEach { dao.insertStudentSubjectCrossRef(it) }
        }

    }
}