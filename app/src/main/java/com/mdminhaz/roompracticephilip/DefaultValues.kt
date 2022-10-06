package com.mdminhaz.roompracticephilip

import com.mdminhaz.roompracticephilip.model.entity.Director
import com.mdminhaz.roompracticephilip.model.entity.School
import com.mdminhaz.roompracticephilip.model.entity.Student
import com.mdminhaz.roompracticephilip.model.entity.Subject
import com.mdminhaz.roompracticephilip.model.entity.relations.StudentSubjectCrossRef

val directors: List<Director> = listOf(
    Director(directorName = "Mike Litoris", schoolName = "Jake Wharton School"),
    Director(directorName = "Jack Goff", schoolName = "Kotlin School"),
    Director(directorName = "Chris P. Chicken", schoolName = "JetBrains School")
)
val schools: List<School> = listOf(
    School(schoolName = "Jake Wharton School"),
    School(schoolName = "Kotlin School"),
    School(schoolName = "JetBrains School")
)
val subjects: List<Subject> = listOf(
    Subject(subjectName = "Dating for programmers"),
    Subject(subjectName = "Avoiding depression"),
    Subject(subjectName = "Bug Fix Meditation"),
    Subject(subjectName = "Logcat for Newbies"),
    Subject(subjectName = "How to use Google")
)
val students: List<Student> = listOf(
    Student(studentName = "Beff Jezos", semester = 2, schoolName = "Kotlin School"),
    Student(studentName = "Mark Suckerberg", semester = 5, schoolName = "Jake Wharton School"),
    Student(studentName = "Gill Bates", semester = 8, schoolName = "Kotlin School"),
    Student(studentName = "Donny Jepp", semester = 1, schoolName = "Kotlin School"),
    Student(studentName = "Hom Tanks", semester = 2, schoolName = "JetBrains School")
)
val studentSubjectRelations: List<StudentSubjectCrossRef> = listOf(
    StudentSubjectCrossRef(studentName = "Beff Jezos", subjectName = "Dating for programmers"),
    StudentSubjectCrossRef(studentName = "Beff Jezos", subjectName = "Avoiding depression"),
    StudentSubjectCrossRef(studentName = "Beff Jezos", subjectName = "Bug Fix Meditation"),
    StudentSubjectCrossRef(studentName = "Beff Jezos", subjectName = "Logcat for Newbies"),
    StudentSubjectCrossRef(studentName = "Mark Suckerberg", subjectName = "Dating for programmers"),
    StudentSubjectCrossRef(studentName = "Gill Bates", subjectName = "How to use Google"),
    StudentSubjectCrossRef(studentName = "Donny Jepp", subjectName = "Logcat for Newbies"),
    StudentSubjectCrossRef(studentName = "Hom Tanks", subjectName = "Avoiding depression"),
    StudentSubjectCrossRef(studentName = "Hom Tanks", subjectName = "Dating for programmers")
)