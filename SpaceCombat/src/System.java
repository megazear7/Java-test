import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
public final class System {

	
	
    private System(String system) {
    	if(system.equals("weapons")){
    		
    	}
    	if(system.equals("reactor")){
    		
    	}
    	if(system.equals("shield")){
    		
    	}
    }

    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        out.println("Hello World!");
        out.close();
    }

}
