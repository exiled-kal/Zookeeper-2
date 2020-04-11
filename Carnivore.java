

public class Carnivore{
    public int energyLevel = 300;

    public Carnivore(){
            
    }

    public void setEnergy(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int getEnergy(){
        return energyLevel;
    }

    public int displayEnergy(){
        System.out.println("Hope the vampire energylevel is not very high " + energyLevel);

        return energyLevel;
        }
    }
