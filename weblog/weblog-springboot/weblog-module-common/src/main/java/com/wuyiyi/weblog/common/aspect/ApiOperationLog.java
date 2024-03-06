package com.wuyiyi.weblog.common.aspect;
/**
 * @Author: wuyiyi
 * @Date: 2024-3-1 13:36
 * @Version: v1.0.0
 * @Description: TODO
 **/
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";

}