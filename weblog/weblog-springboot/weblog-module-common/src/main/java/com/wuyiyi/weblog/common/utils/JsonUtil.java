package com.wuyiyi.weblog.common.utils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
/**
 * @Author: wuyiyi
 * @Date: 2024-3-1 13:39
 * @Version: v1.0.0
 * @Description: TODO
 **/
@Slf4j
public class JsonUtil {
    private static final ObjectMapper INSTANCE = new ObjectMapper();

    public static String toJsonString(Object obj) {
        try {
            return INSTANCE.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }
}
