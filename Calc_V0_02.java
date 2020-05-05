import javax.swing.*;

public class Calc  {




    public static void calcOne(Mashine stanok) {
        mainWindowOne.descriptionArea.append("ПРОИЗВОТИТЬСЯ РАСЧЁТ СТАНКА 1: \n\n");
        mainWindowOne.descriptionArea.append("\nОбщую мощность станка Рн, кВт определяется по формуле:\nРн = n*pнi\n");
        double rez = stanok.count * stanok.power;
        mainWindowOne.descriptionArea.append("Pн = " + stanok.count + " * " + stanok.power + " = " + rez + "кВт\n\n");
        mainWindowOne.descriptionArea.append("Коэфициент спроса для данного станка = " + stanok.kc + "\n");
        mainWindowOne.descriptionArea.append("Для нахождения эффективного числа ЭП, а также для активной и" +
                " реактивной мощностей определим следующие расчетные величины: \n");
        mainWindowOne.descriptionArea.append("Ки*Рн = " + stanok.ki + " * " + rez + " = " + stanok.ki * rez + "\n\n");
        mainWindowOne.descriptionArea.append("Tng f = " + stanok.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн = "+stanok.ki*rez+"\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн*tgφ = " + stanok.ki * rez * stanok.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("n*Pнi^2 = " + stanok.count * Math.pow(stanok.power,2) + "\n\n");
        double nPni2 = stanok.count * Math.pow(stanok.power,2);
        int countOptimalStank = (int) Math.floor((rez*rez) / nPni2);
        mainWindowOne.descriptionArea.append("Эффективное число электроприёмников nэ шт, определяется по формуле: " + "\n" + "nэ = ( ∑Pн )^2" + " / ∑n *P" + "^2" + "нi =" + countOptimalStank+"\n\n");
        getKp(countOptimalStank,stanok);
        mainWindowOne.descriptionArea.append("Определяем Кр исходя из значения эффективного числа элетроприёмников\n" +
                "и коэффициента использования, берем из справочных данных"+"\n"+"Kp = "+stanok.Kр+"\n\n");
        stanok.Pp = stanok.Kр*(stanok.ki*rez);
        mainWindowOne.descriptionArea.append("Активная расчётная мощность ЭО Рр,кВт, определяется по формуле: " + "\n" + "Рр = Кр*∑Ки*Рн = "+stanok.Pp+"Вт\n\n");
        stanok.Qp = 1.1*(stanok.ki*rez)*stanok.tangf;
        mainWindowOne.descriptionArea.append("Реактивная расчётная мощность ЭП Qр кВар, определяется по формуле:"+"\n"+ "QP =1,1* ∑Ки*Рн*tgφ = "+stanok.Qp+"Вар\n\n");
        stanok.Sp = Math.sqrt(Math.pow(stanok.Qp,2)+Math.pow(stanok.Pp,2));
        mainWindowOne.descriptionArea.append("Полная мощность SркВ*А определяется по формуле: " + "\n" + "Sр = √Q^2p+P^2p ="+stanok.Sp+"ВА\n\n");
        stanok.Ip = stanok.Sp/(Math.sqrt(3)*0.4);
        mainWindowOne.descriptionArea.append("Расчётный ток Iр,А определяется по формуле: " + "Ip = Sp/√3∙Uн = "+stanok.Ip+"А\n\n");
        mainWindowOne.descriptionArea.append("РАСЧЁТ ЗАВЕРШЁН");



    }
    public static void calcTwo(Mashine stanokOne, Mashine stanokTwo){
        mainWindowOne.descriptionArea.append("ПРОИЗВОТИТЬСЯ РАСЧЁТ СТАНКА 1: \n\n");
        mainWindowOne.descriptionArea.append("\nОбщую мощность станка Рн, кВт определяется по формуле:\nРн = n*pнi\n");
        double rezOne = stanokOne.count * stanokOne.power;
        mainWindowOne.descriptionArea.append("Pн = " + stanokOne.count + " * " + stanokOne.power + " = " + rezOne + "кВт\n\n");
        mainWindowOne.descriptionArea.append("Коэфициент спроса для данного станка = " + stanokOne.kc + "\n");
        mainWindowOne.descriptionArea.append("Для нахождения эффективного числа ЭП, а также для активной и" +
                " реактивной мощностей определим следующие расчетные величины: \n");
        mainWindowOne.descriptionArea.append("Ки*Рн = " + stanokOne.ki + " * " + rezOne + " = " + stanokOne.ki * rezOne + "\n\n");
        mainWindowOne.descriptionArea.append("Tng f = " + stanokOne.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн = "+stanokOne.ki*rezOne+"\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн*tgφ = " + stanokOne.ki * rezOne * stanokOne.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("n*Pнi^2 = " + stanokOne.count * Math.pow(stanokOne.power,2) + "\n\n");
        double nPni2One = stanokOne.count * Math.pow(stanokOne.power,2);
        mainWindowOne.descriptionArea.append("------------------------------------------------------------------------\n\n");

        mainWindowOne.descriptionArea.append("ПРОИЗВОТИТЬСЯ РАСЧЁТ СТАНКА 2: \n\n");
        mainWindowOne.descriptionArea.append("\nОбщую мощность станка Рн, кВт определяется по формуле:\nРн = n*pнi\n");
        double rezTwo = stanokOne.count * stanokOne.power;
        mainWindowOne.descriptionArea.append("Pн = " + stanokOne.count + " * " + stanokOne.power + " = " + rezTwo + "кВт\n\n");
        mainWindowOne.descriptionArea.append("Коэфициент спроса для данного станка = " + stanokOne.kc + "\n");
        mainWindowOne.descriptionArea.append("Для нахождения эффективного числа ЭП, а также для активной и" +
                " реактивной мощностей определим следующие расчетные величины: \n");
        mainWindowOne.descriptionArea.append("Ки*Рн = " + stanokOne.ki + " * " + rezTwo + " = " + stanokOne.ki * rezTwo + "\n\n");
        mainWindowOne.descriptionArea.append("Tng f = " + stanokOne.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн = "+stanokOne.ki*rezTwo+"\n\n");
        mainWindowOne.descriptionArea.append("Ки*Рн*tgφ = " + stanokOne.ki * rezTwo * stanokOne.tangf + "\n\n");
        mainWindowOne.descriptionArea.append("n*Pнi^2 = " + stanokOne.count * Math.pow(stanokOne.power,2) + "\n\n");
        double nPni2Two = stanokOne.count * Math.pow(stanokOne.power,2);
    }
    public static void calcTree(Mashine stanokOne, Mashine stanokTwo, Mashine stanokTree){}

    public static void getKp(int countOptimalStank, Mashine stanok){
        switch (countOptimalStank) {
            case 1:
                if (stanok.ki <= 0.1) stanok.Kр = 8.0;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 5.33;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 4.0;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 2.67;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 2.0;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.60;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.33;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.14;
                if (stanok.ki > 0.7 & stanok.ki < 0.8) stanok.Kр = 1;
                break;
            case 2:
                if (stanok.ki <= 0.1) stanok.Kр = 6.22;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 4.33;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 3.99;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 2.45;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.98;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.60;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.33;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.14;
                if (stanok.ki > 0.7 & stanok.ki < 0.8) stanok.Kр = 1;
                break;
            case 3:
                if (stanok.ki <= 0.1) stanok.Kр = 4.05;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 2.89;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 2.31;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.74;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.45;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.34;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.22;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.14;
                if (stanok.ki > 0.7 & stanok.ki < 0.8) stanok.Kр = 1;
                break;
            case 4:
                if (stanok.ki <= 0.1) stanok.Kр = 3.24;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 2.35;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.91;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.47;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.25;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.21;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.12;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.06;
                if (stanok.ki > 0.7 & stanok.ki < 0.8) stanok.Kр = 1;
                break;
            case 5:
                if (stanok.ki <= 0.1) stanok.Kр = 2.84;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 2.09;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.72;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.35;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.16;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.16;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.08;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.03;
                if (stanok.ki > 0.7 & stanok.ki < 0.8) stanok.Kр = 1;
                break;
            case 6:
                if (stanok.ki <= 0.1) stanok.Kр = 2.64;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.96;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.62;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.28;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.14;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.13;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.06;
                if (stanok.ki > 0.6 & stanok.ki < 0.7) stanok.Kр = 1.01;
                if (stanok.ki > 0.7 & stanok.ki < 1) stanok.Kр = 1;
                break;
            case 7:
                if (stanok.ki <= 0.1) stanok.Kр = 2.48;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.86;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.54;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.23;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.12;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.08;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.02;
                if (stanok.ki > 0.6 & stanok.ki < 1) stanok.Kр = 1;
                break;
            case 8:
                if (stanok.ki <= 0.1) stanok.Kр = 2.37;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.78;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.48;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.19;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.1;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.08;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.02;
                if (stanok.ki > 0.6 & stanok.ki < 1) stanok.Kр = 1;
                break;
            case 9:
                if (stanok.ki <= 0.1) stanok.Kр = 2.27;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.71;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.43;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.16;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.09;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.07;
                if (stanok.ki > 0.5 & stanok.ki <= 0.6) stanok.Kр = 1.01;
                if (stanok.ki > 0.6 & stanok.ki < 1) stanok.Kр = 1;
                break;
            case 10:
                if (stanok.ki <= 0.1) stanok.Kр = 2.18;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.65;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.39;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.13;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.07;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.05;
                if (stanok.ki > 0.5 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 11:
                if (stanok.ki <= 0.1) stanok.Kр = 2.11;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.61;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.35;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.11;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.06;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.04;
                if (stanok.ki > 0.5 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 12:
                if (stanok.ki <= 0.1) stanok.Kр = 2.04;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.56;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.32;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.08;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.05;
                if (stanok.ki > 0.4 & stanok.ki <= 0.5) stanok.Kр = 1.03;
                if (stanok.ki > 0.5 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 13:
                if (stanok.ki <= 0.1) stanok.Kр = 1.99;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.52;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.29;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.06;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.04;
                if (stanok.ki > 0.4 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 14:
                if (stanok.ki <= 0.1) stanok.Kр = 1.94;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.49;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.27;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.05;
                if (stanok.ki > 0.3 & stanok.ki <= 0.4) stanok.Kр = 1.02;
                if (stanok.ki > 0.4 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 15:
                if (stanok.ki <= 0.1) stanok.Kр = 1.89;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.46;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.25;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.03;
                if (stanok.ki > 0.3 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 16:
                if (stanok.ki <= 0.1) stanok.Kр = 1.85;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.43;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.23;
                if (stanok.ki > 0.2 & stanok.ki <= 0.3) stanok.Kр = 1.02;
                if (stanok.ki > 0.3 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 17:
                if (stanok.ki <= 0.1) stanok.Kр = 1.81;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.41;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.21;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 18:
                if (stanok.ki <= 0.1) stanok.Kр = 1.78;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.39;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.19;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 19:
                if (stanok.ki <= 0.1) stanok.Kр = 1.75;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.36;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.17;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 20:
                if (stanok.ki <= 0.1) stanok.Kр = 1.72;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.35;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.16;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 21:
                if (stanok.ki <= 0.1) stanok.Kр = 1.69;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.33;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.15;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 22:
                if (stanok.ki <= 0.1) stanok.Kр = 1.67;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.31;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.13;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 23:
                if (stanok.ki <= 0.1) stanok.Kр = 1.64;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.3;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.12;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 24:
                if (stanok.ki <= 0.1) stanok.Kр = 1.62;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.28;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.1;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;
            case 25:
                if (stanok.ki <= 0.1) stanok.Kр = 1.6;
                if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.27;
                if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.1;
                if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
                break;

        }
        if (countOptimalStank >= 25 & countOptimalStank < 30) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.6;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.27;
            if (stanok.ki > 0.15 & stanok.ki <= 0.2) stanok.Kр = 1.1;
            if (stanok.ki > 0.2 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 30 & countOptimalStank < 35) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.44;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.16;
            if (stanok.ki > 0.15 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 35 & countOptimalStank < 40) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.4;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.13;
            if (stanok.ki > 0.15 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 40 & countOptimalStank < 45) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.35;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.1;
            if (stanok.ki > 0.15 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 45 & countOptimalStank < 50) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.3;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.07;
            if (stanok.ki > 0.15 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 50 & countOptimalStank < 60) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.25;
            if (stanok.ki > 0.1 & stanok.ki <= 0.15) stanok.Kр = 1.03;
            if (stanok.ki > 0.15 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 60 & countOptimalStank < 70) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.2;
            if (stanok.ki > 0.1 & stanok.ki <= 1) stanok.Kр = 1;
        }
        if (countOptimalStank >= 60 & countOptimalStank < 70) {
            if (stanok.ki <= 0.1) stanok.Kр = 1.16;
            if (stanok.ki > 0.1 & stanok.ki <= 1) stanok.Kр = 1;
        }
    }


}

