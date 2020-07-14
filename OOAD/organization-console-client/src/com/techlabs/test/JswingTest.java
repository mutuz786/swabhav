package com.techlabs.test;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import com.techlabs.model.*;

public class JswingTest {
	public static void main(String[] args) throws Exception {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new DiskLoader("Employees.csv"));
		Employee emp = builder.getCeo();
		JFrame frame = new JFrame("Employees tree");
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(emp.getName());
		getChildNode(emp, node);
		JTree tree = new JTree(node);
		frame.add(tree);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	private static void getChildNode(Employee employee, DefaultMutableTreeNode node) {
		if (employee.getReportee() != null) {
			for (Employee emp : employee.getReportee()) {
				DefaultMutableTreeNode newChild = new DefaultMutableTreeNode(emp.getName());
				getChildNode(emp, newChild);
				node.add(newChild);
			}
		}
	}
}
