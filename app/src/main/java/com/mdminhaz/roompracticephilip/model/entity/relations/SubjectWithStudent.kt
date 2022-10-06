package com.mdminhaz.roompracticephilip.model.entity.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mdminhaz.roompracticephilip.model.entity.Student
import com.mdminhaz.roompracticephilip.model.entity.Subject

data class SubjectWithStudent(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)
