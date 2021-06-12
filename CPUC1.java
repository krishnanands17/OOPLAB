class CPU {
    int price;
    CPU(int price)
    {
        this.price=price;
    }
    class  processor{
        processor(int core,String manufcturer)
        {
            System.out.println("Cores"+core);
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
    static class RAM{
        RAM(double memory,String manufcturer)
        {
            System.out.println("Memory:"+memory+"GB");
            System.out.println("Manufacturer:"+manufcturer);
        }
    }
}
public class CPUC1
{
    public static void main(String ...a)
    {
        CPU c = new CPU(20000);
        CPU.processor pr=c.new processor(8,"APPLE M1");
        new CPU.RAM(32,"APPLE INC");

    }
}