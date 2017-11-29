package com.dzr.dds.config;

import java.lang.annotation.*;

/**
 * @author dingzr
 * @Description
 * @ClassName TargetDataSource
 * @since 2017/11/29 17:00
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {
    String value();
}
