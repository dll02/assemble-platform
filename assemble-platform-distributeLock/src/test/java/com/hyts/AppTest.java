package com.hyts;

import static org.junit.Assert.assertTrue;

import com.hyts.assemble.distributeLock.redis.RedisDistributedLock;
import com.hyts.assemble.distributeLock.redis.RedisDistributedLockParam;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    @RedisDistributedLock
    public void shouldAnswerWithTrue(    String test)
    {
        assertTrue( true );
    }
}
