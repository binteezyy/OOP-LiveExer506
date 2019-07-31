package liveExer506;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class PanganibanFrame extends Frame{
	TextField center1;
	
	PanganibanFrame (String title, Color color, int width, int height){
		super(title);
		setBackground(color);
		setSize(width, height);
		setVisible(true);
		setLayout(new BorderLayout());
		
		Panel panel = new Panel(new GridLayout(1,4));
		
		Button home = new Button("Home");
		home.setPreferredSize(new Dimension(40,40));
		panel.add(home);
		
		Button about = new Button("About Us");
		about.setPreferredSize(new Dimension(40,40));
		panel.add(about);
		
		Button mvc = new Button("MVC");
		mvc.setPreferredSize(new Dimension(40,40));
		panel.add(mvc);
		
		Button contact = new Button("Contact");
		contact.setPreferredSize(new Dimension(40,40));
		panel.add(contact);
		
		add(panel, BorderLayout.NORTH);
		
		Panel pwest = new Panel(new GridLayout(4,1));
		
		Choice choice1 = new Choice();
		choice1.addItem("Group Members");
		choice1.addItem("member1");
		choice1.addItem("member2");
		choice1.addItem("member3");
		choice1.setPreferredSize(new Dimension(400,400));
		pwest.add(choice1);
		
		Label west2 = new Label("west2");
		west2.setPreferredSize(new Dimension(400,400));
		pwest.add(west2);
		
		Label west3 = new Label("west3");
		west3.setPreferredSize(new Dimension(400,400));
		pwest.add(west3);
		
		Label west4 = new Label("west4");
		west4.setPreferredSize(new Dimension(400,400));
		pwest.add(west4);
		
		add(pwest, BorderLayout.WEST);
		
		Panel pcenter = new Panel(new GridLayout(1,1));
		
		center1 = new TextField("Hello");
		pcenter.add(center1);
		
		add(pcenter, BorderLayout.CENTER);
		
		
		choice1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ie) {
				if (choice1.getSelectedItem().equals("member1")) {
					west2.setText("Alvin Panganibain");
					west3.setText("20 yrs old");
					west4.setText("Cavite");
				}
				else if (choice1.getSelectedItem().equals("member2")) {
					west2.setText("Joshua Pascual");
					west3.setText("21 yrs old");
					west4.setText("San Juan");
				}
				else if (choice1.getSelectedItem().equals("member3")) {
					west2.setText("Theo Tejada");
					west3.setText("20 yrs old");
					west4.setText("Navotas");
				}
			}
		});
		
		layout();
		show();
	}
	
	public boolean action(Event e, Object o) {
		if ("Home".equals(e.arg))
		 center1.setText("This is our Live Exercise 506 for the subject Object-Oriented Programming using Java.");
		else if ("About Us".equals(e.arg))
		 center1.setText("We are BS CpE 5-4 from Polytechnic University of the Philippines.");
		else if ("MVC".equals(e.arg))
		 center1.setText("Model–View–Controller is an architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts. This is done to separate internal representations of information from the ways information is presented to and accepted from the user.");
		else if ("Contact".equals(e.arg))
		 center1.setText("Contact details soon.");
		return(super.action(e,e.target));
	}
	
	 public boolean handleEvent(Event evt) {
		 if (evt.id == Event.WINDOW_DESTROY) {
		 hide();
		 System.exit(0);
		 }
		 return(super.handleEvent(evt));
	 }
}

public class PanganibanACMLiveExer506 {
	public static void main(String[] args) {
		PanganibanFrame pframe = new PanganibanFrame("Live Exer 505", Color.white, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight());
	}
}
