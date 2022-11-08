import javax.swing.text.html.Option;
import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.empty();
        System.out.println(optional);
        System.out.println(optional.isPresent());
        System.out.println(optional.isEmpty());
        System.out.println(optional.equals(Optional.empty()));
        System.out.println("Hello world!");
        System.out.println("Hello world!");
    }
}