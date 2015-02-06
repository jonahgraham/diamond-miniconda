package org.dawnsci.miniconda.tests;

import static org.junit.Assert.fail;

import org.dawnsci.miniconda.wizards.InstallWizard;
import org.eclipse.jface.wizard.IWizard;
import org.junit.Test;

public class AnacondaWizardPluginTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testWizard() {		
		IWizard wizard = InstallWizard.createInstallWizard(null);
		assert(wizard != null);
		fail("Not yet implemented");
	}
}
