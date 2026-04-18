package com.example.application.views.nomina;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.vaadin.lineawesome.LineAwesomeIconUrl;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Nómina")
@Route(value = "", layout = MainLayout.class)
@Menu(order = 0, icon = LineAwesomeIconUrl.FILE)
public class NominaView extends VerticalLayout {

    private final List<INomina> nominas;
    private final ComboBox<INomina> selector;
    private final com.vaadin.flow.component.textfield.NumberField valor;
    private final Span resultado;
    private final Button botonCalcular;
    private final DecimalFormat formato;

    public NominaView() {
        this.nominas = new ArrayList<>(NominasPredefinidas.todos());
        this.formato = new DecimalFormat("#,##0.00");

        H2 titulo = new H2("Cálculo de Nómina");

        selector = new ComboBox<>("Empleado");
        selector.setItems(nominas);
        selector.setItemLabelGenerator(INomina::etiqueta);

        valor = new com.vaadin.flow.component.textfield.NumberField("Valor");
        valor.setClearButtonVisible(true);
        valor.setStep(1);

        resultado = new Span();

        botonCalcular = new Button("Calcular", event -> calcular());

        selector.addValueChangeListener(event -> {
            INomina n = event.getValue();
            if (n == null) return;

            // 🔥 Cambia el label según el tipo
            valor.setLabel("Ingrese valor (horas o ventas)");
            resultado.setText("");
        });

        if (!nominas.isEmpty()) {
            selector.setValue(nominas.get(0));
        }

        add(titulo, selector, valor, botonCalcular, resultado);
    }

    private void calcular() {
        INomina n = selector.getValue();
        Double v = valor.getValue();

        if (n == null) {
            Notification.show("Selecciona un empleado");
            return;
        }

        if (v == null) {
            Notification.show("Ingresa un valor");
            return;
        }

        double r = n.calcularSalario(v);

        resultado.setText("Salario: $" + formato.format(r));
    }
}