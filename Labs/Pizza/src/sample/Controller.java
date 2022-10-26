package sample;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class Controller {
    void  processOrder(CheckBox [] topping, TextArea orderDetails)
    {
        String order = "you ordered";
        boolean toppingsOrdered= false;
        for (int index=0; index < topping.length;++index)
            if (topping[index].isSelected()) {
                toppingsOrdered = true;
                order += "\n"+ topping[index].getText();
            }
        if (!toppingsOrdered)
            order += "No Toppings";
        order += ".";
        orderDetails.setText(order);
    }

    void  resetForm( Main x)
    {
        x.reSetTopping();
        x.reSetOrderDetails();

    }
}
