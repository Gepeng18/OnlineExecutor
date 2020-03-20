package site.pyyf.utils;

/**
 * Created by nowcoder on 2016/7/30.
 */
public class RedisKeyUtil {
    private static String BIZ_EVENTQUEUE = "EVENT_QUEUE";

    public static String getEventQueueKey() {
        return BIZ_EVENTQUEUE;
    }


}
