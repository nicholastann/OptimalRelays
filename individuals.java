import java.util.*;
public class individuals {
   public static void main() {
 
       double[] Alex = {102.41, 115.97, 21.3, 53.9, 46.6, 278.58, 55.43, 67};
       double[] CJ = {107.2, 120, 22, 55.9, 49, 295.2 , 59, 65};
       double[] Ethan = {112.54, 125.45, 24, 58, 51.5, 310, 60, 63.5};
       double[] Matt = {126, 139, 24.25, 69, 54, 330, 63, 62.5};
       double[] NickT = {113, 128, 22.4, 53.7, 49, 330, 55.22, 67};
       double[] NickB = {117, 138, 23, 65, 51.5, 330, 61, 74};
       double[] Tony = {111, 129, 24, 58.5, 52, 296.5, 64, 75};
       double[] Hayden = {110, 126.5, 21.9, 56.5, 49, 316, 59, 65};
       double[] Fabian = {109.5, 130, 23.5, 57.5, 51.5, 295.5, 64, 76};
 
       //200, im, 50, fly, 100, 500, back, breast
       System.out.println("Alex");
       besttwo(Alex);
       System.out.println("CJ");
       besttwo(CJ);
       System.out.println("Ethan");
       besttwo(Ethan);
       System.out.println("Matt");
       besttwo(Matt);
       System.out.println("NickT");
       besttwo(NickT);
       System.out.println("NickB");
       besttwo(NickB);
       System.out.println("Tony");
       besttwo(Tony);
       System.out.println("Hayden");
       besttwo(Hayden);
       System.out.println("Fabian");
       besttwo(Fabian);
       
 
   }
 
   public static int[] besttwo (double[] times) {
       int[] besttwo = {0,0};
       String[] Events = new String[2];
       int b = 10;
       int score = 0;
       int x = 0;
       if (scoretwohundred(times[0]) > score) {
           besttwo[0] = 0;
           b = 0;
           //System.out.println("0- 2hundred");
           Events[0] = "TwoHundred";
           score = scoretwohundred(times[0]);
       }
       if (scoreim(times[1]) > score) {
           besttwo[0] = 1;
           b = 1;
           score = scoreim(times[1]);
           Events[0] = "IM";
           //System.out.println("0- im");
       }
       if (scorefifty(times[2]) > score) {
           besttwo[0] = 2;
           b = 2;
           //System.out.println("0- fifty");
           Events[0] = "Fifty";
           score = scorefifty(times[2]);
       }
       if (scorefly(times[3]) > score) {
           besttwo[0] = 3;
           b = 3;
           //System.out.println("0- fly");
           Events[0] = "Fly";
           score = scorefly(times[3]);
       }
       if (scorehundred(times[4]) > score) {
           besttwo[0] = 4;
           b = 4;
           //System.out.println("0- hundred");
           Events[0] = "Hundred";
           score = scorehundred(times[4]);
       }
       if (scorefivehundred(times[5]) > score) {
           besttwo[0] = 5;
           b = 5;
           //System.out.println("0- 500");
           Events[0] = "FiveHundred";
           score = scorefivehundred(times[5]);
       }
       if (scoreback(times[6]) > score) {
           besttwo[0] = 6;
           b = 6;
           //System.out.println("0- back");
           Events[0] = "Back";
           score = scoreback(times[6]);
       }
       if (scorebreast(times[7]) > score) {
           besttwo[0] = 7;
           b = 7;
           //System.out.println("0- bresast");
           Events[0] = "Breast";
           score = scorebreast(times[7]);
       }
       System.out.println("Best Event Score: "+score);
       x = score;
       score = 0;
       if ((scoretwohundred(times[0]) > score)&& (b!= 0)) {
           besttwo[1] = 0;
           //System.out.println("1- 2hundred");
           Events[1] = "TwoHundred";
           score = scoretwohundred(times[0]);
       }
       if ((scoreim(times[1]) > score )&& (b!= 1)) {
           //System.out.println("1- im");
           besttwo[1] = 1;
           Events[1] = "IM";
           score = scoreim(times[7]);
       }
       if (scorefifty(times[2]) > score&& (b!= 2)) {
           besttwo[1] = 2;
           //System.out.println("1- fifty");
           Events[1] = "Fifty";
           score = scorefifty(times[2]);
       }
       if (scorefly(times[3]) > score&& (b!= 3)) {
           besttwo[1] = 3;
           //System.out.println("1- fly");
           Events[1] = "Fly";
           score = scorefly(times[3]);
       }
       if (scorehundred(times[4]) > score&& (b!= 4)) {
           score = scorehundred(times[4]);
           //System.out.println("1- hundred");
           Events[1] = "Hundred";
           besttwo[1] = 4;
       }
       if (scorefivehundred(times[5]) > score&& (b!= 5)) {
           //System.out.println("1- 500");
           besttwo[1] = 5;
           Events[1] = "FiveHundred";
           score = scorefivehundred(times[5]);
       }
       if (scoreback(times[6]) > score&& (b!= 6)) {
           besttwo[1] = 6;
           score = scoreback(times[6]);
           Events[1] = "Back";
           //System.out.println("1- back");
       }
       if (scorebreast(times[7]) > score&& (b!= 7)) {
           besttwo[1] = 7;
           score = scorebreast(times[7]);
           Events[1] = "Breast";
           //System.out.println("1-breast");
       }
       System.out.println("2nd Best Event Score: " +score);
       System.out.println("Event 1: " + Events[0] + " Event 2: " + Events[1]);
       System.out.println("Total Score: " + (x+score));
       return besttwo;
   }
 
