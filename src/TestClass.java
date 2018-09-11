import java.util.*;
import java.util.stream.Collectors;

public class TestClass {

    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();
        list.add("dravit");
        list.add("dravit1");
        list.add("dravit2");
        list.add("dravit3");
        list.add("dravit");
        list.add("dravit1");
        list.add("dravit2");

        List<String> strings = Collections.synchronizedList(list);

        Map<String, Long> collect = list.stream()
                .filter(s -> Collections.frequency(list, s) > 1)
                .collect(Collectors.groupingBy(o -> o, Collectors.counting()));
        System.out.println(collect);*/

        byte[] encodedBytes = Base64.getEncoder().encode("dravit:dravit".getBytes());
        System.out.println("encodedBytes " + new String(encodedBytes));
        byte[] decodedBytes = Base64.getDecoder().decode(encodedBytes);
        System.out.println("decodedBytes " + new String(decodedBytes));
    }
}
