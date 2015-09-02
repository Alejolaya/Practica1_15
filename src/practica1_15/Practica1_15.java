/*
Realizar un programa que tenga una clase llamada PERSONAL_DATE y permita almacenar
los datos personales de una persona: Nombre, Apellidos, Edad, Número de Cedula, 
Fecha de Nacimiento, Dirección y Teléfono. Las operaciones a implementar son:
 Una función Loading_Data(): solicita al usuario los datos de una persona
 Una función Data_Show(): permite ver la información de la persona.
 Implementar un programa para un banco que permita administrar la cuenta de sus
usuarios. Para esto defina una clase llamada CLIENT que contiene los datos personales
del punto anterior (numeral 2) y además tenga el saldo de la cuenta. Las operaciones
a implementar son las dos del numeral anterior y ademásFunción Actualizar_datos(): 
Permite al usuario modificar sus datos personales.
 Función Consignación(): Permite a determinado usuario consignar dinero en su cuenta.
 Función Retiro(): Permite al usuario retirar dinero de su cuenta.
 Función Consultar_Saldo(): Permite al usuario verificar el saldo de la cuenta.
 */
package practica1_15;

/**
 *
 * @author USER
 */
public class Practica1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        CLIENT asdf =new CLIENT();
        asdf.loading_data();
        asdf.update_data();
        asdf.Show_Data();
    }
    
}
