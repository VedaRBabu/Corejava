package lab5;
class Example1{
//public static void main(String args[]){
		//try{
				//System.out.println("Starting of try block");
				
				//throw new MyException("This is My error Message");
			//}
			//catch(MyException exp){
				
				//System.out.println("Catch Block") ;
				//System.out.println(exp) ;
			//}
		  // }
		//}
	
	    public static void main(String args[])
	    {
	        try
	        {
	           
	            throw new MyException("John Smith");
	        }
	        catch (MyException ex)
	        {
	            System.out.println("Caught");
	  
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }
	    }
	}