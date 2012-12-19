package com.productys.poc.composite.eworkshop;

import com.productys.poc.composite.divers.TestForm;
import com.vaadin.annotations.AutoGenerated;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.HorizontalSplitPanel;
import com.vaadin.ui.VerticalLayout;

/**
 * Composant pour l'application globale. ce composant met en forme les blocs principaux
 * de l'application FO. 
 * 
 * @author Cl�ment Bala�
 *
 */
public class EworkshopPoc2 extends CustomComponent {

  private static final long serialVersionUID = 1L;
  
  // Le layout principal en absolu pour que ses composants fils s'adaptent bien
	private AbsoluteLayout mainLayout;
  
  // L'ent�te de l'application
  private HorizontalLayout horizontalLayout_EnteteGlobal;
  private Button button_Quitter;
  private HorizontalLayout horizontalLayout_Entete;
  
  // La barre de gauche des op�rations
  private VerticalLayout verticalLayout_Ops;
	
	// Le split du milieu
  private HorizontalSplitPanel horizontalSplitPanel_Op;
  
  // Les composants de la partie de droite du split
  private GridLayout gridLayout_Media;
  private HorizontalLayout horizontalLayout_labelMedia;
  private VerticalLayout verticalLayout_Documents;
  private VerticalLayout verticalLayout_embeddedMedia;
  private HorizontalLayout horizontalLayout_Validation;

  // Les composants de la partie de gauche du split
  private VerticalLayout verticalLayout_Op;
  private VerticalLayout verticalLayout_AutoControles;
  private HorizontalLayout horizontalLayout_Boutons;
  private Button button_4;
  private Button button_3;
  private Button button_2;
  private VerticalLayout verticalLayout_Images;
  private VerticalLayout verticalLayout_Description;
  private VerticalLayout verticalLayout_TitleOpActuelle;

	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public EworkshopPoc2() {
		buildMainLayout();
		setCompositionRoot(mainLayout);
	}

	@AutoGenerated
  private AbsoluteLayout buildMainLayout() {
		
	  // common part: create layout
	  mainLayout = new AbsoluteLayout();
	  mainLayout.setImmediate(false);
	  mainLayout.setWidth("100%");
	  mainLayout.setHeight("100%");
	  mainLayout.setMargin(false);
	  mainLayout.setStyleName("mainLayout");
	  
	  // top-level component properties
	  setWidth("100.0%");
	  setHeight("100.0%");
	  
	  // horizontalLayout_EnteteGlobal
	  horizontalLayout_EnteteGlobal = buildHorizontalLayout_EnteteGlobal();
	  mainLayout.addComponent(horizontalLayout_EnteteGlobal,
	      "top:0.0px;left:0.0px;");
	  
	  // verticalLayout_Ops
	  verticalLayout_Ops = buildVerticalLayout_Ops();
	  mainLayout.addComponent(verticalLayout_Ops, "top:60.0px;left:0.0px;");
	  
	  // horizontalSplitPanel_Op
	  horizontalSplitPanel_Op = buildHorizontalSplitPanel_Op();
	  mainLayout.addComponent(horizontalSplitPanel_Op,
	      "top:60.0px;right:0.0px;bottom:-3.0px;left:130.0px;");
	  
	  return mainLayout;
  }

	@AutoGenerated
  private HorizontalLayout buildHorizontalLayout_EnteteGlobal() {
	  // common part: create layout
	  horizontalLayout_EnteteGlobal = new HorizontalLayout();
	  horizontalLayout_EnteteGlobal.setStyleName("horizontalLayout_EnteteGlobal");
	  horizontalLayout_EnteteGlobal.setImmediate(false);
	  horizontalLayout_EnteteGlobal.setWidth("100.0%");
	  horizontalLayout_EnteteGlobal.setHeight("60px");
	  horizontalLayout_EnteteGlobal.setMargin(true);
	  
	  // horizontalLayout_Entete
	  horizontalLayout_Entete = new HorizontalLayout();
	  horizontalLayout_Entete.setImmediate(false);
	  horizontalLayout_Entete.setWidth("100.0%");
	  horizontalLayout_Entete.setHeight("100.0%");
	  horizontalLayout_Entete.setMargin(true);
	  horizontalLayout_EnteteGlobal.addComponent(horizontalLayout_Entete);
	  horizontalLayout_EnteteGlobal.setExpandRatio(horizontalLayout_Entete, 1.0f);
	  
	  // button_Quitter
	  button_Quitter = new Button();
	  button_Quitter.setCaption("Quitter");
	  button_Quitter.setImmediate(true);
	  button_Quitter.setWidth("-1px");
	  button_Quitter.setHeight("-1px");
	  horizontalLayout_EnteteGlobal.addComponent(button_Quitter);
	  horizontalLayout_EnteteGlobal.setComponentAlignment(button_Quitter, new Alignment(34));
	  
	  return horizontalLayout_EnteteGlobal;
  }

