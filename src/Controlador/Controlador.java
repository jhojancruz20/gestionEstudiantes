package Controlador;

import Modelo.Estudiante;
import Vista.VerEstudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    private Estudiante estudiante = null;
    private VerEstudiante verEstudiante = null;

    public Controlador() {
    }
    
    public Controlador(Estudiante estudiante, VerEstudiante verEstudiante) {
        super();
        this.estudiante = estudiante;
        this.verEstudiante = verEstudiante;
        actionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        try{
            if(evento.getActionCommand().contentEquals("Agregar")){
                String codigo = this.verEstudiante.txtCodigo.getText();
                String nombre = this.verEstudiante.txtNombre.getText();
                String apellido = this.verEstudiante.txtApellido.getText();
                String telefono = this.verEstudiante.txtTelefono.getText();
                
            }else if(evento.getActionCommand().contentEquals("Mostrar")){
                verEstudiante.areaMostrar.setText(estudiante.nombreCompleto());
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private void actionListener(Controlador controlador) {
        verEstudiante.btnAgregar.addActionListener(controlador);
        verEstudiante.btnMostrar.addActionListener(controlador);
    }
    
}
