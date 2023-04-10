import java.io.IOException;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int i = 0;
        byte b[] = new byte[1];
        while((i = System.in.read())!= -1){
            b[0] = (byte) i;
            System.out.println(new String(b, "UTF-8"));
        }
    }
}
