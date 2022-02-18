/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_juanmolina_11621058;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * 
 */
public class Examen1P2_JuanMolina_11621058 {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    
    public static ArrayList<universo> universos = new ArrayList();
    public static ArrayList<persona> heroe = new ArrayList();
    public static ArrayList<persona> villano = new ArrayList();
    
    public static void main(String[] args) {
        universo marvel = new universo("Marvel");
        escuadron avengers = new escuadron("Avengers", "New York",true);
        
        persona IronMan = new normal("IronMan","Jarvis Suit","Core","heroe",50,50,50,true);
        avengers.getMiembros().add(IronMan);
        heroe.add(IronMan);
        persona Hawkeye = new normal("Hawkeye","Arco","familia","heroe",60,30,40,true);
        avengers.getMiembros().add(Hawkeye);
        heroe.add(Hawkeye);
        persona Thor = new deidad(true,"Nordica","Thor","Martillo Thor","moral","heroe",80,20,50,true);
        avengers.getMiembros().add(Thor);
        heroe.add(Thor);
        marvel.getSquads().add(avengers);
        
        escuadron avengerVillains = new escuadron("Hydra", "Rusia",false);
        
        persona Thanos = new alien("Mexico","Thanos","Fuerza Alienigena","Ambicion","villano",50,50,50,true);
        avengerVillains.getMiembros().add(Thanos);
        villano.add(Thanos);
        persona ElColeccionista = new alien("Guatemala","El Coleccionista","Armamento","debil","heroe",20,80,0,true);
        avengerVillains.getMiembros().add(ElColeccionista);
        villano.add(ElColeccionista);
        
        marvel.getSquads().add(avengerVillains);
        universos.add(marvel);
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            switch(menu()){
                
                case 0 :{
                    System.out.println("Gracias por utilizar este programa!");
                    resp = 'n';
                    break;
                }
           
                case 1 :{
                    System.out.println("******************************");
                    
                    switch(subMenu()){
                        case 0:{
                            System.out.println("Gracias por utilizar el menu de Universos!");
                            break;
                        }
                        
                        case 1:{
                            System.out.println("******************************");
                            System.out.println("Crear Universo ");
                            System.out.println("Ingrese el nombre del universo: ");
                            sc.nextLine();
                            String nombre = sc.nextLine();
                            
                            while(universos.contains(nombre)){
                                System.out.println("Ingrese el nombre del universo (unico): ");
                                sc.nextLine();
                                nombre = sc.nextLine();
                            }
                            
                            universo nuevo = new universo(nombre);
                            universos.add(nuevo);
                            break;
                        }
                        
                        case 2: {
                            System.out.println("******************************");
                            System.out.println("Modificar Universo ");
                            
                            System.out.println("Universos Actuales: ");
                            
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice a modificar: ");
                            int indice = sc.nextInt();
                            System.out.println(universos.get(indice).getNombre() + "sera modificado");
                            
                            System.out.println("Ingrese el nuevo nombre: ");
                            sc.nextLine();
                            String nuevoNombre = sc.nextLine();
                            universos.get(indice).setNombre(nuevoNombre);
                            break;
                        }

                        case 3: {
                            System.out.println("******************************");
                            System.out.println("Eliminar Universo ");
                            
                            System.out.println("Universos Actuales: ");
                            
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice a modificar: ");
                            int indice = sc.nextInt();
                            System.out.println(universos.get(indice).getNombre() + "sera eliminado");
                            
                            universos.remove(indice);
                            break;
                        }
                        
                        case 4 :{
                            System.out.println("******************************");
                            System.out.println("Listar Universos ");
                            
                            System.out.println("Universos Actuales: ");
                            
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            break;
                        }

                        default: {
                            System.out.println("******************************");
                            System.out.println("!!");
                            System.out.println("Error, por favor introduzca un valor del menu.");
                            System.out.println("!!");
                            System.out.println(" ");
                            break;
                        }
                    }
                    
                    break;
                }
                
                case 2 :{
                    System.out.println("******************************");
                    switch(subMenuEscuadron()){
                        case 0:{
                            System.out.println("Gracias por utilizar el menu de Escuadrones!");
                            break;
                        }
                        
                        case 1:{
                            System.out.println("******************************");
                            System.out.println("Crear Escuadron ");
                            
                            if(universos.isEmpty()){
                                System.out.println("Primero cree un Universo!");
                                break;
                            }
                            System.out.println("Universos Actuales: ");
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice del universo: ");
                            int indice = sc.nextInt();
                            System.out.println(universos.get(indice).getNombre() + "aqui se creara el escuadron");
                            
                            System.out.println("Es un escuadron de HEROE o VILLANO?");
                            sc.nextLine();
                            String respuesta = sc.nextLine();
                            boolean heroeOvillano = true;
                            
                            while(respuesta!="HEROE"&&respuesta!="VILLANO"){
                                System.out.println("Es un escuadron de HEROE o VILLANO?");
                                sc.nextLine();
                                respuesta = sc.nextLine();
                            }
                            
                            if(respuesta == "HEROE"){
                                heroeOvillano = true;
                            } else if(respuesta == "VILLANO"){
                                heroeOvillano = false;
                            }
                            
                            System.out.println("Ingrese el nombre del escuadron: ");
                            sc.nextLine();
                            String nombre = sc.nextLine();
                            
                            while(universos.get(indice).getSquads().contains(nombre)){
                                System.out.println("Ingrese el nombre del escuadron (unico): ");
                                sc.nextLine();
                                nombre = sc.nextLine();
                            }
                            
                            System.out.println("Ingrese el nombre de la base: ");
                            sc.nextLine();
                            String base = sc.nextLine();
                            
                            if(heroeOvillano){
                                if(heroe.isEmpty()){
                                    System.out.println("Debe primero crear heroes!");
                                    break;
                                } 
                            } else {
                                if(villano.isEmpty()){
                                    System.out.println("Debe primero crear villanos!");
                                    break;
                                }
                            }
                            
                            String acum2 = "";
                            persona lider;
                            if(heroeOvillano){
                                for (persona temp : heroe) {
                                    if(!temp.isTieneEscuadron()){
                                        acum2 += heroe.indexOf(temp) + ". " + temp.getNombre() + "\n";
                                    }
                                }
                                System.out.println(acum2);
                                System.out.println("Seleccione un lider: ");
                                int indiceLider = sc.nextInt();
                                lider = heroe.get(indiceLider);
                                heroe.get(indiceLider).setTieneEscuadron(true);
                            } else {
                                for (persona temp : villano) {
                                    if(!temp.isTieneEscuadron()){
                                        acum2 += villano.indexOf(temp) + ". " + temp.getNombre() + "\n";
                                    }
                                }
                                System.out.println(acum2);
                                System.out.println("Seleccione un lider: ");
                                int indiceLider = sc.nextInt();
                                lider = villano.get(indiceLider);
                                villano.get(indiceLider).setTieneEscuadron(true);
                            }
                            
                            ArrayList<persona> miembros = new ArrayList();
                            System.out.println("Agregar miembros: ");
                            if(heroeOvillano){
                                for (persona temp : heroe) {
                                    if(!temp.isTieneEscuadron()){
                                        System.out.println(temp.getNombre());
                                        System.out.println("Agregar miembro? s/n");
                                        char respAgregar = sc.nextLine().charAt(0);
                                        if(respAgregar == 's'){
                                            miembros.add(temp);
                                        }
                                    }
                                }
                            } else {
                                for (persona temp : villano) {
                                    if(!temp.isTieneEscuadron()){
                                        System.out.println(temp.getNombre());
                                        System.out.println("Agregar miembro? s/n");
                                        char respAgregar = sc.nextLine().charAt(0);
                                        if(respAgregar == 's'){
                                            miembros.add(temp);
                                        }
                                    }
                                }
                            }
                            
                            
                            escuadron nuevo = new escuadron(nombre,base,lider,heroeOvillano,miembros);
                            universos.get(indice).getSquads().add(nuevo);
                            break;
                        }
                        
                        case 2: {
                            System.out.println("******************************");
                            System.out.println("Modificar Escuadron ");
                            
                            System.out.println("Universos Actuales: ");
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice del universo: ");
                            int indice = sc.nextInt();
                            System.out.println(universos.get(indice).getNombre() + "aqui se modificara el escuadron");
                            
                            String acum2 = "";
                            for (escuadron temp : universos.get(indice).getSquads()) {
                                acum2 += universos.get(indice).getSquads().indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum2);
                            
                            System.out.println("Ingrese el indice del escuadron: ");
                            int indiceEscuadron = sc.nextInt();
                            System.out.println(universos.get(indice).getSquads().get(indiceEscuadron).getNombre() + "escuadron a modificar");
                            
                            System.out.println("Ingrese el nuevo nombre: ");
                            sc.nextLine();
                            String nuevoNombre = sc.nextLine();
                            universos.get(indice).getSquads().get(indiceEscuadron).setNombre(nuevoNombre);
                            
                            System.out.println("Ingrese la nueva base: ");
                            sc.nextLine();
                            String nuevaBase = sc.nextLine();
                            universos.get(indice).getSquads().get(indiceEscuadron).setLugarBase(nuevaBase);
                            break;
                        }

                        case 3: {
                            System.out.println("******************************");
                            System.out.println("Eliminar Universo ");
                            
                            System.out.println("Universos Actuales: ");
                            
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice del universo: ");
                            int indice = sc.nextInt();
                            System.out.println(universos.get(indice).getNombre() + "aqui se eliminara el escuadron");
                            
                            String acum2 = "";
                            for (escuadron temp : universos.get(indice).getSquads()) {
                                acum2 += universos.get(indice).getSquads().indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum2);
                            
                            System.out.println("Ingrese el indice del escuadron: ");
                            int indiceEscuadron = sc.nextInt();
                            System.out.println(universos.get(indice).getSquads().get(indiceEscuadron).getNombre() + "escuadron a eliminar");
                            
                            universos.get(indice).getSquads().remove(indiceEscuadron);
                            break;
                        }
                        
                        case 4 :{
                            System.out.println("******************************");
                            System.out.println("Listar Universos ");
                            
                            System.out.println("Universos Actuales: ");
                            
                            String acum = "";
                            for (universo temp : universos) {
                                acum += universos.indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum);
                            
                            System.out.println("Ingrese el indice del universo: ");
                            int indice = sc.nextInt();
                            
                            String acum2 = "";
                            for (escuadron temp : universos.get(indice).getSquads()) {
                                acum2 += universos.get(indice).getSquads().indexOf(temp) + ". " + temp.getNombre() + "\n";
                            }
                            System.out.println(acum2);
                            break;
                        }
                        
                        case 5:{
                            System.out.println("Simulacion");
                            break;
                        }

                        default: {
                            System.out.println("******************************");
                            System.out.println("!!");
                            System.out.println("Error, por favor introduzca un valor del menu.");
                            System.out.println("!!");
                            System.out.println(" ");
                            break;
                        }
                    }
                    break;
                }
                
                case 3 :{
                    System.out.println("******************************");
                    break;
                }
                
                default :{
                    System.out.println("******************************");
                    System.out.println("!!");
                    System.out.println("Error, por favor introduzca un valor del menu.");
                    System.out.println("!!");
                    System.out.println(" ");
                    break;
                }
            }
        }
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("************BEYONDER**********");
        System.out.println("**************MENU************");
        System.out.println("******************************");
        System.out.println("0. Salir\n"
                + "1. Universo\n"
                + "2. Escuadron\n"
                + "3. Persona\n"
                + "Ingrese la opcion: ");
        System.out.println("******************************");
        return sc.nextInt();
    }
    
    public static int subMenu(){
        System.out.println("");
        System.out.println("**************MENU************");
        System.out.println("0. Salir\n"
                + "1. Crear\n"
                + "2. Modificar\n"
                + "3. Eliminar\n"
                + "4. Listar\n"
                + "Ingrese la opcion: ");
        System.out.println("******************************");
        return sc.nextInt();
    }
    
    public static int subMenuEscuadron(){
        System.out.println("");
        System.out.println("**************MENU************");
        System.out.println("0. Salir\n"
                + "1. Crear\n"
                + "2. Modificar\n"
                + "3. Eliminar\n"
                + "4. Listar\n"
                + "5. Simular Batalla"
                + "Ingrese la opcion: ");
        System.out.println("******************************");
        return sc.nextInt();
    }
    
}
