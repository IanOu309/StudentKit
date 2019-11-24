import java.util.Scanner;
  public class GradeCalculator{
    public static void main (String[] args){
      
      Scanner scnr = new Scanner(System.in);
      double PercentageOfFirstCategory;
      double TotalOfPointsInFirstCategory;
      double TotalOfPointsYouHaveInFirstCategory;

      double PercentageOfSecondCategory;
      double TotalOfPointsInSecondCategory;
      double TotalOfPointsYouHaveInSecondCategory;

      double PercentageOfThirdCategory;
      double TotalOfPointsInThirdCategory;
      double TotalOfPointsYouHaveInThirdCategory;

      double PercentageOfFourthCategory;
      double TotalOfPointsInFourthCategory;
      double TotalOfPointsYouHaveInFourthCategory;

      double FinalGrade;
 
      System.out.println("What percentage of your overall grade is the first category? ");
      PercentageOfFirstCategory = scnr.nextDouble();
      
      System.out.println("What percentage of your overall grade is the second cateogory? ");
      PercentageOfSecondCategory = scnr.nextDouble();
      
      System.out.println("What percentage of your overall grade is the third category?");
      PercentageOfThirdCategory = scnr.nextDouble();
        
      System.out.println("What percentage of your overall grade is the fourth category?");
      PercentageOfFourthCategory = scnr.nextDouble();
      
     //Total # of points in each category
      System.out.println("How many total points are there in the first category?");
      TotalOfPointsInFirstCategory= scnr.nextDouble();
      System.out.println("How many points do you have in the first category?");
      TotalOfPointsYouHaveInFirstCategory = scnr.nextDouble();
      
      System.out.println("How many total points are there in the second category?");
      TotalOfPointsInSecondCategory = scnr.nextDouble();
      System.out.println("How many points do you have in the second category?");
      TotalOfPointsYouHaveInSecondCategory = scnr.nextDouble();
      
      System.out.println("How many total points are there in the third category?");
      TotalOfPointsInThirdCategory = scnr.nextDouble();
      System.out.println("How many points do you have in the third category?");
      TotalOfPointsYouHaveInThirdCategory = scnr.nextDouble();

      System.out.println("How many total points are there in the fourth category?");
      TotalOfPointsInFourthCategory = scnr.nextDouble();
      System.out.println("How many points do you have in the fourth category?");
      TotalOfPointsYouHaveInFourthCategory = scnr.nextDouble();

      FinalGrade = ((TotalOfPointsYouHaveInFirstCategory/TotalOfPointsInFirstCategory)*PercentageOfFirstCategory+(TotalOfPointsYouHaveInSecondCategory/TotalOfPointsInSecondCategory)*PercentageOfSecondCategory+(TotalOfPointsYouHaveInThirdCategory/TotalOfPointsInThirdCategory)*PercentageOfThirdCategory+(TotalOfPointsYouHaveInFourthCategory/TotalOfPointsInFourthCategory)*PercentageOfFourthCategory);
      System.out.println("Your Final Grade is " + FinalGrade + "%");
     
      
      return;
    }
  }

    
  