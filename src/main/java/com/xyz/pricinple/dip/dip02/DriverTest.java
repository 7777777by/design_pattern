package com.xyz.pricinple.dip.dip02;

import junit.framework.TestCase;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Test;

/**
 * @auth: liuyang
 * @date: 2018/9/9 16:04
 */
public class DriverTest extends TestCase {
    Mockery context = new JUnit4Mockery();

    @Test
    public void testDriver() {
        // 根据接口虚拟一个对象
        final ICar car = context.mock(ICar.class);
        IDriver driver = new Driver();
        // 内部类
        context.checking(new Expectations(){
            {
                oneOf(car).run();
            }
        });
        driver.drive(car);
    }
}
