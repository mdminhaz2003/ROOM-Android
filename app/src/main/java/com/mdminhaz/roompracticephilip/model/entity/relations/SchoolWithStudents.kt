package com.mdminhaz.roompracticephilip.model.entity.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mdminhaz.roompracticephilip.model.entity.School
import com.mdminhaz.roompracticephilip.model.entity.Student

data class SchoolWithStudents (
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "studentName"
    )
    val students: List<Student>
)