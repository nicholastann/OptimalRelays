import java.util.*;
public class Relays {
   public static void main() {
       double[] tfree = {21,21.6,23.30,23.75,21.75,22.75, 23.25,21.5,23.2};
       double[] ffree = {45.5,48.5,50.25,51,48.25,50.5,50,48,49};
       ArrayList<im> medley = new ArrayList<im>();
       medley.add(new im(25, 29, 23, 21));
       medley.add(new im(26, 28, 25, 21.6));
       medley.add(new im(28, 29, 24.5, 23.25));
       medley.add(new im(30, 29, 26, 23.75));
       medley.add(new im(24, 30, 24, 21.75));
       medley.add(new im(27, 33, 26, 22.75));
       medley.add(new im(27, 33, 25.5, 23.25));
       medley.add(new im(26, 30, 23.75, 21.5));
       medley.add(new im(29, 32, 25.25, 23.2));
 
       int acap = 0;
       int ccap = 0;
       int ecap = 0;
       int mcap = 0;
       int ntcap = 0;
       int nbcap = 0;
       int tcap = 0;
       int hcap = 0;
       int fcap = 0;
 
       int acapf = 0;
       int ccapf = 0;
       int ecapf = 0;
       int mcapf = 0;
       int ntcapf = 0;
       int nbcapf = 0;
       int tcapf = 0;
       int hcapf = 0;
       int fcapf = 0;
 
       int score = 0;
       int run = 0;
 
       int afinal = 0;
       int sfinal= 0;
       int dfinal = 0;
       int ffinal=0;
 
       int ifinal=0;
       int jfinal=0;
       int kfinal=0;
       int pfinal=0;
 
       int zfinal=0;
       int xfinal=0;
       int cfinal=0;
       int vfinal=0;
 
       for (int i = 0; i < tfree.length; i+= 1) {
           for (int j= i+1; j < tfree.length; j+= 1) {
               for (int k= j+1; k < tfree.length; k+= 1) {
                   for (int p= k+1; p < tfree.length; p+= 1) {
                       double[] tfreerelay = {tfree[i], tfree[j], tfree[k], tfree[p]};
                       for (int z = 0; z < ffree.length; z+= 1) {
                           for (int x= z+1; x < ffree.length; x+= 1) {
                               for (int c= x+1; c < ffree.length; c+= 1) {
                                   for (int v= c+1; v < ffree.length; v+= 1) {
                                       double[] ffreerelay = {ffree[z], ffree[x], ffree[c], ffree[v]};     
                                       im[] placeholder = new im[9];
                                       for (int t = 0; t < 4; t++) {
                                           if (tfreerelay[t] == 21)    acap++;
                                           if (tfreerelay[t] == 21.6)  ccap++;
                                           if (tfreerelay[t] == 23.3)  ecap++; 
                                           if (tfreerelay[t] == 23.75) mcap++;
                                           if (tfreerelay[t] == 21.75) ntcap++;
                                           if (tfreerelay[t] == 22.75) nbcap++;
                                           if (tfreerelay[t] == 23.25) tcap++;
                                           if (tfreerelay[t] == 21.5)  hcap++;
                                           if (tfreerelay[t] == 23.2)  fcap++;
                                       }
                                       for (int t = 0; t < 4; t++) {
                                           if (ffreerelay[t] == 45.5)  acap++;
                                           if (ffreerelay[t] == 48.5)  ccap++;
                                           if (ffreerelay[t] == 50.25) ecap++; 
                                           if (ffreerelay[t] == 51)    mcap++;
                                           if (ffreerelay[t] == 48.25) ntcap++;
                                           if (ffreerelay[t] == 50.5)  nbcap++;
                                           if (ffreerelay[t] == 50)    tcap++;
                                           if (ffreerelay[t] == 48)    hcap++;
                                           if (ffreerelay[t] == 49)    fcap++;
                                       }
                                       if (acap == 2) {
                                           placeholder[0] = new im(25, 29, 23, 21);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 21) medley.remove(q);
                                           }
                                           //System.out.println("Alex Was Removed");
 
                                       }                                       
                                       if (ccap == 2) {
                                           placeholder[1] = new im(26, 28, 25, 21.6);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 21.6) medley.remove(q);
                                           }
                                           //System.out.println("CJ Was Removed");
 
                                       }                                                                                                      
                                       if (ecap == 2) {
                                           placeholder[2] = new im(28, 30, 24.5, 23.25);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 23.25) medley.remove(q);
                                           }
                                           //System.out.println("Ethan Was Removed");
 
                                       }                                            
                                       if (mcap == 2) {
                                           placeholder[3] = new im(30, 29, 26, 23.75);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 23.75) medley.remove(q);
                                           }
                                           //System.out.println("Matt Was Removed");
 
                                       }         
                                       if (ntcap == 2) {
                                           placeholder[4] = new im(24, 30, 24, 21.75);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 21.75) medley.remove(q);
                                           }
                                           //System.out.println("NickT Was Removed");      
 
                                       }                      
                                       if (nbcap == 2) {
                                           placeholder[5] = new im(27, 33, 26, 22.75);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 22.75) medley.remove(q);
                                           }
                                           //System.out.println("NickB Was Removed");
 
                                       }                 
                                       if (tcap == 2) {
                                           placeholder[6] = new im(27, 33, 25.5, 23.25);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 23.25) medley.remove(q);
                                           }
                                           //System.out.println("Tony Was Removed");
 
                                       }
                                       if (hcap == 2) {
                                           placeholder[7] = new im(26, 30, 23.75, 21.5);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 21.5) medley.remove(q);
                                           }
                                           //System.out.println("Hayden Was Removed");
 
                                       }
                                       if (fcap == 2) {
                                           placeholder[8] = new im(29, 32, 25.25, 23.2);
                                           for (int q = 0; q < medley.size(); q++) {
                                               if (medley.get(q).getfree() == 23.2) medley.remove(q);
                                           }
                                           //System.out.println("Fabian Was Removed");
 
                                       }
                                       for (int a = 0; a < medley.size(); a++) {
                                           for (int s= a+1; s < medley.size(); s++) {
                                               for (int d= s+1; d < medley.size(); d++) {
                                                   for (int f= d+1; f < medley.size(); f++) {
 
                                                       ArrayList<im> four = new ArrayList<im>();
                                                       four.add(medley.get(a));
                                                       four.add(medley.get(s));
                                                       four.add(medley.get(d));
                                                       four.add(medley.get(f));
                                                       run++;
 
                                                       //System.out.print("Medley: " + a+ ", "+ s + ", "+d+ ", "+f+ " ");
                                                       //System.out.print("200 Free: " + i+ ", " + j+ ", "+ k+ ", " + p+ " ");
                                                      //System.out.println("400 Free: " + z+ ", "+ x + ", "+c+ ", "+v+ " ");     
                                                       if (score(build(four), tfreerelay, ffreerelay) > score) {
                                                           score = score(build(four), tfreerelay, ffreerelay);
                                                           afinal = a;
                                                           sfinal = s;
                                                           dfinal = d;
                                                           ffinal = f;
                                                           zfinal = z;
                                                           xfinal = x;
                                                           cfinal = c;
                                                           vfinal = v;
                                                           ifinal = i;
                                                           jfinal = j;
                                                           kfinal = k;
                                                           pfinal = p;
                                                           acapf = acap;
                                                           ccapf = ccap;
                                                           ecapf = ecap;
                                                           mcapf = mcap;
                                                           ntcapf = ntcap;
                                                           nbcapf = nbcap;
                                                           tcapf = tcap;
                                                           hcapf = hcap;
                                                           fcapf = fcap;
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                       medley.clear();
                                       medley.add(new im(25, 29, 23, 21));
                                       medley.add(new im(26, 28, 25, 21.6));
                                       medley.add(new im(28, 30, 24.5, 23.25));
                                       medley.add(new im(30, 29, 26, 23.75));
                                       medley.add(new im(24, 30, 24, 21.75));
                                       medley.add(new im(27, 33, 26, 22.75));
                                       medley.add(new im(27, 33, 25.5, 23.25));
                                       medley.add(new im(26, 30, 23.75, 21.5));
                                       medley.add(new im(29, 32, 25.25, 23.2));
                                       acap = 0;
                                       ccap = 0;
                                       ecap = 0;
                                       mcap = 0;
                                       ntcap = 0;
                                       nbcap = 0;
                                       tcap = 0;
                                       hcap = 0;
                                       fcap = 0;
                                   }
                               }
                           }
                       }
                   }
               }
           }
       }
       if (acapf == 2) System.out.println("Alex was removed from medley array");
       if (ccapf == 2) System.out.println("CJ was removed from medley array");
       if (ecapf == 2) System.out.println("Ethan was removed from medley array");
       if (mcapf == 2) System.out.println("Matt was removed from medley array");
       if (ntcapf == 2) System.out.println("NickT was removed from medley array");
       if (nbcapf == 2) System.out.println("NickB was removed from medley array");
       if (tcapf == 2) System.out.println("Tony was removed from medley array");
       if (hcapf == 2) System.out.println("Hayden was removed from medley array");
       if (fcapf == 2) System.out.println("Fabian was removed from medley array");
       System.out.println("tests: " + run);
       System.out.println("Medley: " + ffinal+ ", "+ dfinal + ", "+sfinal+ ", "+afinal+ " ");
       System.out.println("200 Free: " + ifinal+ ", " + jfinal+ ", "+ kfinal+ ", " + pfinal+ " ");
       System.out.println("400 Free: " + zfinal+ ", "+ xfinal + ", "+cfinal+ ", "+vfinal+ " "); 
       System.out.println("Total: "+ score);
   }
 
   public static double[] build(ArrayList<im> option){
       double [] build = new double[4];
       double t = 600;
       for (int i = 0; i < option.size(); i++) {
           for (int j = i+1; j < option.size(); j++) {
               for (int k = j+1; k < option.size(); k++) {
                   for (int l = k+1; l < option.size(); l++) {
                       double[] test = new double[4];
                       test[0] = option.get(l).getback();
                       test[1] = option.get(k).getbreast();
                       test[2] = option.get(j).getfly();
                       test[3] = option.get(i).getfree();
                       if (time(test) < t) {
                           t = time(build);
                           build[0] = test[0];
                           build[1] = test[1];
                           build[2] = test[2];
                           build[3] = test[3];
                       }
                   }
               }
           }
       }
       return build;
   }
 
   public static double time(double [] x) {
       double time = 0;
       for (int i = 0; i < x.length; i = i+1) {
           time = time + x[i];
 
       }
       return time;
   }
 
   public static int score(double[] medley, double[] tfree, double[] ffree ) {
       int medleys = 0;
       int tfrees = 0;
       int ffrees = 0;
 
       //System.out.print("Medley Time: " + time(medley));
       if (time(medley) < 95.04) { 
           medleys = 40;
       }
       else if (time(medley) < 96.27) {
           medleys = 34;
       }
       else if (time(medley) < 96.46) { 
           medleys = 32;
       }
       else if (time(medley) < 97.07) {
           medleys = 30;
       }
       else if (time(medley) < 97.25) { 
           medleys = 28;
       }
       else if (time(medley) < 99.28) {
           medleys = 26;
       }
       else if (time(medley) < 99.34) { 
           medleys = 24;
       }
       else if (time(medley) < 99.53) {
           medleys = 22;
       }
       else if (time(medley) < 99.59) { 
           medleys = 18;
       }
       else if (time(medley) < 100.02) {
           medleys = 14;
       }
       else if (time(medley) < 100.06) { 
           medleys = 12;
       }
       else if (time(medley) < 100.53) {
           medleys = 10;
       }
       else if (time(medley) < 100.87) {
           medleys = 8;
       }
       else if (time(medley) < 101.36) {
           medleys = 6;
       }
       else if (time(medley) < 101.88) {
           medleys = 4;
       }
       else if (time(medley) < 101.97) {
           medleys = 2;
       }
      // System.out.print("200 Free Time: " + time(tfree));
 
       if (time(tfree) < 85.73) { 
           tfrees = 40;
       }
       else if (time(tfree) < 87.52) {
           tfrees = 34;
       }
       else if (time(tfree) < 88.38) { 
           tfrees = 32;
       }
       else if (time(tfree) < 88.4) {
           tfrees = 30;
       }
       else if (time(tfree) < 88.84) { 
           tfrees = 28;
       }
       else if (time(tfree) < 88.87) {
           tfrees = 26;
       }
       else if (time(tfree) < 88.94) { 
           tfrees = 24;
       }
       else if (time(tfree) < 88.97) {
           tfrees = 22;
       }
       else if (time(tfree) < 89.13) { 
           tfrees = 18;
       }
       else if (time(tfree) < 90.24) {
           tfrees = 14;
       }
       else if (time(tfree) < 90.33) { 
           tfrees = 12;
       }
       else if (time(tfree) < 90.34) {
           tfrees = 10;
       }
       else if (time(tfree) < 90.91) {
           tfrees = 8;
       }
       else if (time(tfree) < 90.99) {
           tfrees = 6;
       }
       else if (time(tfree) < 93.11) {
           tfrees = 4;
       }
       else if (time(tfree) < 93.24) {
           tfrees = 2;
       }
       //System.out.println("400 Free Time: " + time(ffree));
       if (time(ffree) < 191.98) { 
           ffrees = 40;
       }
       else if (time(ffree) < 192.02) {
           ffrees = 34;
       }
       else if (time(ffree) < 193.85) { 
           ffrees = 32;
       }
       else if (time(ffree) < 195.58) {
           ffrees = 30;
       }
       else if (time(ffree) < 195.81) { 
           ffrees = 28;
       }
       else if (time(ffree) < 196.06) {
           ffrees = 26;
       }
       else if (time(ffree) < 196.34) { 
           ffrees = 24;
       }
       else if (time(ffree) < 196.52) {
           ffrees = 22;
       }
       else if (time(ffree) < 196.95) { 
           ffrees = 18;
       }
       else if (time(ffree) < 197.44) {
           ffrees = 14;
       }
       else if (time(ffree) < 197.75) { 
           ffrees = 12;
       }
       else if (time(ffree) < 198.96) {
           ffrees = 10;
       }
       else if (time(ffree) < 199.8) {
           ffrees = 8;
       }
       else if (time(ffree) < 199.91) {
           ffrees = 6;
       }
       else if (time(ffree) < 200.71) {
           ffrees = 4;
       }
       else if (time(ffree) < 222.54) {
           ffrees = 2;
       }
 
       //System.out.println("Medley Score: " + medleys);
       //System.out.println("200 Free Score: " + tfrees);
       //System.out.println("400 Free Score: " + ffrees);
       //System.out.println("Total: " + (ffrees + medleys + tfrees));
       return (ffrees+ medleys + tfrees);
   }
}