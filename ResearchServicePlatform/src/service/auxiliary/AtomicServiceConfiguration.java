package service.auxiliary;

public @interface AtomicServiceConfiguration {
    public boolean MultipeThreads() default false;
    public int MaxNoOfThreads() default 1;
    public int MaxQueueSize() default 0;
}
