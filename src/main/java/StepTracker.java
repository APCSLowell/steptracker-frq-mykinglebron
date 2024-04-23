import java.util.ArrayList;
public class StepTracker
{
 private int minSteps, totalSteps;
 private int totalDays, actDays;
 public StepTracker(int goals){
minSteps=goals;
totalSteps=0;
 totalDays=0;
  actDays=0;

 }
 public void addDailySteps(int steps){
  totalSteps= totalSteps +steps;
  totalDays++;
  if(steps>= minSteps)
   actDays++;
 }
 public int activeDays(){
return actDays;
 }

public double averageSteps(){
if(totalDays==0.0){
return 0.0;}
 else{
return (double) totalSteps/totalDays;
 }

}
} 
