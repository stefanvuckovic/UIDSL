/*
 * generated by Xtext 2.10.0
 */
package com.stefanvuckovic.uidsl.ui.tests;

import com.google.inject.Injector;
import com.stefanvuckovic.uidsl.ui.internal.UidslActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class UIDSLUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return UidslActivator.getInstance().getInjector("com.stefanvuckovic.uidsl.UIDSL");
	}

}
