public class TwoSum {

    //Constructor
    TwoSum(){
    }

    //Method
    public int[] Solution(int [] tab, int target){

        //Searching through the given tab
        for(int i=0; i<tab.length; i++){

            //Trying to get the target
            for(int j=i+1; j<tab.length; j++){
                if(tab[i]+tab[j]==target){

                    //Returning the target into an array
                    return new int[]{i,j};
                }
            }
        }

        //If no found target returning an empty array
        return new int[]{};
    }
 
    public static void main(String[]args){

        //Creating an array with values
        int[] tab1 = new int[]{1,2,3,4,5,6,7,8,9,10};

        //Instanciating the class
        TwoSum essai = new TwoSum();

        //Calling the methode with the needed arguments
        int[] result = essai.Solution(tab1,10);

        //Printing out the result of the method
        System.out.println("[" + result[0] + "," + result[1]+ "]");

    }
}
