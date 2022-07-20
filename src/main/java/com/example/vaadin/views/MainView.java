package com.example.vaadin.views;



import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import com.vaadin.flow.router.Route;

@Route
public class MainView extends VerticalLayout {

    Button button = new Button("I'm a button");
    Button button1 = new Button("I'm a button");
    Button button2 = new Button("I'm a button");
    Button button3 = new Button("I'm a button");
    Button button4 = new Button("I'm a button");
    HorizontalLayout layout = new HorizontalLayout(button,button1,button2,button3,button4);




    public MainView() {
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);
        button.addClickListener(clickEvent ->
                add(new Text("Clicked!")));
    }



}
