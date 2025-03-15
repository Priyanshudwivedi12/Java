public class tryAndCatchTopic {

    public static void main(String a[]) {
        int i=4;
        int j=0;
        int nums[] =new int[5];
        String str = null;
        try {
            j = 18 / i;
            System.out.println(str.length());
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("Something Went Wrong"+e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in your limit");
        }
        catch(Exception e)
        {
               System.out.println("Something went wrong");
        }
          System.out.println(j);
          System.out.println("Bye");
    }
}
