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
    public Configuration(boolean multipleThreads, int maxNoOfThreads, int maxQueueSize, int maxResponseTime, boolean sDCacheMode, boolean sDCacheShared, int sDCacheTimeout,
	    int sDCacheSize) {
	this.MultipleThreads = multipleThreads;
	this.maxNoOfThreads = maxNoOfThreads;
	this.maxQueueSize = maxQueueSize;
	this.maxResponseTime = maxResponseTime;
	SDCacheMode = sDCacheMode;
	SDCacheShared = sDCacheShared;
	SDCacheTimeout = sDCacheTimeout;
	SDCacheSize = sDCacheSize;
    }

    public Configuration(boolean multipleThreads, int maxNoOfThreads, int maxQueueSize) {
	this.MultipleThreads = multipleThreads;
	this.maxNoOfThreads = maxNoOfThreads;
	this.maxQueueSize = maxQueueSize;
    }

    public boolean MultipleThreads;
    public int maxNoOfThreads;
    public int maxQueueSize;
    public int maxResponseTime;
    public boolean SDCacheMode;
    public boolean SDCacheShared;
    public int SDCacheTimeout;
    public int SDCacheSize;

}
