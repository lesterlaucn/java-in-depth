package com.tenstone.annotations.refect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by liuyuancheng on 2022/2/7 <br/>
 *
 * @author liuyuancheng
 */
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ClassDemoAnnotation {

}
