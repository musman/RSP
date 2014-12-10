package service.auxiliary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CompositeServiceConfiguration{
    
    public boolean MultipeThreads() default false;
    public int MaxNoOfThreads() default -1;
    public int MaxQueueSize() default 0;
      
    public int Timeout() default 10;
    public int MaxRetryAttempts() default 1;
    public boolean SDCacheMode() default false;
    public boolean SDCacheShared() default false;
    public int SDCacheTimeout() default 0;
    public int SDCacheSize() default 0;
}
