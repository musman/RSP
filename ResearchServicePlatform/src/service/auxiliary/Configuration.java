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
    public int maxResponseTime;
    public boolean SDCacheMode;
    public boolean SDCacheShared;
    public int SDCacheTimeout;
    public int SDCacheSize;

}