	@AutoGenerated
  private VerticalLayout buildVerticalLayout_Ops() {
	  // common part: create layout
	  verticalLayout_Ops = new VerticalLayout();
	  verticalLayout_Ops.setStyleName("verticalLayout_Ops");
	  verticalLayout_Ops.setImmediate(false);
	  verticalLayout_Ops.setWidth("130px");
	  verticalLayout_Ops.setHeight("100.0%");
	  verticalLayout_Ops.setMargin(true);
	  
	  return verticalLayout_Ops;
  }

	@AutoGenerated
  private HorizontalSplitPanel buildHorizontalSplitPanel_Op() {
	  // common part: create layout
	  horizontalSplitPanel_Op = new HorizontalSplitPanel();
	  horizontalSplitPanel_Op.setStyleName("horizontalSplitPanel_Op");
	  horizontalSplitPanel_Op.setImmediate(false);
	  horizontalSplitPanel_Op.setWidth("100.0%");
	  horizontalSplitPanel_Op.setHeight("100.0%");
	  horizontalSplitPanel_Op.setMargin(true);
	  
	  // verticalLayout_Op
	  verticalLayout_Op = buildVerticalLayout_Op();
	  horizontalSplitPanel_Op.addComponent(verticalLayout_Op);
	  
	  // gridLayout_Media
	  /*verticalLayout_Media = buildVerticalLayout_Media();
	  horizontalSplitPanel_Op.addComponent(verticalLayout_Media);*/
	  gridLayout_Media = buildGridLayout_Media();
	  horizontalSplitPanel_Op.addComponent(gridLayout_Media);
	  
	  return horizontalSplitPanel_Op;
  }

	@AutoGenerated
  private VerticalLayout buildVerticalLayout_Op() {
	  // common part: create layout
	  verticalLayout_Op = new VerticalLayout();
	  verticalLayout_Op.setImmediate(false);
	  verticalLayout_Op.setSizeFull();
	  verticalLayout_Op.setMargin(false);
	  
	  // label_OpActuelle
	  verticalLayout_TitleOpActuelle = new VerticalLayout();
	  verticalLayout_TitleOpActuelle.setStyleName("verticalLayout_TitleOpActuelle");
	  verticalLayout_TitleOpActuelle.setImmediate(false);
	  verticalLayout_TitleOpActuelle.setWidth("100.0%");
	  verticalLayout_TitleOpActuelle.setHeight("20px");
	  verticalLayout_TitleOpActuelle.setMargin(false);
	  verticalLayout_Op.addComponent(verticalLayout_TitleOpActuelle);
	  
	  // textArea_Description
	  verticalLayout_Description = new VerticalLayout();
	  verticalLayout_Description.setStyleName("verticalLayout_Description");
	  verticalLayout_Description.setImmediate(false);
	  verticalLayout_Description.setWidth("100.0%");
	  verticalLayout_Description.setHeight("100.0%");
	  verticalLayout_Op.addComponent(verticalLayout_Description);
	  verticalLayout_Op.setExpandRatio(verticalLayout_Description, 0.5f);
	  
	  // verticalLayout_2
	  verticalLayout_Images = new VerticalLayout();
	  verticalLayout_Images.setImmediate(false);
	  verticalLayout_Images.setWidth("100.0%");
	  verticalLayout_Images.setHeight("60px");
	  verticalLayout_Images.setMargin(false);
	  verticalLayout_Images.setStyleName("verticalLayout_Images");
	  verticalLayout_Op.addComponent(verticalLayout_Images);
	  
	  // horizontalLayout_Boutons
	  horizontalLayout_Boutons = buildHorizontalLayout_Boutons();
	  verticalLayout_Op.addComponent(horizontalLayout_Boutons);
	  
	  // verticalLayout_AutoControles
	  verticalLayout_AutoControles = new VerticalLayout();
	  verticalLayout_AutoControles.setStyleName("verticalLayout_AutoControles");
	  verticalLayout_AutoControles.setImmediate(false);
	  verticalLayout_AutoControles.setWidth("100.0%");
	  verticalLayout_AutoControles.setHeight("100%");
	  verticalLayout_AutoControles.setMargin(true);
	  TestForm testForm = new TestForm();
	  testForm.setSizeFull();
	  testForm.setImmediate(false);
	  verticalLayout_AutoControles.addComponent(testForm);
	  verticalLayout_Op.addComponent(verticalLayout_AutoControles);
	  verticalLayout_Op.setExpandRatio(verticalLayout_AutoControles, 0.5f);
	  
	  return verticalLayout_Op;
  }

