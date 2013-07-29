import components.simplereader.SimpleReader;
import components.simplereader.SimpleReader1L;
import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
public final class Utils {

    private Utils() {
    	// constructor
    }
    
    private static String extracFirstWord(String str){
    	String temp = "";
    	
    	int space = str.indexOf(" ");
    	temp = str.substring(0, space-1);
    	space = temp.indexOf(" ");
    			
    	String word = temp.substring(0, space-1);

    	return word;
    }
   
    /**
     * This function takes in a string of the formate of three words each seperated by a space
     * @param command_str The string to parse
     * @return A array of 3 strings.
     */
    private static String[] extractElements(String command_str){
    	String first = "";
    	String second = "";
    	String third = "";
    	
    	int space = command_str.indexOf(" ");
    	first = command_str.substring(0, space -1);
    	String command_trim = command_str.trim();
    	space = command_trim.indexOf(" ");
    	second = command_trim.substring(0, space -1);
    	int end = command_trim.length();
    	third = command_trim.substring(space+1, end-1);

    	String[] ret = {first, second, third};

    	return ret;
    }
    
    
    
    public static Command stringToCommand(String command_str){
    	Command command = new Command();
    	
    	
    	String system = extracFirstWord(command_str);
    	
    	return command;
    	
    }

    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        SimpleReader in = new SimpleReader1L();
        
        String test = in.nextLine();
        
        String[] words = extractElements(test);
        
        out.println(words[1]);
        out.println(words[2]);
        out.println(words[3]);
        
        out.close();
    }

}
