public class MultipleCatchBlocks {
    public static void main(String[] args) throws Exception{

        int[]array1 = null;
        int[]array2 = {1,2,3};
        System.out.println("Element : " + retrieveElement(array1, 0));      // this will throw nullPointerException
        System.out.println("Element : " + retrieveElement(array2, 0));      // this will throw indexOutOfBound exception
    }

    static int retrieveElement(int[]array, int index) throws Exception{
        try{
            // return the index value of array
            return array[index];
        }

        catch (NullPointerException e){
            throw new Exception("Array is not initialized!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            throw new Exception("Invalid index!");
        }
    }
}
