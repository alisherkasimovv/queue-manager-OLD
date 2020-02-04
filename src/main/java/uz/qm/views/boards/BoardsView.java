package uz.qm.views.boards;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import uz.qm.views.MainView;
@Route(value = "boards", layout = MainView.class)
@PageTitle("Boards")
@CssImport("styles/views/boards/boards-view.css")
public class BoardsView extends Div {

    public BoardsView() {
        setId("boards-view");
        add(new Label("Content placeholder"));
    }

}
