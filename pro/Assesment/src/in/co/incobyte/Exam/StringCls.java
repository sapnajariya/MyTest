package in.co.incobyte.Exam;

public class StringCls {
	
	public static int  add(String s1) throws MyException
	{
		int sum=0;
		if(s1.equals(""))
		{ 
			//System.out.println("string is empty");
		}
		
		else if(s1.trim()!=null)
		{
			
		String[]arr=s1.split(",|\n|//|;");
		String s2="";
		int []arr1=new int[arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			s2=arr[i];
			
			arr1[count]=Integer.parseInt(s2);
			
			
			count++;
			
			
			
			}
			
			
	
			
		
		
		
		
			for(int j=0;j<arr1.length;j++)
			{
			
			 sum=arr1[j]+sum;
			 
			 if(sum>=0) {
				
				 //return sum;}
			 }
			 else {
				 throw new MyException();
			 }
			 
			 
			 
			}
		
		return sum;}
		
			
		return 0;
		
	}
	
	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub
		String s="1\n2//8;";
		
		
			
			int result=add(s);
			System.out.print(result);
		}
		
		
		

	}