   public static int scoretwohundred (double time) {
       int score = 0;
       if (time < 98.12) score = 20;
       else if (time < 99.08) score = 17;
       else if (time < 102.34) score = 16;
       else if (time < 102.44) score = 15;
       else if (time < 103.67) score = 14;
       else if (time < 104.29) score = 13;
       else if (time < 104.43) score = 12;
       else if (time < 104.74) score = 11;
       else if (time < 105.09) score = 9;
       else if (time < 105.24) score = 7;
       else if (time < 105.62) score = 6;
       else if (time < 105.89) score = 5;
       else if (time < 106.94) score = 4;
       else if (time < 107.27) score = 3;
       else if (time < 108.98) score = 2;
       else if (time < 109.07) score = 1;
 
       return score;
   }
 
   public static int scoreim (double time) {
       int score = 0;
       if (time < 109.4) score = 20;
       else if (time < 114.58) score = 17;
       else if (time < 115.02) score = 16;
       else if (time < 115.13) score = 15;
       else if (time < 115.82) score = 14;
       else if (time < 117.86) score = 13;
       else if (time < 118.84) score = 12;
       else if (time < 119.02) score = 11;
       else if (time < 119.23) score = 9;
       else if (time < 119.82) score = 7;
       else if (time < 121.04) score = 6;
       else if (time < 121.16) score = 5;
       else if (time < 121.33) score = 4;
       else if (time < 122.66) score = 3;
       else if (time < 123.19) score = 2;
       else if (time < 123.94) score = 1;
 
       return score;
   }
 
   public static int scorefifty (double time) {
       int score = 0;
       if (time < 20.71) score = 20;
       else if (time < 21) score = 17;
       else if (time < 21.03) score = 16;
       else if (time < 21.38) score = 15;
       else if (time < 21.48) score = 14;
       else if (time < 21.67) score = 13;
       else if (time < 21.72) score = 12;
       else if (time < 21.73) score = 11;
       else if (time < 21.74) score = 9;
       else if (time < 21.78) score = 7;
       else if (time < 21.88) score = 6;
       else if (time < 22.02) score = 5;
       else if (time < 22.08) score = 4;
       else if (time < 22.19) score = 3;
       else if (time < 22.43) score = 2;
       else if (time < 22.6) score = 1;
 
       return score;
   }
 
