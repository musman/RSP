package service.auxiliary;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CompositeServiceConfiguration {
    public Thread Thread() default Thread.Single;
    public int MaxNoOfThreads() default 1;
    public QueueStrategy QueueStrategy() default QueueStrategy.FIFO;
    public int MaxQueueSize() default -1;
    public int MaxResponseTime() default -1;
    public boolean SDCacheMode() default false;
    public boolean SDCacheShared() default false;
    public int SDCacheTimeout() default -1;
    public int SDCacheSize() default -1;
    
    
    public enum Thread{
	Single, Multiple;
    }
    
    public enum QueueStrategy{
	FIFO, PRIORITY;
    }
    
}
