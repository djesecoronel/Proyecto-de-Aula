
package Vista;

import Modelo.Bitacora;
import Modelo.Caso;
import Modelo.Detective;
import Modelo.Direccion;
import Modelo.Sospechoso;

public class Principal {
    public static void main(String[] args) {
        
        //------------------------------- Detectives -----------------------------------------
        Detective detective1 = new Detective(46465, "Jhonatan David", "Hostia Arrieta", 8, "");
        Detective detective2 = new Detective(68786, "David Jesé", "Coronel Hinojosa", 9, "");
        Detective detective3 = new Detective(66868, "Andres David", "Velasquez Arrieta", 3, "");
        
        //-------------------------------------------- Direcciones -------------------------------------------------------------------------
        Direccion direccion1 = new Direccion("Calle 7 Numero 33-23 El dangon", 8, "El dangon","Valledupar","cesar", "Colombia");
        Direccion direccion2 = new Direccion("calle 5 Numero 22-65 Mocua", 6,"Mocua","Valledupar","Cesar", "Colombia");
        Direccion direccion3 = new Direccion("cr 14-54 san jorge ",9 ,"wila","Popayan","Cauca", "Colombia");
        Direccion direccion4 = new Direccion("calle 24 numero 55-24 ",3 ,"Frandia","Popayan","Cauca", "Colombia");
        Direccion direccion5 = new Direccion("calle 54 numero 78-25 ",15 ,"Frandia","Popayan","Cauca", "Colombia");
        Direccion direccion6 = new Direccion("calle 34 numero 34-26 ",27, "Las flores","Flin", "goro", "Colombia ");
        
        //-------------------------------------------- Sospechosos ------------------------------------------------------------------
        Sospechoso sospechoso1 = new Sospechoso(4561237,"Luis","El cabeza",19,"Hombre delgado /Ojos negros /Cabello rosado /1.75 metros de altura", "Calle 7 # 33-23 ", 8, "El dangond /","/ Valledupar /"," Cesar /", " Colombia");
        Sospechoso sospechoso2 = new Sospechoso(7896521,"Juanes","Dienton",26,"Hombre de contestura gruesa /Ojos verdes /Calvo /1.70 metros de altura", "Calle 12 # 23-67 ", 54, "El molino /","/ Riohacha /"," La Guajira /", " Colombia");
        Sospechoso sospechoso3 = new Sospechoso(3569874,"Andrea","Maca",45,"Mujer delgada /ojos azules /Cabello corto castaño /1.60 metros de altura", "Kra. 14-54 ",9 , "Divino Niño /", "/ Valledupar /", " Cesar /", " Colombia");
        Sospechoso sospechoso4 = new Sospechoso(6564563,"Brayan","Perico",32, "Hombre delgado /Ojos cafe oscuros /Cabello castaño /1.82 metros de altura", "Calle 9 # 76-65 ", 34, "Novalito /","/ Valledupar /"," Cesar /", " Colombia");
        Sospechoso sospechoso5 = new Sospechoso(5877896, "Juancho", "Pluma blanca", 45, "Hombre delgado /Ojos azules /Cabello rubio /2.10 metros de altura", "Calle 54 # 78-25 ",15 ,"Francia /", "/ Popayan /"," Cauca /", "Colombia");
        Sospechoso sospechoso6 = new Sospechoso(2232323, "Pedro", "El Rajas", 21, "Hombre bajito /Ojos cafe / Cabello castaño oscuro /1.89 metros de altura", "Calle 17 # 9-78 ", 98, "La nevada /", "/ Valledupar /", " Cesar /", " Colombia");
    
        Sospechoso[] caso1Sospechoso = {sospechoso1,sospechoso2};
        Sospechoso[] caso2Sospechoso = {sospechoso3,sospechoso4,sospechoso5};
        Sospechoso[] caso3Sospechoso = {sospechoso6};
       
        //-------------------------------------------- Bitacoras -----------------------------------------------------
        Bitacora bitacora1 = new Bitacora(""," El caso ha empezado. Tenemos muchas pistas, "+"sin embargo, todavia nos falta por esclarecer algunos hechos. Uno de los sospechosos nos ha dado informacion importante para la solucion de este caso.");
        Bitacora bitacora2 = new Bitacora("","El caso ha sido resuelto.");
        Bitacora bitacora3 = new Bitacora("", "El caso se anuló por falta de pruebas contra el acusado.");
        
        //-------------------------------------------- Casos --------------------------------------------------------------
        Caso caso1 = new Caso (46879, "Cadaver encontrado en el rio.", "A", "Guatapuri", detective1, caso1Sospechoso, bitacora1);
        Caso caso2 = new Caso (23548, "Cuerpo encontrado en un restaurante de comidas rapidas.", "C","Rest", detective2, caso2Sospechoso, bitacora2 );
        Caso caso3 = new Caso (23332, "Homicidio en la calle 9na del barrio Novalito.", "A", "Triki", detective3, caso3Sospechoso, bitacora3);
        
        System.out.println(caso1);
        System.out.println(caso2);
        System.out.println(caso3);
    }
    
    
    
    
}
