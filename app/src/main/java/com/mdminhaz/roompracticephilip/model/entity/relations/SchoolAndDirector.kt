package com.mdminhaz.roompracticephilip.model.entity.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.mdminhaz.roompracticephilip.model.entity.Director
import com.mdminhaz.roompracticephilip.model.entity.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)