public class Mashine {
    int count;
    String name;
    double power;
    double ki;
    double kc;
    double cosf;
    double tangf;
    double Kр;
    double Qp;
    double Pp;
    double Sp;
    double Ip;

    Mashine(int count, double power, double ki,double cosf) {
        this.count = count;
        this.power = power;
        this.ki = ki;
        this.cosf = cosf;

        if(this.ki<0.4){this.kc = 0.5;}
        if(this.ki>=0.4&this.ki<=0.5){this.kc=0.6;}
        if(this.ki>=0.5&this.ki<=0.6){this.kc=0.65;}
        if(this.ki>=0.6&this.ki<=0.7){this.kc = 0.72;}
        if(this.ki>=0.7&this.ki<=0.8){this.kc =0.85;}
        if(this.ki>=0.8)this.kc = 0.92;

        tangf =Math.tan(Math.acos(cosf));
    }

}
