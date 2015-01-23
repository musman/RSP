/**
 * 
 */
package service.auxiliary;

/**
 * @author yfruan, m.usman
 * @email ry222ad@student.lnu.se
 * 
 */
public class Configuration {
    
    /**
     * 
     * @param multipleThreads
     * @param maxNoOfThreads
     * @param maxQueueSize
     * @param maxResponseTime
     * @param sDCacheMode
     * @param sDCacheShared
     * @param sDCacheTimeout
     * @param sDCacheSize
     */
    public Configuration(boolean multipleThreads, int maxNoOfThreads, int maxQueueSize, int timeout, boolean ignoreTimeoutError,int maxRetryAttempts,boolean sDCacheMode, boolean sDCacheShared, int sDCacheTimeout,
	    int sDCacheSize) {
	this(multipleThreads, maxNoOfThreads, maxQueueSize);
	this.timeout = timeout;
	this.ignoreTimeoutError = ignoreTimeoutError;
	this.maxRetryAttempts = maxRetryAttempts;
	SDCacheMode = sDCacheMode;
	SDCacheShared = sDCacheShared;
	SDCacheTimeout = sDCacheTimeout;
	SDCacheSize = sDCacheSize;
    }

    public Configuration(boolean multipleThreads, int maxNoOfThreads, int maxQueueSize) {
	this.MultipleThreads = multipleThreads;
	this.maxNoOfThreads = maxNoOfThreads;
	this.maxQueueSize = maxQueueSize;
	if (maxNoOfThreads == -1 && MultipleThreads == true){
	    maxNoOfThreads = Runtime.getRuntime().availableProcessors();
	}
    }
    
    /*
    public Configuration(){
    	this.MultipleThreads = false;
    	this.maxNoOfThreads = 1;
    	this.maxQueueSize = 0;
    	this.maxResponseTime = 0;
    	SDCacheMode = false;
    	SDCacheShared = false;
    	SDCacheTimeout = 0;
    	SDCacheSize = 0;
    }*/

    public boolean MultipleThreads;
    public int maxNoOfThreads;
    public int maxQueueSize;
    public int timeout;
    public boolean ignoreTimeoutError;
    public int maxRetryAttempts;
    public boolean SDCacheMode;
    public boolean SDCacheShared;
    public int SDCacheTimeout;
    public int SDCacheSize;

}
