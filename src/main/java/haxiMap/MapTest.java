package haxiMap;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> userMap = new HashMap<String,Integer>();
        userMap.put("1",123);
        System.out.println(userMap);

    }
}
