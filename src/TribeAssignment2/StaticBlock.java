package TribeAssignment2;

public class StaticBlock {
    static int Var1; 
    int Var2;        

    // Static block
    static {
        System.out.println("Static block executed.");
        Var1 = 100; 
    }

    // Non-static block
    {
        System.out.println("Non-static block executed.");
        Var2 = 50; 
    }

    
    public static void main(String[] args) {
        
        
        
    	System.out.println("Static Var1: " + Var1);
        
        StaticBlock obj1 = new StaticBlock();
        System.out.println("Instance Var2: " + obj1.Var2);

        
    }
}
