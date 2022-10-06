package com.mdminhaz.roompracticephilip.model.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.mdminhaz.roompracticephilip.model.entity.Director
import com.mdminhaz.roompracticephilip.model.entity.School
import com.mdminhaz.roompracticephilip.model.entity.Student
import com.mdminhaz.roompracticephilip.model.entity.Subject
import com.mdminhaz.roompracticephilip.model.entity.relations.SchoolAndDirector
import com.mdminhaz.roompracticephilip.model.entity.relations.SchoolWithStudents
import com.mdminhaz.roompracticephilip.model.entity.relations.StudentSubjectCrossRef
import com.mdminhaz.roompracticephilip.model.entity.relations.SubjectWithStudent

@Dao
interface SchoolDao {
    @Insert
    suspend fun insertSchool(school: School)

    @Insert
    suspend fun insertDirector(director: Director)

    @Insert
    suspend fun insertStudent(student: Student)

    @Insert
    suspend fun insertSubject(subject: Subject)

    @Insert
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    @Transaction
    @Query(value = "SELECT * FROM SCHOOL WHERE schoolName = :schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>

    @Transaction
    @Query(value = "SELECT * FROM STUDENT WHERE schoolName = :schoolName")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>

    @Transaction
    @Query(value = "SELECT * FROM SUBJECT WHERE subjectName = :subjectName")
    suspend fun getStudentsOfSubject(subjectName: String): List<SubjectWithStudent>

    @Transaction
    @Query(value = "SELECT * FROM STUDENT WHERE studentName = :studentName")
    suspend fun getSubjectOfStudent(studentName: String): List<SchoolWithStudents>
}