package uz.qm.views.serviceselection;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "service-selection", layout = MainView.class)
@PageTitle("Service selection")
@CssImport("styles/views/serviceselection/serviceselection-view.css")
public class ServiceselectionView extends Div {

    public ServiceselectionView() {
        setId("serviceselection-view");
        add(new Label("Content placeholder"));
    }

}
