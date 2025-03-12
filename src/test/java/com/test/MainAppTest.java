package com.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.MainApp;

public class MainAppTest {
    
    @Test
    public void testAddition() {
        MainApp app = new MainApp();
        assertEquals(14, app.addition(8, 6));
    }
    
    @Test
    public void testMultiply() {
        MainApp app = new MainApp();
        assertEquals(48, app.multiply(8, 6));
    }
}
