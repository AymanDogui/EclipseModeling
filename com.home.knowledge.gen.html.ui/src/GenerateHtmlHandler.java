 

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;

import com.home.knowledge.Organisation;
import com.home.knowledge.gen.html.common.Generate;

public class GenerateHtmlHandler {
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection isel) {
		Object selected = isel.getFirstElement();
		if(selected instanceof Organisation)
			executeForOrganisation((Organisation) selected);
	}
	
	@Execute
	public void executeForOrganisation(@Named(IServiceConstants.ACTIVE_SELECTION) Organisation org){
		File targetFolder = new File("c:/TMP");
		try {
			Generate gen = new Generate(org, targetFolder, Collections.emptyList());
			gen.doGenerate(new BasicMonitor());
			System.out.println("File generated in : /tmp");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_SELECTION) IStructuredSelection s){
		return (s != null && s.getFirstElement() instanceof Organisation);
	}
		
}