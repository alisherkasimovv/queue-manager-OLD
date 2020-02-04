package uz.qm.views.employees;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

import uz.qm.views.MainView;
@Route(value = "employees", layout = MainView.class)
@RouteAlias(value = "", layout = MainView.class)
@PageTitle("Employees")
@CssImport("styles/views/employees/employees-view.css")
public class EmployeesView extends Div {

    public EmployeesView() {
        setId("employees-view");
        add(new Label("Content placeholder"));
    }

}
