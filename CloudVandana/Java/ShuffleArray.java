package Java;
public class ShuffleArray{

    public static void randomGenerator(int[] array){
        int noOfElement = array.length;

        for(int i=0; i<noOfElement; i++){
            int s = i + (int)(Math.random()*(noOfElement - i));

            int temp = array[s];
            array[s] = array[i];
            array[i] = temp;

        }
    }


    public static void main (String[] args){

        int[] arrayOfNumbers = {1,2,3,4,5,6,7};

        ShuffleArray.randomGenerator(arrayOfNumbers);

        for(int i=0; i<arrayOfNumbers.length;i++){
            System.out.print(arrayOfNumbers[i] + " ");
        }

    }
}