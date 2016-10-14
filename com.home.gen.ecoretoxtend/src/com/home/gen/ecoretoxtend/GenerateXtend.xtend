package com.home.gen.ecoretoxtend

import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EClass
import java.io.File
import java.io.FileWriter

class GenerateXtend {
	
	def static void main(String[] args) {
		val gx = new GenerateXtend
		val c = EcorePackage.eINSTANCE
		gx.generate(c)
	}
	
	def generate(EPackage p){
		
		
		for (e : p.EClassifiers.filter(EClass)) {
			println(e.generateXtend)
		}
	}
	
	def dispatch generateXtend(EClass c) '''
	Class : «c.name»
	«FOR att : c.EAllAttributes»
			Attribute : «att.EAttributeType.name» «att.name»
	«ENDFOR»
	«FOR op : c.EAllOperations»
		Operation : «op.name» 
	«ENDFOR»
	'''
}