   public static int scorefly (double time) {
       int score = 0;
       if (time < 48.87) score = 20;
       else  if (time < 50.25) score = 17;
       else  if (time < 50.99) score = 16;
       else  if (time < 51.25) score = 15;
       else  if (time < 51.44) score = 14;
       else  if (time < 51.95) score = 13;
       else  if (time < 52.65) score = 12;
       else  if (time < 52.86) score = 11;
       else  if (time < 52.92) score = 9;
       else  if (time < 53.02) score = 7;
       else  if (time < 53.05) score = 6;
       else  if (time < 53.63) score = 5;
       else  if (time < 53.68) score = 4;
       else  if (time < 53.86) score = 3;
       else  if (time < 54.49) score = 2;
       else  if (time < 54.78) score = 1;
 
       return score;
   }
 
   public static int scorehundred (double time) {
       int score = 0;
       if (time < 44.96) score = 20;
       else  if (time < 45.3) score = 17;
       else  if (time < 46.36) score = 16;
       else  if (time < 46.4) score = 15;
       else  if (time < 47.12) score = 14;
       else  if (time < 47.4) score = 13;
       else  if (time < 47.43) score = 12;
       else  if (time < 47.64) score = 11;
       else  if (time < 47.78) score = 9;
       else  if (time < 47.91) score = 7;
       else  if (time < 48.99) score = 6;
       else  if (time < 48.22) score = 5;
       else  if (time < 48.31) score = 4;
       else  if (time < 48.75) score = 3;
       else  if (time < 49.01) score = 2;
       else  if (time < 49.02) score = 1;
 
       return score;
   }
 
   public static int scorefivehundred (double time) {
       int score = 0;
       if (time < 268.67) score = 20;
       else   if (time < 277.79) score = 17;
       else   if (time < 279) score = 16;
       else   if (time < 281.08) score = 15;
       else   if (time < 282) score = 14;
       else   if (time < 282.79) score = 13;
       else   if (time < 284.1) score = 12;
       else   if (time < 285.89) score = 11;
       else   if (time < 286.13) score = 9;
       else   if (time < 288.67) score = 7;
       else   if (time < 288.81) score = 6;
       else   if (time < 290.41) score = 5;
       else   if (time < 290.79) score = 4;
       else   if (time < 291.93) score = 3;
       else   if (time < 293.01) score = 2;
       else   if (time < 305.34) score = 1;
 
       return score;
   }
 
   public static int scoreback (double time) {
       int score = 0;
       if (time < 49.8) score = 20;
       else  if (time < 50.69) score = 17;
       else  if (time < 51.77) score = 16;
       else  if (time < 52.07) score = 15;
       else  if (time < 52.46) score = 14;
       else  if (time < 53.07) score = 13;
       else  if (time < 53.36) score = 12;
       else  if (time < 54.09) score = 11;
       else  if (time < 54.4) score = 9;
       else  if (time < 54.53) score = 7;
       else  if (time < 54.65) score = 6;
       else  if (time < 54.79) score = 5;
       else  if (time < 54.85) score = 4;
       else  if (time < 55.26) score = 3;
       else  if (time < 55.45) score = 2;
       else  if (time < 55.62) score = 1;
 
       return score;
   }
 
   public static int scorebreast (double time) {
       int score = 0;
       if (time < 55.97) score = 20;
       else  if (time < 57.11) score = 17;
       else  if (time < 57.92) score = 16;
       else  if (time < 58.15) score = 15;
       else  if (time < 58.73) score = 14;
       else  if (time < 58.97) score = 13;
       else  if (time < 59.4) score = 12;
       else  if (time < 60) score = 11;
       else  if (time < 60.1) score = 9;
       else  if (time < 60.51) score = 7;
       else  if (time < 60.6) score = 6;
       else  if (time < 60.68) score = 5;
       else  if (time < 61.04) score = 4;
       else  if (time < 61.53) score = 3;
       else  if (time < 62.8) score = 2;
       else  if (time < 63.56) score = 1;
 
       return score;
   }
 
}