enum status
{
    Insert, Update, Delete, On_fly;
}
public class Main {
    public static void main(String[] args) {
        status s = status.On_fly;
        switch(s)
        {
            case Insert:
                System.out.println("All Inserted"+s.ordinal());
                break;
            case Update:
                System.out.println("All Updated");
                break;
            case Delete:
                System.out.println("All Deleted");
                break;
            case On_fly:
                System.out.println("All Updated on fly "+s.ordinal());
                break;

                default:
                System.out.println("Your input is wrong");

        }

    }
}