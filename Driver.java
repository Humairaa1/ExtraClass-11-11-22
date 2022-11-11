public class Driver{
    public static void main(String []args){
        Account accoun1=new Account();
        accoun1.show_Data();
        accoun1.setInput(101,1000.50);
        accoun1.show_Data();
        accoun1.deposit(500.50);
        accoun1.show_Data();
    }
     
}