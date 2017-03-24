package com.commons.util;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.METHOD})    
@Retention(RetentionPolicy.RUNTIME)    
@Documented
public @interface AccessLogUtil {
	public String access_content()  default "";
}
