package uz.qm.views.dashboard;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "dashboard", layout = MainView.class)
@PageTitle("Dashboard")
@CssImport("styles/views/dashboard/dashboard-view.css")
public class DashboardView extends Div {

    public DashboardView() {
        setId("dashboard-view");
        add(new Label("Content placeholder"));
    }

}
