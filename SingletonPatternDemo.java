public class SingletonPatternDemo {
   public static void main(String[] args) {

      SingleObject object1 = SingleObject.getInstance();
      object1.count();
      SingleObject object2 = SingleObject.getInstance();
      object2.count(); 
   }
}
