/**
 * 
 */
package service.auxiliary;

import service.auxiliary.CompositeServiceConfiguration.QueueStrategy;
import service.auxiliary.CompositeServiceConfiguration.Thread;

/**
 * @author yfruan
 * @email  ry222ad@student.lnu.se
 *
 */
public class Configuration {
    /**
	 * @param thread
	 * @param maxNoOfThreads
	 * @param queueStrategy
	 * @param maxQueueSize
	 * @param maxResponseTime
	 * @param sDCacheMode
	 * @param sDCacheShared
	 * @param sDCacheTimeout
	 * @param sDCacheSize
	 */
	public Configuration(Thread thread, int maxNoOfThreads,
			QueueStrategy queueStrategy, int maxQueueSize, int maxResponseTime,
			boolean sDCacheMode, boolean sDCacheShared, int sDCacheTimeout,
			int sDCacheSize) {
		super();
		this.thread = thread;
		this.maxNoOfThreads = maxNoOfThreads;
		this.queueStrategy = queueStrategy;
		this.maxQueueSize = maxQueueSize;
		this.maxResponseTime = maxResponseTime;
		SDCacheMode = sDCacheMode;
		SDCacheShared = sDCacheShared;
		SDCacheTimeout = sDCacheTimeout;
		SDCacheSize = sDCacheSize;
	}

	public Thread thread;
	public int maxNoOfThreads;
	public QueueStrategy queueStrategy;
	public int maxQueueSize;
	public int maxResponseTime;
	public boolean SDCacheMode;
	public boolean SDCacheShared;
	public int SDCacheTimeout;
	public int SDCacheSize;
    
}
