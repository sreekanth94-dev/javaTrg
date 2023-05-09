
import java.util.*;;

public class MapInterface {
    public static void main(String[] args) {
        
        Map <String,String> dic = new HashMap<String,String>();

        dic.put("name", "identity of a person");
        dic.put("city", "place");

        System.out.println(dic.get("city"));
    }
}
