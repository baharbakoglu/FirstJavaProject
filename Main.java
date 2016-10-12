import java.util.*; //Import all the classes in the java.util package was//

public class Main { //Defined Main class//

	private static Scanner sc; //sc variable was created in the class to read the user.//

	public static void main(String args[])
	{

		int k;		//Generated in integer variables//
		int i = 0;
		int value=0;
		int length=0;
		int value1=0;
		int value2;
		int selection=0;
		int[] number = new int [100]; //Generated in integer array//
		int[] number1 = new int [100];
	
		
		while(i!=5){  //The menu printed//
		System.out.println("---------------------------------------");
		System.out.println("1. Factorial");
		System.out.println("2. Fibonacci");
		System.out.println("3. Armstrong Numbers");
		System.out.println("4. Sorting");
		System.out.println("5. Exit");
		System.out.println("---------------------------------------");
		System.out.print("Selection:");
		sc = new Scanner(System.in); //Asked for the number to be read from memory location//
	    i = sc.nextInt();//Read the user number//
	    
	    switch (i){   
	    case 1:     		//Selection is factorial//
	    		System.out.println("...............Factorial...............");
	    		System.out.print("Enter value:"); // The factorial of the number value will be asked to user//
	       		sc= new Scanner(System.in);//Asked for the number to be read from memory location//
	       		value = sc.nextInt();
	       		if(value<0)
	       			System.out.println("You entered a negative number. Please enter a positive number.."); //Gives an error message in incorrect values//
		       	else
	       			System.out.println("Factorial of " + value +" is:" + factorial(value)); //Factorial function and number was printed screen//
	       			System.out.println(".......................................");
	       		
	       		break;
	    case 2:          //Selection is Fibonacci//
	    		System.out.println("...............Fibonacci...............");
	    		System.out.print("Enter legth of Fibonacci sequence:");//Total number written on the screen will be prompted//
	    		sc = new Scanner(System.in); //Asked for the number to be read from memory location//
	    		length = sc.nextInt();
	    		if(length<0)
	       			System.out.println("You entered a negative number. Please enter a positive number..");//Gives an error message in incorrect values//
		       	else{
		  
					
										
					if(length==1)
						
						System.out.println("0");
					
					if(length==2)
						
						System.out.println("0 1");
					
					if(length>2){  //Find and print the fibonacci numbers//
						int[] array = new int[length]; //Generated in integer array//
						array[0]=0;
						array[1]=1;
						System.out.print("0 1 ");
						
						for(k=0;k<length-2;k++){
							
							array[k+2]=array[k] + array[k+1];
								
							System.out.print(array[k+2] + " " );
							
							}
						System.out.println("");
						System.out.println(".......................................");
					}
		       	}
								
	        		
	    		break;
	    case 3:            //Selection is Armstrong Numbers//
	    		System.out.println("...........Armstrong Numbers...........");
	    		System.out.print("Enter value:");
	    		sc = new Scanner(System.in);//Asked for the number to be read from memory location//
	    		value1 = sc.nextInt();
	    		if(value1<0)
	       			System.out.println("You entered a negative number. Please enter a positive number..");//Gives an error message in incorrect values//
		       	else
		       	{			//Functions are called//
	    			armstrong(100,1000,value1); 
		    		armstrong1(1000,10000,value1);			
		    		armstrong2(10000,100000,value1);
		    		armstrong3(100000,1000000,value1);
		    		armstrong4(1000000,10000000,value1);
		    		
		    		if(value1>10000000){ //In order to increase the operating speed of the program, if used condition.//
		    			
		    			armstrong5(10000000,100000000,value1);
		    			armstrong6(100000000,1000000000,value1);
		    		}
		    		
		    		System.out.println("");
		    		System.out.println(".......................................");
		    		
		       	}
	    		break;
	    case 4:				//Selection is Sorting//
	    		System.out.println("................Sorting................");
	    		System.out.println("1. Ascending order");
	    		System.out.println("2. Descending order");
	    		System.out.print("Enter sorting type:");
	    		
	    		sc = new Scanner(System.in);//Asked for the number to be read from memory location//
	    		selection = sc.nextInt();
	    		
	    		switch(selection){
	    		
	    			case 1:		//Selection is Ascending order//
	    					System.out.println("Ascending order was selected...");
	    					System.out.println("Enter -1 to finish");
	    					k=0;
	    					value2=0;	    					
	    					
	    					while(value2!=-1){
	    						
	    						System.out.print("Enter value:");
	    						sc = new Scanner(System.in);//Asked for the number to be read from memory location//
		    					value2 = sc.nextInt();
		    					if(value2==-1){
		    						System.out.println(".......................................");
		    						break;
		    					}
		    					else
		    					{
			    					number[k]= value2; //Value obtained from the user is transfered to array//
			    					k++;
			    					sort(number,k); //Called ascending sorting function//
	    					}
	    					}
	    					
	    					for(i=0;i<number.length;i++){ //Reset all the elements of the array//
	    						number[i]=0;
	    					}
	    					
	    					
	    					break;
	    			case 2:		//Selection is Descending order//
	    					System.out.println("Descending order was selected...");
	    					System.out.println("Enter -1 to finish");
	    					k=0;
	    					value2=0;
	    					while(value2!=-1){
			    				
	    						System.out.print("Enter value:");
	    						sc = new Scanner(System.in);//Asked for the number to be read from memory location//
		    					value2 = sc.nextInt();
		    					if(value2==-1)	{	    					
		    						System.out.println("......................................");
		    						break;
		    					}
		    					
		    					else{
			    					
			    					number1[k]= value2;//Value obtained from the user is transfered to array//
			    					k++;
			    					sort1(number1,k); //Called descending function//
		    					
		    					
		    					}	
	    					
	    					}
	    					
	    					for(i=0;i<number1.length;i++){ //Reset all the elements of the array//
	    						number1[i]=0;
	    					}
	    						    		
	    					
	    					break;
	    					
	    				default: 
	    				{
	    				
	    						System.out.println("You entered wrng charecter. Please enter 1 or 2.. ");//Gives an error message in incorrect values//
	    						
	    						break;
	    				}
	    				
	    		}
	    					break;
	   
	    case 5:			//Selection is Exit this prongram//
	    		
	    		System.out.print("Terminated..."); 
	    		
	    		break;
	    		
	    default:
	    		
	    		System.out.println("Wrong command! Please select a number from the menu..");//Gives an error message in incorrect values//
	    		
	    		break;
	    		
	    		
	    		
	    		
	    
		
	    }
		}
		
	}
	public static int factorial(int i){ //Defined function that calculates the factorial.//
		
		long result=1;
		
		if((i==1)&&(i==0))
			
			result=1;
		
		else
			
			for(int j=2;j<=i;j++){
				
				result = result*j;
			
			}
		
		return (int) result;
	}
	
	
	public static int power (int a, int b) //Defined function to find the powers of a number//
	{
		int result=1;
		
		for(int i=0;i<b;i++){
			result=result*a;
		}
		return result;
	}
	static void sort(int []array, int k)//Ascending sort function is defined//
	{
		int temp;
		
		for(int pass=1;pass<k;pass++){
			
			for(int i=0; i<k-1;i++){
				
				if(array[i]>array[i+1]){
					temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		}
		
		for(int j=0; j<k;j++){
							
				System.out.print(array[j] + " ");
			
		}
		System.out.println("");
		
		}
	
	static void sort1(int []array, int k) //Descending sort function is defined//
	{
			int temp;
			
			for(int pass=1;pass<k;pass++){
				
				for(int i=0; i<k-1;i++){
					
					if(array[i]<array[i+1]){
						temp=array[i];
						array[i]=array[i+1];
						array[i+1]=temp;
					}
				}
			}
			
			for(int j=0; j<k;j++){
										
				System.out.print(array[j] + " ");
	
			}
			System.out.println("");
		}
	public static void  armstrong(int n1, int n2,int value){  //Function finds the three-digit armstrong numbers//
		
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
		     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,3);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong1(int n1, int n2, int value){//Function finds the four-digit armstrong numbers//
			
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
			     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,4);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong2(int n1, int n2, int value){ //Function finds the five-digit armstrong numbers//
			
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
			     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,5);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong3(int n1, int n2, int value){ //Function finds the six-digit armstrong numbers//
			
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
		     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,6);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong4(int n1, int n2, int value){ //Function finds the seven-digit armstrong numbers//
			
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
			     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,7);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong5(int n1, int n2, int value){ //Function finds the eight-digit armstrong numbers//
		
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
			     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,8);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}
	public static void  armstrong6(int n1, int n2, int value){ //Function finds the nine-digit armstrong numbers//
		
		for(int i=n1+1; i<n2; ++i)
		  {
		      int temp=i;
		      int num=0;
		      int rem=1;
			     	      
		      while(temp!=0)
		      {
		          rem=(temp%10);
		          num+=power(rem,9);
		          temp/=10;
		      }
		      if((i==num)&&(i<value))
		      {
		          System.out.print(i +" ");
		      }
		  }
		}


		


}
	

	
	



