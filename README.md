# hive-udf

>First of all you have to export the jar file.
  >1.create tables
      a)create table iwilluse(name string,id int,marks int,deptid int) row format delimited fields terminated by ',' lines terminated by '\n'
      Load data into this file from local file system.
     > load data local inpath 'useme.txt' overwrite into table iwilluse;
     b)create table usedused (name string, id int,marks int,grade string,deptid int,deptname string);
  >2.Create temporary functions
      a)create temporary function grade as 'com.hadoopexpert.GradeUdf';
      b)create temporary function depname as 'com.hadoopexpert.DeptName';
` >3.Load data into table usedused
     >insert overwrite table  usedused  select name,id,marks,grade(marks),deptid,depname(deptid) from iwilluse;
  >4.Now you can see the result;
