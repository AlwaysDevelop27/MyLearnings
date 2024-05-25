package Learnings.Learningsdsa;

public class LearningPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* * * *
		//* * * *
		//* * * *
		//* * * *
		int n=4;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++)
			{
			System.out.print("* ");	
			
			}
			System.out.print("\n");
			}
		System.out.println("new pattern");
		
				//* 
				//* * 
				//* * * 
				//* * * *
		
		
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
		System.out.println( "Hello World!" );
        int x=153;
        int val =0,rem;
        while(x!=0) {
        	rem= x%10;
        	int cube=rem*rem*rem;
        	val=val+cube;
        	x=x/10;
        }
        System.out.println("anstronme: "+val);
        
        int num=36;
        for(int i=1;i<=num;i++) {
        	if(num%i==0) {
        		System.out.println(i);
        	}
        }
		
	}

}
