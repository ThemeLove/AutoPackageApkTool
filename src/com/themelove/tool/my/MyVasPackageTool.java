package com.themelove.tool.my;

import java.awt.EventQueue;


/**
 * Android������һ���������
 * @author qingshanliao
 */
public class MyVasPackageTool {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyPackageFrame frame = new MyPackageFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
