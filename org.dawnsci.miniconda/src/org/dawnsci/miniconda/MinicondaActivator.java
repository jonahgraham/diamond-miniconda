package org.dawnsci.miniconda;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in life cycle
 */
public class MinicondaActivator implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.dawnsci.miniconda"; //$NON-NLS-1$

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}


	@Override
	public void start(BundleContext bundleContext) throws Exception {
		MinicondaActivator.context = bundleContext;
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		MinicondaActivator.context = null;
	}


	/**
	 * Return the URL of a file represented by path
	 * @param path Path to the file e.g. new Path("installer/Anaconda_License.txt")
	 * @return URL within the Bundle
	 * @see FileLocator#find(URL)
	 */
	public static URL getBundleURL(Path path) {
		Bundle bundle = MinicondaActivator.getContext().getBundle();
		URL licenseUrl = FileLocator.find(bundle, path, null);
		return licenseUrl;
	}

}
