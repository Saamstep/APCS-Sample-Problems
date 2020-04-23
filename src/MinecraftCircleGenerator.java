import java.util.*;
import java.lang.Math;

// 4/23/2020
// APCS Period 3B
public class MinecraftCircleGenerator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input a radius ");
        int radius = s.nextInt();
        System.out.println("Input a height ");
        int height = s.nextInt();

        if(radius <= 0 || height <= 0) throw new java.lang.RuntimeException("Your radius and height must be greater than zero");

        System.out.println("setblock ~ ~-1 ~ gold_block");
        System.out.println("setblock ~ ~ ~ oak_sign{Text1:\"{\\\"text\\\":\\\"Circle Generator\\\",\\\"bold\\\":true}\",Text3:\"{\\\"text\\\":\\\"r = " + radius +"\\\",\\\"color\\\":\\\"aqua\\\"}\"}");
        for(double theta = 0; theta < 2*Math.PI; theta += Math.atan(1/radius)) {
            double x0 = Math.round(Math.cos(theta) * radius * 100.0) / 100.0;
            double z0 = Math.round(Math.sin(theta) * radius * 100.0) / 100.0;
            String fill = "fill ~" + x0 + " ~ ~" + z0 + " ~" + x0 + " ~" + (height - 1) + " ~" + z0 + " stone replace air";
            System.out.println(fill);
            theta += 0.001;
        }
    }
}
