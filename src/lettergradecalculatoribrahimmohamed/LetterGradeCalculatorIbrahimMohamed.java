//Ibrahim Mohamed

package lettergradecalculatoribrahimmohamed;

import java.util.Scanner;

public class LetterGradeCalculatorIbrahimMohamed
{

    public static void main(String[] args)
    {
        String name, idNum;
        int q1, q2, e1, e2, bestQuiz, bestExam;
        double score;
        char letterGrade;
        Scanner kbd;
        kbd = new Scanner(System.in);
        System.out.println("Enter the student’s name:");
        name = kbd.nextLine();
        System.out.println("Enter the id number: ");
        idNum = kbd.nextLine();
        System.out.println("Enter the quiz scores:");
        q1 = kbd.nextInt();
        q2 = kbd.nextInt();
        System.out.println("Enter the exam scores:");
        e1 = kbd.nextInt();
        e2 = kbd.nextInt();
        bestQuiz = max(q1, q2);
        bestExam = max(e1, e2);
        score = computeRawPercentage(bestQuiz, bestExam);
        letterGrade = finalGrade(score);
        System.out.print("\n" + name + " " + idNum + " ");
        System.out.println("Final Grade: " + letterGrade);
    }

    public static int max(int n1, int n2)
    {
        int big;

        if (n1 > n2)
        {
            big = n1;
        } else
        {
            big = n2;
        }
        return big;

    }

    public static double computeRawPercentage(int quizScore, int examScore)
    {
        return ((quizScore * .4) + (examScore * .6));
    }

    public static char finalGrade(double score)
    {
        if (score >= 90)
        {
            return 'A';
        } else if (score >= 80)
        {
            return 'B';
        } else if (score >= 70)
        {
            return 'C';
        } else if (score >= 60)
        {
            return 'D';
        } else
        {
            return 'F';
        }
    }
}
