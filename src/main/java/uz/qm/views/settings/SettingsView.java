package uz.qm.views.settings;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "settings", layout = MainView.class)
@PageTitle("Settings")
@CssImport("styles/views/settings/settings-view.css")
public class SettingsView extends Div {

    public SettingsView() {
        setId("settings-view");
        add(new Label("Content placeholder"));
    }

}
