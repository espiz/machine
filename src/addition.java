import java.util.Scanner;
public class addition{


	   public static void calculate()
	   {
		   int a;
	       double nber1,nber2,nber3,nber4,nber5,answer;
	    int choice;
	     Scanner choic=new Scanner(System.in);
	     for(;;)
	     {
	     System.out.println("Enter Your Choice::");
	     choice=choic.nextInt();
	     switch(choice)
	     {
	         case 1:
	             //addition
	             System.out.println("Number 1:");
	             nber1=choic.nextDouble();
	             System.out.println("Number 2:");
	             nber2=choic.nextDouble();
	             answer=nber1+nber2;
	             System.out.print("The Sum is:\t");
	             System.out.print(answer);
	         break;
	        case 2:
	            
	        	
	        	//division
	            System.out.println("Number 1:");
	            nber1=choic.nextDouble();
	            System.out.println("Number 2:");
	             nber2=choic.nextDouble();
	             answer=nber1/nber2;
	             System.out.print("The Quotient is:\t");
	             System.out.print(answer);
	        break;
	        case 3:
	             
	        	
	        	//multiplication
	            System.out.println("Number 1:");
	            nber1=choic.nextDouble();
	            System.out.println("Number 2:");
	             nber2=choic.nextDouble();
	             answer=nber1*nber2;
	             System.out.print("The Multiplication is:\t");
	             System.out.print(answer);
	        break;
	        case 4:
	             
	        	
	        	//Subtraction
	            System.out.println("Number 1:");
	            nber1=choic.nextDouble();
	            System.out.println("Number 2:");
	             nber2=choic.nextDouble();
	             answer=nber1-nber2;
	             System.out.print("The answer is:\t");
	             System.out.print(answer);
	       break;
	        case 5:
	        	
	        	//square root 
	            System.out.println("Number:");
	            nber1=choic.nextDouble();
	            answer=Math.sqrt(nber1);
	            System.out.print("The Sum is:\t");
	            System.out.print(answer);
	            break;
	        case 6:
	        	
	        	//cosines
	            System.out.println("Number:");
	            nber1=choic.nextDouble();
	            answer=Math.cos(nber1);
	            System.out.print("The answer is:\t");
	            System.out.print(answer);
	            break;
	        case 7:
	             //power
	            System.out.println("Number:");
	            nber1=choic.nextDouble();
	            System.out.println("Exponent");
	             nber2=choic.nextDouble();
	             answer=Math.pow(nber1, nber2);
	             System.out.print("The answer is:\t");
	             System.out.print(answer);
	        	
	             break;
	        case 8:
	             //sines
	            System.out.println("Number:");
	            nber1=choic.nextDouble();
	            answer=Math.sin(nber1);
	             System.out.print("The answer is:\t");
	             System.out.print(answer);
	    
	     
	     
	     }
	     }
	     }
      
	    
	        	public static void main(String[] args) {
	                
	        		System.out.println("1-!!!!!!!!!Addition:");
	                System.out.println("2--!!!!!!!!Division:");
	                System.out.println("3-!!!!!!!!!Multiplication:");
	                System.out.println("4-!!!!!!!!!Substraction:");
	                
	                System.out.println("5-!!!!!!!!!square root :");
	                System.out.println("6--!!!!!!!!cosines:");
	                System.out.println("7-!!!!!!!!!power:");
	                System.out.println("8-!!!!!!!!!sines:");
	                
	                
	             addition espoir=new addition();
	             espoir.calculate();
	     
	    	 
	  }
	     
}







	     