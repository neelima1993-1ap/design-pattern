public class SingleObject {
   
   private int count=0;
   
   private static SingleObject instance = new SingleObject();//eager initialisation

   private SingleObject()
     {
     }
     
   public static SingleObject getInstance()
       {
          return instance;
       }

    public void count()
        {
           count++;
           System.out.println(count);
        }
}
