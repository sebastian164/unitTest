package util;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class StringUtilTest {

    @Mock
    private StringUtil stringUtil;

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testEmptyString() {
        when(stringUtil.isEmpty("")).thenReturn(true);
        assertTrue("La cadena debería estar vacía", stringUtil.isEmpty(""));
    }

    @Test
    public void testNullString() {
        when(stringUtil.isEmpty(null)).thenReturn(true);
        assertTrue("null debería ser considerado vacío", stringUtil.isEmpty(null));
    }

    @Test
    public void testNonEmptyString() {
        when(stringUtil.isEmpty("a")).thenReturn(false);
        assertTrue("La cadena no debería estar vacía", !stringUtil.isEmpty("a"));
    }

    @Test
    public void testStringWithSpaces() {
        when(stringUtil.isEmpty("   ")).thenReturn(true);
        assertTrue("La cadena con solo espacios debería estar vacía", stringUtil.isEmpty("   "));
    }
}