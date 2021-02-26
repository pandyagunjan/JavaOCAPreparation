package Mix.enumsDemo;

public enum MusicType {
    CLASSICAL(1) ,JAZZ(2),ROCK(6),METAL(11);
    private int earDamageFactor;

    private MusicType(int earDamageFactor)
    {
        this.earDamageFactor=earDamageFactor;
    }
public int calcHearingLoss(int hours){
        return hours * earDamageFactor;
}

public String toString()
{
    return this.name() +"-" + this.ordinal()+"-" + this.earDamageFactor;
}

}
