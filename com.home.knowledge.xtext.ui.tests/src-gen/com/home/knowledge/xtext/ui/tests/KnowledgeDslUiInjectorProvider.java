/*
 * generated by Xtext 2.10.0
 */
package com.home.knowledge.xtext.ui.tests;

import com.google.inject.Injector;
import com.home.knowledge.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class KnowledgeDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("com.home.knowledge.xtext.KnowledgeDsl");
	}

}
