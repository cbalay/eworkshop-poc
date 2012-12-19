package com.productys.poc.composite.divers;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalSplitPanel;

public class TestSplitPanel extends CustomComponent {

	@AutoGenerated
  private AbsoluteLayout mainLayout;
	@AutoGenerated
  private HorizontalSplitPanel horizontalSplitPanel_1;
	@AutoGenerated
  private VerticalSplitPanel verticalSplitPanel_1;

	/*- VaadinEditorProperties={"grid":"RegularGrid,20","showGrid":true,"snapToGrid":true,"snapToObject":true,"movingGuides":false,"snappingDistance":10} */

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public TestSplitPanel() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

		// TODO add user code here
	}

	@AutoGenerated
  private AbsoluteLayout buildMainLayout() {
	  // common part: create layout
	  mainLayout = new AbsoluteLayout();
	  mainLayout.setImmediate(false);
	  mainLayout.setWidth("100%");
	  mainLayout.setHeight("100%");
	  mainLayout.setMargin(false);
	  
	  // top-level component properties
	  setWidth("100.0%");
	  setHeight("100.0%");
	  
	  // verticalSplitPanel_1
	  verticalSplitPanel_1 = new VerticalSplitPanel();
	  verticalSplitPanel_1.setImmediate(false);
	  verticalSplitPanel_1.setWidth("780px");
	  verticalSplitPanel_1.setHeight("280px");
	  verticalSplitPanel_1.setMargin(false);
	  mainLayout.addComponent(verticalSplitPanel_1, "top:40.0px;left:60.0px;");
	  
	  // horizontalSplitPanel_1
	  horizontalSplitPanel_1 = new HorizontalSplitPanel();
	  horizontalSplitPanel_1.setImmediate(false);
	  horizontalSplitPanel_1.setWidth("360px");
	  horizontalSplitPanel_1.setHeight("320px");
	  horizontalSplitPanel_1.setMargin(false);
	  mainLayout.addComponent(horizontalSplitPanel_1, "top:400.0px;left:60.0px;");
	  
	  return mainLayout;
  }

}
