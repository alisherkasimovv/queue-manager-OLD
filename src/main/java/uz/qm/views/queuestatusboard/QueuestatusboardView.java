package uz.qm.views.queuestatusboard;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "queue-status-board", layout = MainView.class)
@PageTitle("Queue status board")
@CssImport("styles/views/queuestatusboard/queuestatusboard-view.css")
public class QueuestatusboardView extends Div {

    public QueuestatusboardView() {
        setId("queuestatusboard-view");
        add(new Label("Content placeholder"));
    }

}
