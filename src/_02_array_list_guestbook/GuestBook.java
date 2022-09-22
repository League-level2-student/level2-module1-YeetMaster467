package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addName = new JButton("Add Name");
	JButton viewNames = new JButton("View Names");
	JButton emptyNames = new JButton("Empty Names");
	ArrayList<String> names = new ArrayList<String>();
	
	public void showWindow() {
		panel.add(addName);
		panel.add(viewNames);
		panel.add(emptyNames);
		frame.add(panel);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Guest Book");
		
		initalizeNames();
		
		addName.addActionListener(this);
		viewNames.addActionListener(this);
		emptyNames.addActionListener(this);
		
		frame.setVisible(true);
	}
	
	private void initalizeNames() {
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed.equals(viewNames)) {
			if(names.isEmpty()) {
				JOptionPane.showMessageDialog(null, "List contains no names :(");
			} else {
				JOptionPane.showMessageDialog(null, names);
			}
		} else if(buttonPressed.equals(addName)) {
			String n = JOptionPane.showInputDialog("Enter Name to Add");
			names.add(n);
			JOptionPane.showMessageDialog(null, "Name added sucsessfully :)");
		} else if(buttonPressed.equals(emptyNames)) {
			int r = JOptionPane.showConfirmDialog(buttonPressed, "Are you sure you want to delete all names?", null, JOptionPane.YES_NO_OPTION);
			if(r==0) {
				names.removeAll(names);
				JOptionPane.showMessageDialog(null, "All names have been deleted.");
			} else {
				JOptionPane.showMessageDialog(null, "Nothing has been deleted.");
			}
		}
		
	}
	
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
