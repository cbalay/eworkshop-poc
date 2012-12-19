package com.productys.poc;

import com.productys.poc.composite.eworkshop.EworkshopPoc2;
import com.vaadin.Application;
import com.vaadin.terminal.Terminal;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;
import com.vaadin.ui.Window.Notification;

/**
 * Cette application est utilisée uniquement pour faire des tests graphiques. On peut créer des composants, les tester avec Eclipse sans redémarrer le serveur.
 * 
 * @author Clément Balaÿ
 *
 */
public class EworkshopApplicationPoc extends Application {
	
	private static final long serialVersionUID = -2883689767996649336L;

	@Override
	public void init() {
		Window mainWindow = new Window("Testvaadin Application");
		mainWindow.getContent().setSizeFull();

		/**
		 * Test spplitPanel
		 */
		EworkshopPoc2 poc = new EworkshopPoc2();
		poc.setSizeFull();
		
		
		mainWindow.addComponent(poc);
		
		
		
		
		/**
		 * Test de l'"évenement de la fermeture d'une fenêtre
		 */
		// Close the application if the main window is closed.
		mainWindow.addListener(new Window.CloseListener(){
		    public void windowClose(CloseEvent e) {
		       System.out.println("Closing the application");
		       getMainWindow().getApplication().close();
		    } 
		});
		
		setMainWindow(mainWindow);
		
		setTheme("testvaadintheme");
	}
	
	@Override
	public void terminalError(Terminal.ErrorEvent event) {
	    // Call the default implementation.
	    super.terminalError(event);

	    // Some custom behaviour.
	    if (getMainWindow() != null) {
	        getMainWindow().showNotification(
	                "An unchecked exception occured!",
	                event.getThrowable().toString(),
	                Notification.TYPE_ERROR_MESSAGE);
	    }
	}

}
