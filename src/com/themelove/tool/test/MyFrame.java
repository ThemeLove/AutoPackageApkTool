package com.themelove.tool.test;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends Frame {
	private String mTitle;

	public MyFrame(String title) {
		mTitle = title;
		setTitle(mTitle);
		addWindowListener(windownListener);
	}

	public void setTitle(String title) {
		super.setTitle(title);
	}

	private WindowListener windownListener = new WindowListener() {

		@Override
		public void windowOpened(WindowEvent e) {

		}

		@Override
		public void windowIconified(WindowEvent e) {

		}

		@Override
		public void windowDeiconified(WindowEvent e) {

		}

		@Override
		public void windowDeactivated(WindowEvent e) {

		}

		/**
		 * Ĭ��ʵ�ֹرհ�ť����ر�
		 */
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {

		}

		@Override
		public void windowActivated(WindowEvent e) {

		}
	};
}
