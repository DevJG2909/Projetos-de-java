package SystemasDeCalculo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Calculadora {


     double n1d = 0.01112134 ,n2d = 0.01112134;
    String operação;
    @FXML public TextField display;
    @FXML
    private void um(ActionEvent e){
        display.setText(display.getText()+"1");
    }

    @FXML
    private void dois(ActionEvent e){
        display.setText(display.getText()+"2");
    }

    @FXML
    private void tres(ActionEvent e){
        display.setText(display.getText()+"3");
    }

    @FXML
    private void quatro(ActionEvent e){
        display.setText(display.getText()+"4");
    }

    @FXML
    private void cinco(ActionEvent e){
        display.setText(display.getText()+"5");
    }

    @FXML
    private void seis(ActionEvent e){
        display.setText(display.getText()+"6");
    }

    @FXML
    private void sete(ActionEvent e){
        display.setText(display.getText()+"7");
    }

    @FXML
    private void oito(ActionEvent e){
        display.setText(display.getText()+"8");
    }

    @FXML
    private void nove(ActionEvent e){
        display.setText(display.getText()+"9");
    }

    @FXML
    private void zero(ActionEvent e){
        display.setText(display.getText()+"0");
    }

    @FXML
    private void somar(ActionEvent e){
        n1d = Double.parseDouble(display.getText());
        display.setText("");
        operação = "somar";
    }

    @FXML
    private void subtrair(ActionEvent e){
        n1d = Double.parseDouble(display.getText());
        display.setText("");
        operação = "subtrair";
    }

    @FXML
    private void Multiplicar(ActionEvent e){
        n1d = Double.parseDouble(display.getText());
        display.setText("");
        operação = "multiplicar";
    }

    @FXML
    private void Dividir(ActionEvent e){
        n1d = Double.parseDouble(display.getText());
        display.setText("");
        operação = "dividir";
    }

//    @FXML
//    private void MaisMenos(ActionEvent e){
//        String a = display.getText();
//        if(!a.contains("-")){
//            display.setText("-" + display.getText());
//        }else if(!display.getText().contains("+")){
//            a.replace("-","");
//        }
//    }

    @FXML
    private void igual(ActionEvent e){
        if (n1d != 0.01112134){
            n2d = Double.parseDouble(display.getText());
            if(operação.equalsIgnoreCase("somar")){
                n1d = n1d + n2d;
                display.setText(Double.toString(n1d));
                n2d = 0.01112134;
            }else if(operação.equalsIgnoreCase("subtrair")){
                n1d = n1d - n2d;
                display.setText(Double.toString(n1d));
                n2d = 0.01112134;
            }else if(operação.equalsIgnoreCase("multiplicar")){
                n1d = n1d * n2d;
                display.setText(Double.toString(n1d));
                n2d = 0.01112134;
            }else if(operação.equalsIgnoreCase("dividir")){
                n1d = n1d / n2d;
                display.setText(Double.toString(n1d));
                n2d = 0.01112134;
            }
        }else if(n1d == 0.01112134) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setHeaderText(null);
            alerta.setContentText("Você omitiu o primeiro valor");
            alerta.show();
        }
    }
    @FXML
    public void AC(ActionEvent e){
        n1d = 0.01112134;
        n2d = 0.01112134;
        display.setText("");
    }


}
