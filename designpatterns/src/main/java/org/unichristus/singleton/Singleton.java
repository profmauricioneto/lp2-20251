package org.unichristus.singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){};

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton exemplo1 = Singleton.getInstance();
        Singleton exemplo2 = Singleton.getInstance();

        if (exemplo1 == exemplo2) {
            System.out.println("Instancias iquais!");
        } else {
            System.out.println("Instancias diferentes!");
        }
        System.out.println(exemplo1);
        System.out.println(exemplo2);
    }
}
