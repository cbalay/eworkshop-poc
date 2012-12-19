package com.productys.poc.composite.divers;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class Testvaadin2Application extends Application {
	@Override
	public void init() {
		Window mainWindow = new Window("Testvaadin2 Application");
		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);
		setMainWindow(mainWindow);
	}

}
