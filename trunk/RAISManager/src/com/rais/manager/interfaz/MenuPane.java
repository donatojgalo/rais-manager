package com.rais.manager.interfaz;

import nextapp.echo.app.Alignment;
import nextapp.echo.app.Button;
import nextapp.echo.app.Column;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Panel;
import nextapp.echo.app.Row;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;

import com.rais.manager.Desktop.DesktopType;
import com.rais.manager.RaisManagerApp;
import com.rais.manager.styles.GUIStyles;

@SuppressWarnings("serial")
public class MenuPane extends Panel {

	private RaisManagerApp app = (RaisManagerApp) //
			RaisManagerApp.getActive();

	public MenuPane() {
		initGui();
	}

	private void initGui() {

		Row row = new Row();
		row.setInsets(new Insets(0, 10, 0, 0));
		row.setAlignment(Alignment.ALIGN_LEFT);

		Column col = new Column();

		Button btnHome = new Button("Inicio");
		btnHome.setStyle(GUIStyles.BUTTON_STYLE);
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnHomeClicked();
			}
		});
		col.add(btnHome);

		Button btnProfile = new Button("Perfil");
		btnProfile.setStyle(GUIStyles.BUTTON_STYLE);
		btnProfile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnProfileClicked();
			}
		});
		col.add(btnProfile);

		Button btnPolls = new Button("Encuestas");
		btnPolls.setStyle(GUIStyles.BUTTON_STYLE);
		btnPolls.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnPollsClicked();
			}
		});
		col.add(btnPolls);

		Button btnWorks = new Button("Tareas");
		btnWorks.setStyle(GUIStyles.BUTTON_STYLE);
		btnWorks.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnWorksClicked();
			}
		});
		col.add(btnWorks);

		Button btnExit = new Button("Salir");
		btnExit.setStyle(GUIStyles.BUTTON_STYLE);
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				btnExitClicked();
			}
		});
		col.add(btnExit);

		row.add(col);
		add(row);

	}

	private void btnHomeClicked() {

		MainPane panel = new MainPane();
		app.getDesktop().setCentralPanel(panel);

	}

	private void btnPollsClicked() {

		AutoCoEvaluationPane panel = new AutoCoEvaluationPane();
		app.getDesktop().setCentralPanel(panel);

	}

	private void btnProfileClicked() {

		ProfilePane panel = new ProfilePane();
		app.getDesktop().setCentralPanel(panel);

	}

	private void btnWorksClicked() {

//		WorksPane panel = new WorksPane();
//		app.getDesktop().setCentralPanel(panel);

	}

	private void btnExitClicked() {

		app.setUser(null);
		app.setNewDesktop(DesktopType.INDEX);

	}

}