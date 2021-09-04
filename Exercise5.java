/*
This problem was asked by Google.

Given two singly linked lists that intersect at some point, find the intersecting node. The lists are non-cyclical.

For example, given A = 3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10, return the node with value 8.

In this example, assume nodes with the same value are the exact same node objects.

Do this in O(M + N) time (where M and N are the lengths of the lists) and constant space.*/

public class Exercise5 {

    private static Integer ReturnIntersectionNode(Integer[] pArrayOne, Integer[] pArrayTwo){
        Integer result = 0;

        for(int i = 0; i < pArrayOne.length; i++){

            for(int j = 0; j < pArrayTwo.length; j++){

                //System.out.println(pArrayOne[i] + " igual " + pArrayTwo[j]);
                if (pArrayOne[i] == pArrayTwo[j]){
                  result = pArrayOne[i];
                  break;
                }
                
            }
            if (result == pArrayOne[i]){
                break;
            }
        }
        return result;
    } 

    public static void main(String[] args) throws Exception {

        Integer[] ListA = {3, 7, 8, 10};
        Integer[] ListB = {99, 1, 8, 10};
        
        Integer result = ReturnIntersectionNode(ListA, ListB);
        
        System.out.println(result);

    }
}
