package com.example.application;

import com.example.application.services.Person;
import com.example.application.services.PersonService;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("flow")
public class FlowView extends VerticalLayout {

    public FlowView(PersonService service) {
        var datePicker = new DatePicker("Born on");
        var grid = new Grid<>(Person.class);

        datePicker.addValueChangeListener(event -> {
            grid.setItems(service.getPeopleBornOn(event.getValue()));
        });

        add(datePicker, grid);
    }
}
