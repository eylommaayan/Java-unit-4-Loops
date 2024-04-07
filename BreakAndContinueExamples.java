// breake & continue נותן שליטה מלאה על הלולאות

public class BreakAndContinueExamples {

    public static void main(String[] args) {
    
     //כאשר התנאי מתקיים הלולאה מפסיקה וממשיכה ללואה הבאה break- שימוש ב
        for (int i = 1; i < 11; i++) {
            if (i == 5){
                break;
            }
            System.out.println(i);
           }
        
        //כאשר התנאי מתקיים הלולאה מדלגת על התנאי שנרשם וממשיכה להבא continue- שימוש ב
        for (int i = 1; i < 11; i++) {
        if (i == 5){
            continue;
        }
        System.out.println(i);
       }

        // Example 3: Find the smallest number greater than 20 that is divisible by 3 (using break)
        
        for (int i= 21; i < 30; i++){
            if (i % 3==0){
                System.out.println("המספר הקטן ביותר שגדול מ-20 ומתחלק ב-3");
                break;
            }
        }
        
        // TODO: Write a loop that finds the smallest number greater than 20 that is divisible by 3 using the 'break' statement
       //כאשר התנאי מתקיים הלולאה מדלגת על התנאי שנרשם וממשיכה להבא continue- שימוש ב
       for (int i=1; i < 21; i++) {
            if (i % 2 !=0){
                continue;
            }
            System.err.println(i);
        }
    }
}
