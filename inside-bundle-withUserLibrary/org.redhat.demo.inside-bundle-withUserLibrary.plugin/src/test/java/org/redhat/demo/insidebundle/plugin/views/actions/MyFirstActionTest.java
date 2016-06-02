package org.redhat.demo.insidebundle.plugin.views.actions;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFirstActionTest {
	
	@Test
	public void testComputedMessage() throws Exception {
		assertEquals("Action 1 executed", new MyFirstAction().computeMessage());
	}
}
