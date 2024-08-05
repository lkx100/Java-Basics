public class light_speed {
    public static void main(String [] args) {
        int LightSpeed;    // Int data types
        long days, seconds, distance;   // Long data types
        LightSpeed = 186000;   // In miles per sec
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = LightSpeed * seconds;   // Calculating distance using d = t * s
        System.out.println("Total distance = " + distance);
    }
}
