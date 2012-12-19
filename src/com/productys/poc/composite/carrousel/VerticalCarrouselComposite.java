package com.productys.poc.composite.carrousel;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.NativeButton;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;

/**
 * Cette classe est utilisée pour construire un composant scrollable à partir d'un composant choisi.
 * Le but de ce composant est de pouvoir ajouter n'importe quel tyle de composant à l'intérieur. Ce composant 
 * l'affiche en mode "scrollable" sans les barres d'ascenseur et avec 2 boutons en haut et en base pour pouvoir scroller.
 * Le problème apparait lorsque ce composant doit être en 100%.
 * 
 * 
 * @author Clément Balaÿ
 *
 */
public class VerticalCarrouselComposite extends CustomComponent {

  private static final long serialVersionUID = 1L;
  
	private final String width;
	private final String height;
	
	public VerticalCarrouselComposite(ComponentContainer componentContainer, int pas, String width, String height) {
		this.width = width;
		this.height = height;
		
		VerticalLayout mainLayout = buildMainLayout(componentContainer, pas);
		setCompositionRoot(mainLayout);
	}

	public VerticalLayout buildMainLayout(ComponentContainer componentContainer, final int pas) {
		
		VerticalLayout mainLayout = new VerticalLayout();
	  mainLayout.setImmediate(false);
	  mainLayout.setWidth(this.width);
	  mainLayout.setHeight(this.height);
	  mainLayout.setMargin(false);
	  mainLayout.setStyleName("ew-mainLayout");

	  // top-level component properties
	  setWidth("100.0%");
	  setHeight("100.0%");
	  setStyleName("ew-rootLayout");
		
		// Le panel est utilisé pour avoir la partie scrollable
		final Panel panel	 = new Panel();
	  panel.setWidth("100.0%");
	  panel.setHeight("100.0%");
	  panel.setContent(componentContainer);
	  panel.setScrollable(true);
	  //panel.setImmediate(false);
	  panel.setStyleName("ew-panel");

	  // Evenement pour le scroll vers le haut
	  NativeButton scrollUp = new NativeButton("");
	  scrollUp.setWidth("100%");
	  scrollUp.setHeight("10px");
		scrollUp.addListener(new Button.ClickListener() {
		    public void buttonClick(ClickEvent event) {
		        int scrollPos = panel.getScrollTop() - pas;
		        if(scrollPos < 0) {
		        	scrollPos = 0;
		        }
		        System.out.println("scrollPos: " + scrollPos);
		        panel.setScrollTop(scrollPos);
		    }
		});
		mainLayout.addComponent(scrollUp);
		
		mainLayout.addComponent(panel);

	  // Evenement pour le scroll vers le haut
		NativeButton scrollDown = new NativeButton("");
		scrollDown.setWidth("100%");
		scrollDown.setHeight("10px");
		scrollDown.addListener(new Button.ClickListener() {
		    public void buttonClick(ClickEvent event) {
		        int scrollPos = panel.getScrollTop() + pas;
		        int panelHeight = (int)panel.getHeight();
		        int maxScrollTop = ((int) panel.getContent().getHeight() - panelHeight) + 10;
		        if(scrollPos > maxScrollTop) {
		        	scrollPos = maxScrollTop;
		        }
	    	  	System.out.println("scrollPos:" + scrollPos + ", maxScrollTop:" + maxScrollTop);
		        panel.setScrollTop(scrollPos);
		    }
		});
		mainLayout.addComponent(scrollDown);
		
		return mainLayout;
  }

}
