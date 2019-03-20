package org.linlinjava.litemall.core.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期格式化工具类
 */
public class DateTimeUtil {



    public static final String CN_DATE_FORMAT = "yyyy年MM月dd日 HH:mm:ss";

    /**
     * 格式 yyyy年MM月dd日 HH:mm:ss
     *
     * @param dateTime
     * @return
     */
    public static String getDateTimeDisplayString(LocalDateTime dateTime) {
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(CN_DATE_FORMAT);
        String strDate2 = dtf2.format(dateTime);
        return strDate2;
    }
}
