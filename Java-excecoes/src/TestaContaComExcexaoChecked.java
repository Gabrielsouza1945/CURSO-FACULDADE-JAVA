
public class TestaContaComExcexaoChecked {
    
    public static void main(String[] args) {
        
        Conta c = new Conta();
        
        try{
            c.deposita();
        } catch(Exception ex){
            System.out.println("tratando...");
        }
        
        
        
       
        
    }
    
}
