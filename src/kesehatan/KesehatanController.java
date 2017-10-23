/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesehatan;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Skaha_AM
 */
public class KesehatanController implements Initializable {

    @FXML
    private Label ide;
    @FXML
    private JFXTextArea ta1;
    @FXML
    private JFXTextArea ta2;
    @FXML
    private JFXTextField nama;

    @FXML
    private JFXTextField tinggi;

    @FXML
    private JFXTextField bb;
    @FXML
    private Label jenis;
    @FXML
    private ToggleGroup grup;
     @FXML
    private JFXRadioButton lk;

    @FXML
    private JFXRadioButton pr;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String Hasil;
        String Saran;
        int ideal;
        String nama1 =nama.getText();
        int tinggil = parseInt(tinggi.getText().toString());
        int berat = parseInt(bb.getText().toString());
        
        if(lk.isSelected()){
            ideal = tinggil - 105;
            String i=String.valueOf(ideal);
            if(ideal==berat){
                Saran = "Bagus!!! Tetap jagalah berat badan Anda\n"
                        + "dan tetap makan makanan bergisi serta \n"
                        + "tetap Olahraga teratur.";
                Hasil = "Berat badan Anda Ideal";
            } else if(berat<ideal){
                Saran = "Anda Kekurangan berat badan, \n"
                        + "Cobalah menambah Porsi makanan bergizi,\n"
                        + " Perbanyaklah memakan serat dan karbohidrat.";
                Hasil = "Berat badan Anda Underweight";
            } else{
                Saran = "Anda Kelebihan berat badan \n"
                        + "Cobalah diet secara teratur, Berolahraga,\n"
                        + " dan menjaga pola makan Anda.";
                Hasil = "Berat badan Anda Overweight";
            }
            ide.setText(i);
            ta1.setText(nama1+", "+Hasil);
            ta2.setText(Saran);
        } else if(pr.isSelected()){
            ideal = tinggil - 110;
            String i=String.valueOf(ideal);
            if(ideal==berat){
                Saran = "Bagus!!! Tetap jagalah berat badan Anda\n"
                        + "dan tetap makan makanan bergisi serta \n"
                        + "tetap Olahraga teratur.";
                Hasil = "Berat badan Anda Ideal";
            } else if(berat<ideal){
                Saran = "Anda Kekurangan berat badan, \n"
                        + "Cobalah menambah Porsi makanan bergizi,\n"
                        + " Perbanyaklah memakan serat dan karbohidrat.";
                Hasil = "Berat badan Anda Underweight";
            } else{
                Saran = "Anda Kelebihan berat badan \n"
                        + "Cobalah diet secara teratur, Berolahraga,\n"
                        + " dan menjaga pola makan Anda.";
                Hasil = "Berat badan Anda Overweight";
            }
            ide.setText(i);
            ta1.setText(nama1+", "+Hasil);
            ta2.setText(Saran);
        }
    }
    @FXML
    private void hapus(ActionEvent event) {
        nama.setText("");
        tinggi.setText("");
        bb.setText("");
        ta1.setText("");
        ta2.setText("");
        lk.setSelected(false);
        pr.setSelected(false);
        ide.setText("");
    }
    
}
