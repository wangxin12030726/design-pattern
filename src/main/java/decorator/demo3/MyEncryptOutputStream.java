package decorator.demo3;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 加密算法，对输出的字符统一向后移动2为，例如 a->c,b->d  y->a  z->b
 */
public class MyEncryptOutputStream extends FilterOutputStream {

    public MyEncryptOutputStream(OutputStream out) {
     super(out);
    }

    @Override
    public void write(int b) throws IOException {
        //统一向后移动2位
        b = b + 2;
        if(b >= 97+26){
            b = b - 26;
        }
        super.write(b);
    }
}
