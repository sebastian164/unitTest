package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_hass_less_than_8_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("1234567"));
    }

    @Test
    public void weak_when_hass_only_letters() {
        assertEquals(PasswordUtil.SecurityLevel.WEAK,PasswordUtil.assessPassword("abshdc"));
    }

    @Test
    public void medium_when_hass_lleters_and_numbers() {
        assertEquals(PasswordUtil.SecurityLevel.MEDIUM,PasswordUtil.assessPassword("abshd12c"));
    }
}