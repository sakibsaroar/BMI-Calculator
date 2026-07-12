package com.tempcon.bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField F1;
    @FXML
    private TextField F3;
    @FXML
    private TextField F4;
    @FXML
    private Label F2;
    @FXML
    private TextField F5;
    @FXML
    private Label label2;
    @FXML
    private Label label1;
    @FXML
    private Button button;
    @FXML
    private Label label3;
    @FXML
    private Button button2;
    @FXML
    private Label unit;
    @FXML
    private Label labelpound;
    @FXML
    private Label label4;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
       
      double weightkg = Double.parseDouble(F1.getText());
      
      double weightpound = weightkg*2.20462;
      
      F2.setText(String.valueOf(weightpound));
      
      labelpound.setText("pound");
      
      int heightfoot =  Integer.parseInt(F3.getText());
      
      double heightfootdot = (int)heightfoot;
      
      double inch =  Double.parseDouble(F4.getText());
      
      double totalheightinch =(heightfootdot*12)+inch;
       
      label1.setText(String.valueOf(totalheightinch+" inch"));
      
      double totalheightmeter = totalheightinch*.0254;
       
      label2.setText(String.valueOf( totalheightmeter));
       
      label3.setText(String.valueOf("meter"));
       
      double bmi = (weightpound*703)/( totalheightinch* totalheightinch);
       
      F5.setText(String.valueOf(bmi));
       
      unit.setText("Kg/m²");
      
           
        if(bmi<18.5){
            label4.setText("You are underweight") ;
            
        }else if(bmi>=18.5 && bmi<=24.9){
            
          label4.setText  ("Your health is in good condtion");
          
        }else if(bmi>=25 && bmi<=29.9){
            
           label4.setText ( "You are at risk! You are overweight");
           
        }else if(bmi>=30 && bmi<=34.9){
         
            label4.setText ("");
        }
        else if(bmi>=35 && bmi<=39.9){
        
            label4.setText ("You are at risk!You are severely obesed");
            
        }else if(bmi>=40){
         
            label4.setText ("You are at risk!You are morbidly obesed");
        }
        else{
            label4.setText("Invalid input");
        }
      
    
    
    }
    
    @FXML
       void reset(){
    F1.setText("");
    F2.setText("");
    F3.setText("");
    F4.setText("");
    F5.setText("");
    label1.setText("");
    label2.setText("");
    label3.setText("");
    label4.setText("");
    labelpound.setText("");
    unit.setText("");
       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
