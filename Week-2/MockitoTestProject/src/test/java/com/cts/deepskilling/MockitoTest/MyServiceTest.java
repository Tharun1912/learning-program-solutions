package com.cts.deepskilling.MockitoTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    private ExternalApi mockApi;

    @InjectMocks
    private MyService service;

    @Test
    public void testExternalApi() {
        when(mockApi.getData()).thenReturn("Mock Data");
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}
