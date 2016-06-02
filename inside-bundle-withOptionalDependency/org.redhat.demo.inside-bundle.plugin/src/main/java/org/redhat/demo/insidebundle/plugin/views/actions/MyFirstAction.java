package org.redhat.demo.insidebundle.plugin.views.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

public final class MyFirstAction extends Action {

	@Override
	public void run() {
			MessageDialog.openInformation(
				PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
				"Sample View",
				computeMessage());
	}

	String computeMessage() {
		return "Action 1 executed";
	}
	
}