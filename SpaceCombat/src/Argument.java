import components.simplewriter.SimpleWriter;
import components.simplewriter.SimpleWriter1L;
public final class Argument {

    private Argument() {
    	// constructor
    }

    public static void main(String[] args) {
        SimpleWriter out = new SimpleWriter1L();
        out.println("Hello World!");
        out.close();
    }

}
