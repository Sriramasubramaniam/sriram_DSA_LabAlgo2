package Traveller;

public class Traveller {
    int denominations[];
    public Traveller(int sizeOfArray){
        denominations = new int[sizeOfArray];
    }
    public void addDenominationsToArray(int index, int value){
        denominations[index] = value;
    }
    public int[] getDenomination(){
        return denominations;
    }
    public void displayDenominationCount(int amount, int[]denominations){
        System.out.println("Your payment approach in order to give min no of notes will be");
        for (int denomination : denominations) {
            if (denomination <= amount) {
                int denominationCount = amount / denomination;
                amount = amount % denomination;
                System.out.print(denomination);
                System.out.print(":");
                System.out.println(denominationCount);
            }
        }
        //handle case when exact amount cannot be paid with given denominations
        if(amount>0){
            System.out.println("Exact amount cannot be paid with the given denominations");
            System.out.println("Amount remaining: "+ amount);
        }
    }
}
