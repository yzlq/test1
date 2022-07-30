import java.lang.reflect.Constructor;
import java.util.concurrent.ThreadPoolExecutor;

public class StackDemo02 {

    // 记录调用了多少次出现了栈内存溢出
    private static int count = 0 ;

    // 入口方法
    public static void main(String[] args) {

        String name1 = User.class.getName();
        Constructor<?>[] constructors = User.class.getConstructors();
        System.out.println(name1);
        System.out.println(constructors);

    }

}