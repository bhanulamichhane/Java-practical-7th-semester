import java.util.Scanner;
public class SortNumber1 {
    int n1, n2, n3;
    public static void main(String args[])
    {
        int tmp;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 3 numbers");
        SortNumber1 obj = new SortNumber1();
        obj.n1=scan.nextInt();
        obj.n2=scan.nextInt();
        obj.n3=scan.nextInt();
        
        if(obj.n1>obj.n2)
        {
            swap1(obj);
        }
        if(obj.n2>obj.n3)
        {
            swap2(obj);
            if(obj.n1>obj.n2)
            {
                swap1(obj);
            }
        }
        System.out.println(obj.n1+""+obj.n2+""+obj.n3);
    }
    
    public static void swap1(SortNumber1 obj)
    {
        int tmp;
        tmp=obj.n1;
        obj.n1=obj.n2;
        obj.n2=tmp;
    }
    public static void swap2(SortNumber1 obj)
    {
        int tmp;
        tmp=obj.n2;
        obj.n2=obj.n3;
        obj.n3=tmp;
    }
    
    
}
