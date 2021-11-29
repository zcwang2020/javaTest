package util;

import org.springframework.beans.BeanUtils;

/**
 * @author wangjianping
 */
public class BeanUtil {

    public static <T> T copy(Object source, Class<T> targetClass) {
        if (source == null) {
            return null;
        }
        try {
            T t = targetClass.newInstance();
            BeanUtils.copyProperties(source, t);
            return t;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
