package Testing;



public class TestMod0_Ex8 {
    public static void main(String[] args) {
        
        String string = "Hello";
        String revString = ""; 
        for (int i = string.length(); i > 0; --i)
        {
            revString = revString + (string.charAt(i-1));
        }
        System.out.println(revString);
        
        
        
        
    }
}
