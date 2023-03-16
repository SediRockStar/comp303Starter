public class MusicPlayer implements App{
    final private String name;
    final private float size;

    private boolean updated= false;

    public MusicPlayer(String name, float size){
        this.name= name;
        this.size= size;
        this.updated= false;
    }

    /**
     * A method to update the MusicPlayer app
     */
    @Override
    public void update(){
        this.updated= true;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
