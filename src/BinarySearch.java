public class BinarySearch
{
    private int[] arr;

    public BinarySearch(int[] arr) {
        this.arr = arr;
    }

    public boolean BinarySearch2(int searchElement)
    {
        boolean response = false;
        int low = 0;
        int high = arr.length-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(searchElement == arr[mid])
            {
                response = true;
                break;
            }
            else if(searchElement < arr[mid])
            {
                high = mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return response;
    }

    public static void main(String[] args) {
        int[] sortedarray = {10,20,30,40,50,60,70,80,90,100};
        int searchElement = 8;
        BinarySearch obj = new BinarySearch(sortedarray);
        boolean result = obj.BinarySearch2(searchElement);
        if(result)
        {
            System.out.println("found");
        }
        else
        {
            System.out.println("not found");
        }
    }
}
