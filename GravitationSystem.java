package project;

public class GravitationSystem {

    private static double G;  //gravity constant


    //constructor with input size to set G;
    public  GravitationSystem(int size,Particle[] particles){
        calG(size);

    }

    //calculate G
    public void calG(int size){
        G =6.67*(1/size/size/size);
    }



}
