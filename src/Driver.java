import MergeSort.MergeSort;
import Traveller.Traveller;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of currency denomination");
        int numberOfDenominations = sc.nextInt();

        Traveller traveller = new Traveller(numberOfDenominations);

        System.out.println("enter the currency denominations value");
        for(int i=0; i<numberOfDenominations; i++)
        {
            int inputTransaction = sc.nextInt();
            traveller.addDenominationsToArray(i,inputTransaction);
        }

        System.out.println("enter the amount you want to pay");
        int payableAmount = sc.nextInt();

        MergeSort mergeSort = new MergeSort();

        int[] denominationsArray = traveller.getDenomination();
        //sort the array in descending order
        mergeSort.sort(denominationsArray, 0,denominationsArray.length-1);
        //calculate denominations and its count
        traveller.displayDenominationCount(payableAmount, denominationsArray);
        sc.close();
    }


}
