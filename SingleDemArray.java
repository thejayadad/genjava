public class SingleDemArray {

    int arr[] = null;
    //ESTABLISHING THE ARRAY AND THE MIN VALUE IN ALL OPEN CELLS OF THE ARRAY
    public SingleDemArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    //INSERT ITEM IN ARRAY
    public void insert(int location, int valueToBeInserted){
        try {
            if(arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToBeInserted;
                System.out.println("Value succesfully inserted");
            } else {
                System.out.println("Array cell occupied");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Invalude index to be access in array");
        }
    }

    //ARRAY TRAVERSAL
    public void traverseArray(){
        try {
            for(int i = 0; i < arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("No longer exists");
        }
    }
}
