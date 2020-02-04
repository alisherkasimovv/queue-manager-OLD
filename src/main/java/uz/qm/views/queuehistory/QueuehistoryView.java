package uz.qm.views.queuehistory;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "queue-history", layout = MainView.class)
@PageTitle("Queue history")
@CssImport("styles/views/queuehistory/queuehistory-view.css")
public class QueuehistoryView extends Div {

    public QueuehistoryView() {
        setId("queuehistory-view");
        add(new Label("Content placeholder"));
    }

}
