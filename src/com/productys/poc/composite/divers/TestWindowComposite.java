package com.productys.poc.composite.divers;

import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;
import com.vaadin.ui.Window.CloseEvent;

/** Component contains a button that allows opening a window. */
public class TestWindowComposite extends CustomComponent implements Window.CloseListener {
	
	private static final long serialVersionUID = 6295601301954051571L;
	
	Window mainwindow;  // Reference to main window
    Window mywindow;    // The window to be opened
    Button openbutton;  // Button for opening the window
    Button closebutton; // A button in the window
    Button closeAppButton;  // Button for closing application
    Label  explanation; // A descriptive text

    public TestWindowComposite(String label, Window main) {
        mainwindow = main;

        // The component contains a button that opens the window.
        final VerticalLayout layout = new VerticalLayout();
        
        openbutton = new Button("Open Window", this,
                                "openButtonClick");
        closeAppButton = new Button("Close app", this, "closeAppButtonClick");
        
        explanation = new Label("Explanation");
        layout.addComponent(openbutton);
        layout.addComponent(explanation);
        layout.addComponent(closeAppButton);
        
        setCompositionRoot(layout);
    }

    /** Handle the clicks for the two buttons. */
    public void openButtonClick(Button.ClickEvent event) {
        /* Create a new window. */
        mywindow = new Window("My Dialog");
        mywindow.setPositionX(200);
        mywindow.setPositionY(100);
        mywindow.setModal(false);

        /* Add the window inside the main window. */
        mainwindow.addWindow(mywindow);

        /* Listen for close events for the window. */
        mywindow.addListener(this);

        /* Add components in the window. */
        mywindow.addComponent(
                new Label("A text label in the window."));
        closebutton = new Button("Close", this, "closeButtonClick");
        mywindow.addComponent(closebutton);

        /* Allow opening only one window at a time. */
        openbutton.setEnabled(false);

        explanation.setValue("Window opened");
    }

    /** Handle Close button click and close the window. */
    public void closeButtonClick(Button.ClickEvent event) {
        /* Windows are managed by the application object. */
        mainwindow.removeWindow(mywindow);

        /* Return to initial state. */
        openbutton.setEnabled(true);

        explanation.setValue("Closed with button");
    }

    /** In case the window is closed otherwise. */
    public void windowClose(CloseEvent e) {
        /* Return to initial state. */
        openbutton.setEnabled(true);

        explanation.setValue("Closed with window controls");
    }

    /** Handle Close app button click. */
    public void closeAppButtonClick(Button.ClickEvent event) {
    	//mainwindow.getApplication().close();
    	
    	throw new RuntimeException("You can't catch this.");
    }
}