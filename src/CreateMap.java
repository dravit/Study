import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateMap {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        List<String> list = ListMap.getList();
        Map<String, String> map1 = new HashMap<>();
        for (String e : list) {
            String[] split = e.split("::::");
            if (split.length == 2)
                map1.put(e.split("::::")[0], e.split("::::")[1]);
            else
                map1.put(e.split("::::")[0], "");
        }

        for(Map.Entry<String, String> entry : map1.entrySet()) {
            if(!entry.getKey().contains("_DESC")) {
                sb.append(entry.getValue()).append(":").append("\n");
                sb.append("\t").append("faultCode: ").append(entry.getValue()).append("\n");
                sb.append("\t").append("faultDescription: ").append(map1.get(entry.getKey()+"_DESC")).append("\n");
                sb.append("\t").append("faultTrace: ").append("''").append("\n");
                sb.append("\t").append("faultOriginator: ").append("''").append("\n");
                sb.append("\t").append("faultType: ").append("''").append("\n");
            }
        }
        System.out.println(sb);
    }
}
