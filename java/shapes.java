package java;

public class shapes {
	
	static class circle{
		private double pai=3.14;
		private int  radius=0;
		
		  circle(int r){
			 this.radius=r;
			 
			 
			 double circle=this.radius*this.radius*this.pai;
			 
			 System.out.println("radius is :"+circle);
			 
		    
		     
		  }	  
			  
		  }
	public static void main(String[] args) {
	      shapes.circle cradius=new shapes.circle(10);
	      
		
	}
		
		
		
	}

