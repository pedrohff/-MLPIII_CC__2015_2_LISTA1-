
public class FabricaDeCarro {

   private static FabricaDeCarro singleton = new FabricaDeCarro( );
   

   private FabricaDeCarro(){ }
   

   public static FabricaDeCarro getInstance( ) {
      return singleton;
   }

}
