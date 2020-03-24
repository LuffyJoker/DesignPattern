package single;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Mr.Q
 * @date 2020/3/25 0:16
 * desc：使用 HashMap 实现单例模式，创建一个对象丢进 HashMap,在使用时，直接从 HashMap里面取
 */
public class SingletonMap {

    // 管理单例的 Map 在初始化时放进 Map，使用时取出即可
    private static Map<String, Object> objectMap = new HashMap<>();

    private SingletonMap() {
    }

    private static void registerObject(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getObject(String key) {
        return objectMap.get(key);
    }
}
