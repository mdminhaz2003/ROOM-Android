package com.mdminhaz.roompracticephilip.model.entity.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.mdminhaz.roompracticephilip.model.entity.Student
import com.mdminhaz.roompracticephilip.model.entity.Subject

data class StudentWithSubject(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)
