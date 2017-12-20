package com.hadoopexpert;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;

public class GradeUdf extends UDF

{
	public Text evaluate(IntWritable marks)
	{
			int m=marks.get();
			String s="";
			
			if(m>70)
			{
				s="A";
			}
			else if(m>50)
			{
				s="B";
			}
			
			else if(m>350)
			{
				s="C";
			}
			else
				s="D";
			
					
		return new Text(s);
		
	}

}
