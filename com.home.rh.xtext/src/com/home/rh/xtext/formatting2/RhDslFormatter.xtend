/*
 * generated by Xtext 2.10.0
 */
package com.home.rh.xtext.formatting2

import com.google.inject.Inject
import com.home.rh.xtext.rhDsl.Company
import com.home.rh.xtext.rhDsl.Employee
import com.home.rh.xtext.rhDsl.Project
import com.home.rh.xtext.rhDsl.Task
import com.home.rh.xtext.services.RhDslGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class RhDslFormatter extends AbstractFormatter2 {
	
	@Inject extension RhDslGrammarAccess

	def dispatch void format(Company company, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		company.interior[indent]
		
		for (Employee employees : company.getEmployees()) {
			employees.format;
		}
		for (Project projects : company.getProjects()) {
			projects.format;
		}
	}

	def dispatch void format(Project project, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Task tasks : project.getTasks()) {
			tasks.format;
		}
	}
	
	def dispatch void format(Employee employee, extension IFormattableDocument document){
		employee.interior[indent]
		employee.regionFor.keyword("height").prepend[newLine]
		employee.regionFor.keyword("weight").prepend[newLine]
	}
	
	// TODO: implement for Task
}