public class Light {
    public boolean IsOn;

    public boolean TurnON(){
        IsOn=true;
        return IsOn;
    }
    public boolean TurnOff(){
        IsOn=false;
        return IsOn;
    }

    public void print(){
        if (IsOn){
            System.out.println(" the light is on? "+IsOn);


        }else {
            System.out.println(" the light is off? "+IsOn);

        }

}


}

