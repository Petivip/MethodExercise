import java.util.*;

public class Main {


    public static void main(String[] args) {
        sum();
        division();
        sorting();
        wordLength();
        average();
        leapYear();
        countWord();
        rectangleArea();
        generateRandom5();
        generateRandomWord();
        OddEven();
        grading();
    }


    public static void sum() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter you first number to add here: ");
        int num1 = key.nextInt();
        System.out.println("enter you second number to add here: ");
        int num2 = key.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);


    }

    public static void division() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter you first number to be divided  here: ");
        int num1 = key.nextInt();
        System.out.println("enter you second number to be divided  here: ");
        int num2 = key.nextInt();
        if (num2 == 0) {
            System.out.println("Undefined");
            System.out.println("enter another number other than 0: ");
            num2 = key.nextInt();
        } else {
            int div = num1 / num2;
            System.out.println(div);
        }

    }

    public static void sorting() {

        Scanner key = new Scanner(System.in);
        int i = 0;
        ArrayList<Character> word = new ArrayList<Character>();
        while (i < 5) {
            System.out.println("Enter the " + (i + 1) + "st letter of 5 you  want to be sorted: ");
            char letter = key.next().charAt(0);
            word.add(letter);
            i++;
        }
        Collections.sort(word);
        System.out.println(word);
    }

    public static void wordLength() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter you word that need its length config: ");
        String word = key.next();

        int num = word.length();

        System.out.println("The length of the word you have entered : " +num);


    }
    public static void average() {
        Scanner key = new Scanner(System.in);
        int i = 0;
        int sum=0;

        while (i < 3) {
            System.out.println("Enter the " + (i + 1) + "st number of 3 you want to be averaged: ");
            int num = key.nextInt();
            sum+=num;
            i++;
        }

        System.out.println("The average of the three numbers : " + sum/3);

    }
    public static void leapYear() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter a year to check if leap year or not: ");
        int num = key.nextInt();
        if(num%4==0){
            System.out.println(num +" is a leap year");
        }else{
            System.out.println(num +" is not a leap year");}



    }
    public static void countWord() {
        int count=0;
        Scanner key = new Scanner(System.in);
        System.out.println("enter a sentence to check the number of words it contains: ");
        String sent= key.nextLine();
        for(String word:sent.split(" ")){
            count++;
        }
        System.out.println("The Sentence have "+ count+" words in it");
    }
    public static void rectangleArea() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter the length of the rectangle here: ");
        int num1 = key.nextInt();
        System.out.println("enter the width of the rectangle here: ");
        int num2 = key.nextInt();
        int sum = num1 * num2;
        System.out.println("The area of the rectangle is :" + sum);

    }
    public static void generateRandom5() {
        int i=0;
        System.out.print("The five numbers that are generated are: ");
        while (i<5) {
            Random r = new Random();
            int rand = 1 + r.nextInt(100);
            System.out.print(rand +", ");
            i++;
        }
        System.out.println(" ");

    }
    public static void generateRandomWord() {
        String[] arr={"module", "class","implement","another","easy"};

            Random r = new Random();
            int rand = 1 + r.nextInt(6);
            System.out.println(arr[rand]);

    }
    public static void OddEven() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter the number to check if odd or even ");
        int num1 = key.nextInt();
       if(num1%2==0){
           System.out.println( num1+ " is an even number ");
       }else {
           System.out.println( num1+ " is an odd number ");
       }


    }
    public static void grading() {
        Scanner key = new Scanner(System.in);
        System.out.println("enter your score here to be graded ");
        int num = key.nextInt();
        char grade=' ';
        if( 90<num && num<100){
            grade='A';
        }else if( 80<num && num<90){
            grade='B';
        }else if( 70<num && num<80){
            grade='C';
        }else if( 60<num && num<70){
            grade='D';
        }else if( 50<num && num<60){
            grade='E';
        }else if( num<50){
            grade='F';
        }
        System.out.println("Your grade is :" + grade);


    }




}