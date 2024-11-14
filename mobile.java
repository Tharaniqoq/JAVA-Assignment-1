import java.util.Scanner;
class mobile{
    String name;
    int ram;
    int storage;
    String processor;
    int price;
    mobile[] m;
    public mobile( String name,int ram,int storage,String processor,int price){
        super();
        this.name=name;
        this.ram=ram;
        this.storage=storage;
        this.processor=processor;
        this.price=price;
    }
    public mobile(){
        super();
    }
    int get_mobile(int n)
    {
        m=new mobile[n];
        Scanner my = new Scanner (System.in);
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name"+""+(i+1));
            String name=my.next();
            System.out.println("Enter ram "+""+(i+1));
            int ram=my.nextInt();
            System.out.println("Enter Storage"+""+(i+1));
            int storage=my.nextInt();
            System.out.println("Enter processor "+""+(i+1));
            String processor=my.next();
            System.out.println("Enter price"+""+(i+1));
            int price=my.nextInt();
            m[i]=new mobile(name,ram,storage,processor,price);
        }
        return 1;
    }
    void print_mobile(int n)
    {
        for(int i=0;i<n;i++){
            System.out.println("name="+m[i].name);
            System.out.println("ram="+m[i].ram);
            System.out.println("storage="+m[i].storage);
            System.out.println("processor="+m[i].processor);
            System.out.println("price="+m[i].price);
        }
    }

    public static void main(String[] args){
        System.out.println("enter the no. of mobile: ");
        Scanner my=new Scanner(System.in);
        int n=my.nextInt();
        mobile m1=new mobile();
        int c=m1.get_mobile(n);
        m1.print_mobile(n);
    
}
}
