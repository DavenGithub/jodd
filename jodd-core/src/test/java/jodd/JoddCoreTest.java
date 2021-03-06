// Copyright (c) 2003-2014, Jodd Team (jodd.org). All Rights Reserved.

package jodd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JoddCoreTest {

	@Test
	public void testLoadedModules() {
		assertEquals(false, Jodd.isBeanLoaded());
		assertEquals(false, Jodd.isHttpLoaded());
		assertEquals(false, Jodd.isMadvocLoaded());
		assertEquals(false, Jodd.isMailLoaded());
		assertEquals(false, Jodd.isPetiteLoaded());
		assertEquals(false, Jodd.isPropsLoaded());
		assertEquals(false, Jodd.isProxettaLoaded());
		assertEquals(false, Jodd.isServletLoaded());
		assertEquals(false, Jodd.isUploadLoaded());
		assertEquals(false, Jodd.isVtorLoaded());
	}
}
