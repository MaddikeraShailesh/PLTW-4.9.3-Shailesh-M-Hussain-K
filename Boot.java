/*
 * Activity 4.9.3
 */
public class Boot extends LakeObject
{

     @Override
    public boolean wasCaught(Hook h) {
        return true; // Always caught
    }

     @Override
    public String say() {
        return "You caught a boot!";
    }

}