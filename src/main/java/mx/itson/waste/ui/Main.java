/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.waste.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.waste.entidades.Activacion;
import mx.itson.waste.entidades.Descarga;
import mx.itson.waste.entidades.Empresa;
import mx.itson.waste.entidades.Instalacion;
import mx.itson.waste.entidades.Office;
import mx.itson.waste.entidades.Requisito;
import mx.itson.waste.enumeradores.Usos;

/**
 * Proceso de instalacion de Microsoft Office
 * @author Emmanuel Rivas
 */
public class Main {
    
    
    
    public static void main(String[] args){
        
        
        Office office = new Office();
        office.setNombre(" " + "Microsoft Office");
        office.setDescripcion("El nuevo Microsoft Office le permite crear, compartir y colaborar en un solo lugar con sus aplicaciones favoritas");
        
         Empresa empresa = new Empresa();
         empresa.setNombre("Microsoft");
         
         office.setEmpresa(empresa);
        
         /* 
           Esta lista contiene una serie de requisitos
          necesarios para la instalación de Office
         */
         
         List<Requisito> requisitos = new ArrayList <>();
         
            Requisito requisito1 = new Requisito();
            requisito1.setNombre("Sistema Operativo: Windows 11, Windows 10, Windows 10 LTSC 2019, Windows Server 2019 de 32 o 64 bits");
            requisitos.add(requisito1);
            
            Requisito requisito2 = new Requisito();
            requisito2.setNombre("Procesador: Procesador de doble núcleo de 1 GHz");
            requisitos.add(requisito2);
            
            Requisito requisito3 = new Requisito();
            requisito3.setNombre("Memoria RAM: 4 GB como mínimo");
            requisitos.add(requisito3);
            
            Requisito requisito4 = new Requisito();
            requisito4.setNombre("Disco duro: 4 GB de espacio disponible");
            requisitos.add(requisito4);
            
            Requisito requisito5 = new Requisito();
            requisito5.setNombre("Graficos: DirectX 9 con WDDM 2.0 ");
            requisitos.add(requisito5);
            
            office.setRequisitos(requisitos);
         
         /*
            Esta lista contiene una serie de pasos a seguir
            para su descarga.
            */
         
        List<Descarga> pasosDescargas = new ArrayList<>();
            
            Descarga pasosDescargas1 = new Descarga();
            pasosDescargas1.setOrden(1);
            pasosDescargas1.setDescripcion("Vaya a www.office.com y, si aún no ha iniciado sesión, seleccione Iniciar sesión.");
            pasosDescargas.add(pasosDescargas1);
            
            Descarga pasosDescargas2 = new Descarga();
            pasosDescargas2.setOrden(2);
            pasosDescargas2.setDescripcion("Inicie sesión con la cuenta asociada a esta versión de Office. Esta cuenta puede ser una cuenta de Microsoft o una cuenta profesional o educativa.");
            pasosDescargas.add(pasosDescargas2);
            
            Descarga pasosDescargas3 = new Descarga();
            pasosDescargas3.setOrden(3);
            pasosDescargas3.setDescripcion("Después de iniciar sesión, siga los pasos que coincidan con el tipo de cuenta con la cual ha iniciado sesión.");
            pasosDescargas.add(pasosDescargas3);
            
            Descarga pasosDescargas4 = new Descarga();
            pasosDescargas4.setOrden(4);
            pasosDescargas4.setDescripcion("En la página principal de Office, seleccione Instalar Office.");
            pasosDescargas.add(pasosDescargas4);
            
            Descarga pasosDescargas5 = new Descarga();
            pasosDescargas5.setOrden(5);
            pasosDescargas5.setDescripcion("Esto completa la descarga de Office en el dispositivo. Para completar la instalación, siga las indicaciones de la sección \"Instalar Office\" que encontrará a continuación.");
            pasosDescargas.add(pasosDescargas5);
            
            office.setDescarga(pasosDescargas);
            
            /*
            Esta lista contiene una serie de pasos necesarios
            para la instalacion del programa.
            */
            
         List<Instalacion> pasosInstalacion = new ArrayList<>();
         
            Instalacion pasosInstalacion1 = new Instalacion();
            pasosInstalacion1.setOrden(1);
            pasosInstalacion1.setDescripcion("Según el navegador, haga clic en Ejecutar (en Microsoft Edge o Internet Explorer), Instalar(en Chrome) o Guardar archivo (en Firefox)." +
           "\n" + " " + "Si ve el aviso del Control de cuentas de usuario con el mensaje ¿Quieres permitir que esta aplicación haga cambios en el dispositivo? haga clic en Sí." +
           "\n" + " " + "Se iniciará la instalación.");
            pasosInstalacion.add(pasosInstalacion1);

             Instalacion pasosInstalacion2 = new Instalacion();
            pasosInstalacion2.setOrden(2);
            pasosInstalacion2.setDescripcion("La instalación habrá finalizado cuando vea la frase \"Ya está listo. Office está instalado\" y se reproduce una animación para mostrar dónde encontrar  Officeaplicaciones en el equipo. Seleccione Cerrar.");
            pasosInstalacion.add(pasosInstalacion2);
            
            office.setInstalacion(pasosInstalacion);
            
            /*
            Esta lista contiene una serie de pasos
            para la activación del programa.
            */
         
         List<Activacion> pasosActivacion = new ArrayList<>();
            
            Activacion pasosActivacion1 = new Activacion();
            pasosActivacion1.setOrden(1);
            pasosActivacion1.setDescripcion("Para abrir una aplicación de Office, seleccione el botón Iniciar (esquina inferior izquierda de la pantalla) y escriba el nombre de una Officeaplicación, como Word." +
            "\n" + " " + "Si tiene Windows 8.1 o 8.0, escriba el nombre de una aplicación Office  en la pantalla Iniciar. ¿No encuentra las aplicaciones de Office?");
           pasosActivacion.add(pasosActivacion1);
            
            Activacion pasosActivacion2 = new Activacion();
            pasosActivacion2.setOrden(2);
            pasosActivacion2.setDescripcion("Para abrir la aplicación Office , seleccione su icono en los resultados de la búsqueda.");
            pasosActivacion.add(pasosActivacion2);
            
            Activacion pasosActivacion3 = new Activacion();
            pasosActivacion3.setOrden(3);
            pasosActivacion3.setDescripcion("Cuando se abra la aplicación Office, acepte el contrato de licencia. Office está activada y lista para usar.");
            pasosActivacion.add(pasosActivacion3);
            
            office.setActivacion(pasosActivacion);
            
            office.setUsos(Usos.DOMESTICO);
            
            /*
            Se imprimirá en consola el nombre de la aplicacion a instalar llamandolo desde la clase Office
            el nombre de la empresa y su descripción.
            */
            
         System.out.println("*** INSTALACION OFFICE ***");
         System.out.println(office.getNombre());
         System.out.println(" " + "By "  + office.getEmpresa().getNombre());
         System.out.println(office.getDescripcion());
         
         /*
         Se imprimirá los requisitos puestos en la lista, así tambien los pasos de Descarga, Instalación y Activación.
         */
         System.out.println("\nRequisitos:");
         for(Requisito r : office.getRequisitos()){
             System.out.println("- " + r.getNombre());
             
         }

         System.out.println("\nDescargar");
         for(Descarga d : office.getDescarga()){
             System.out.println(d.getOrden() + "- " + d.getDescripcion());
         }
         
         System.out.println("\nInstalar");
         for(Instalacion i : office.getInstalacion() ){
             System.out.println(i.getOrden() + "- " + i.getDescripcion());
         }
         
         System.out.println("\nActivar");
         for(Activacion a : office.getActivacion()){
             System.out.println(a.getOrden() + "- " + a.getDescripcion());
         }
         
        
    }
    
}
