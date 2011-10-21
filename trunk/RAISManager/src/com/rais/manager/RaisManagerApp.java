package com.rais.manager;

import com.rais.manager.Desktop.DesktopType;

import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.Window;

@SuppressWarnings("serial")
public class RaisManagerApp extends ApplicationInstance {

	private ContentPane contentPane;
	private Desktop desktop;

	@Override
	public Window init() {

		Window window = new Window();
		window.setTitle("Sistema de Gesti�n RAIS");

		desktop = new Desktop(DesktopType.INDEX);
		contentPane = new ContentPane();
		contentPane.add(desktop);

		window.setContent(contentPane);
		return window;

	}

	public ContentPane getContentPane() {
		return contentPane;
	}

	public Desktop getDesktop() {
		return desktop;
	}

	public void setNewDesktop(DesktopType DesktopType) {

		contentPane.removeAll();
		desktop.removeDesktop();
		desktop = null;

		desktop = new Desktop(DesktopType);
		contentPane.add(desktop);

	}

}