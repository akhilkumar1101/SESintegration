
package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {

    @Test
    public void testGetMessage() {

        String result = App.getMessage();

        assertNotNull(result);

        assertEquals(
            "Hello! Maven Build Successful. AWS SES CI/CD Pipeline Working!",
            result
        );
    }

    @Test
    public void testMessageNotEmpty() {

        String result = App.getMessage();

        assertEquals(false, result.isEmpty());
    }
}
