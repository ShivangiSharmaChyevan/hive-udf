package com.hadoopexpert;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class DeptName extends UDF
{
	
	public Text evaluate (IntWritable deptid)
	{
			int depid=deptid.get();
			String s="";
			if(depid==101)
			{
				s="Computer";
			}
			else if (depid==102)
			{
				s="ENTC";
			} 
			else if (depid==103)
			{
				s="MECH";
			} 
			else if (depid==104)
			{
				s="IT";
			} 
				
		return new Text(s);
		
	}
	
	

}
