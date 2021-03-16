package com.unittest.mailchecker;

import org.junit.Test;

import static com.unittest.mailchecker.utils.MailUtils.checkMail;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CheckMailUnitTest {
    @Test
    public void mail_isCorrect() {
        assertTrue(checkMail("toto@gegemail.fr"));
        assertFalse(checkMail("toto@gmailfr"));
    }
}
