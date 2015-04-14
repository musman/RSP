/**
 * 
 */
package service.auxiliary;

/**
 * @author Yifan Ruan, m.usman
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

    /**
     * 
     * @param multipleThreads
     * @param maxNoOfThreads
     * @param maxQueueSize
     */
    public Configuration(boolean multipleThreads, int maxNoOfThreads, int maxQueueSize) {
		this.MultipleThreads = multipleThreads;
		this.maxNoOfThreads = maxNoOfThreads;
		this.maxQueueSize = maxQueueSize;
		if (maxNoOfThreads == -1 && MultipleThreads == true) {
			maxNoOfThreads = Runtime.getRuntime().availableProcessors();
		}
    }
    
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
