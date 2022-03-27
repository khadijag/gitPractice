package project2Coding;

public class Marks {
        /*
        We have to calculate the average of marks obtained
        in three subjects by student A and by student B.
        Create   class   'Marks'   with   an   abstract   method
        'getPercentage' that will be returning the average
         percentage   of   marks.   Provide   implementation   of
         abstract   method   in   classes   'A'   and   'B'.   The
         constructor of student A takes the marks in three
         subjects as its parameters and the marks in four
         subjects as its parameters for student B. Test your
         code
         */}
     abstract class marks{
    	 abstract double getPercentage();
     }
     class StudentA extends marks{
    	 double physicsScore;
    	 double chemisteryScore;
    	 double mathScore;
    	 
    	 StudentA(double physicsScore, double chemisteryScore, double mathScore) {
    		 this. physicsScore=physicsScore;
        	 this.chemisteryScore=chemisteryScore;
        	 this.mathScore=mathScore;
        	  
    	 }

		@Override
		double getPercentage() {
         	return (physicsScore + chemisteryScore + mathScore)/3;
		}
     }
     
     class StudentB extends marks{
    	 double physicsScore;
    	 double chemisteryScore;
    	 double mathScore;
    	 double englishScore;
    	  StudentB(double physicsScore, double chemisteryScore, double mathScore, double englishScore) {
    		 this. physicsScore=physicsScore;
        	 this.chemisteryScore=chemisteryScore;
        	 this.mathScore=mathScore;
        	 this.englishScore=englishScore;
     }
		@Override
		double getPercentage() {
			return (physicsScore+chemisteryScore+mathScore+englishScore)/4;
    		
		}
     }
     class marksTester{
    	 public static void main(String[] args) {
    		 StudentA studentA=new StudentA(85,90,100);
		     System.out.println("The average percentage of StudentA is "+studentA);
			 StudentB studentB=new StudentB(75,95,70, 80);
			 System.out.println("The average percentage of StudentB ia "+studentB);
		}
     }
