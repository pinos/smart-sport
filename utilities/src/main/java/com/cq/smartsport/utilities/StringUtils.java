/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.cq.smartsport.utilities;

import com.cq.smartsport.list.LinkedList;

public class StringUtils {
    public static String join(LinkedList source) {
        return JoinUtils.join(source);
    }

    public static LinkedList split(String source) {
        return SplitUtils.split(source);
    }
}
