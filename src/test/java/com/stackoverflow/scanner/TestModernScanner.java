package com.stackoverflow.scanner;

import org.junit.Ignore;
import org.junit.Test;

public class TestModernScanner
{
    @Ignore
    @Test
    public void testSystemIn() throws Exception
    {
        final ModernScanner ms = new ModernScanner(System.in);
        System.out.println("Type something and press enter!");
        while(ms.iterator().hasNext())
        {
            System.out.println(ms.predicateIterator().next());
        }
    }
}
