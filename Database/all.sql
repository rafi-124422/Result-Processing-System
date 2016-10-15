create table Course (
CourseId  varchar(20) ,
CourseTitle  varchar(50),
CourseTeacherId varchar(20),
Credit float(10),
SemesterNumber int,
SemesterYear int,
Type varchar(20),
primary key(CourseId,SemesterYear));

create table Marks (
StudentId  varchar(20),
CourseId  varchar(20),
SemesterYear int,
att float(10),
quiz1 float(10),
quiz2 float(10),
quiz3 float(10),
quiz4 float(10),
midTerm float(10),
semesterfinal float(10),
totalmark float(10),
gpa float(10),
primary key(StudentId,CourseId,SemesterYear));

create table Student (
StudentId  varchar(20) ,
Name  varchar(50),
Password varchar(20),
DepartmentName varchar(20),
CurrentSemester int,
primary key(StudentId));


create table Teacher (
TeacherId  varchar(20) ,
Name  varchar(50),
Password varchar(20),
primary key(TeacherId));
