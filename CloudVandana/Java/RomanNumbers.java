package Java;
import java.util.*;

public class RomanNumbers {
    public int romanToInt(String s){
        int num =0, temp=0, sum=0;
        for(int i= s.length()-1; i>=0;i--){
            switch(s.charAt(i))
            {
                case 'I' : num =1;
                break;

                case 'V' : num =5;
                break;

                case 'X' : num =10;
                break;

                case 'L' : num=50;
                break;

                case 'C' : num=100;
                break;

                case 'D' : num = 500;
                break;

                case 'M' : num =1000;
                break;
            }
            if(num<temp){
                sum = sum-num;
                temp = num;

            }else{
                sum = sum+num;
                temp=num;
            }
        }
        return sum;
    }



    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Number: ");

        String str = sc.nextLine();
        RomanNumbers obj = new RomanNumbers();
        int result = obj.romanToInt(str);
        System.out.println("Integer Number: " + result);

    }
}
