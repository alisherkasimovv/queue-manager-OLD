package uz.qm.views.services;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "services", layout = MainView.class)
@PageTitle("Services")
@CssImport("styles/views/services/services-view.css")
public class ServicesView extends Div {

    public ServicesView() {
        setId("services-view");
        add(new Label("Content placeholder"));
    }

}
