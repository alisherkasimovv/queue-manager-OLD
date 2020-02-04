package uz.qm.views.employeedashboard;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "employee-dashboard", layout = MainView.class)
@PageTitle("Employee dashboard")
@CssImport("styles/views/employeedashboard/employeedashboard-view.css")
public class EmployeedashboardView extends Div {

    public EmployeedashboardView() {
        setId("employeedashboard-view");
        add(new Label("Content placeholder"));
    }

}