	@AutoGenerated
  private HorizontalLayout buildHorizontalLayout_Boutons() {
	  // common part: create layout
	  horizontalLayout_Boutons = new HorizontalLayout();
	  horizontalLayout_Boutons.setStyleName("horizontalLayout_Boutons");
	  horizontalLayout_Boutons.setImmediate(false);
	  horizontalLayout_Boutons.setWidth("100.0%");
	  horizontalLayout_Boutons.setHeight("50px");
	  horizontalLayout_Boutons.setMargin(false);
	  
	  // button_2
	  button_2 = new Button();
	  button_2.setCaption("Op�rations");
	  button_2.setImmediate(true);
	  button_2.setWidth("-1px");
	  button_2.setHeight("-1px");
	  horizontalLayout_Boutons.addComponent(button_2);
	  horizontalLayout_Boutons.setComponentAlignment(button_2, new Alignment(48));
	  
	  // button_3
	  button_3 = new Button();
	  button_3.setCaption("L�gendes");
	  button_3.setImmediate(true);
	  button_3.setWidth("-1px");
	  button_3.setHeight("-1px");
	  horizontalLayout_Boutons.addComponent(button_3);
	  horizontalLayout_Boutons.setComponentAlignment(button_3, new Alignment(48));
	  
	  // button_4
	  button_4 = new Button();
	  button_4.setCaption("Annexes");
	  button_4.setImmediate(true);
	  button_4.setWidth("-1px");
	  button_4.setHeight("-1px");
	  horizontalLayout_Boutons.addComponent(button_4);
	  horizontalLayout_Boutons.setComponentAlignment(button_4, new Alignment(48));
	  
	  return horizontalLayout_Boutons;
  }

	@AutoGenerated
  private GridLayout buildGridLayout_Media() {
	  // common part: create layout
	  gridLayout_Media = new GridLayout();
	  gridLayout_Media.setImmediate(false);
	  gridLayout_Media.setSizeFull();
	  gridLayout_Media.setMargin(false);
	  gridLayout_Media.setColumns(2);
	  gridLayout_Media.setRows(2);
	  
	  // verticalLayout_Documents
	  verticalLayout_Documents = new VerticalLayout();
	  verticalLayout_Documents.setStyleName("verticalLayout_Documents");
	  verticalLayout_Documents.setImmediate(false);
	  verticalLayout_Documents.setWidth("100px");
	  verticalLayout_Documents.setHeight("100.0%");
	  verticalLayout_Documents.setMargin(false);
	  gridLayout_Media.addComponent(verticalLayout_Documents, 0, 0);
	  
	  // embedded_Media
	  verticalLayout_embeddedMedia = new VerticalLayout();
	  verticalLayout_embeddedMedia.setStyleName("verticalLayout_embeddedMedia");
	  verticalLayout_embeddedMedia.setImmediate(false);
	  verticalLayout_embeddedMedia.setSizeFull();
	  gridLayout_Media.addComponent(verticalLayout_embeddedMedia, 1, 0);
	  gridLayout_Media.setRowExpandRatio(0, 1.0f);
	  gridLayout_Media.setColumnExpandRatio(1, 1.0f);
	  
	  // horizontalLayout_Validation
	  horizontalLayout_Validation = new HorizontalLayout();
	  horizontalLayout_Validation.setStyleName("horizontalLayout_Validation");
	  horizontalLayout_Validation.setImmediate(false);
	  horizontalLayout_Validation.setWidth("100%");
	  horizontalLayout_Validation.setHeight("120px");
	  horizontalLayout_Validation.setMargin(false);
	  gridLayout_Media.addComponent(horizontalLayout_Validation, 0, 1, 1, 1);

		return gridLayout_Media;
  }

}
