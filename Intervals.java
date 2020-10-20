import javax.sound.midi.Soundbank;
import java.awt.*;

public class Intervals {
    public static String[] intevals = {"","m2","M2","m3","M3","P4","P5","m6","M6","m7","M7","P8"};
    public static String[] notes = {"C","D","E","F","G","A","B"};
    public static String[] semitons = {"C","-","-","D","-","-","E","-","F","-","-","G","-","-","A","-","-","B","-"};


    static int semiton;
    static int degrees;


    public static String intervalConstruction(String[] args) {
        String inInteval = args[0];
        String inNote = args[1];
        String upOrLow = null;
        String endNote = null;

        int startNoteId = 0;
        int startSemitonId = 0;
        int endNoteId = 0;
        int endSemitonId = 0;
        int semitonsCount = 0;
        int semitonDif = 0;

        if(args.length > 3){
            throw new RuntimeException("Недопустимое количество элементов во входном массиве");
        }

        if(args.length == 2){
            upOrLow = "asc";
        }else{
            upOrLow = args[2];
        }


        // Находит интервал из масива и получает его занчение
        for(int i = 0; i < intevals.length; i++){

            if(inInteval == intevals[i]){
                degrees = Integer.parseInt(String.valueOf(intevals[i].charAt(1)));
                if(i > 5){semiton = i+1;
                }else{semiton = i;}

            }
        }


        //Находит индекс первой ноты
        for(int i = 0; i < notes.length; i++){
            if(String.valueOf(inNote.charAt(0)).equals(notes[i])){
                startNoteId = i;
                break;
            }
        }


        int it = startNoteId;

        if(upOrLow.equals("asc")) {
            for (int i = 0; i != degrees; i++) {
                if (it > notes.length - 1) {
                    it = 0;
                }
                endNoteId = it;
                it++;
            }
        }else if(upOrLow.equals("dsc")){
            for (int i = 0; i != degrees; i++) {
                if (it < 0) {
                    it = notes.length-1;
                }
                endNoteId = it;
                it--;
            }
        }

        endNote = notes[endNoteId];

        for(int i = 0; i < semitons.length; i++){
            if(inNote.contains(semitons[i])){
                startSemitonId = i;
            }
        }

        for (int i = 0; i < semitons.length; i++){
            if(endNote.contains(semitons[i])){
                endSemitonId = i;
            }
        }


        it = startSemitonId;
        if(upOrLow.equals("asc")) {
            while (it != endSemitonId) {
                if (it > semitons.length - 1) {
                    it = 0;
                }
                if (semitons[it].equals("-")) {
                    semitonsCount++;
                }
                it++;
            }
        }else if(upOrLow.equals("dsc")){
            while (it != endSemitonId) {
                if (it == 0) {
                    it = semitons.length-1;
                }
                if (semitons[it].equals("-")) {
                    semitonsCount++;
                }
                it--;
            }
        }
        if(upOrLow.equals("asc")){
            if(inNote.contains("b")){
                semitonsCount++;
            }else if(inNote.contains("#")){
                semitonsCount--;
            }

        }else if(upOrLow.equals("dsc")){
            if(inNote.contains("b")){
                semitonsCount--;
            }else if(inNote.contains("#")){
                semitonsCount++;
            }
        }

        semitonDif = semiton-semitonsCount;

        if(upOrLow.equals("asc")){
            switch (semitonDif){
                case 1:
                    endNote += "#";
                    break;
                case 2:
                    endNote += "##";
                    break;
                case -1:
                    endNote += "b";
                    break;
                case -2:
                    endNote += "bb";
                    break;
                case 0:
                    break;
            }

        }else if(upOrLow.equals("dsc")){
            switch (semitonDif){
                case 1:
                    endNote += "b";
                    break;
                case 2:
                    endNote += "bb";
                    break;
                case -1:
                    endNote += "#";
                    break;
                case -2:
                    endNote += "##";
                    break;
                case 0:
                    break;
            }
        }

        return "Количество интервалов "+semitonsCount+" "+endNote;
    }

    public static String intervalIdentification(String[] args) {
        String firstNote = args[0];
        String secondNote = args[1];
        String upOrLow = null;
        String inteval = null;

        int firstNoteId = 0;
        int secondNoteiId = 0;
        int firstSemitonId = 0;
        int secondSemitonId = 0;
        int endDegrees = 0;
        int iterator = 0;
        int semitonsCount = 0;

        //Выброс ошибки при превышении кол-ва параметров
        if(args.length > 3){
            throw new RuntimeException("Недопустимое количество элементов во входном массиве");
        }

        //Проверка на наличие 3 параметра
        if(args.length == 3){
            upOrLow = args[2];
        }else if(args.length == 2){
            upOrLow = "asc";
        }

        //Находит позицию в масиве обеих нот
        for(int i = 0; i < notes.length; i++){
            if(firstNote.equals(notes[i])){
                firstNoteId = i;

            }
        }
        if(firstNoteId == 0){
            firstNoteId = 1;
        }
        for (int j = 0; j < notes.length; j++){
            if(secondNote.contains(notes[j])){
                secondNoteiId = j;
            }
        }


        System.out.println(firstNoteId+" "+secondNoteiId);
        if(firstNoteId == 1 & secondNoteiId == 1){
            endDegrees = firstNoteId + secondNoteiId;
        }


       for(int i = 0; i < semitons.length; i++){
           if(firstNote.equals(semitons[i])){
               firstSemitonId = i;
           }
       }
       for(int i = 0; i < semitons.length;i++){
           if(secondNote == semitons[i]){
               secondNoteiId = i;
           }
       }
        System.out.println(firstSemitonId + " " + secondSemitonId);


        if(upOrLow == "asc"){
            iterator = firstSemitonId;
            while (iterator != secondSemitonId){
                if(iterator > semitons.length-1){
                    iterator = 0;
                }
                if(semitons[iterator].contains("b") || semitons[iterator].contains("#")){
                    semitonsCount++;
                }
                if(iterator == secondNoteiId){break;}
                iterator++;
            }
        }else if(upOrLow == "asc"){
            iterator = firstSemitonId;
            while (iterator != secondSemitonId){
                if(iterator > semitons.length-1){
                    iterator = 0;
                }
                if(semitons[iterator].contains("b") || semitons[iterator].contains("#")){
                    semitonsCount++;
                }
                iterator--;
            }
        }

        System.out.println(semitonsCount);


        return inteval;
    }



}
