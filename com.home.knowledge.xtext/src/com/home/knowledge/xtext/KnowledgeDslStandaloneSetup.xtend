/*
 * generated by Xtext 2.10.0
 */
package com.home.knowledge.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class KnowledgeDslStandaloneSetup extends KnowledgeDslStandaloneSetupGenerated {

	def static void doSetup() {
		new KnowledgeDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}