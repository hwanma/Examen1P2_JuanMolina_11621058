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
 String nombre, String poder, String debilidad, String heroeVillano, int fuerza, 
 * int habilidadMental, int habilidadFisica, boolean tieneEscuadron
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
        universos.add(marvel);
        
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
                            System.out.println("Crear universo: ");
                            break;
                        }
                        
                        case 2: {
                            System.out.println("******************************");
                            break;
                        }

                        case 3: {
                            System.out.println("******************************");
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
