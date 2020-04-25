package com.techlabs.model;

import java.lang.annotation.*;

@Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@Target(value = { java.lang.annotation.ElementType.METHOD })
public @interface MyBeforeEveryUnitTestcase {
	
}
