

public class Vampire extends Carnivore {
    public void fly(){
        this.setEnergy(this.getEnergy()-50);
        System.out.println("Evreybody hide, they are coming!");
        
    }
    public void eatHumans(){
        this.setEnergy(this.getEnergy()-25);
        System.out.println("The vampire ate a human, let's hope it's not hungry anymore.");
    }
    
    public void attackTown(){
        this.setEnergy(this.getEnergy()-100);
        System.out.println("The whole town of SomeCity is destroyed and under fire.");
    }
}